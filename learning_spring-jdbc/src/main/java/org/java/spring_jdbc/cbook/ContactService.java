package org.java.spring_jdbc.cbook;

import java.util.List;

public interface ContactService {
    Contact addContact(Contact contact);
    Contact updateContact(Contact contact);
    List<Contact> getContact();
    List<Contact> search(String str);
    boolean deleteContact(long id);
    Contact getContact(long id);
    int[] addContact(List<Contact> contacts);

}
