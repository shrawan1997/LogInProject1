<%@page contentType="text/html" pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
    <head>
        <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
        <title>JSP Page</title>
        <link rel="stylesheet" type="text/css" href="mystyle.css">
    </head>
    <body>
       <center>
            <div class= "divform">
            <form action="select" method="post">
             
   <%-- error messages --%>
                <div class="form-group">
                <c:forEach items="${registrationErrors}" var="error">
                <p class="error">${error}</p>
                 </c:forEach>
               </div>
                    <div class="box">
                        <i class="fa fa-sign-in log" aria-hidden="true"></i>
                        <h2>Log In</h2>
                    <div class="textbox">
                        <i class="fa fa-user" aria-hidden="true"></i>
                         <input style="" type="text" placeholder="username" name="username"/><br><br>
                        </div>
                        <div class="textbox">
                          <i class="fa fa-lock" aria-hidden="true"></i>
                            <input type="password" placeholder="password" name="password"/><br><br>
                        </div>
                         <div class="btn">
                            <button type="submit" class="btn-custom">LogIn</button>
                         </div>
                    </div>
                 </form>
                
            </div>
       </center>
       
    </body>
</html>
