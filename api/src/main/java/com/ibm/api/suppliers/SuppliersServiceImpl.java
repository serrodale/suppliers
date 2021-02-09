package com.ibm.api.suppliers;

import java.util.Optional;
import java.util.Collection;
import java.util.stream.Collectors;

import com.ibm.api.suppliers.dtos.GetAllSuppliersDto;
import com.ibm.api.suppliers.dtos.GetOneSupplierDto;

import org.springframework.stereotype.Service;
import org.springframework.beans.factory.annotation.Autowired;

@Service
public class SuppliersServiceImpl implements SuppliersService {

  @Autowired
  private SuppliersRepository suppliersRepository;

  @Override
  public Collection<GetAllSuppliersDto> getAllSuppliers() {
    return this.suppliersRepository
      .findAll()
      .stream()
      .map(SuppliersMapper::toGetAllDto)
      .collect(Collectors.toList());
  }

  @Override
  public Optional<GetOneSupplierDto> getOneSupplier(Double id) {
    return this.suppliersRepository
      .findById(id)
      .map(SuppliersMapper::toGetOneDto);
  }

}