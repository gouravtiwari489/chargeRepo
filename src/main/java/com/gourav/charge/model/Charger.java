package com.gourav.charge.model;

import org.springframework.data.annotation.Id;
import org.springframework.data.mongodb.core.mapping.Document;

import java.util.List;

@Document
public class Charger {

  @Id
  private Integer      id;
  private String powerType;
  private List<Connector> connectors;
  private String status;


  public Integer getId() {
    return id;
  }

  public void setId(final Integer id) {
    this.id = id;
  }

  public String getPowerType() {
    return powerType;
  }

  public void setPowerType(final String powerType) {
    this.powerType = powerType;
  }

  public List<Connector> getConnectors() {
    return connectors;
  }

  public void setConnectors(final List<Connector> connectors) {
    this.connectors = connectors;
  }

  public String getStatus() {
    return status;
  }

  public void setStatus(final String status) {
    this.status = status;
  }
}