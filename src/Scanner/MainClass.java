package Scanner;
import java.util.Scanner;

public class MainClass {

	public static void main(String[] args) {
		Scanner kafil=new Scanner(System.in);
		Tuna tunaobj=new Tuna();
		System.err.println("enter   your name here");
		String name=kafil.nextLine();
		
		tunaobj.simplemsg(name);
		
	}

}
