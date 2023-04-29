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
          <div class="card-header">Kontakt</div>
          <div class="card-body">
            <form name="my-form" onsubmit="return validform()" action="success.php" method="">
              <div class="form-group row" >
                <label  class="col-md-4 col-form-label text-md-right"> Julita, Filip, Mateusz, Karol</label>

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