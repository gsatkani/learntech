let city=['Pune','Goa','Delhi','Vizag','Kochi','Goa','Chennai']
console.log("----------------------")
for (let index = 0; index < city.length; index++) {
   console.log(city[index])
}
console.log("----------------------")
for (const key in city) {
   console.log(key)
}
console.log("----------------------")
for (const val of city) {
    console.log(val)
}
console.log("----------------------")

city.forEach(x=>{
    console.log(x)
})
console.log("----------------------")

//Java  Eight Streams 
let x=city.filter( x=> x.length>3).map(x => x.toUpperCase())
console.log(x)

let find= city.find(x=> x === 'Goa')
console.log(find)
let findI= city.findIndex(x=> x === 'Goa')
console.log(findI)