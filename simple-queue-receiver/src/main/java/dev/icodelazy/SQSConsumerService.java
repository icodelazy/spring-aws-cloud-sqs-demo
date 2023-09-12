package dev.icodelazy;

import io.awspring.cloud.sqs.annotation.SqsListener;
import lombok.extern.slf4j.Slf4j;
import org.springframework.boot.context.properties.EnableConfigurationProperties;
import org.springframework.stereotype.Service;

@Service
@Slf4j
@EnableConfigurationProperties({LocalStackSQSProperties.class})
public class SQSConsumerService {



    @SqsListener(queueNames = "my-test-queue.fifo")
    public void processMessage(MessageData message) {

        log.info("Message received >> [{}]", message);

    }
}
