package Assignment3;
import java.util.*;

public class Mirrorstring {

	
		
		public String getImage(String str)
		{
		StringBuffer sbr = new StringBuffer(str);
		sbr.append('|');
		StringBuffer sb = new StringBuffer(str);
		sb.reverse();
		sbr.append(sb);
		return sbr.toString();
		}
		public static void main(String[] ar)
		{
		Mirrorstring p = new Mirrorstring();
		Scanner s = new Scanner(System.in);
		System.out.println("Enter a String");
		String str = s.next();
		System.out.println(p.getImage(str));
		}
		


		// TODO Auto-generated method stub

	}


