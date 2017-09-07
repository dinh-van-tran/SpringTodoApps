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
	                <th>todo.user</th>
	                <th>todo.desc</th>
	                <th>todo.targetDate</th>
	                <th>todo.done</th>
	            </tr>
            </c:forEach>
        </tbody>
    </table>
</div>
<%@ include file="common/footer.jspf" %>