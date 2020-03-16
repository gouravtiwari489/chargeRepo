package com.gourav.charge.model;

import org.springframework.data.annotation.Id;
import org.springframework.data.mongodb.core.mapping.Document;

import java.util.List;

@Document
public class Charger {

  @Id
  private String          _id;
  private List<Connector> connectors;
  private String          status;

  public String get_id() {
    return _id;
  }

  public void set_id(final String _id) {
    this._id = _id;
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