package com.hazkassb.fleetapp.repositories;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.hazkassb.fleetapp.models.Client;

@Repository
public interface ClientRepository extends JpaRepository<Client, Integer> {

}
