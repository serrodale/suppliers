export interface GetOneSupplierDto {
  createdAt: string;
  name: string;
  cif: string;
  logoUrl: string;

}

export interface GetAllSuppliersDto {
  id: number;
  name: string;
}