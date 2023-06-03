package servlet;

import java.io.IOException;

import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import model.Contact;
import model.ContactLogic;

@WebServlet("/ContactServlet")
public class ContactServlet extends HttpServlet {
	private static final long serialVersionUID = 1L;


	protected void doPost(HttpServletRequest request,
		      HttpServletResponse response)
		      throws ServletException, IOException {

		// リクエストパラメータを取得
		request.setCharacterEncoding("UTF-8");
	    String name = request.getParameter("username");
	    String furigana = request.getParameter("userfurigana");
	    String tel = request.getParameter("usertel");
	    String mail = request.getParameter("usermail");
	    String comment = request.getParameter("usercomment");

	    Contact contact = new Contact(name, furigana, tel, mail, comment);

	 // リクエストスコープに保存
	    request.setAttribute("contact", contact);
	    
	    ContactLogic logic = new ContactLogic();
	    logic.postContact(contact);
	    

	    RequestDispatcher dispatcher =
		        request.getRequestDispatcher
		            ("/WEB-INF/jsp/contactResult.jsp");
		    dispatcher.forward(request, response);

	}

	protected void doGet(HttpServletRequest request,
			HttpServletResponse response)
	throws ServletException, IOException {

		//フォーワード
		RequestDispatcher dispatcher =
		        request.getRequestDispatcher
		            ("/contact.html");
		    dispatcher.forward(request, response);
	}

}
