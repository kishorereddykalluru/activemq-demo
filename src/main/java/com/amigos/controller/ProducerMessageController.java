package com.amigos.controller;

import com.amigos.jms.JmsProducer;
import com.amigos.model.Employee;
import lombok.extern.slf4j.Slf4j;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

@RestController
@Slf4j
public class ProducerMessageController {

    @Autowired
    JmsProducer jmsProducer;

    @PostMapping("/api/employee")
    public Employee sendMessage(@RequestBody Employee employee) {
        log.info("sendMessage: {}", employee.getId());
        jmsProducer.sendMessage(employee);
        return employee;
    }
}
