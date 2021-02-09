import React from 'react';
import axios from 'axios';

import env from '../envs/env';
import SupplierDetails from './SupplierDetails';
import SuppliersListItem from './SuppliersListItem';

import { GetAllSuppliersDto } from '../dtos/suppliersDtos';
import { List, Header, Container, Modal } from 'semantic-ui-react';

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
    <Container text>
      <Header as='h1' content='Suppliers' />

      <List divided relaxed>
        {suppliers.map((supplier: GetAllSuppliersDto) => (
          <li
            key={supplier.id}
            onClick={() => setSelectedSupplier(supplier)}
          >
            <SuppliersListItem
              key={supplier.id}
              supplier={supplier}
            />
          </li>
        ))}
      </List>

      {selectedSupplier && (
        <Modal
          size='tiny'
          open={!!selectedSupplier}
          onClose={() => setTimeout(() => setSelectedSupplier(undefined))}
        >
          <SupplierDetails
            id={selectedSupplier.id}
          />
        </Modal>
      )}
    </Container>
  );
}

export default SuppliersList;
