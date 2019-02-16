<%-- 
    Document   : EventsView
    Created on : 15 févr. 2019, 14:17:22
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
    </head>
    <body>
        <h1>Evenements : </h1>
        <ul>
        <% 
            List<Event> listeEvents = (List<Event>) request.getAttribute("events");
        
            for(Event event : listeEvents) {
                %>
                <li><%= "Event " + event.getAddress()  %></li><%
            }
        %>
        </ul>
        
    </body>
</html>
