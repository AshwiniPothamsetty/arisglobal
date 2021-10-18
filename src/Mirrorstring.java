

	import java.util.Scanner;
	public class Mirrorstring 
	{

	    public static void main(String[] ar)
	       {
	             
	              Scanner s = new Scanner(System.in);
	              System.out.println("Enter a String");
	              String str = s.next();
	              Problem p=new Problem();
	              System.out.println(p.getImage(str));
	       }
	
	public class Problem
	{
	      
	       public String getImage(String str)
	       {
	              StringBuffer sbr = new StringBuffer(str);
	              sbr.append('|');
	              StringBuffer sb = new StringBuffer(str);
	              sb.reverse();
	              sbr.append(sb);
	              return sbr.toString();
	       }
	    
	       
	}

}
