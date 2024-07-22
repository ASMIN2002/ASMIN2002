
import java.io.FileOutputStream;

public class FileOutputTRYWITHRESOURCES {
	public static void main(String[] args){
		
	try (FileOutputStream fileOutputStream = new FileOutputStream("E:/abc/xyz/welcome.txt",true);
){
		String data = "\nWhat is your plan today";
		byte[] bytes = data.getBytes();
		fileOutputStream.write(bytes);
		System.out.println("DATA SENT SUCCESSFULLY");
		fileOutputStream.close();
	}catch(Exception exception) {
		exception.printStackTrace();
	}
	
	}

}
