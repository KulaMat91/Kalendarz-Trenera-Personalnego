<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c" %>
<%@ taglib uri="http://java.sun.com/jsp/jstl/fmt" prefix="fmt" %>
<jsp:useBean id="now" class="java.util.Date"/>
<%@ page contentType="text/html; charset=UTF-8"%>
<%@include file="../dynamic/header.jspf"%>

<!-- Page Content-->
<main class="my-form">
    <div class="cotainer">
        <div class="row justify-content-center">
            <div class="col-md-8">
                <div class="card">
                    <div class="card-header">Dodawanie wydarzenia</div>
                    <div class="card-body">
                        <form method="post" name="my-form" enctype="multipart/form-data" onsubmit="return validform()" action='<c:url value="/addEvent"/>'>
                            <div class="form-group row" >
                                <label for="title" class="col-md-4 col-form-label text-md-right">Tytuł</label>
                                <div class="col-md-6">
                                    <input type="text" id="title" class="form-control" name="title">
                                </div>
                            </div>
                            <p></p>
                            <div class="form-group row">
                                <label for="description" class="col-md-4 col-form-label text-md-right">Opis wydarzenia</label>
                                <div class="col-md-6">
                                    <textarea type="text" id="description" class="form-control" name="description"></textarea>
                                </div>
                            </div>
                            <p></p>
                            <div class="form-group row" >
                                <label  for="eventDate" class="col-md-4 col-form-label text-md-right">Data wydarzenia</label>
                                <div class="col-md-6">
                                    <input class="form-control" id="eventDate" name="eventDate" placeholder="MM/DD/YYYY" type="datetime-local"/>
                                </div>
                            </div>
                            <p></p>
<%--                            <p></p>--%>
<%--                            <div class="form-group row" >--%>
<%--                                <label  for="addDate" class="col-md-4 col-form-label text-md-right">Data dodania</label>--%>
<%--                                <div class="col-md-6">--%>
<%--                                    <input class="form-control" id="addDate" name="addDate" placeholder="MM/DD/YYYY" type="date"/>--%>
<%--                                </div>--%>
<%--                            </div>--%>
<%--                            <p></p>--%>
                            <div class="form-group row">
                                <label for="numbersOfSlots" class="col-md-4 col-form-label text-md-right">Ilość uczestników</label>
                                <div class="col-md-6">
                                    <input type="text" id="numbersOfSlots" class="form-control" name="numberOfSlots">
                                </div>
                            </div>
                            <p></p>
                            <div class="form-group row">
                                <label for="picture" class="col-md-4 col-form-label text-md-right">Dodaj zdjęcie</label>
                                <div class="col-md-6">
                                    <input type="file" id="picture" class="form-control" name="picture" accept="image/*,audio/*,.gif">
                                </div>
                            </div>
                            <p></p>
                            <div class="col-md-6 offset-md-4">
                                <input class="btn btn-warning pull-left mb-2" type="submit" value="Dodaj event" id="searchButton">
                            </div>
                        </form>
                    </div>
                </div>
            </div>
        </div>
    </div>

</main>


<%--        <!-- Footer-->--%>
<%@include file="../dynamic/footer.jspf"%>

<%--        <!-- Bootstrap core JS-->--%>
<%--        <!-- Core theme JS-->--%>
<%@include file="../dynamic/javaScript.jspf"%>