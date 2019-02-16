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
        <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
        <title>JSP Page</title>
        <link rel="stylesheet" href="eventDetail.css">
    </head>
    <body class="body">
        <% Event event = (Event) request.getAttribute("event"); %>
            <div class="detailBorder">
                <div class="detailBlock">
                    <h3>Détails :</h3>
                    <p><%= event.getDetail()%></p>
                </div>
                <div class="detailBlock">
                    <h3>Date :</h3>
                    <p><%= event.getDate().toString() %></p>
                </div>
                <div class="detailBlock">
                    <h3>Lieu :</h3>
                    <p><%= event.getAddress() %></p>
                </div>
                <div class="detailBlock">
                    <h3>Prix :</h3>
                    <p><%= event.getPrice() %></p>
                </div>
            </div>
        </body>
</html>
