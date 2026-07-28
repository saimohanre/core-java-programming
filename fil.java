import java.io.*;
class A
{
	public static void main(String[] args)throws IOException
	{
		File f=new File("C:\\Users\\DELL\\OneDrive\\Desktop\\hi.txt");
		if(f.createNewFile())
		{
			System.out.println("file is created");
		}
		else
		{
			System.out.println("file already created");
		}

		/*FileWriter fw=new FileWriter(f,true);  //true is used for to not rest the data in file .it checks the data is have are not.
		fw.write("\nmama");
		fw.flush();  //to push the data in file
		fw.close();   */

		FileReader fr=new FileReader(f);
		BufferedReader br=new BufferedReader(fr);
		
		/*int i=0;
		while((i=br.read())!=-1)
		{
			System.out.print((char)(i));
		} */
	
		String x="";
		while((x=br.readLine())!=null)
		{
			System.out.println(x);
		}

		fr.close();
		br.close();
	}	
}