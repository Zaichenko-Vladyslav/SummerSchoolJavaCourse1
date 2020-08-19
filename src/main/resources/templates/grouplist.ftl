<#import "/spring.ftl" as spring/>
<!DOCTYPE html>
<html lang="en">
<head>
    <meta charset="UTF-8">
    <title>Group list</title>
    <link rel="stylesheet" href="https://stackpath.bootstrapcdn.com/bootstrap/4.5.2/css/bootstrap.min.css" integrity="sha384-JcKb8q3iqJ61gNV9KGb8thSsNjpSL0n8PARn9HuZOnIxN0hoP+VmmDGMN5t9UJ0Z" crossorigin="anonymous">

</head>
<body>
<div>
    <table class="table table-dark">
        <tr>
            <th>Name</th>
            <th>Specialty</th>
            <th>Department</th>
            <th>Description</th>
            <th>Amount Of Students</th>
            <th>Update</th>
            <th>Delete</th>
        </tr>
        <#list list as item>
            <tr>
                <td>${item.name}</td>
                <td>${item.specialty}</td>
                <td>${item.department}</td>
                <td>${item.description}</td>
                <td>${item.amountOfStudents}</td>
                <td><a href="http://localhost:8080/web/group/update/${item.id}">
                        <input type="button" value="update" class="btn-primary"></a>
                </td>
                <td><a href="http://localhost:8080/web/group/delete/${item.id}">
                        <input type="button" value="delete" class="btn-danger">
                    </a>
            </tr>
        </#list>

    </table>
    <a href="/web/group/reloadDB">
        <input type="button", value="Reload Database" class="btn-danger"></a>
    </a>
</div> <div>
    <a href="/web/group/create">
        <input type="button" value="New Group From" class="btn-danger">
    </a>
</div>
</body>
</html>
