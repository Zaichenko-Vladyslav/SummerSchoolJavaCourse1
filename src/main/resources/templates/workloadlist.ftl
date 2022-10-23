<#import "/spring.ftl" as spring/>
<!DOCTYPE html>
<html lang="en">
<head>
    <meta charset="UTF-8">
    <title>Workload List</title>
    <link rel="stylesheet" href="https://stackpath.bootstrapcdn.com/bootstrap/4.5.2/css/bootstrap.min.css"
          integrity="sha384-JcKb8q3iqJ61gNV9KGb8thSsNjpSL0n8PARn9HuZOnIxN0hoP+VmmDGMN5t9UJ0Z" crossorigin="anonymous">
</head>
<body>
    <div>
        <table class="table table-dark">
            <tr>
                <th>Subject</th>
                <th>Amount of hours</th>
                <th>Payment</th>
            </tr>
            <#list list as item>
                <tr>
                    <td>${item.subject}</td>
                    <td>${item.amountOfHours}</td>
                    <td>${item.payment}</td>
                </tr>
            </#list>
        </table>
    </div>
</body>
</html>