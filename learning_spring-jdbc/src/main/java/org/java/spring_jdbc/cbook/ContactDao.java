package org.java.spring_jdbc.cbook;

import java.util.List;

public interface ContactDao {
    Contact insertContact(Contact contact);
    Contact updateContact(Contact contact);
    List<Contact> selectContact();
    List<Contact>search(String str);
    boolean deleteContact(long id);
    Contact selectContact(long id);
    int[] insertContacts(List<Contact> contacts);
}
