<jsp:include page="/WEB-INF/view/cms/header.jsp">
    <jsp:param name="title" value="Bestellingen" />
</jsp:include>
<%@ page pageEncoding="UTF-8" %>
<div class="tableWrap">
    <table class="dataTable">
        <tr>
            <th>Nummer</th>
            <th>Artikel</th>
            <th>Aantal</th>
            <th>Uitgeboekt</th>
            <th>Acties</th>
        </tr>
        <tr>
            <td>B000001</td>
            <td><a href="/cms">Wieldopje</a></td>
            <td class="center">34</td>
            <td>In bestelling</td>
            <td class="right">
                <button>Uitboeken</button>
                <button>Verzenden</button>
            </td>
        </tr>
        <tr>
            <td>B000002</td>
            <td><a href="/cms">Wieldopje</a></td>
            <td class="center">34</td>
            <td>Niet geleverd</td>
            <td class="right">
                <button>Uitboeken</button>
                <button>Verzenden</button>
            </td>
        </tr>
        <tr>
            <td>B000003</td>
            <td><a href="/cms">Wieldopje</a></td>
            <td class="center">34</td>
            <td>Geleverd</td>
            <td class="right">
                <button>Uitboeken</button>
                <button>Verzenden</button>
            </td>
        </tr>
    </table>
</div>
<footer class="contentMenu">
    <ul class="menu">
        <li class="button">
            <a href="/cms/" title="">Nieuwe bestellng</a>
        </li>
        <li class="button">
            <a href="/cms/" title="">Toon afgeronde</a>
        </li>
    </ul>
</footer>
<%@include file="/WEB-INF/view/cms/footer.jsp" %>