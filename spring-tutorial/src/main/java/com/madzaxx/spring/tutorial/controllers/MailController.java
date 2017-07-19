package com.madzaxx.spring.tutorial.controllers;

import com.madzaxx.spring.tutorial.mail.MailSender;
import com.madzaxx.spring.tutorial.mail.MockMailSender;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class MailController {

    private MailSender mailSender = new MockMailSender();

    @RequestMapping("/mail")
    public String sendMail() {

        mailSender.send("abc@example.com", "Some subject", "the content");

        return "Mail sent";
    }
}
