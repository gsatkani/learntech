import { HttpClient } from "@angular/common/http";
import { Injectable } from "@angular/core";
import { Observable } from "rxjs";
import { Product } from "src/model/product";

@Injectable({
    providedIn :"root"
})
export class ProductService {

    url="http://localhost:3000/products"
    //DI - Injecting httpclinet in ProductService
    constructor(private httpClient:HttpClient){
    }
    //A representation of any set of values over any amount of time. This is the most basic building block of RxJS.
    getListOfProducts(): Observable<Product[]> {

         let data= this.httpClient.get<Product[]>(this.url,);
          data.forEach(x =>{
            console.log(x)
          })

        //  let productList : Product[]
        // productList =[
        //     new Product(1001,"Table",5000,12),
        //     new Product(1002,"Chair",5000,12),
        //     new Product(1003,"Speaker",12000,12),
        //     new Product(1004,"Mobile",15000,12),
        // ]
        return data
    }
}