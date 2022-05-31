<%@ taglib prefix="form" uri="http://www.springframework.org/tags/form" %>
<!DOCTYPE html>
<html>
<head>
</head>
<body>

    <form:form action="processForm" modelAttribute="student1">

    city : <form:input path="city" />
    First name : <form:input path="FirstName" />

    <br><br>

    last name : <form:input path="LastName" />



    <input type="submit" value="Submit" />

    </form:form>
</body>
</html>