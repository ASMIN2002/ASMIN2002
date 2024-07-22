import java.awt.Taskbar.State;
import java.io.FileOutputStream;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.Statement;

public class Main {

	public static void main(String[] args) {
	try (
			FileOutputStream fileOutputStream = new FileOutputStream("E:/abc/xyz/emp.html");
			Connection connection = DriverManager.getConnection("jdbc:mysql://localhost:3306/EMPLOYEE","root","Asmin@2002"); 
			Statement statement = connection.createStatement();
			ResultSet resultSet = statement.executeQuery("select * from emp");
){
		String data = "<html><body><table border='1' style='margin-left:auto; margin-right:auto;'>";
		data = data + "<tr><th>name</th><th>email</th><th>pass</th><th>gender</th><th>loc</th></tr>";
		while (resultSet.next()) {
			data = data + "<tr>";
			data = data + "<td>"+resultSet.getString("name") + "</td>";
			data = data + "<td>"+resultSet.getString("email") + "</td>";
			data = data + "<td>"+resultSet.getString("pass") + "</td>";
			data = data + "<td>"+resultSet.getString("gender") + "</td>";
			data = data + "<td>"+resultSet.getString("loc") + "</td>";
			data = data + "</tr>";
		}
		fileOutputStream.write(data.getBytes());
		System.out.println("Data Sent To E:/abc/xyz/emp.html  Successfully");
	} catch (Exception e) {
		e.printStackTrace();
	}	

	}

}
