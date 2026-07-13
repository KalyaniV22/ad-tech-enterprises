package com.adtech.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.adtech.entity.Contact;
import com.adtech.repository.ContactRepository;

@Service
public class ContactService {

    @Autowired
    private ContactRepository contactRepository;

    public Contact saveContact(Contact contact) {

        return contactRepository.save(contact);

    }

}