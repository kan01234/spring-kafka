package com.dotterbear.spring.kafka;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.kafka.core.KafkaTemplate;
import org.springframework.stereotype.Component;

@Component
public class MsgProducer {
  private static final Logger logger = LoggerFactory.getLogger(MsgProducer.class);

  @Autowired
  private KafkaTemplate<Object, Object> kafkaTemplate;

  public void sendMessage(String topicName, String data) {
    logger.debug("send msg, topicName: {}, data: {}", topicName, data);
    try {
      kafkaTemplate.send(topicName, data);
      logger.debug("send ok");
    } catch (Exception e) {
      logger.error("unable to send msg, topicName: {}, data: {}", topicName, data, e);
    }
  }

}
