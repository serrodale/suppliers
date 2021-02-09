import React from 'react';
import axios from 'axios';
import env from '../envs/env';

import { GetOneSupplierDto } from '../dtos/suppliersDtos';

interface Props {
  id: number;
}

const SupplierDetails: React.FC<Props> = ({ id }) => {
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
          ? <>{supplier.name} ({supplier.cif}) [{supplier.createdAt}]</>
          : <>Loading...</>
      }
    </>
  );
}

export default SupplierDetails;
