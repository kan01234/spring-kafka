package com.dotterbear.spring.kafka;

import javax.annotation.Resource;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/kafka")
public class TestKafkaController {

  @Resource(name = "msgProducer")
  private MsgProducer producer;

  private final String TOPIC = "topic-test";

  @RequestMapping("/send")
  public String send(String data) {
    producer.sendMessage(TOPIC, data);
    return "send" + data + " ok!";
  }

}
