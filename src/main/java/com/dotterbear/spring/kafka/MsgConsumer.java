package com.dotterbear.spring.kafka;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.kafka.annotation.KafkaListener;
import org.springframework.stereotype.Component;

@Component
public class MsgConsumer {
  private static final Logger logger = LoggerFactory.getLogger(MsgProducer.class);

  @KafkaListener(id = "test", topics = {"topic-test"})
  public void listen(String data) {
    logger.debug("receive msg: {}", data);
  }

}
