package com.gourav.charge.model;

import org.springframework.data.annotation.Id;
import org.springframework.data.mongodb.core.mapping.Document;

@Document
public class Amenities {

  @Id
  private Integer id;

  public Integer getId() {
    return id;
  }

  public void setId(final Integer id) {
    this.id = id;
  }
}
