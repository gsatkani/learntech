function add(a,b) {
    return a+b;
}

let sub=(x,y) =>{
    return x-y;
}

function calculate (num1,num2,callBack){
    console.log(callBack(num1,num2))
}
//setTimeout(calculate(56,67,add),5000)
calculate(10,20,add)
calculate(34,56,sub)
