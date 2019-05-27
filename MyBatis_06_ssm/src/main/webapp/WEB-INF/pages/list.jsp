<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<%@taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<head>
    <title>员工列表</title>
</head>
<body>
    <table>
            <tr>
                <td>id</td>
                <td>lastName</td>
                <td>email</td>
                <td>gender</td>
            </tr>
        <script>
            debugger;
            console.log(1);
            console.log(${allEmpsfuck});
        </script>
        <c:forEach items="${allEmps }" var="emp">
            <tr>
                <td>${emp.id }</td>
                <td>${emp.lastName }</td>
                <td>${emp.email }</td>
                <td>${emp.gender }</td>
            </tr>
        </c:forEach>
    </table>
</body>
</html>
