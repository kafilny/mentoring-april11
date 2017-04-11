package Scanner;

import java.util.Scanner;

public class Scaner {

	public static void main(String[] args) {
		Scanner kafil=new Scanner(System.in);
		int fnum, twondnum,thirdnum,answer;
		System.out.println("Enter first num: ");
		fnum=(kafil.nextInt());
		System.out.println("Enter 2ndnum num: ");
		twondnum=(kafil.nextInt());
		System.out.println("Enter 3rdnum num: ");
		thirdnum=(kafil.nextInt());
		answer=fnum-twondnum-thirdnum;
		System.out.println(answer);



	}

	}


