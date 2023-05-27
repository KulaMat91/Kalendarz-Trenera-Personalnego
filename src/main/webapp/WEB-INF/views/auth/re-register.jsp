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
                    <div class="card-header">Rejestracja</div>
                    <div class="card-header2"  style="color: red; text-align: center">Podany Login lub E-mail jest zajęty</div>
                    <div class="card-body">
                        <form name="my-form" action='<c:url value="/re-register"/>' method="post">
                            <div class="form-group row" >

                                <label for="login" class="col-md-4 col-form-label text-md-right">Login</label>
                                <div class="col-md-6">
                                    <input type="text" id="login" class="form-control" name="username">
                                </div>
                            </div>
                            <p></p>
                            <div class="form-group row">
                                <label for="password" class="col-md-4 col-form-label text-md-right">Hasło</label>
                                <div class="col-md-6">
                                    <input type="password" id="password" class="form-control" name="password">
                                </div>
                            </div>
                            <p></p>
                            <div class="form-group row" >
                                <label for="full_name" class="col-md-4 col-form-label text-md-right">Imię</label>
                                <div class="col-md-6">
                                    <input type="text" id="full_name" class="form-control" name="name">
                                </div>
                            </div>
                            <p></p>
                            <div class="form-group row">
                                <label for="user_name" class="col-md-4 col-form-label text-md-right">Nazwisko</label>
                                <div class="col-md-6">
                                    <input type="text" id="user_name" class="form-control" name="surname">
                                </div>
                            </div>
                            <p></p>
                            <div class="form-group row">
                                <label for="email_address" class="col-md-4 col-form-label text-md-right">E-mail</label>
                                <div class="col-md-6">
                                    <input type="text" id="email_address" class="form-control" name="email">
                                </div>
                            </div>
                            <p></p>
                            <div class="form-group row">
                                <label for="phone_number" class="col-md-4 col-form-label text-md-right">Numer telefonu</label>
                                <div class="col-md-6">
                                    <input type="text" id="phone_number" class="form-control" name="phoneNumber">
                                </div>
                            </div>
                            <p></p>
                            <div class="form-group row">
                                <label for="operacja" class="col-md-4 col-form-label text-md-right">Płeć </label>
                                <div class="col-md-6">
                                    <select id="operacja" name="gender" class="form-control" >
                                        <option value="" disabled selected hidden>Wybierz płeć</option>
                                        <option value="kobieta">Kobieta</option>
                                        <option value="mężczyzna">Mężczyzna</option>
                                    </select>
                                </div>
                            </div>
                            <p></p>
                            <div class="form-group row"> <!-- Date input -->
                                <label  for="date" class="col-md-4 col-form-label text-md-right">Data urodzenia</label>
                                <div class="col-md-6">
                                    <input class="form-control" id="date" name="birthdayDate" placeholder="MM/DD/YYY" type="datetime-local"/>
                                </div>
                            </div>
                            <p></p>
                            <div class="col-md-6 offset-md-4">
                                <input class="btn btn-warning pull-left mb-2" type="submit" value="Zarejestruj" id="searchButton">
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