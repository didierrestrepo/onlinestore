import { Size } from 'app/shared/model/enumerations/size.model';

export interface IProduct {
  id?: number;
  name?: string;
  descripcion?: string;
  price?: number;
  size?: Size;
  imageContentType?: string;
  image?: any;
  productCategoryNombre?: string;
  productCategoryId?: number;
}

export class Product implements IProduct {
  constructor(
    public id?: number,
    public name?: string,
    public descripcion?: string,
    public price?: number,
    public size?: Size,
    public imageContentType?: string,
    public image?: any,
    public productCategoryNombre?: string,
    public productCategoryId?: number
  ) {}
}
