package tech.brnasc.kafka.producer.listener.api.producer;

import java.util.concurrent.CompletableFuture;

public interface TopicProducer {

    CompletableFuture sendMessage(String message);
}
