package org.nordstrom.webserver;

import org.springframework.kafka.annotation.KafkaListener;
import org.springframework.stereotype.Service;

//@Service
public class WebServerConsumer {

    /*private final SimpleMessageRepository messages;

    public WebServerConsumer(SimpleMessageRepository messages) {
        this.messages = messages;
    }

    @KafkaListener(topics = "Kafka_Example", groupId = "group_id")
    public void consume(String message) {
        System.out.println("Consumed message: " + message);
        messages.save(new SimpleMessage(message));
    }*/
}
