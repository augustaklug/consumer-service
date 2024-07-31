package com.klug.consumer.client;

import org.springframework.cloud.openfeign.FeignClient;
import org.springframework.web.bind.annotation.GetMapping;

@FeignClient(name = "producer-service", url = "http://localhost:8081")
public interface ProducerClient {

    @GetMapping("/produce")
    String getProducerMessage();
}
