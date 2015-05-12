<jsp:include page="/WEB-INF/view/cms/header.jsp">
    <jsp:param name="title" value="Voorraadbeheer" />
</jsp:include>
<%@ page pageEncoding="UTF-8" %>
<div class="tableWrap">
    <table class="dataTable">
        <tr>
            <th>Nummer</th>
            <th>Artikel</th>
            <th>Voorraad</th>
            <th>Acties</th>
        </tr>
        <tr>
            <td>A000001</td>
            <td>Wieldop</td>
            <td>983</td>
            <td>
                <button>Muteren</button>
                <button>Bestellen</button>
                <button>Verwijderen</button>
            </td>
        </tr>
        <tr>
            <td>A000002</td>
            <td>Auto band A44</td>
            <td>234</td>
            <td>
                <button>Muteren</button>
                <button>Bestellen</button>
                <button>Verwijderen</button>
            </td>
        </tr>
        <tr>
            <td>A000003</td>
            <td>Motor klep Audi 7t</td>
            <td>5</td>
            <td>
                <button>Muteren</button>
                <button>Bestellen</button>
                <button>Verwijderen</button>
            </td>
        </tr>
        <tr>
            <td>A000004</td>
            <td>Type 61 #34A</td>
            <td>145</td>
            <td>
                <button>Muteren</button>
                <button>Bestellen</button>
                <button>Verwijderen</button>
            </td>
        </tr>
    </table>
</div>
<footer class="contentMenu">
    <ul class="menu">
        <li class="button">
            <a href="/cms/" title="">Artikel toevoegen</a>
        </li>
    </ul>
</footer>
<%@include file="/WEB-INF/view/cms/footer.jsp" %>