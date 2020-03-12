/*1.
        Write a program to accept a string as command line argument 
        & check whether it is a file or directory.if it is a directory,
        list the content of the directory, count how many files the 
        directory has & delete all files in that directory having 
        extension .txt.If it  is a file ,Display all information about
        the file(path,size,attributes etc.)  
*/
import java.io.*;
class Slip11_1
{
	public static void main(String args[]) throws IOException
    {
    	int cnt=0;
        String name=args[0];
        //BufferedReader br=new BufferedReader(new InputStreamReader(System.in));
        File f1=new File(name);
             
        if(f1.isDirectory())
        {
        	System.out.println(f1+" is a Directory");
            String s[]=f1.list();// gives all the files in the dir
            for(int i=0;i<s.length;i++)
            {
            	File f=new File(name+"/"+s[i]);
                   
                if(f.isFile())
                	if(s[i].endsWith(".txt"))
                    	System.out.println(s[i]);
                	//  else
                cnt++;
			}
            System.out.println("No of files in directory "+name+" : "+cnt);
		}
        else
        if(f1.isFile())                       
        {
			System.out.println("size="+f1.length());
            System.out.println("Path="+f1.getPath());
            System.out.println("Attributes="+f1.getName());
        }
	}      
}