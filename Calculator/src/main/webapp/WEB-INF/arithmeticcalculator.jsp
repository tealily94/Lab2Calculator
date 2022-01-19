<%@page contentType="text/html" pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
    <head>
        <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
        <title>Arithmetic Calculator</title>
        
        <link href="css/style.css" type="text/css" rel="stylesheet">
    </head>
    <body>
        <h1>Arithmetic Calculator</h1>
        
        <form action="arithmetic" method="post">
            <label for="first">First: </label>
            <input type="number" name="first" id="first"><br>
            <label for="second">Second: </label>
            <input type="number" name="second" id="second"><br>
            
            <button type="submit" value="plus" name="cal">+</button>
            <button type="submit" value="minus" name="cal">-</button>
            <button type="submit" value="mul" name="cal">*</button>
            <button type="submit" value="div" name="cal">%</button><br>
        </form>
        <a href="age">Age Calculator</a>
    <p>${message}</p>
    </body>
</html>