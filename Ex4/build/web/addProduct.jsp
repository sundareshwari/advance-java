<%-- 
    Document   : addProduct
    Created on : Oct 9, 2018, 3:14:39 PM
    Author     : User
--%>

<%@page contentType="text/html" pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
    <head>
        <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
        <title>JSP Page</title>
    </head>
    <body>
        <h1>ADD PRODUCT</h1>
        <form action="AddProduct.do" method="post">
            <br/>Enter product id:<input type="text" name="pid" value="" />
            <br/>            Enter product name:<input type="text" name="pname" value="" />
            <br/>            Enter product desc:<input type="text" name="pdesc" value="" />
            <br/>            Enter product price:<input type="text" name="price" value="" />
<br/><input type="submit" VALUE="ADD PRODUCT" />
        </form>
    </body>
</html>
