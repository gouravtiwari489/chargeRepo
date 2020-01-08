package com.gourav.charge.repositories;

import com.gourav.charge.model.ChargingStation;
import org.springframework.data.mongodb.repository.MongoRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface ChargingStationRepository extends MongoRepository<ChargingStation, Integer> {

}