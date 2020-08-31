package org.nordstrom.webserver;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.ArrayList;
import java.util.List;
import java.util.stream.Collectors;

@RestController
public class GroupController {

    @Autowired
    private SimpleMessageRepository messages;

    /*public GroupController(SimpleMessageRepository messages) {
        this.messages = messages;
    }*/

    @RequestMapping("/")
    public String index() {
        return "Greetings from Spring Boot!";
    }

    @RequestMapping("/messages")
    public List<String> messages() {
        List<String> msgs = new ArrayList<>();
        messages.findAll().forEach(x -> msgs.add(x.getMessage()));
        return msgs;
        //.map((SimpleMessage::getMessage)).collect(Collectors.toList());
    }
}
