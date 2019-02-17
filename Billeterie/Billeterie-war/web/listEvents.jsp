<%-- 
    Document   : listEvents
    Created on : 17 févr. 2019, 12:35:13
    Author     : mathieu
--%>

<%@page import="java.util.List"%>
<%@page import="entities.Event"%>
<%@page contentType="text/html" pageEncoding="UTF-8"%>


<!DOCTYPE html>
<html>

<head>
  <meta charset="utf-8">
  <meta name="viewport" content="width=device-width, initial-scale=1">
  <link rel="stylesheet" href="https://static.pingendo.com/bootstrap/bootstrap-4.2.1.css">
</head>

<body class="bg-light">
  <%@include file = "navbar.html" %>
  
  
  <div class="py-4 bg-light">
    <div class="container">
        <div class="row">
        <% 
            List<Event> listeEvents = (List<Event>) request.getAttribute("events");
        
            for(Event event : listeEvents) {
                %>
                
                <div class="col-md-4 p-3">
          <div class="card box-shadow">
            <div class="card-body">
                <p class="card-text"><%= "Evènement : " + event.getDetail()%></p>
              <p class="card-text"><%= "Adresse : " + event.getAddress()  %></p>
              <p class="card-text"><%= "Prix : " + event.getPrice() + " €"%></p>
              <div class="d-flex justify-content-between align-items-center">
                <div class="btn-group">
                    <button type="button" onclick="location.href = 'DetailEvent?id=<%= event.getId()%>';" class="btn btn-sm btn-outline-secondary">View</button>
                  <button type="button" class="btn btn-sm btn-outline-secondary">Edit</button>
                </div> <small class="text-muted"><%=  event.getDate()%></small>
              </div>
            </div>
          </div>
        </div>
                
            <%
            }
        %>
        </div>
    </div>
  </div>
</body>

</html>