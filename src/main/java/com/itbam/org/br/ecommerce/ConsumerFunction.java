package com.itbam.org.br.ecommerce;

import org.apache.kafka.clients.consumer.ConsumerRecord;

public interface ConsumerFunction {
    void consume(ConsumerRecord<String, String> record) throws InterruptedException;
}
