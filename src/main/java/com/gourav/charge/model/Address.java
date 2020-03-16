package com.gourav.charge.model;

import org.springframework.data.annotation.Id;
import org.springframework.data.mongodb.core.mapping.Document;

@Document
public class Address {

  @Id
  private Integer _id;
  private String  landMark;

  public Integer get_id() {
    return _id;
  }

  public void set_id(final Integer _id) {
    this._id = _id;
  }

  public String getLandMark() {
    return landMark;
  }

  public void setLandMark(final String landMark) {
    this.landMark = landMark;
  }
}
