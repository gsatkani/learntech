let listProduct= new Promise((resolve,reject)=>{
    console.log("line 1")
     setTimeout(()=>{
           resolve("List of Products")
     },5000);
     console.log("line 50")
})

let data=fetch("https://jsonplaceholder.typicode.com/posts");
 async function getProductDetails(){
       let ul=document.createElement("ul"); 
       
       let list=await listProduct;
       let userData=await data;
       let x=await userData.json()
       x.forEach(element => {
            let li=document.createElement("li"); 
        //document.getElementById("h3").innerText=element.userId +" --" +element.id +"--"+element.title  
        li.innerHTML=element.userId +" --" +element.id +"--"+element.title 
        ul.appendChild(li)
       });
       //document.getElementById("h3").innerText=x
        document.getElementById("list").appendChild(ul);
        console.log(list)
       console.log(x)
}
console.log("line 100")
getProductDetails()
