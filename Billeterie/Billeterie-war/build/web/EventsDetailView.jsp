<%-- 
    Document   : EventsView
    Created on : 15 fÃ©vr. 2019, 14:17:22
    Author     : bepereiraa
--%>

<%@page import="entities.Event"%>
<%@page import="java.util.List"%>
<%@page contentType="text/html" pageEncoding="UTF-8"%>

<!DOCTYPE html>
<html>

<head>
  <meta charset="utf-8">
  <meta name="viewport" content="width=device-width, initial-scale=1">
  <link rel="stylesheet" href="https://cdnjs.cloudflare.com/ajax/libs/font-awesome/4.7.0/css/font-awesome.min.css" type="text/css">
  <link rel="stylesheet" href="https://static.pingendo.com/bootstrap/bootstrap-4.2.1.css">
</head>

<body style="background-image: url('https://static.pingendo.com/cover-bubble-dark.svg');background-size:cover;">
  <%@include file = "navbar.html" %>
  <% Event event = (Event) request.getAttribute("event"); %>
  <div class="py-5 text-center">
    <div class="container">
      <div class="row">
        <div class="mx-auto col-md-6 col-10 bg-white p-5">
          <h1><%= event.getDetail()%></h1>
          <p class="mb-3">Cet évènement aura lieu le <%= event.getDate()%>.<br/>
              Cet évènement se déroulera à <%= event.getAddress()%>.<br/>
              Le billet coûte <%= event.getPrice()%> €.<br/></p> <a class="btn btn-primary" href="#">Participer</a>
        </div>
      </div>
    </div>
  </div>
  
</body>

</html>