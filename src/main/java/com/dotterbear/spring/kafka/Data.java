package com.dotterbear.spring.kafka;

import java.io.Serializable;

public class Data implements Serializable {

  private static final long serialVersionUID = 1L;

  private long id;

  private String data;

  public Data() {

  }

  public Data(long id, String data) {
    super();
    this.id = id;
    this.data = data;
  }

  public long getId() {
    return id;
  }

  public void setId(long id) {
    this.id = id;
  }

  public String getData() {
    return data;
  }

  public void setData(String data) {
    this.data = data;
  }

  @Override
  public String toString() {
    return "Data [id=" + id + ", data=" + data + "]";
  }

}
