package com.pm.patient_service.Repository;

import java.util.UUID;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.pm.patient_service.model.Patient;

// Handles communitcation with the DB (Configuration due to Jpa inheritence)
@Repository
public interface PatientRepository extends JpaRepository<Patient, UUID> {

    //Is the Email already in db?
    public boolean existsByEmail(String email);

    
}
