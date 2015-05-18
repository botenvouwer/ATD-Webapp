<%@include file="/WEB-INF/view/website/header.jsp" %>
<%@ page pageEncoding="UTF-8" %>
<h2>Registreren</h2>
<p>Nieuwe klanten kunnen zich hier registreren!</p>
    <form method="post">
        <table class="registreer">
            <tr>
                <td>
                    Naam:
                </td>
                <td>
                    <input type="text" style="width: 400px" placeholder="Naam"><br>
                </td>
            </tr>
            <tr>
                <td>
                    Gebruikersnaam:
                </td>
                <td>
                    <input type="text" style="width: 400px" placeholder="Gebruikersnaam"><br>
                </td>
            </tr>
            <tr>
                <td>
                    Wachtwoord:
                </td>
                <td>
                    <input type="password" style="width: 400px" placeholder="Wachtwoord"><br>
                </td>
            </tr>
            <tr>
                <td>
                    Herhaal wachtwoord:
                </td>
                <td>
                    <input type="password" style="width: 400px" placeholder="Herhaal wachtwoord"><br>
                </td>
            </tr>
            <tr>
                <td>
                    E-mailadres:
                </td>
                <td>
                    <input type="text" style="width: 400px" placeholder="E-mail"><br>
                </td>
            </tr>
            <tr>
                <td>
                    Adres:
                </td>
                <td>
                    <input type="text" style="width: 400px" placeholder="Adres"><br>
                </td>
            </tr>
            <tr>
                <td>
                    Postcode:
                </td>
                <td>
                    <input type="text" style="width: 400px" placeholder="Postcode"><br>
                </td>
            </tr>
            <tr>
                <td>
                    Plaats:
                </td>
                <td>
                    <input type="text" style="width: 400px" placeholder="Plaats"><br>
                </td>
            </tr>
        </table>
        <input type="submit" value="Registreer"><br>
    </form>
    <p>Heeft u al een account? Klik dan <a href="/login" style="color:#000">hier</a> om naar de loginpagina te gaan!</p>
</div>
<%@include file="/WEB-INF/view/website/footer.jsp" %>