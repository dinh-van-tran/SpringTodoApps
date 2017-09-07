<%@ include file="common/header.jspf" %>

<div class="container">
    <table class="table table-stripped">
        <thead>
            <th>Name</th>
            <tr>Description</tr>
            <th>Date</th>
            <th>Completed</th>
        </thead>
        <tbody>
            <c:forEach item="${todos}" var="todo">
	            <tr>
	                <td>todo.user</td>
	                <td>todo.desc</td>
	                <td>todo.targetDate</td>
	                <td>todo.done</td>
	                <td>
	                    <a type="button" class="btn btn-warning" href="/delete-todo?id=${todo.id}">Delete</a>
	                </td>
	            </tr>
            </c:forEach>
        </tbody>
    </table>
    <div>
        <a type="button" class="btn btn-success" href="/add-todo">Add</a>
    </div>
</div>
<%@ include file="common/footer.jspf" %>