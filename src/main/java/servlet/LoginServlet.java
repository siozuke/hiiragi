package servlet;

import java.io.IOException;
import java.util.List;

import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;

import model.Contact;
import model.ContactLogic;
import model.Login;
import model.LoginLogic;

@WebServlet("/LoginServlet")
public class LoginServlet extends HttpServlet{
	private static final long serialVersionUID = 1L;

	protected void doGet(HttpServletRequest request,
		      HttpServletResponse response)
		      throws ServletException, IOException {

		     //フォワード
		    RequestDispatcher dispatcher =
		        request.getRequestDispatcher
		            ("/WEB-INF/jsp/login.jsp");
		    dispatcher.forward(request, response);
//		    System.out.println("userId");
		  }

	protected void doPost(HttpServletRequest request,
		      HttpServletResponse response)
		      throws ServletException, IOException {
		//リクエストパラメータ取得
		request.setCharacterEncoding("UTF-8");
		String userId = request.getParameter("userId");
		String pass = request.getParameter("pass");
//		System.out.println("userId" + userId + "pass" + pass);

		//ログイン処理の実行
		Login login = new Login(userId, pass);
		LoginLogic bo = new LoginLogic();
		boolean result = bo.execute(login);
//		System.out.println(result);

		//ログイン処理の成否によって処理を分岐
		if(result == true) { //ログイン成功時
			//セッションスコープにユーザーIDを保存
			HttpSession session = request.getSession();
			session.setAttribute("userId", userId);
			
			ContactLogic cl = new ContactLogic();
			List<Contact> contactList = cl.getContactList();
			request.setAttribute("contactList", contactList);

			//フォーワード
			RequestDispatcher dispatcher =
					request.getRequestDispatcher("/WEB-INF/jsp/admin.jsp");
			dispatcher.forward(request, response);

		}else { //ログイン失敗
			//リダイレクト
			response.sendRedirect("/hiiragi/LoginServlet");
		}
	}

}
