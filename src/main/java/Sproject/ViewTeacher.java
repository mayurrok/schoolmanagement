package Sproject;

import java.io.IOException;

import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.Persistence;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

@WebServlet("/view")
public class ViewTeacher extends HttpServlet {
	
	@Override
	protected void doPost(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
		
		EntityManagerFactory emf = Persistence.createEntityManagerFactory("mayur") ;
	     EntityManager em = emf.createEntityManager() ;
	     
	     Teacher t=em.find(Teacher.class, 1);
	     System.out.println(t.getId());
	     System.out.println(t.getName());
	     System.out.println(t.getSubject());
	     System.out.println(t.getSalary());
	}

}
