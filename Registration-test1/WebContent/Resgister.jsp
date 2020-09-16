<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Insert title here</title>
</head>
<body>
	  <form action="<%=request.getContextPath()%>/RegisterServlet" method="POST">
                <table style="width: 100%">
                <tr>
                    <td>First Name</td>
                    <td><input type="text" name="firstName"/></td>
				</tr>
				 <tr>
                    <td>Last Name</td>
                    <td><input type="text" name="lastName"/></td>
				</tr>
				 <tr>
                    <td>E-mail</td>
                    <td><input type="text" name="email"/></td>
				</tr>
                <tr>
                    <td>Password</td>
                    <td><input type="password" name="password"></td>
                </tr>
				 <tr>
                    <td>Contact Number</td>
                    <td><input type="text" name="contactNo"/></td>
				</tr>
                </table>
                <input type="submit" value="Submit">
	</form>
</body>
</html>