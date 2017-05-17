
<%--
  Created by IntelliJ IDEA.
  User: USER
  Date: 5/17/2017
  Time: 10:18 AM
  To change this template use File | Settings | File Templates.
--%>
<%@ taglib prefix="form" uri="http://www.springframework.org/tags/form" %>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<html>
<head>
    <title>User Input</title>
</head>
<body>
<form:form  method="POST" action="/addUserInput">
    <fieldset>
        <legend>User Information:</legend>
        <table>
            <tr>
                <td><form:label path="firstName">First Name: </form:label></td>
                <td><form:input name="firstName" path="firstName"/></td>
            </tr>
            <tr>
                <td><form:label path="lastName">Last Name: </form:label></td>
                <td><form:input path="lastName"/></td>
            </tr>
            <tr>
                <td><form:label path="orderNumber">Order # : </form:label></td>
                <td><input type="text" value="44672"></td>

            </tr>
            <tr>
                <td>
                    <input type="submit" value="submit">
                </td>
            </tr>
        </table>

    </fieldset>
</form:form>


</body>
</html>
