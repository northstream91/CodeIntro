package org.nordstrom.webserver;

import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

import java.util.List;

@Repository
public interface SimpleMessageRepository extends CrudRepository<SimpleMessage, Long> {

    List<SimpleMessage> findbyMessage(String message);

    SimpleMessage findById(long id);
}
