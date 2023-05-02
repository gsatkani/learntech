
const product=document.querySelector("input")
const button=document.querySelector("button")
const div=document.getElementById("result")

button.addEventListener('click', ()=>{
   const pName=product.value
   if(pName == "" || pName == " "){
     alert("Product Name is required")
     product.focus() 
     return
   }
   let ul=document.createElement("ul")
   let li=document.createElement("li")
   let h3 =document.createElement("h3")
   const del= document.createElement("button")
   div.setAttribute('class','highlighter') 
   h3.textContent=pName
   del.textContent="Delete"
   del.style.backgroundColor="red"
   del.style.borderRadius="5px"
   del.style.padding="5px"
   li.style.listStyleType="circle"
   del.style.marginLeft="20px"
   li.appendChild(h3)
   h3.appendChild(del)
   ul.appendChild(li)
   div.appendChild(ul)
   del.addEventListener('click',()=>{
       ul.removeChild(li)
       div.removeChild(ul)
   })
   del.addEventListener('mouseover',()=>{
    del.style.backgroundColor="yellow"
})
del.addEventListener('mouseout',()=>{
    del.style.backgroundColor="red"
})
   product.value=""
   
})
