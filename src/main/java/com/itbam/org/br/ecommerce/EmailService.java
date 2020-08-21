package com.itbam.org.br.ecommerce;

import org.apache.kafka.clients.consumer.ConsumerRecord;

public class EmailService {

    public static void main(String[] args) throws InterruptedException {

        var emailService = new EmailService();

        var service = new KafkaService("ECOMMERCE_SEND EMAIL", emailService::parse);

        service.run();
    }

    private void parse(ConsumerRecord<String, String> record) throws InterruptedException {
        System.out.println("Sending email");
        System.out.println("Key :" + record.key());
        System.out.println("Value :" + record.value());
        System.out.println("Partition :" + record.partition());
        System.out.println("Offset :" + record.offset());
        Thread.sleep(1000);
        System.out.println("Email sent");
    }


}
