package com.gourav.charge.controller;

import com.gourav.charge.model.ChargingStation;
import com.gourav.charge.repositories.ChargingStationRepository;
import lombok.extern.slf4j.Slf4j;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import javax.validation.Valid;
import java.util.List;

@RestController
@Slf4j
@RequestMapping("/charger")
public class ChargingController {

  @Autowired
  private ChargingStationRepository chargingStationRepository;

  @PostMapping
  public ResponseEntity<?> addCharger(@Valid @RequestBody ChargingStation chargingStation) {
    log.info("charger request {}", chargingStation);
    try {
      ChargingStation chargingStation1 = chargingStationRepository.save(chargingStation);
      log.info("ChargingStation response {}", chargingStation1);
      return new ResponseEntity<>(chargingStation1, HttpStatus.CREATED);
    } catch (Exception e) {
      log.error("Failed to save ChargingStation details {}", e.getMessage());
      return new ResponseEntity<>("Error saving ChargingStation details ", HttpStatus.INTERNAL_SERVER_ERROR);
    }

  }

  @GetMapping()
  public ResponseEntity<?> fetchCharger(){
    //log.info("Id {}", id);
    try{
      List<ChargingStation> chargingStationList = chargingStationRepository.findAll();
      log.info("charger response for requested id {}", chargingStationList);
      return new ResponseEntity<>(chargingStationList, HttpStatus.OK);
    }catch (Exception e){
      log.error("Error while fetching charger details {}", e.getMessage());
      return new ResponseEntity<>("Error fetching car details ", HttpStatus.NOT_FOUND);
    }
  }

}