// Construtor
class Shape {
    constructor(length, bredth) {
        this.length = length;
        this.bredth = bredth;
    }
    arae (){
        console.log(`Area of Reactangle${this.length*this.bredth}`)
    }
}

let rectangle=new Shape(10,20);

let map=new Map()

map.set(1,100)
map.set(2,100)
map.set(3,100)
map.set(4,100)
// get has delete
// keys() values() map.entries
for( let key of map.keys()){
    console.log(key)
}

for (const val of map.values()) {
    console.log(val)
}

for (const map1 of map.entries()) {
    console.log(map1)
   
}

map.forEach((v,k)=>{
     console.log(`${k} --- ${v}`)
} )

rectangle.arae()
