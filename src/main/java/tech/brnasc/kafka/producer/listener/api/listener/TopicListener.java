package tech.brnasc.kafka.producer.listener.api.listener;

import org.springframework.kafka.annotation.KafkaListener;
import tech.brnasc.kafka.producer.listener.internal.configuration.ApplicationConstants;

public interface TopicListener {

    @KafkaListener(topics = ApplicationConstants.KAFKA_TOPIC, groupId = ApplicationConstants.KAFKA_TOPIC)
    void listenMessageSentEvent(String message);
}
