package org.Jan.jfs.cbook;

import java.util.Scanner;

public class ContactBookManager {
    public static void main(String[] args) {
        ContactBookService cbs =new ContactBookService();
        System.out.println("-------menu----------");
        Scanner sc =new Scanner(System.in);
        while (true) {
            System.out.println("1. Add Contact ");
            System.out.println("2. Delete Contact ");
            System.out.println("3. Update email ");
            System.out.println("4. Update Mobile ");
            System.out.println("5. Show Contact Details ");
            System.out.println("6. Show All Contacts");
            System.out.println("7. Search String to find data ");
            System.out.println("8. Exit");

            System.out.println("Enter Your Choice : ");
            int ch =sc.nextInt();
            switch (ch){
                case 1:
                    System.out.println("Enter the name ");
                    String Name=sc.next();
                    System.out.println("Enter the email ");
                    String email =sc.next();
                    System.out.println("Enter the Mobile ");
                    String mobile =sc.next();
                    Contact contact =new Contact(Name,email,mobile);
                    cbs.addContact(contact);
                    break;
                case 2:
                    System.out.println("Enter the Contact Id : ");
                    String  cid1 =sc.next();
                    cbs.deleteContact(cid1);
                    break;
                case 3:
                    System.out.println("Enter the Contact Id : ");
                    String cid2 =sc.next();
                    System.out.println("Enter the Email : ");
                    String email1 =sc.next();
                    cbs.UpdateEmail(cid2,email1);
                    break;
                case 4:
                    System.out.println("Enter the Contact Id : ");
                    String cid3 =sc.next();
                    System.out.println("Enter the Mobile  : ");
                    String  mobile1 =sc.next();
                    cbs.UpdateMobile(cid3,mobile1);
                    break;
                case 5:
                    System.out.println("Enter the Contact Id : ");
                    String cid4 =sc.next();
                    cbs.ShowContactDetails(cid4);
                    break;
                case 6:
                    cbs.ShowAllContacts();
                    break;
                case 7:
                    System.out.println("Enter the String to search :");
                    String search =sc.next();
                    cbs.search(search);
                    break;
                case 8:
                    System.out.println("Thanks for using these Application");
                    System.exit(0);
            }
        }
    }
}
