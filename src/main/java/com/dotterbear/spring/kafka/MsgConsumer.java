package com.dotterbear.spring.kafka;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.kafka.annotation.KafkaListener;
import org.springframework.stereotype.Component;

@Component
public class MsgConsumer {
  private static final Logger logger = LoggerFactory.getLogger(MsgConsumer.class);

  @KafkaListener(topics = {"topic-test"}, groupId="grp1")
  public void listen(Data data) {
    logger.debug("grp1 receive msg: {}", data);
  }

}
