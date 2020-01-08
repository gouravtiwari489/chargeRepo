package com.gourav.charge.model;

import org.springframework.data.annotation.Id;
import org.springframework.data.mongodb.core.mapping.Document;

@Document
public class Address {

  @Id
  private Integer id;
  private String landMark;

  public Integer getId() {
    return id;
  }

  public void setId(final Integer id) {
    this.id = id;
  }

  public String getLandMark() {
    return landMark;
  }

  public void setLandMark(final String landMark) {
    this.landMark = landMark;
  }
}
