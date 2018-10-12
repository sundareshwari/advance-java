<%-- 
    Document   : index
    Created on : Oct 8, 2018, 3:05:20 PM
    Author     : MR1
--%>

<%@page contentType="text/html" pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
    <head>
        <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
        <title>JSP Page</title>
    </head>
    <body>
     
        
     <%   for(int i=0; i <10; i++){  %>
     <h1>Hello World!</h1>
      <%  } %>
        
        
      
      <table border="5">
          
          <thead>
          <th>NO</th> <th>SQUARE</th>
          </thead>
          <tbody>
              <% for(int i=1; i<=10; i++){%>
              <tr>  <td><%=i%></td>  <td><%=i*i%></td>   </tr>               
              <% }%>
          </tbody>
          
      </table>
      
    </body>
</html>
