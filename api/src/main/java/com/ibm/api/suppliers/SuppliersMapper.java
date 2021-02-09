package com.ibm.api.suppliers;

import com.ibm.api.suppliers.entities.Supplier;

import com.ibm.api.suppliers.dtos.GetOneSupplierDto;
import com.ibm.api.suppliers.dtos.GetAllSuppliersDto;

import lombok.experimental.UtilityClass;

@UtilityClass
public class SuppliersMapper {

  public static GetOneSupplierDto toGetOneDto(Supplier entity) {
    return GetOneSupplierDto
      .builder()
      .cif(entity.getCif())
      .name(entity.getName())
      .logoUrl(entity.getLogoUrl())
      .createdAt(entity.getCreatedAt())
      .build();
  }
  
  public static GetAllSuppliersDto toGetAllDto(Supplier entity) {
    return GetAllSuppliersDto
      .builder()
      .code(entity.getId())
      .name(entity.getName())
      .build();
  }

}

