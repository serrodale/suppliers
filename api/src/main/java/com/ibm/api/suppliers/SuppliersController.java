package com.ibm.api.suppliers;

import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.ibm.api.suppliers.dtos.GetOneSupplierDto;
import com.ibm.api.suppliers.dtos.GetAllSuppliersDto;

import java.util.Collection;
import java.util.Optional;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.beans.factory.annotation.Autowired;

@RestController
@RequestMapping(value="/suppliers")
@CrossOrigin(origins="*", methods={RequestMethod.GET})
public class SuppliersController {

  @Autowired
  private SuppliersService suppliersService;

  @GetMapping()
  public Collection<GetAllSuppliersDto> getAllSuppliers() {
    return this.suppliersService.getAllSuppliers();
  }

  @GetMapping()
  public Optional<GetOneSupplierDto> getOneSupplier(
    @PathVariable("id") Double id
  ) {
    return this.suppliersService.getOneSupplier(id);
  }

}