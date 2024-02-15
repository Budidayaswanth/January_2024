package org.Jan.jfs.cbook;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class ContactBookService {
    Scanner sc = new Scanner(System.in);
    private List<Contact> contacts;

    public ContactBookService() {
        this.contacts = new ArrayList<>();
    }

    public void addContact(Contact contact) {
        contacts.add(contact);
        System.out.println("Contact is added with id :" + contact.getCid());
    }

    public void deleteContact(String cid) {
        Contact contact = getCidNumber(cid);
        if (contact != null) {
            contacts.remove(contact);
            System.out.println("Contact is deleted with id :" + cid);
        } else {
            System.out.println("Contact with id :" + cid + " is Not Found ");
        }
    }

    public void UpdateEmail(String cid, String email) {
        Contact contact = getCidNumber(cid);
        if (contact != null) {
            contact.setEmail(email);
            System.out.println("Contact Email  is Updated with id : " + cid);
        } else {
            System.out.println("Contact with id :" + cid + " is not found ");
        }

    }

    public void UpdateMobile(String cid, String mobile) {
        Contact contact = getCidNumber(cid);
        if (contact != null) {
            contact.setMobile(mobile);
            System.out.println(" Contact Mobile Number is Updated with id :" + cid);
        } else {
            System.out.println("Contact wit id :" + cid + " is Not Found ");
        }
    }

    public void ShowContactDetails(String cid) {
        Contact contact = getCidNumber(cid);
        if (contact != null) {
            showContacts(contact);
        } else {
            System.out.println("Contact with id :" + cid + " is not Found");
        }
    }

    public void ShowAllContacts() {
        if (!contacts.isEmpty()) {
            System.out.println("-".repeat(45));
            for (Contact contact : contacts) {
                showContacts(contact);
            }
            System.out.println("-".repeat(45));
        } else {
            System.out.println("No contacts found ");
        }
    }

    public void search(String str) {
        boolean isFound = false;
        for (Contact contact : contacts) {
            str = str.toLowerCase();
            if (contact.getCid().toLowerCase().contains(str) || contact.getName().toLowerCase().contains(str) || contact.getEmail().toLowerCase().contains(str) || contact.getMobile().toLowerCase().equalsIgnoreCase(str)) {
                showContacts(contact);
                System.out.println("-".repeat(30));
                isFound = true;
            }
        }
        if (!isFound) {
            System.out.println("No contacts are found with a search string :" + str);
        }
    }

    public void showContacts(Contact contact) {
        System.out.println("Contact id :" + contact.getCid());
        System.out.println("Name " + contact.getName());
        System.out.println("Email " + contact.getEmail());
        System.out.println("Mobile No :" + contact.getMobile());
        System.out.println("-------------------------------------");

    }

    private Contact getCidNumber(String cid) {
        for (Contact contact : contacts) {
            if (contact.getCid().equals(cid)) {
                return contact;
            }
        }
        return null;
    }
}
