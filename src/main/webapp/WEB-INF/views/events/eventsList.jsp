<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c" %>
<%@ taglib uri="http://java.sun.com/jsp/jstl/fmt" prefix="fmt" %>
<jsp:useBean id="now" class="java.util.Date"/>
<%@ page contentType="text/html; charset=UTF-8"%>
<%@include file="../dynamic/header.jspf"%>
<%@ taglib prefix="security" uri="http://www.springframework.org/security/tags" %>

<!-- Page Content-->
        <div class="container px-4 px-lg-5">
            <!-- Call to Action-->
            <div class="card text-white bg-secondary my-5 py-4 text-center">
                <div class="card-body"><a class="btn btn-primary" href='<c:url value="/addEvent"/>'>DODAJ NOWE WYDARZENIE!</a></div>
            </div>
            <!-- Heading Row-->
             <c:forEach items="${eventModel}" var="event">
            <div class="row gx-4 gx-lg-5 align-items-center my-5">
                <div class="col-lg-6"><img src="data:image/*;base64,${event.picture}" width="550" height="350" float="right"/></div>

                <div class="col-lg-6">
                    <h1 class="font-weight-light">${event.title}</h1>
                    <p>${event.description}</p>
                    <p>Data wydarzenia: ${event.eventDate}</p>
                    <p>Ilość dostępnych miejsc: ${event.numberOfSlots}</p>
                    <c:if test="${userModel.userRole == 'ADMIN'}">
                        <a class="btn btn-primary" href='<c:url value="/editEvent/${event.id}"/>'>Edytuj</a>
                        <a class="btn btn-danger" href='<c:url value="/deleteEvent/${event.id}"/>'>Usuń</a>
                    </c:if>
                    <form method="post" action='<c:url value="/signUp/${event.id}"/>'>
                        <input class="btn btn-success" type="submit" value="Zapisz się" id="searchButton">
                    </form>
                        <%--<a class="btn btn-secondary" href=''>Skomentuj</a>--%>
                </div>
            </div>
             </c:forEach>
        </div>

<%--        <!-- Footer-->--%>
<%@include file="../dynamic/footer.jspf"%>

<%--        <!-- Bootstrap core JS-->--%>
<%--        <!-- Core theme JS-->--%>
<%@include file="../dynamic/javaScript.jspf"%>
