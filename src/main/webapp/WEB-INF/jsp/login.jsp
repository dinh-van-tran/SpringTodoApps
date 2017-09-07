<%@ include file="common/header.jspf" %>
<div class=container">
    <form action="/login" method="post">
        <div class="form-group">
            <label for="username">Username:</label>
            <input type="text" class="form-control" id="username" placeholder="Enter username" name="username" />
        </div>
        <div class="form-group">
            <label for="password">Password:</label>
            <input id="password" type="password" class="form-control" placeholder="Enter password" name="password" />
        </div>
        <button type="submit" class="btn btn-success">Submit</button>
    </form>
</div>
<%@ include file="common/footer.jspf" %>
