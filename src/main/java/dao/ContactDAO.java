package dao;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;

import model.Contact;

public class ContactDAO {

	//データベース接続に使用する情報
	private String JDBC_URL = "jdbc:h2:tcp://localhost/~/hiiragi";
	private String DB_USER = "sa";
	private String DB_PASS = "pass";


	public boolean create(Contact contact) {
		//データベース接続
		try(Connection con = DriverManager.getConnection(JDBC_URL,DB_USER,DB_PASS)) {

			//INSERT分の準備
			String sql = "INSERT INTO CONTACT(NAME, FURIGANA, TEL, MAIL, COMMENT) VALUES(?,?,?,?,?)";
			PreparedStatement state = con.prepareStatement(sql);

			//INSERT分中の「?」に使用する値を設定しSQLを完成			
			state.setString(1, contact.getName());
			state.setString(2, contact.getFurigana());
			state.setString(3, contact.getTel());
			state.setString(4, contact.getMail());
			state.setString(5, contact.getComment());
			

			//INSERT分を実行(resultには追加された行数が代入される)
			int result = state.executeUpdate();

			if (result != 1) {
				return false;
			}

		} catch (SQLException e) {
			e.printStackTrace();
			return false;
		}
		System.out.println("w");
		return true;

	}

	public List<Contact> read() {
		List<Contact> list = new ArrayList<Contact>();

				//データベース接続
				try(Connection con = DriverManager.getConnection(JDBC_URL, DB_USER, DB_PASS)) {

					//SELECT分の準備
					String sql =
							"SELECT ID,NAME,FURIGANA,TEL,MAIL,COMMENT FROM CONTACT ORDER BY ID ASC";
					PreparedStatement state = con.prepareStatement(sql);

					//SELECTを実行
					ResultSet rs = state.executeQuery();

					//SELECT分の結果をArrayListに格納
					while (rs.next()) {
						int id = rs.getInt("ID");
						String name = rs.getString("NAME");
						String furigana = rs.getString("FURIGANA");
						String tel = rs.getString("TEL");
						String mail = rs.getString("MAIL");
						String comment = rs.getString("COMMENT");

						Contact contact = new Contact(id, name, furigana, tel, mail, comment);
						list.add(contact);

					}
				} catch (SQLException e) {
					e.printStackTrace();
					return null;
				}
				System.out.println("o");
				System.out.println(list.get(0));
				return list;

	}

}
