import java.io.*;
public class HelloWorld{

	public static String getFileContent(String fileName){
		String xml_str = "";
		try {
			File f = new File(fileName);			
			InputStreamReader read = new InputStreamReader(new FileInputStream(f));
			BufferedReader reader = new BufferedReader(read);
			String line;
			while((line = reader.readLine())!=null){
				xml_str = xml_str + line + "\n";
			}			
		} catch (FileNotFoundException e) {
			e.printStackTrace();
		} catch (IOException e) {
			e.printStackTrace();
		}
		return xml_str;
	}

     public static void main(String []args){
        System.out.println("Hello World");
        System.out.println(getFileContent("test2.xml"));
     }
}
