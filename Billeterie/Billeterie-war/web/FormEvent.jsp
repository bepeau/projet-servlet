<%-- 
    Document   : formEvent
    Created on : 16 févr. 2019, 09:14:36
    Author     : bepereiraa
--%>

<%@page contentType="text/html" pageEncoding="UTF-8"%>

<%--
<!DOCTYPE html>
<html>
    <head>
        <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
        <title>JSP Page</title>
    </head>
    <body>
        <form method="post" action="createEvent">
            <fieldset>
                <legend>Créer évènement</legend>
                
                <label for="id">Adresse<span class="requis">*</span></label>
                <input type="text" id="id" name="id" value="" size="30" maxlength="60" />
                <br />
                
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

--%>


<!DOCTYPE html>
<html>

<head>
  <meta charset="utf-8">
  <meta name="viewport" content="width=device-width, initial-scale=1">
  <link rel="stylesheet" href="https://cdnjs.cloudflare.com/ajax/libs/font-awesome/4.7.0/css/font-awesome.min.css" type="text/css">
  <link rel="stylesheet" href="https://static.pingendo.com/bootstrap/bootstrap-4.2.1.css">
</head>

<body>
  <%@include file = "navbar.html" %>
    
  <div class="py-5 text-center">
    <div class="container">
      <div class="row">
        <div class="mx-auto col-lg-6 col-10">
          <h1>Ceer evenement</h1>
          <form class="text-left" method="post" action="createEvent">
            <div class="form-group"> <label for="id">Id</label> <input type="text" class="form-control" id="id" name="id" placeholder="01"> </div>
            <div class="form-group"> <label for="address">Adresse</label> <input type="text" class="form-control" id="address" name="address" placeholder="rue Gautier Clermont 63000"> </div>
            <div class="form-group"> <label for="price">Prix</label> <input type="number" class="form-control" id="price" name="price" placeholder="16"> </div>
            <div class="form-group"> <label for="detail">Detail</label> <input type="text" class="form-control" id="detail" name="detail" placeholder="concert">
              <div class="form-group"><label for="date">Date</label><input type="date" class="form-control" id="date" name="date" placeholder="10/09/2019"></div>
            </div>
            
            <button type="submit" class="btn btn-primary">Creer</button>
          </form>
        </div>
      </div>
    </div>
  </div>
</body>

</html>
