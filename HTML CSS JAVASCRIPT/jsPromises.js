let flag=true
let promise=new Promise((resolve,reject)=>{
    if(flag == true){
       setTimeout(() => {
        resolve("fulfilled: meaning that the operation was completed successfully")
       }, 5000); 
    }
    else{
        reject("rejected: meaning that the operation failed.")
    }
});
console.log( promise )
promise.then(result=>{
    document.getElementById("h3").innerText=result
    document.getElementById("h3").style.color="green"
     console.log(result)
}).catch(err=>{
    document.getElementById("h3").innerText=err
    document.getElementById("h3").style.color="red"
    console.log(err)
})

console.log( promise )