package com.gourav.charge.model;

import org.springframework.data.annotation.Id;
import org.springframework.data.mongodb.core.mapping.Document;

import java.util.List;

@Document
public class Charger {

  @Id
  private String      code;
  private List<Connector> connectors;
  private String status;

  public String getCode() {
    return code;
  }

  public void setCode(final String code) {
    this.code = code;
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