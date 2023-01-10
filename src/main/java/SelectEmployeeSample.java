
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;

public class SelectEmployeeSample {

	public static void main(String[] args) {
		try (Connection conn = DriverManager.getConnection("jdbc:h2:tcp://localhost/~/example", "sa", "")) {
			String sql = "SELECT ID, NAME, AGE FROM EMPLOYEE";
			PreparedStatement pSmnt = conn.prepareStatement(sql);
			ResultSet rs = pSmnt.executeQuery();
			while (rs.next()) {
				String id = rs.getString("ID");
				String name = rs.getString("NAME");
				int age = rs.getInt("AGE");

				System.out.println("ID:" + id);
				System.out.println("NAME:" + name);
				System.out.println("AGE:" + age);
			}
		} catch (SQLException e) {
			e.printStackTrace();
		}
	}

}
