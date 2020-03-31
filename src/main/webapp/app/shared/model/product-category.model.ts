import { IProduct } from 'app/shared/model/product.model';

export interface IProductCategory {
  id?: number;
  name?: string;
  descripcion?: string;
  productos?: IProduct[];
}

export class ProductCategory implements IProductCategory {
  constructor(public id?: number, public name?: string, public descripcion?: string, public productos?: IProduct[]) {}
}
