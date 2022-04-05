package com.fjgonmir.lil.sbet.clr.roomcleanernotifier;

import com.fasterxml.jackson.databind.ObjectMapper;
import org.springframework.amqp.rabbit.core.RabbitTemplate;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.context.ConfigurableApplicationContext;
import org.springframework.stereotype.Component;

import java.security.NoSuchAlgorithmException;
import java.security.SecureRandom;
import java.util.Random;

@Component
public class Runner implements CommandLineRunner {

    private final RabbitTemplate rabbitTemplate;
    private final ObjectMapper objectMapper;
    private final Random random;

    @Autowired
    private ConfigurableApplicationContext context;

    public Runner(RabbitTemplate rabbitTemplate,ObjectMapper objectMapper) throws NoSuchAlgorithmException {
        this.rabbitTemplate = rabbitTemplate;
        this.objectMapper = objectMapper;
        this.random = SecureRandom.getInstanceStrong();
    }

    @Override
    public void run(String... args) throws Exception {

        int index = this.random.nextInt(27);
        AsyncPayload payload = new AsyncPayload();
        payload.setId(index);
        payload.setModel("ROOM");
        rabbitTemplate.convertAndSend("operations","landon.rooms.cleaner",objectMapper.writeValueAsString(payload));
        context.close();
    }
}
