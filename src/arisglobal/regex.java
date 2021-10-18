package arisglobal;
import java.util.regex.*;
public class regex {

	

public static void main(String[] args) {
String regex="..mo";
String str="mosmos";
Pattern p=Pattern.compile(regex);
Matcher m=p.matcher(str);
while(m.find()) {
System.out.println(true);
}



}



}