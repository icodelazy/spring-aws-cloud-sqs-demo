package dev.icodelazy;

import io.awspring.cloud.sqs.operations.SqsTemplate;
import lombok.RequiredArgsConstructor;
import lombok.extern.slf4j.Slf4j;
import org.springframework.stereotype.Service;

@Service
@Slf4j
@RequiredArgsConstructor
public class SQSProducerService {

    private final SqsTemplate sqsTemplate;

    public void sendMessage(MessageData messageData) {
        sqsTemplate.send("my-test-queue.fifo", messageData);
    }
}
