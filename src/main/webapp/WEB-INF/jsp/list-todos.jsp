<%@ include file="common/header.jspf" %>
<div class="container">
    <table class="table table-stripped">
        <thead>
            <tr>
                <th>Name</th>
                <th>Description</th>
                <th>Date</th>
                <th>Completed</th>
                <th></th>
            </tr>
        </thead>
        <tbody>
            <c:forEach item="${todos}" var="todo">
	            <tr>
	                <td>todo.user</td>
	                <td>todo.desc</td>
	                <td><fmt:formatDate pattern="dd/MM/yyyy" value="${todo.targetDate}"/></td>
	                <td>todo.done</td>
	                <td>
	                    <a type="button" class="btn btn-primary" href="/update-todo?id=${todo.id}">Edit</a>
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