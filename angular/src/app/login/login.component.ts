import { Component } from '@angular/core';
import { Product } from 'src/model/product';
import { ProductService } from '../service/product.service';

@Component({
  selector: 'app-login',
  templateUrl: './login.component.html',
  styleUrls: ['./login.component.css']
})
export class LoginComponent {
     title="Click to Display ProductList"
     flag=true
     //productService: any  // ProductService service
     productList: Product[] =[]
     // Inject ProductService object inside the constructor
     constructor(private productService:ProductService){
      //this.productService=new ProductService()
     }
     getProducts(){
       //this.productList =this.productService.getListOfProducts()
     }

     items = []
     emploeeList=[
      {id:101,name:"Siva"},
      {id:102,name:"Karthick"},
      {id:103,name:"Madhu"},
      {id:104,name:"Nadheesh"},
      {id:105,name:"Ajay"},

     ] 

    //  productList : Product[]=[
    //      new Product(1001,"Table",5000,12),
    //      new Product(1002,"Chair",5000,12),
    //      new Product(1003,"Speaker",12000,12),
    //      new Product(1004,"Mobile",15000,12),
    //  ]

}
