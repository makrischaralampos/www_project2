<%-- 
    Document   : result
    Created on : 6 Νοε 2020, 4:32:22 μ.μ.
    Author     : makri
--%>

<%@page import ="java.util.*" contentType="text/html" pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
    <head>
        <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
        <meta name="viewport" content="width=device-width, initial-scale=1.0">
        <meta lang="en">
	<meta name="description" content="The page of the product you registered">
	<meta name="author" content="Makris Charalampos">
        <link rel="stylesheet" type="text/css" href="style.css">
        <title>Result Page</title>
    </head>
    <body>
        <h1>Your Product's Page !</h1>
        
        <table border="1">
            <thead>
                <tr>
                    <th>Barcode</th>
                    <th>Name</th>
                    <th>Color</th>
                    <th>Description</th>
                </tr>
            </thead>
            <tbody>
                <tr>
                    <td>
                        <%
                            String barcode = (String)request.getAttribute("barcode");
                            out.print(barcode);
                        %>
                    </td>
                    <td>
                        <%
                            String name = (String)request.getAttribute("name");
                            out.print(name);
                        %>
                    </td>
                    <td>
                        <%
                            String color = (String)request.getAttribute("color");
                            out.print(color);
                        %>
                    </td>
                    <td>
                        <%
                            String description = (String)request.getAttribute("description");
                            out.print(description);
                        %>
                    </td>
                </tr>
            </tbody>
        </table>

    </body>
</html>
