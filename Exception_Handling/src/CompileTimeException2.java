import java.io.*;

class FileNotFoundDemo{

	public static void main(String[] args){

		File f=new File("Core2Web.txt");
		FileInputStream obj=new FileInputStream(f);
	}		
}
/*
error: unreported exception FileNotFoundException; must be caught or declared to be thrown
		FileInputStream obj=new FileInputStream(f);

we have to write public static void main(String[] args)throws IOException{

		 }
*/
