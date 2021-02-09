package com.ibm.api.suppliers.entities;

import java.io.Serializable;
import java.util.Date;

import javax.persistence.Id;
import javax.persistence.Table;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;

import javax.validation.constraints.NotEmpty;

import lombok.Data;
import lombok.Builder;
import lombok.NoArgsConstructor;
import lombok.AllArgsConstructor;

@Data
@Entity
@Builder
@Table(name="SUPPLIERS")
@NoArgsConstructor
@AllArgsConstructor
public class Supplier implements Serializable {

  private static final long serialVersionUID = -1943964398917872396L;

  @Id
	@GeneratedValue(strategy=GenerationType.SEQUENCE)
  private Double id;
  
  @Column(name="CREATED_AT")
  private Date createdAt;

  @NotEmpty
  @Column(name="NAME")
  private String name;

  @NotEmpty
  @Column(name="CIF", unique=true)
  private String cif;

  @Column(name="LOGO_URL")
  private String logoUrl;

}
