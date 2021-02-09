package com.ibm.api.suppliers.dtos;

import com.fasterxml.jackson.annotation.JsonProperty;

import lombok.Data;
import lombok.Builder;
import lombok.NoArgsConstructor;
import lombok.AllArgsConstructor;

@Data
@Builder
@NoArgsConstructor
@AllArgsConstructor
public class GetAllSuppliersDto {

  @JsonProperty
  private Double code;

  @JsonProperty
  private String name;

}