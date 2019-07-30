package com.dotterbear.spring.kafka;

import java.util.List;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.kafka.annotation.KafkaListener;
import org.springframework.stereotype.Component;

@Component
public class MsgConsumer2 {
  private static final Logger logger = LoggerFactory.getLogger(MsgConsumer2.class);

  @KafkaListener(topics = {"topic-test"}, groupId="grp2")
  public void listen(List<Data> data) {
    logger.debug("grp2 receive msg: {}", data);
  }

}
