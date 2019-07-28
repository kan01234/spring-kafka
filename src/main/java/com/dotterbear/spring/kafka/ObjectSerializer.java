package com.dotterbear.spring.kafka;

import java.util.Map;
import org.apache.kafka.common.serialization.Serializer;
import org.springframework.util.SerializationUtils;

public class ObjectSerializer implements Serializer<Object> {

  @Override
  public void configure(Map<String, ?> configs, boolean isKey) {

  }

  @Override
  public byte[] serialize(String topic, Object data) {
    return SerializationUtils.serialize(data);
  }

  @Override
  public void close() {

  }

}
