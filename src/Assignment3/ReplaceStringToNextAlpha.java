package Assignment3;
import java.util.*;

public class ReplaceStringToNextAlpha {
	
	
	String alterString(char[] str) {
	for (int i = 0; i < str.length; i++)
	{
	if (!isVowel(str[i]))
	{
	if (str[i]=='z')
	{
	str[i]='b';
	}
	else
	{str[i] = (char) (str[i] + 1);
	if (isVowel(str[i]))
	{
	if (isVowel(str[i]))
	{
	str[i] = (char) (str[i] + 1);
	}
	}
	}
	}
	}
	return String.valueOf(str);
	}boolean isVowel(char ch)
	{
	if (ch!='a'&&ch!='e'&& ch!= 'i'&& ch != 'o' && ch != 'u'){
	return false;
	}
	return true;
	}public static void main(String[] args) {
	// TODO Auto-generated method stub
	Scanner sc=new Scanner(System.in);
	System.out.println("Enter the String");
	String str=sc.nextLine();
	ReplaceStringToNextAlpha ra=new ReplaceStringToNextAlpha();
	String str1=ra.alterString(str.toCharArray());
	System.out.println(str1);
	}}


	 

