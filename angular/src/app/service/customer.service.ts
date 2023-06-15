import { Injectable } from '@angular/core';
import { Customer } from 'src/model/customer';

@Injectable({
  providedIn: 'root'
})
export class CustomerService {

  customerList:Customer[] = []
  constructor() { }

  addCustomer(customer:any){
     this.customerList.push(customer)
     console.log(this.customerList)
     alert("Customer Added")
  }
  getCustomerList(){
    return this.customerList
  }
  findByCustomerId(id:string) {
      return this.customerList.find(customer => id==customer.ssn)
  }
  updateCustomer(){

  }
  removeCustomer(){

  }
  
}
