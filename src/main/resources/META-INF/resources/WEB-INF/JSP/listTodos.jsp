<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>


<html>
<head>
    <title>
        List Todos Page
    </title>
</head>
<body>
<div>
    <h1>your Todos are:</h1>
    
</div>


<table>
    <thead>
    <tr>
        <th>
            id
        </th>
        <th>
            Description
        </th>
        <th>
            Target Date
        </th>
        <th>
            isDone
        </th>
    </tr>
    </thead>
    <tbody>
    <c:forEach items="${todoList}" var="todo">
        <tr>
            <td>
                ${todo.id}
            </td>
            <td>
                    ${todo.description}
            </td>
            <td>
                ${todo.localdate}

            </td>
            <td>
                ${todo.done}

            </td>
        </tr>
    </c:forEach>
    </tbody>

</table>



</tbody>

</body>
</html>