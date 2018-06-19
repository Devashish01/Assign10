import java.io.File;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;

public class File1 {


	public static void main(String[] args) throws IOException {

   File file=new File("D:\\Acdview\\abc.txt");
   FileReader  d1=new FileReader(file);
   File files=new File("D:\\Acdview\\xyz.txt");
   FileWriter d2=new FileWriter(files);

   try
   {

	   int ch;
	   String q="";
	   while((ch=d1.read())!=-1)
	   {

		   System.out.print((char)ch);
	       q+=(char)ch;

	   }
	   char ab[]=q.toCharArray();
	   int x=ab.length;
	   for(int i=0;i<x;i++)
	   {

		   d2.write(ab[i]);
	   }

   }
   catch(Exception e)
   {
	   System.out.println("Oho error!");
   }
   finally
   {
	   d2.close();
	   d1.close();
   }
	}

}
