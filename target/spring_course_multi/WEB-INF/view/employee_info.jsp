<%@ taglib prefix="form" uri="http://www.springframework.org/tags/form" %>
<%--
  Created by IntelliJ IDEA.
  User: User
  Date: 26.08.2021
  Time: 18:14
  To change this template use File | Settings | File Templates.
--%>
<!DOCTYPE html>
<html>
<body>

<h2>Employee info</h2>
<br>

<%--do not forget references for Spring framework tags (for "form"--%>
<form:form action="saveEmployee" modelAttribute="emp">
<%--invisible form to save value of id--%>
    <form:hidden path="id"/>

    Name<form:input path="name"/>
    <br>
    Surname<form:input path="surname"/>
    <br>
    Department<form:input path="dep"/>
    <br>
    Salary<form:input path="salary"/>
    <br>
    <input type="submit" value="OK">
    <br>
</form:form>


</body>
</html>
