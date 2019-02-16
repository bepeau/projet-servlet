<%-- 
    Document   : formEvent
    Created on : 16 févr. 2019, 09:14:36
    Author     : bepereiraa
--%>

<%@page contentType="text/html" pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
    <head>
        <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
        <title>JSP Page</title>
    </head>
    <body>
        <form method="post" action="CreateEvent">
            <fieldset>
                <legend>Créer évènement</legend>
                
                <label for="address">Adresse<span class="requis">*</span></label>
                <input type="text" id="address" name="address" value="" size="30" maxlength="60" />
                <br />

                <label for="price">Prix<span class="requis">*</span></label>
                <input type="text" id="motdepasse" name="price" value="" size="20" maxlength="20" />
                <br />
                
                <label for="detail">Detail<span class="requis">*</span></label>
                <input type="text" id="detail" name="detail" value="" size="20" maxlength="20" />
                <br />
                
                <label for="date">Date<span class="requis">*</span></label>
                <input type="date" id="date" name="date" value="" size="20" maxlength="20" />
                <br />
                
                <input type="submit" value="create" class="sansLabel" />
                <br />
            </fieldset>
        </form>
    </body>
</html>
