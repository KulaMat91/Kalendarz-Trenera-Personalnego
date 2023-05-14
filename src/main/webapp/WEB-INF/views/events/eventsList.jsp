<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c" %>
<%@ taglib uri="http://java.sun.com/jsp/jstl/fmt" prefix="fmt" %>
<jsp:useBean id="now" class="java.util.Date"/>
<%@ page contentType="text/html; charset=UTF-8"%>
<%@include file="../dynamic/header.jspf"%>

        <!-- Page Content-->
        <div class="container px-4 px-lg-5">
            <!-- Call to Action-->
            <div class="card text-white bg-secondary my-5 py-4 text-center">
                <div class="card-body"><a class="btn btn-primary" href='<c:url value="/addEvent"/>'>DODAJ NOWE WYDARZENIE!</a></div>
            </div>
            <!-- Heading Row-->
             <c:forEach items="${eventModel}" var="event">
            <div class="row gx-4 gx-lg-5 align-items-center my-5">
                <div class="col-lg-7"><img class="img-fluid rounded mb-4 mb-lg-0" src="data:image/jpg;base64,${event.picture}" alt="imgg" /></div>
                <div class="col-lg-5">
                    <h1 class="font-weight-light">${event.title}</h1>
                    <p>${event.description}</p>
                    <p>${event.eventDate}</p>
                    <p>${event.numberOfSlots}</p>
                    <a class="btn btn-primary" href='<c:url value="/editEvent/${event.id}"/>'>Edytuj</a>
                    <a class="btn btn-primary" href=''>Usuń</a>
                </div>
            </div>
             </c:forEach>
        </div>

<%--        <!-- Footer-->--%>
<%@include file="../dynamic/footer.jspf"%>

<%--        <!-- Bootstrap core JS-->--%>
<%--        <!-- Core theme JS-->--%>
<%@include file="../dynamic/javaScript.jspf"%>
