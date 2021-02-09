import React from 'react';
import { GetAllSuppliersDto } from '../dtos/suppliersDtos';

interface Props {
  supplier: GetAllSuppliersDto;
}

const SuppliersListItem: React.FC<Props> = ({ supplier }) => {
  return (
    <>{supplier.name}</>
  );
}

export default SuppliersListItem;
