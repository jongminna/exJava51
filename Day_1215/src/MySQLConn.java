import java.sql.Connection;
import java.sql.DriverManager;

public class MySQLConn {
	public static void main(String[] args) {
		try {
			Class.forName("com.mysql.jdbc.Driver");
			System.out.println("드라이버 로딩 성공");
		}catch(Exception e) {
			e.printStackTrace();
		}
		
		try {
			Connection conn = 
					DriverManager.getConnection("jdbc:mysql://localhost:3307/mysql", "root","1234");

			System.out.println("커넥션 연결 :" + conn);
		}catch(Exception e) {
			e.printStackTrace();
		}
	}

}
