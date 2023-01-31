package Sproject;

import java.io.IOException;
import java.io.PrintWriter;

import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.EntityTransaction;
import javax.persistence.Persistence;
import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

@WebServlet("/savestudent")
public class SaveStudentData  extends HttpServlet{
	
	@Override
	protected void doPost(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
		 EntityManagerFactory emf = Persistence.createEntityManagerFactory("mayur") ;
	     EntityManager em = emf.createEntityManager() ;
	     EntityTransaction et = em.getTransaction() ;
	     
	    String id = req.getParameter("id") ;
	    String name = req.getParameter("name") ;
	    String stream = req.getParameter("stream") ;
	    String fees =  req.getParameter("fees") ;
	    
	    
	    Student s=new Student();
	    s.setId(Integer.parseInt(id));
	    s.setName(name);
	    s.setStream(stream);
	    s.setFees(Double.parseDouble(fees));
	    
	    et.begin();
	    em.persist(s);
	    et.commit();
	    
	    resp.setContentType("text/html");
			PrintWriter pw = resp.getWriter() ;
			pw.write("student added");
			
		    RequestDispatcher rd = req.getRequestDispatcher("studentmenu.html") ;
			rd.include(req, resp);

	}

}
