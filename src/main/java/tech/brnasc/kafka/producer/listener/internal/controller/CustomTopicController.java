package tech.brnasc.kafka.producer.listener.internal.controller;

import lombok.AllArgsConstructor;
import org.springframework.web.bind.annotation.RestController;
import tech.brnasc.kafka.producer.listener.api.controller.TopicController;
import tech.brnasc.kafka.producer.listener.api.producer.TopicProducer;

@RestController
@AllArgsConstructor
public class CustomTopicController implements TopicController {

    private final TopicProducer topicProducer;

    @Override
    public String sendMessage(String message) {
        this.topicProducer.sendMessage(message);
        return message;
    }
}
