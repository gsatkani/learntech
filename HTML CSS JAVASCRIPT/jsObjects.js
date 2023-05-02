// class 
let employee = { 
     name: "Ajay",
     age: 22,
     mobile : 7894561236,
     email : 'ajay@gmail.com',
     salary: 23000.50,
     address : {
           houseNo: '2/155', 
           street : 'Anna Nagar',
           city : 'Chennai'

     },
     displayEmployee : ()=>{
         console.log(employee)
     }
}

console.log(employee)
console.log(employee.name)
console.log(employee.address)
console.log(employee.address.city)

console.log(employee["mobile"])

employee.displayEmployee()