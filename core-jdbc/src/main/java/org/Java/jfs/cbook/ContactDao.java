package org.Java.jfs.cbook;

import java.util.List;

public interface ContactDao {
    long insertContact(Contact contact);
    Contact selectContact(long cid);
    Contact updateEmail(long cid,String email);
    Contact updateMobile(long cid,String mobile);
    boolean deleteContact(long cid);
    List<Contact> selectContact();
    List<Contact> search(String str);
}
