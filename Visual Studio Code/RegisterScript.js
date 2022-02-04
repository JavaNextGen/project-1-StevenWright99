const url = "http://localhost:3000/" //putting our base URL in a variable for cleaner code below
//eventually, we'll use this in our fetch requests and make calls to our server by appending endpoints

document.getElementById("registerButton2").addEventListener("click", registerFunction2);

async function registerFunction2() {

    //window.location="login.html";

    let usern = document.getElementById("username").value
    let userp = document.getElementById("password").value
    let fname = document.getElementById("fname").value
    let lname = document.getElementById("lname").value
    let email = document.getElementById("email").value
    let role =  document.getElementById("role").value

    let user = {
        username:usern,
        password:userp,
        fname:fname,
        lname:lname,
        email:email,
        role_id:role

    }

    console.log(user)
    
    let response = await fetch (url + "employee",{

        method: "POST", //send a POST request (would be a GET if we didn't do this...)
        body: JSON.stringify(user), //turn our user object into JSON
        credentials: "include"
        //this last line will ensure that the cookie is captured (so that we can have a user session)
        //future fetches will also require this "include" value to send the cookie back
    });

    console.log(response.status); //useful for debug :)

    //control flow based on successful/unsuccessful login
    if(response.status === 201) {
        //wipe our login row and welcome the user 
        function ReturnToLogin() {
           
            window.location.href = "login.html";
            document.write('You have successfully registered. You can now Log In.');
            setTimeout('ReturnToLogin', 3000);
           
        }
        ReturnToLogin();
        //Maybe figure this out tomorrow
        window.location.href = "login.html";
        
        //document.getElementById("loginRow").innerText="You have successfully registered!";
    } else {
        //document.getElementById("loginRow").innerText="Login failed! Refresh the page";
        //document.querySelector('#redirect')
        function ReturnToLogin2(){
            window.location.href = 'login.html';
            document.write('Registration Failed. Returning to home page.');
        }
        setTimeout('ReturnToLogin()', 4000);
        
 }
}