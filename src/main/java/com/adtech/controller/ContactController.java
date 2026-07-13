package com.adtech.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import com.adtech.entity.Contact;
import com.adtech.service.ContactService;

@RestController
@RequestMapping("/contact")
public class ContactController {

    @Autowired
    private ContactService contactService;

    @PostMapping
    public Contact saveContact(@RequestBody Contact contact) {

        return contactService.saveContact(contact);

    }

}