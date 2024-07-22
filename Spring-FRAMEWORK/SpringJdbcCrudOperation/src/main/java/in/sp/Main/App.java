package in.sp.Main;

import java.util.List;

import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;
import org.springframework.jdbc.core.JdbcTemplate;

import in.sp.beans.Student;
import in.sp.mappers.StudentRowMapper;
import in.sp.resources.SpringConfigFile;

public class App {
	public static void main(String[] args) {

		ApplicationContext context = new AnnotationConfigApplicationContext(SpringConfigFile.class);

		JdbcTemplate jt = context.getBean(JdbcTemplate.class);

		
		
		
		
		// ----------- INSERT OPERATION -------------- //

//		int std_rollno = 104;
//		String std_name = "MEGHNA";
//		float std_marks = 80.4f;
		
//       String insertquery = "insert into student values (?,?,?)";
//       int count = jt.update(insertquery,std_rollno,std_name,std_marks);
//       
//       if(count > 0) 
//       {
//    	 System.out.println("insertion Success");  
//       }else{
//    	   System.out.println("Insertion Failed");
//       }

		
		
		
		
		// ------------- UPDATE OPERATION ---------------- //

//		float marks = 97.76f;
//		int rollno = 101;
//		
//		String updateQuery = "update student set std_marks = ? where std_roll=?";
//		int count = jt.update(updateQuery,marks,rollno);
//		
//		if(count>0) {
//			System.out.println("update Successfully");
//		}else {
//			System.out.println("update failed");
//		}
		
		
		
		
		
		// ----------------- DELETE OPERATION ---------------- //
		
//		int rollno = 104;
//		
//		String deleteQuery = "delete from student where std_roll = ?";
//		int count = jt.update(deleteQuery,rollno);
//		if(count > 0) {
//			System.out.println("Deletion Successfully");
//		}else {
//			System.out.println("Deletion Failed");
//		}
		
		
		
		
		
		// ------------------ SELECT OPERATION=1 ------------------------- //
		
//		String selectQuery = "select * from student";
//		List<Student> std_list =  jt.query(selectQuery, new StudentRowMapper());
//		for(Student std : std_list) {
//			System.out.println("Rollno : "+std.getRollno());
//			System.out.println("Name   : "+std.getName());
//			System.out.println("Marks  : "+std.getMarks());
//			System.out.println("------------------");
//
//		}
		
		
		
		
		// -------------------- SELECT OPERATION=2 ------------------------ //
//		
//		int roll = 101;
//		String selectQuery = "select * from student where std_roll = ?";
//		List<Student> std_list =  jt.query(selectQuery, new StudentRowMapper(),roll);
//		for(Student std : std_list) {
//			System.out.println("Rollno : "+std.getRollno());
//			System.out.println("Name   : "+std.getName());
//			System.out.println("Marks  : "+std.getMarks());
//			System.out.println("------------------");
//
//		}
		
		
		
		
		// ---------------------- SELECT OPERATION=3 -------------------------- //

		int roll = 102;
		String selectQuery = "select * from student where std_roll = ?";
		Student std =  jt.queryForObject(selectQuery, new StudentRowMapper(),roll);
		
			System.out.println("Rollno : "+std.getRollno());
			System.out.println("Name   : "+std.getName());
			System.out.println("Marks  : "+std.getMarks());
			System.out.println("------------------");

		
	}
}
