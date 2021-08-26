<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<%--
  Created by IntelliJ IDEA.
  User: User
  Date: 25.08.2021
  Time: 20:46
  To change this template use File | Settings | File Templates.
--%>
<!DOCTYPE html>
<html>
<body>
<table>
    <tr>
        <th>Name</th>
        <th>Surname</th>
        <th>Department</th>
        <th>Salary</th>
        <th>Operations</th>
    </tr>

    <%--    important to press ALT+Enter to add taglib--%>
    <c:forEach var="emp" items="${allEmps}">
<%--creation of link on which we will go. Also add to it information about employee Id--%>
        <c:url var="linkForUpdateButton" value="/api/updateInfo">
            <c:param name="empId" value="${emp.id}">
            </c:param>
        </c:url>

        <tr>
            <td>${emp.name}</td>
            <td>${emp.surname}</td>
            <td>${emp.dep}</td>
            <td>${emp.salary}</td>
            <td>
                <input type="button" value="Update"
                onclick="window.location.href='${linkForUpdateButton}'"/>
            </td>
        </tr>
    </c:forEach>

</table>
<br>
<input type="button" value="Add"
       onclick="window.location.href='addNewAmp'"/>


</body>
</html>
