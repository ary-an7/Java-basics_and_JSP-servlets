<html>
    <head>
        <title>Enter two numbers to add up</title>
    </head>
    
    <body>
    <%= "<h3> The sum is "+(Integer.parseInt(request.getParameter("t1"))+Integer.parseInt(request.getParameter("t2")))+"</h3>"%>
    </body>
</html>
