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
                                        <div class="card-header">Register</div>
                                        <div class="card-body">
                                                <form name="my-form" onsubmit="return validform()" action="success.php" method="">
                                                        <div class="form-group row">
                                                                <label for="full_name" class="col-md-4 col-form-label text-md-right">Imię</label>
                                                                <div class="col-md-6">
                                                                        <input type="text" id="full_name" class="form-control" name="full-name">
                                                                </div>
                                                        </div>

                                                        <div class="form-group row">
                                                                <label for="user_name" class="col-md-4 col-form-label text-md-right">Nazwisko</label>
                                                                <div class="col-md-6">
                                                                        <input type="text" id="user_name" class="form-control" name="username">
                                                                </div>
                                                        </div>

                                                        <div class="form-group row">
                                                                <label for="email_address" class="col-md-4 col-form-label text-md-right">E-Mail Address</label>
                                                                <div class="col-md-6">
                                                                        <input type="text" id="email_address" class="form-control" name="email-address">
                                                                </div>
                                                        </div>

                                                        <div class="form-group row">
                                                                <label for="phone_number" class="col-md-4 col-form-label text-md-right">Phone Number</label>
                                                                <div class="col-md-6">
                                                                        <input type="text" id="phone_number" class="form-control">
                                                                </div>
                                                        </div>

                                                        <div class="form-group row">
                                                                <label for="operacja">Płeć: </label>
                                                                <select id="operacja" name="operacja">
                                                                        <option value="suma">Kobieta</option>
                                                                        <option value="odejmowanie">Mężczyzna</option>
                                                                </select>
                                                        </div>

                                                        <div class="form-group"> <!-- Date input -->
                                                                <label class="control-label" for="date">Data urodzenia</label>
                                                                <input class="form-control" id="date" name="date" placeholder="MM/DD/YYY" type="text"/>
                                                        </div>

                                                        <div class="col-md-6 offset-md-4">
                                                                <button type="submit" class="btn btn-primary">
                                                                        Zarejestruj się!
                                                                </button>
                                                        </div>
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
