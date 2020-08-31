package org.nordstrom.webserver;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import java.util.Objects;

@Entity
public class SimpleMessage {

    private @Id @GeneratedValue Long id;
    private String message;

    public SimpleMessage() {
        // Empty constructor
    }

    public SimpleMessage(String message) {
        this.message = message;
    }

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public String getMessage() {
        return message;
    }

    public void setMessage(String message) {
        this.message = message;
    }

    @Override
    public boolean equals(Object o) {

        if (this == o)
            return true;
        if (!(o instanceof SimpleMessage))
            return false;
        SimpleMessage simpleMessage = (SimpleMessage) o;
        return Objects.equals(this.id, simpleMessage.id) && Objects.equals(this.message, simpleMessage.message);
    }

    @Override
    public int hashCode() {
        return Objects.hash(this.id, this.message);
    }

    @Override
    public String toString() {
        return "SimpleMessage{" + "id=" + this.id + ", message='" + this.message + '}';
    }

}
