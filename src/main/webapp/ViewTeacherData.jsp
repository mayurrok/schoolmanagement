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
	Teacher t=em.find(Teacher.class, id1);
	%>

	<%= t.getId()%>
	<%= t.getName()%>
	<%= t.getSubject()%>
    <%= t.getSalary()%>
			
		
	


	

</body>
</html>