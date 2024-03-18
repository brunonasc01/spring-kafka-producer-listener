package tech.brnasc.kafka.producer.listener.internal.configuration;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.kafka.annotation.EnableKafka;
import org.springframework.kafka.core.KafkaTemplate;
import org.springframework.kafka.core.ProducerFactory;
import org.springframework.kafka.support.ProducerListener;

@Configuration
@EnableKafka
public class ApplicationConfiguration {

    @Bean
    KafkaTemplate<?, ?> kafkaTemplate(ProducerFactory<?, ?> kafkaProducerFactory, ProducerListener producerListener) {
        KafkaTemplate<?, ?> kafkaTemplate = new KafkaTemplate<>(kafkaProducerFactory);
        kafkaTemplate.setProducerListener(producerListener);
        return kafkaTemplate;
    }
}
