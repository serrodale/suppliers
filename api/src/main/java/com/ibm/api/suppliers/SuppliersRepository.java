package com.ibm.api.suppliers;

import java.util.List;
import java.util.Optional;

import com.ibm.api.suppliers.entities.Supplier;

import org.springframework.data.jpa.repository.JpaRepository;

public interface SuppliersRepository extends JpaRepository<Supplier, Double> {

  List<Supplier> findAll();
  Optional<Supplier> findById(Double id);
  
  default Optional<Supplier> findOne(Double id) {
    return this.findById(id);
  }

}