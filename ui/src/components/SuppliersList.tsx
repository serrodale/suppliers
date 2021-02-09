import React from 'react';
import axios from 'axios';

import env from '../envs/env';
import SuppliersDetails from './SuppliersDetails';
import SuppliersListItem from './SuppliersListItem';

import { GetAllSuppliersDto } from '../dtos/suppliersDtos';
import { List, Header, Container, Grid, Modal } from 'semantic-ui-react';

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
      <Grid columns='equal'>
        <Header as='h1' content='Suppliers' />
      </Grid>

      <List divided relaxed>
        {suppliers.map((supplier: GetAllSuppliersDto) => (
          <li onClick={() => setSelectedSupplier(supplier)}>
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
          centered={false}
          onClose={() => setTimeout(() => setSelectedSupplier(undefined))}
        >
          <SuppliersDetails
            id={selectedSupplier.id}
          />
        </Modal>
      )}
    </Container>
  );
}

export default SuppliersList;
