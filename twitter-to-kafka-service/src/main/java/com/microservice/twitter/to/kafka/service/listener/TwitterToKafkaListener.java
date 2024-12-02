package com.microservice.twitter.to.kafka.service.listener;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.stereotype.Component;
import twitter4j.Status;
import twitter4j.StatusAdapter;

@Component
public class TwitterToKafkaListener extends StatusAdapter {
    public static final Logger LOG = LoggerFactory.getLogger(TwitterToKafkaListener.class);

    @Override
    public void onStatus(Status status) {
        LOG.info("Twitter status with text {}", status.getText());
    }
}
