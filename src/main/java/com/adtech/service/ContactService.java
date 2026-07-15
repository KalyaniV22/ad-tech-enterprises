package com.adtech.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.adtech.dto.ContactDto;
import com.adtech.repository.ContactRepository;

@Service
public class ContactService {

    @Autowired
    private ContactRepository contactRepository;

    public ContactDto saveContact(ContactDto contact) {

        return contactRepository.save(contact);

    }

}