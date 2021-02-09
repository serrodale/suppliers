package com.ibm.api.suppliers.dtos;

import java.util.Date;

import com.fasterxml.jackson.annotation.JsonProperty;

import lombok.Data;
import lombok.Builder;
import lombok.NoArgsConstructor;
import lombok.AllArgsConstructor;

@Data
@Builder
@NoArgsConstructor
@AllArgsConstructor
public class GetOneSupplierDto {

  @JsonProperty
  private Date createdAt;

  @JsonProperty
  private String name;

  @JsonProperty
  private String cif;

  @JsonProperty
  private String logoUrl;

}