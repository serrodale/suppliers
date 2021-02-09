package com.ibm.api.suppliers;

import java.util.Optional;
import java.util.Collection;

import com.ibm.api.suppliers.dtos.GetOneSupplierDto;
import com.ibm.api.suppliers.dtos.GetAllSuppliersDto;

public interface SuppliersService {

  public Optional<GetOneSupplierDto> getOneSupplier(Double id);
  public Collection<GetAllSuppliersDto> getAllSuppliers();

}