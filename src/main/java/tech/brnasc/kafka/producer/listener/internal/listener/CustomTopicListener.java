package tech.brnasc.kafka.producer.listener.internal.listener;

import lombok.extern.slf4j.Slf4j;
import org.springframework.stereotype.Component;
import tech.brnasc.kafka.producer.listener.api.listener.TopicListener;

@Slf4j
@Component
public class CustomTopicListener implements TopicListener {
    @Override
    public void listenMessageSentEvent(String message) {
        log.info("Message [{}] received", message);
    }
}
