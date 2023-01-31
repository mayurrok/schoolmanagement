<%@page import="Sproject.Student"%>
<%@page import="Sproject.Teacher"%>
<%@page import="java.io.PrintWriter"%>
<%@page import="javax.persistence.EntityManager"%>
<%@page import="javax.persistence.Persistence"%>
<%@page import="javax.persistence.EntityManagerFactory"%>
<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
	pageEncoding="ISO-8859-1"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Insert title here</title>
</head>
<body>
	<%
	String id = request.getParameter("id");
	int id1 = Integer.parseInt(id);
	EntityManagerFactory emf = Persistence.createEntityManagerFactory("mayur");
	EntityManager em = emf.createEntityManager();
	Student s=new Student();
	%>

	<form action="updatets" method="post">
		id: <input type="text" value="<%=s.getId()%>" name="id">
		name: <input type="text" value="<%=s.getName()%>" name="name">
		stream: <input type="text" value="<%=s.getStream()%>" name="stream">
		fees: <input type="text" value="<%=s.getFees()%>"name="fees">
		<input type="submit">
	</form>


	

</body>
</html>