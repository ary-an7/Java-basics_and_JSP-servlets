<!DOCTYPE html>
<html>
    <head>
        <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
        <title>Convert Fahrenheit to Celsius JSP Program</title>
    </head>
    <body>
        <h2>Convert Fahrenheit to Celsius in JSP</h2>
        <form action="" method="post">            
            <label>Enter Fahrenheit: </label>
            <input type="text" name="fahrenheit" />            
        </form>
    </body>
</html>
 
<%
    
    if("POST".equalsIgnoreCase(request.getMethod()))
    {
        
        float fahrenheit, celsius;

        fahrenheit = Float.parseFloat(request.getParameter("fahrenheit"));

        celsius = (fahrenheit - 32) * 5/9;

        out.print("<h3>Celsius: "+celsius+"</h3>");
    }
%>
