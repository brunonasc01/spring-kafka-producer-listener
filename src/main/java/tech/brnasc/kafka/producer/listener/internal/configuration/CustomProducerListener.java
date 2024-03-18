package tech.brnasc.kafka.producer.listener.internal.configuration;

import lombok.extern.slf4j.Slf4j;
import org.apache.kafka.clients.producer.ProducerRecord;
import org.apache.kafka.clients.producer.RecordMetadata;
import org.springframework.kafka.support.ProducerListener;
import org.springframework.stereotype.Component;

@Slf4j
@Component
public class CustomProducerListener implements ProducerListener<Object, Object> {

    @Override
    public void onSuccess(ProducerRecord<Object, Object> producerRecord, RecordMetadata recordMetadata) {
        log.debug("Sucess sending topic [{}] with value [{}]", producerRecord.topic(), producerRecord.value());
    }

    @Override
    public void onError(ProducerRecord<Object, Object> producerRecord, RecordMetadata recordMetadata, Exception exception) {
        log.debug("Error sending topic [{}] with value [{}] ", producerRecord.topic(), producerRecord.value(), exception);
    }
}
