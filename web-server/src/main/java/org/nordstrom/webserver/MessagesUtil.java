package org.nordstrom.webserver;

import java.util.ArrayList;
import java.util.List;

public class MessagesUtil {

    private List<String> messages;

    public MessagesUtil() {
        messages = new ArrayList<>();
    }

    public MessagesUtil(List<String> messages) {
        this.messages = messages;
    }

    public void addMessage(String msg) {
        messages.add(msg);
    }

    public List<String> getMessages() {
        return messages;
    }
}
