package org.java.spring_jdbc.cbook;

import org.springframework.stereotype.Service;

import java.util.List;
@Service
public class ContactServiceImpl implements ContactService{
    @Override
    public Contact addContact(Contact contact) {
        return null;
    }

    @Override
    public Contact updateContact(Contact contact) {
        return null;
    }

    @Override
    public List<Contact> getContact() {
        return List.of();
    }

    @Override
    public List<Contact> search(String str) {
        return List.of();
    }

    @Override
    public boolean deleteContact(long id) {
        return false;
    }

    @Override
    public Contact getContact(long id) {
        return null;
    }

    @Override
    public int[] addContact(List<Contact> contacts) {
        return new int[0];
    }
}
