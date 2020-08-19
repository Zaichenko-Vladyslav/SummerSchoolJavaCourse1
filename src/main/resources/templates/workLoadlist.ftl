<#import "/spring.ftl" as spring/>
<!DOCTYPE html>
<html lang="en">
<head>
    <meta charset="UTF-8">
    <title>WorkLoad list</title>
    <link rel="stylesheet" href="https://stackpath.bootstrapcdn.com/bootstrap/4.5.2/css/bootstrap.min.css" integrity="sha384-JcKb8q3iqJ61gNV9KGb8thSsNjpSL0n8PARn9HuZOnIxN0hoP+VmmDGMN5t9UJ0Z" crossorigin="anonymous">

</head>
<body>
<div>
    <table class="table table-dark">
        <tr>
            <th>Group</th>
            <th>Teacher</th>
            <th>Subject</th>
            <th>Type Of Class</th>
            <th>Amount Of Hours</th>
            <th>Payment</th>
            <th>Update</th>
            <th>Delete</th>
        </tr>
        <#list list as item>
            <tr>
                <td>${item.group.getName()}</td>
                <td>${item.teacher.getName()}</td>
                <td>${item.subject}</td>
                <td>${item.typeOfClass}</td>
                <td>${item.amountOfHours}</td>
                <td>${item.payment}</td>
                <td><a href="http://localhost:8080/web/workLoad/update/${item.id}">
                        <input type="button" value="update" class="btn-primary"></a>
                </td>
                <td><a href="http://localhost:8080/web/workLoad/delete/${item.id}">
                        <input type="button" value="delete" class="btn-danger">
                    </a>
            </tr>
        </#list>

    </table>
    <a href="/web/workLoad/reloadDB">
        <input type="button", value="Reload Database" class="btn-danger"></a>
    </a>
</div> <div>
    <a href="/web/workLoad/create">
        <input type="button" value="New WorkLoad From" class="btn-danger">
    </a>
</div>
</body>
</html>
