import { Component, OnInit } from '@angular/core';
import { FormControl, FormGroup } from '@angular/forms';
import { Customer } from 'src/model/customer';
import { CustomerService } from '../service/customer.service';

@Component({
  selector: 'app-user',
  templateUrl: './user.component.html',
  styleUrls: ['./user.component.css']
})
export class UserComponent  implements OnInit{
   //Dependency Injection  - Injection service object in UserComponent Class
   constructor(private customerService:CustomerService){
   }
  ngOnInit(): void {
     this.getCustomerList();
  }
  customerForm= new FormGroup({
      ssn : new FormControl(''),
      cname : new FormControl(''),
      mobile : new FormControl(''),
      email : new FormControl(''),
      dateOfBirth : new FormControl('')
  })
  addCustomer(){
    alert("Submit Button Clicked")
    console.log(this.customerForm)
    console.log(this.customerForm.value)
    console.log(this.customerForm.controls["ssn"].value)
    console.log(this.customerForm.controls["cname"].value)
    console.log(this.customerForm.controls["mobile"].value)
    console.log(this.customerForm.controls["email"].value)
    console.log(this.customerForm.controls["dateOfBirth"].value)
    this.customerService.addCustomer(this.customerForm.value)   
  }
  getCustomerList(){
    console.log(this.customerService.getCustomerList())
  }
}
