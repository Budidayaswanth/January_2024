package org.Java.jfs.cbook;

import java.util.List;

public class ContactServiceImpl implements ContactService{
    private ContactDao contactDao =new ContactDaoImpl();
    private ContactDaoUtil contactDaoUtil =new ContactDaoUtil();

    @Override
    public long addContact(Contact contact) {
        if (contact == null || contact.getName() == null || contact.getName().isBlank() || contact.getEmail() == null || contact.getEmail().isBlank() || contact.getMobile()==null || contact.getMobile().isBlank() || contact.getMobile().length() !=10){
            throw new IllegalArgumentException("Provide valid contact details");
        }
        if (contactDaoUtil.isEmailExists(contact.getEmail())){
            throw new IllegalArgumentException("provide valid contact details");
        }
        if (contactDaoUtil.isMobileExists(contact.getMobile())){
            throw new IllegalArgumentException(" Mobile Already exits");
        }
        return contactDao.insertContact(contact);
    }

    @Override
    public Contact getContact(long cid) {
        return contactDao.selectContact(cid);
    }

    @Override
    public Contact updateEmail(long cid, String email) {
        Contact existingContact =contactDao.selectContact(cid);
        if (existingContact ==null){
            throw new IllegalArgumentException("Contact with given id does not exits");
        }
        if (email ==null ||email.isBlank()){
            throw new IllegalArgumentException("Email can't be null or Empty");
        }
        if (contactDaoUtil.isEmailExists(email)){
            throw new IllegalArgumentException("Email already exists, please provide a different email");
        }
        if (existingContact.getEmail().equals(email)){
            throw new IllegalArgumentException("Email same as existing email");
        }
        return contactDao.updateEmail(cid,email);
    }

    @Override
    public Contact updateMobile(long cid, String mobile) {
        Contact existingContact =contactDao.selectContact(cid);
        if (existingContact ==null){
            throw new IllegalArgumentException("Contact with given id doesn't exists");
        }
        if (mobile ==null || mobile.isBlank() || mobile.length() !=10){
            throw new IllegalArgumentException("Mobile can't be a null or Empty");
        }
        if (existingContact.getMobile().equals(mobile)){
            throw new IllegalArgumentException("Mobile same as existing mobile");
        }
        if (contactDaoUtil.isMobileExists(mobile) && !existingContact.getMobile().equals(mobile)){
            throw new IllegalArgumentException("Mobile already exists, provide a different mobile Number. ");
        }
        return contactDao.updateMobile(cid,mobile);
    }

    @Override
    public boolean deleteContact(long cid) {
        if (contactDao.selectContact(cid)==null){
            throw new IllegalArgumentException("Contact with given id doesn't exists");
        }
        return contactDao.deleteContact(cid);
    }

    @Override
    public List<Contact> getAllContacts() {
        return contactDao.selectContact();
    }

    @Override
    public List<Contact> search(String str) {
        if (str ==null || str.isBlank()){
            throw new IllegalArgumentException("search striing can't be empty or null");
        }
        return contactDao.search(str);
    }
}
