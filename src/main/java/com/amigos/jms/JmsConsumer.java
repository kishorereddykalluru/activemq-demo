package com.amigos.jms;

import com.amigos.model.Employee;
import lombok.extern.slf4j.Slf4j;
import org.springframework.jms.annotation.JmsListener;
import org.springframework.stereotype.Component;

@Component
@Slf4j
public class JmsConsumer {

    @JmsListener(destination = "${active-mq.topic}")
    public void receive(Employee message) {
            log.info("Received Message: {}", message.toString());
    }
}
