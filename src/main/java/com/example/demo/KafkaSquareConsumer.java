package com.example.demo;
import org.springframework.kafka.annotation.KafkaListener;
import org.springframework.stereotype.Component;

@Component
public class KafkaSquareConsumer {

    @KafkaListener(topics = "${kafka.topic.output}")
    public void consume(Long number)  {
        System.out.println(String.format("Consumed :: %d", number));
    }

}