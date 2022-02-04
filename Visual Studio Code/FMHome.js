const url = "http://localhost:3000/"

document.getElementById("ViewHistory").addEventListener("click", viewAllReimb);
document.getElementById("Update").addEventListener("click", updateReimb);

//This pulls up the ers_reimbusement table
async function viewAllReimb() {

    let response = await fetch(url + "manager/view", {credentials: "include"});

    console.log(response);

    if(response.status === 200) {

        let data = await response.json();

        console.log(data);

        for(let employee of data){

            let row = document.createElement("tr");
            
            let cell = document.createElement("td");
            cell.innerHTML = employee.author;
            row.appendChild(cell);

            let cell2 = document.createElement("td");
            cell2.innerHTML = employee.amount;
            row.appendChild(cell2);

            let cell3 = document.createElement("td");
            cell3.innerHTML = employee.status
            row.appendChild(cell3);

            document.getElementById("ReimbBody").appendChild(row);
        }
    }
}

//This pulls up all users with the pending attribute in a table
async function updateReimb() {

    let id = document.getElementById("Id").value;
    let status = document.getElementById("Status").value;

    let update = {
        author:id,
        status:status
    }

    console.log(update)

    let response = await fetch (url + "manager/status", {
        method: "POST", 
        body: JSON.stringify(update), 
        credentials: "include"
    })

    console.log(response.status);

    if(response.status === 201) {
        window.location.href = "FMHome.html"
    }else {
        window.location.href = "ReFailure"
    }
}