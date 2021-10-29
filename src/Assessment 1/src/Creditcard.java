import java.util.Scanner;

public class Creditcard {


	public static String card_no;
	public static char ch;
	public static void Credi_card_validation()
	{
	Scanner scan = new Scanner(System.in);
	System.out.println("Enter the card number :");
	card_no = scan.next();
	if(card_no.length() != 16)
	{
	System.out.println("The card number must be 16 digits in length ");
	}
	else
	{
	ch = card_no.charAt(0);
	if(ch == '3')
	{
	System.out.println("This card is part of American Express, Diner's club or Carte Blanche Payment network");
	}
	else
	if(ch == '4')
	{
	System.out.println("Visa Card");
	}
	else
	if(ch == '5')
	{
	System.out.println("Master Card");
	}
	else
	if(ch == '6')
	{
	System.out.println("Discover Network");
	}
	else
	System.out.println("Enter a valid card number"); }
	}
	public static void main(String[] args)
	{
	Credi_card_validation();
	}
	}



