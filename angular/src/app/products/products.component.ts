import { Component, OnInit } from '@angular/core';
import { ProductService } from '../service/product.service';
import { Product } from 'src/model/product';

@Component({
  selector: 'app-products',
  templateUrl: './products.component.html',
  styleUrls: ['./products.component.css']
})
export class ProductsComponent implements OnInit {

  productList:Product[]=[]
  constructor(private servce:ProductService){

  }
  ngOnInit(): void {
    this.servce.getListOfProducts().subscribe(data => {
      this.productList=data
      

      console.log("Product List " + this.productList)
    })
  }

}
