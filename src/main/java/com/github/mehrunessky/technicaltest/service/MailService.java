package com.github.mehrunessky.technicaltest.service;

import lombok.extern.slf4j.Slf4j;
import org.springframework.stereotype.Service;

@Service
@Slf4j
public class MailService {

    public void sendMail() {
        log.info("EMAIL SEND");
    }


}
