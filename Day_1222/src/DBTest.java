import java.sql.Connection;
import java.sql.DriverManager;

public class DBTest {
	public static void main(String[] args) {
		try {
			Class.forName("oracle.jdbc.driver.OracleDriver");
			System.out.println("드라이버 로딩 성공");
		}catch(Exception e) {
			e.printStackTrace();
		}
		//커넥션 연결테스트
		try {
			Connection conn = 
					DriverManager.getConnection("jdbc:oracle:thin:@localhost:1521:xe", "hr", "1234");
			System.out.println("커넥션 연결 성공");
			System.out.println("CONN : "  + conn);
		}catch(Exception e) {
			
		}
	}

}
