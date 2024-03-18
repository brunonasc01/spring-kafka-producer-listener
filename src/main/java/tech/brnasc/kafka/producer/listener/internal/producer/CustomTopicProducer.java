package tech.brnasc.kafka.producer.listener.internal.producer;

import lombok.AllArgsConstructor;
import org.apache.kafka.clients.producer.ProducerRecord;
import org.springframework.kafka.core.KafkaTemplate;
import org.springframework.stereotype.Component;
import tech.brnasc.kafka.producer.listener.api.producer.TopicProducer;
import tech.brnasc.kafka.producer.listener.internal.configuration.ApplicationConstants;

import java.util.concurrent.CompletableFuture;

@Component
@AllArgsConstructor
public class CustomTopicProducer implements TopicProducer {

    private final KafkaTemplate kafkaTemplate;

    @Override
    public CompletableFuture sendMessage(String message) {
        return kafkaTemplate.send(this.prepareRecord(message));
    }

    private ProducerRecord prepareRecord(String message) {
        ProducerRecord producerRecord = new ProducerRecord(ApplicationConstants.KAFKA_TOPIC, message);
        return producerRecord;
    }
}
