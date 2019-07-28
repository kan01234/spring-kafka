package com.dotterbear.spring.kafka;

import java.util.Map;
import org.apache.kafka.common.serialization.Deserializer;
import org.springframework.util.SerializationUtils;

public class ObjectDeserializer implements Deserializer<Object> {

  @Override
  public void configure(Map<String, ?> configs, boolean isKey) {

  }

  @Override
  public Object deserialize(String topic, byte[] data) {
    return SerializationUtils.deserialize(data);
  }

  @Override
  public void close() {

  }

}
