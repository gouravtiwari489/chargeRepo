package com.gourav.charge.model;

import org.springframework.data.annotation.Id;
import org.springframework.data.mongodb.core.mapping.Document;

@Document
public class ChargingStation {

  @Id
  private String     stationCode;
  private String      name;
  private String      longitude;
  private String      latitude;
  private Address     address;
  private Amenities   amenities;
  private String      status;
  private Charger     charger;
  private String accessibility;
  private Information information;
  private String paymentMethod;

  public String getPaymentMethod() {
    return paymentMethod;
  }

  public void setPaymentMethod(final String paymentMethod) {
    this.paymentMethod = paymentMethod;
  }

  public String getAccessibility() {
    return accessibility;
  }

  public void setAccessibility(final String accessibility) {
    this.accessibility = accessibility;
  }

  public String getStationCode() {
    return stationCode;
  }

  public void setStationCode(final String stationCode) {
    this.stationCode = stationCode;
  }

  public String getName() {
    return name;
  }

  public void setName(final String name) {
    this.name = name;
  }

  public String getLongitude() {
    return longitude;
  }

  public void setLongitude(final String longitude) {
    this.longitude = longitude;
  }

  public String getLatitude() {
    return latitude;
  }

  public void setLatitude(final String latitude) {
    this.latitude = latitude;
  }

  public Address getAddress() {
    return address;
  }

  public void setAddress(final Address address) {
    this.address = address;
  }

  public Amenities getAmenities() {
    return amenities;
  }

  public void setAmenities(final Amenities amenities) {
    this.amenities = amenities;
  }

  public String getStatus() {
    return status;
  }

  public void setStatus(final String status) {
    this.status = status;
  }

  public Charger getCharger() {
    return charger;
  }

  public void setCharger(final Charger charger) {
    this.charger = charger;
  }

  public Information getInformation() {
    return information;
  }

  public void setInformation(final Information information) {
    this.information = information;
  }
}
