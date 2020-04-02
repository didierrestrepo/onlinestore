export interface IStock {
  id?: number;
  cantidad?: number;
  estado?: boolean;
  productName?: string;
  productId?: number;
}

export class Stock implements IStock {
  constructor(
    public id?: number,
    public cantidad?: number,
    public estado?: boolean,
    public productName?: string,
    public productId?: number
  ) {
    this.estado = this.estado || false;
  }
}
