export class Product{
    id:number | undefined;
    name:string | undefined;
    price: number | undefined;
    quantity:number | undefined;  

    constructor(id:number,name:string,price:number,quantity:number){
      this.id=id;
      this.name=name;
      this.price=price;
      this.quantity=quantity
    }
}