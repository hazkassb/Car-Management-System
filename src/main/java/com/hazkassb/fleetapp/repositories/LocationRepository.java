package com.hazkassb.fleetapp.repositories;

import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

import com.hazkassb.fleetapp.models.Location;

@Repository
public interface LocationRepository extends CrudRepository<Location, Integer> {

}
