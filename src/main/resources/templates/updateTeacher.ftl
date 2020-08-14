<#import "/spring.ftl" as spring/>
<!DOCTYPE html>
<html lang="en">
<head>
    <meta charset="UTF-8">
    <title>Title</title>
    <link rel="stylesheet"
          type="text/css" href="<@spring.url '/css/style.css'/>"/>
</head>
<body>
<div>
    <fieldset>
        <legend>Update teacher</legend>
        <form name="teacher" action="" method="POST">
            Name:<@spring.formInput "teacherForm.name" "" "text"/>
            <br>
            Description:<@spring.formInput "teacherForm.description" "" "text"/>
            <br>
            Telephone:<@spring.formInput "teacherForm.telephone" "" "text"/>
            <br>
            <input type="submit" value="Update"/>
        </form>
    </fieldset>
</div>
</body>
</html>