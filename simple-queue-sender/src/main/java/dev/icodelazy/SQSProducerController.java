package dev.icodelazy;

import lombok.RequiredArgsConstructor;
import lombok.extern.slf4j.Slf4j;
import org.springframework.http.MediaType;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

@RestController
@Slf4j
@RequiredArgsConstructor
public class SQSProducerController {

    private final SQSProducerService service;

    @PostMapping(value = "/send", consumes = MediaType.APPLICATION_JSON_VALUE)
    public void sendMessage(@RequestBody MessageData message) {
        log.info("Message to send >> [{}]", message);

        service.sendMessage(message);
    }
}
