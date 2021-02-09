import React from 'react';
import axios from 'axios';

import env from '../envs/env';
import SuppliersDetails from './SuppliersDetails';
import SuppliersListItem from './SuppliersListItem';

import { GetAllSuppliersDto } from '../dtos/suppliersDtos';

const SuppliersList: React.FC = () => {
  const [suppliers, setSuppliers] = React.useState([]);
  const [selectedSupplier, setSelectedSupplier] = React.useState<GetAllSuppliersDto>();

  React.useEffect(() => {
    axios
      .get(`${env.apiUrl}/suppliers`)
      .then(response => response.data)
      .then(setSuppliers)
  }, []);

  return (
    <ul>
      {suppliers.map((supplier: GetAllSuppliersDto) => (
        <li onClick={() => setSelectedSupplier(supplier)}>
          <SuppliersListItem supplier={supplier} />
        </li>
      ))}

      {selectedSupplier && (
        <SuppliersDetails id={selectedSupplier.id} />
      )}
    </ul>
  );
}

export default SuppliersList;
