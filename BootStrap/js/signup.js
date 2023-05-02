const userName = document.getElementById("uname")
const email = document.getElementById("email")
const error = document.getElementById("error")
const gender= document.getElementsByName("gender")
const city=document.getElementById("city")
console.log(gender)
function signUpValidate() { 
 alert("----")
  alert(`${userName.value} ${email.value} `)
   if(userName.value.length<2 || userName.value.lengh>20){
    alert("Name length should be 2-20")
    error.innerText="Name length should be 2-20";
    userName.focus()
    return false
   }
   let flag=""
  for (let i = 0; i < gender.length; i++) {
    if(gender[i].checked) {
         flag=gender[i].value
     }
  }
  if(flag==""){
    alert("Select the gender")
 }
 if(city.value === ""){
    alert("Select the City")
 }

}

