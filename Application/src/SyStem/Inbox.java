package SyStem;

import java.io.IOException;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

/**
 * Servlet implementation class EmailRegister
 */
@WebServlet("/Inbox")
public class Inbox extends HttpServlet {
	
	String jdbcURL = "jdbc:mysql://sql305.epizy.com/epiz_27548621_usersdatabase?useUnicode=true&useJDBCCompliantTimezoneShift=true&useLegacyDatetimeCode=false&serverTimezone=UTC";
	String utilisateur = "epiz_27548621";
	String motDepasse = "2ru9Hahawk" ;

    public Inbox() {
        super();
       
    }

protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		
		this.getServletContext().getRequestDispatcher( "/WEB-INF/Inbox.jsp" ).forward( request, response );
	}

	
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		 try {
			 	Connection conn = DriverManager.getConnection( jdbcURL ,utilisateur, motDepasse );

			 	String sql = "SELECT * FROM usersdatabase.mailing WHERE destinataire = 'User@Email.com'";
			 
				Statement statement = conn.createStatement();
				ResultSet result = statement.executeQuery(sql);
				 
				int count = 0;
				 
				while (result.next()){
				    String  idmailing = result.getString("idmailing");
				    String destinataire = result.getString("destinataire");
				    String  exp�diteur = result.getString("exp�diteur");
				    String objet = result.getString("objet");
				    String message = result.getString("message");
				 
				    String output = "User #%d: %s - %s - %s - %s - %s";
				    System.out.println(String.format(output, ++count, idmailing, destinataire, exp�diteur, objet, message));
				}
			 } catch (SQLException e) {
							
						}
		
	}

}
