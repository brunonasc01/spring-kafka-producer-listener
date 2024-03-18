package tech.brnasc.kafka.producer.listener.api.controller;

import org.springframework.http.HttpStatus;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.ResponseStatus;

public interface TopicController {

    @PostMapping(path = "/api/v1/message")
    @ResponseStatus(HttpStatus.CREATED)
    String sendMessage(@RequestBody String message);
}
