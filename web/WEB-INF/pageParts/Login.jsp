<%@include file="/WEB-INF/view/website/header.jsp" %>
<%@ page pageEncoding="UTF-8" %>
<h2>Login</h2>
<div style="padding: 80px 0px; text-align: center">
    <form method="post">
        <input type="text" style="width: 400px" placeholder="Gebruikersnaam"><br>
        <input type="password" style="width: 400px" placeholder="Wachtwoord"><br>
        <input type="submit" style="width:300px" value="Log in"><br>
    </form>
    <a href="/registreer" style="color:#000">Registreer</a>
</div>
<%@include file="/WEB-INF/view/website/footer.jsp" %>