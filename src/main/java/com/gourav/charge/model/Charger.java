package com.gourav.charge.model;

import org.springframework.data.annotation.Id;
import org.springframework.data.mongodb.core.mapping.Document;

import java.util.List;

@Document
public class Charger {

  @Id
  private Integer      id;
  private List<Connector> connectors;
  private String status;
  private PricingDetails pricingDetails;

  public PricingDetails getPricingDetails() {
    return pricingDetails;
  }

  public void setPricingDetails(final PricingDetails pricingDetails) {
    this.pricingDetails = pricingDetails;
  }

  public Integer getId() {
    return id;
  }

  public void setId(final Integer id) {
    this.id = id;
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