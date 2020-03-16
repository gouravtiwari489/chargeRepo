package com.gourav.charge.model;

import org.springframework.data.annotation.Id;
import org.springframework.data.mongodb.core.mapping.Document;

@Document
public class Connector {

  @Id
  private String _id;
  private String powerOutput;
  private String connectorType;
  private String status;
  private String powerType;
  private String price;

  public String getPrice() {
    return price;
  }

  public void setPrice(final String price) {
    this.price = price;
  }

  public String getPowerType() {
    return powerType;
  }

  public void setPowerType(final String powerType) {
    this.powerType = powerType;
  }

  public String get_id() {
    return _id;
  }

  public void set_id(final String _id) {
    this._id = _id;
  }

  public String getPowerOutput() {
    return powerOutput;
  }

  public void setPowerOutput(final String powerOutput) {
    this.powerOutput = powerOutput;
  }

  public String getConnectorType() {
    return connectorType;
  }

  public void setConnectorType(final String connectorType) {
    this.connectorType = connectorType;
  }

  public String getStatus() {
    return status;
  }

  public void setStatus(final String status) {
    this.status = status;
  }
}
