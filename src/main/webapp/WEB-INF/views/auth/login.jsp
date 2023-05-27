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
                                        <div class="card-header">Logowanie</div>
                                        <div class="card-body">
                                                <form name="my-form" onsubmit="return validform()" action='<c:url value="/login"/>' method="post">
                                                        <div class="form-group row">
                                                                <label for="full_name" class="col-md-4 col-form-label text-md-right">Login</label>
                                                                <div class="col-md-6">
                                                                        <input type="text" id="full_name" class="form-control" name="username">
                                                                </div>
                                                        </div>
                                                        <p></p>
                                                        <div class="form-group row">
                                                                <label for="user_name" class="col-md-4 col-form-label text-md-right">Hasło</label>
                                                                <div class="col-md-6">
                                                                <input type="password" id="user_name" class="form-control" name="password">
                                                                </div>
                                                        </div>
                                                        <p></p>
                                                        <div class="col-md-6 offset-md-4">
                                                                <button type="submit" class="btn btn-primary">
                                                                        Zaloguj się!
                                                                </button>
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
