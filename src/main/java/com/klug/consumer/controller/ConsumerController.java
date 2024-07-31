package com.klug.consumer.controller;

import com.klug.consumer.client.ProducerClient;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class ConsumerController {

    private final ProducerClient producerClient;

    public ConsumerController(ProducerClient producerClient) {
        this.producerClient = producerClient;
    }

    @GetMapping("/consume")
    public String consume() {
        return producerClient.getProducerMessage();
    }
}
