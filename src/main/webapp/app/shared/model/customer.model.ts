export interface ICustomer {
  id?: number;
  firstName?: string;
  lastName?: string;
  email?: string;
  phone?: string;
  addresLine1?: string;
  userId?: number;
}

export class Customer implements ICustomer {
  constructor(
    public id?: number,
    public firstName?: string,
    public lastName?: string,
    public email?: string,
    public phone?: string,
    public addresLine1?: string,
    public userId?: number
  ) {}
}
