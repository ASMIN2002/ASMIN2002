package in.sp.main;

import java.util.HashMap;
import java.util.Map;

import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;
import org.springframework.jdbc.core.namedparam.NamedParameterJdbcTemplate;

import in.sp.resources.SpringConfigFile;

public class App 
{
    public static void main( String[] args )
    {
       ApplicationContext context = new AnnotationConfigApplicationContext(SpringConfigFile.class);
       
       NamedParameterJdbcTemplate njdb=context.getBean(NamedParameterJdbcTemplate.class);
       
       Map<String, Object> map = new HashMap<String, Object>();
       
       map.put("key_rollno", 104);
       map.put("key_name", "MEGHNA");
       map.put("key_marks", 78.45f);
       
       
       String insertquery = "insert into student values(:key_rollno, :key_name, :key_marks)";
       
      int count = njdb.update(insertquery, map);
       if(count>0) {
    	   System.out.println("INSERTION SUCCESSFULLY");
       }else {
    	   System.out.println("INSERTION FAILED");
       }
    }
}
