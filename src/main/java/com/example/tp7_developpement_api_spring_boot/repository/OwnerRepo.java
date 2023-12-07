package com.example.tp7_developpement_api_spring_boot.repository;

import com.example.tp7_developpement_api_spring_boot.model.Owner;
import org.springframework.data.jpa.repository.JpaRepository;

public interface OwnerRepo extends JpaRepository<Owner,Long> {
}
