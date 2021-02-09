import React from 'react';
import axios from 'axios';
import env from '../envs/env';

import { GetOneSupplierDto } from '../dtos/suppliersDtos';

interface Props {
  id: number;
}

const SuppliersListItem: React.FC<Props> = ({ id }) => {
  const [supplier, setSupplier] = React.useState<GetOneSupplierDto>();

  React.useEffect(() => {
    axios
      .get(`${env.apiUrl}/supplier/${id}`)
      .then(response => response.data)
      .then(setSupplier)
  }, []);

  return (
    <>
      {
        supplier
          ? <p>{supplier.cif}</p>
          : <p>Loading...</p>
      }
    </>
  );
}

export default SuppliersListItem;
