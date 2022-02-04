const url = "http://localhost:3000/"

document.getElementById("SubmitRequest").addEventListener("click", submitFunction);

async function submitFunction() {

    let amount = document.getElementById("amount").value;
    let status = document.getElementById("status").value;
    let id = document.getElementById("id").value;

    let reimb = {
        amount:amount,
        status:status,
        author:id
    }

    console.log(reimb)

    let response = await fetch (url + "employee/submit", {
        method: "POST",
        body: JSON.stringify(reimb),
        credentials: "include"
    });

    console.log(response.status);

    if (response.status === 201) {
        window.location.href = 'ReSuccess.html'
    } else {
        window.location.href = 'ReFailure.html'
    }
}