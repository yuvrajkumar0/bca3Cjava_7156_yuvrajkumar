import java.io.*;
public class TestThrowss{
	static void readFile() throws IOException{
		FileReader file = new FileReader("yuvraj_notes.txt");
        BufferedReader br = new BufferedReader(file);
         System.out.println(br.readLine());
	}
      
		public static void main(String[] args){
			try{
				readFile();
			} catch (IOException e){
				System.out.println("Caller handled File error for yuvraj " + e.getMessage());
			}
		}
}