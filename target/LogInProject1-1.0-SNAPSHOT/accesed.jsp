<%@page contentType="text/html" pageEncoding="UTF-8" %>
<%@taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c" %>
<%@page isELIgnored="false" %>
<!DOCTYPE html>


<!DOCTYPE html>
<html lang="en">

<head>
    <meta charset="UTF-8">
    <meta name="viewport" content="width=device-width, initial-scale=1.0">
    <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
    <meta http-equiv="X-UA-Compatible" content="ie=edge">
    <title>login</title>
    <link rel="stylesheet" href="https://use.fontawesome.com/releases/v5.7.2/css/all.css"
          integrity="sha384-fnmOCqbTlWIlj8LyTjo7mOUStjsKC4pOpQbqyi7RrhN7udi9RwhKkMHpvLbHG9Sr" crossorigin="anonymous">
    <title>JSP Page</title>
    <!-- <link rel="stylesheet" href="all.min.css"> -->
    <!-- <link rel="stylesheet" href="style.css"> -->

    <link rel="stylesheet" type="text/css" href="accessed.css">

</head>
<body>

<c:set var="data" value="${requestScope.login}"/>
<c:choose>
    <c:when test="${data != null}">
        <center>
            <div class="para">
                <div class="wood"><img src="image/welcome.png" alt="welcome image"></div>
                <div class="details"><p>First Name: ${data.firstName}</p>
                    <p>Last Name: ${data.lastName}</p></div>
                <p> You are welcome to our brand new login application</p>
            </div>
        </center>

    </c:when>


    <c:otherwise>
        <center>
            <div class="para">
                <div class="wood"><img src="image/welcome.png" alt="welcome image"></div>
                <p>Sorry, you are not registered</p>

            </div>
        </center>


    </c:otherwise>
</c:choose>
</body>
</html>
