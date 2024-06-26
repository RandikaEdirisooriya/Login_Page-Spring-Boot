function saveCitizan(){
    let FirstName=$(`#FirstName`).val();
    let LastName=$(`#LastName`).val();
    let NIC=$(`#Nic`).val();
    let ContactNumber=$(`#ContactNumber`).val();
    let Address=$(`#Address`).val();
    let EmailAddress=$(`#EmailAddress`).val();
    let Password=$(`#Password`).val();


    $.ajax({
        method:"POST",
        contentType:"application/json",
        url:"http://localhost:8080/api/v1/citizan/saveCitizan",
        async:true,
        data:JSON.stringify({
            "id": "",
            "address": Address,
            "contactNumber":ContactNumber,
            "emailAddress":EmailAddress,
            "firstName": FirstName,
            "lastName":LastName,
            "nic": NIC,
            "password": Password

        }),
        success:function (data){

            alert("saved")

        },
        error:function (){
            alert("Error")
        }
    })
}