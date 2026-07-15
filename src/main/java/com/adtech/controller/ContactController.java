package com.adtech.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.adtech.dto.ContactDto;
import com.adtech.service.ContactService;

@RestController
@RequestMapping("/contact")
public class ContactController {

    @Autowired
    private ContactService contactService;

    @PostMapping
    public ContactDto saveContact(@RequestBody ContactDto contact) {

        return contactService.saveContact(contact);

    }
    
    @GetMapping
   public String home() {
       return "AD Tech Backend is Running Successfully!";
   }


}