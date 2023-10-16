package com.quiz;

import java.util.Scanner;

public abstract class Quiz extends Thread {

	String press[] = new String[10];
	String Ans[] = new String[10];
	static int marks;

	Quiz() throws InterruptedException {
		System.out.println("Welcome to the Quiz Game!!");
		System.out.println("In this Game you will be asked 5 General Knowledge Questions with 4 options");
		System.out.println("You will have to choose 1 option and Every Question will carry 1 mark");
		System.out.println("If you manage to earn more than 8 marks you will be granted a surprise.");
		System.out.println("So let's Proceed Further!! All the Best!!");
		System.out.println("**************************************************");
		Thread.sleep(1000);
	}

	void ques() {
		// 1
		press[0] = "b";

		System.out.println("Question 1.");
		System.out.println("Who is the President Of India?");
		System.out.println("A. Narendra Modi");
		System.out.println("B. Draupadi Murmu");
		System.out.println("C. Rajnath Kovind");
		System.out.println("D. Jagdeep Dhangad");
		// System.out.println("Please provide your input in lower case only!!");
		Scanner sc = new Scanner(System.in);
		Ans[0] = sc.next();
		// Ans[0].toLowerCase();

		if (press[0].equals(Ans[0].toLowerCase())) {
			marks += 1;
		} else if ((Ans[0].toLowerCase()).equals("a") || (Ans[0].toLowerCase()).equals("c")
				|| (Ans[0].toLowerCase()).equals("d")) {
			marks += 0;
		} else {
			System.out.println("Please enter a valid input!!");
			// code for repeating the question.
		}
		try {
			Thread.sleep(1000);
		} catch (InterruptedException e) {
			System.out.println("NOO");
			e.printStackTrace();
		}

		// 2
		press[1] = "d";
		System.out.println("Question .2");
		System.out.println("Who is the Vice President Of India?");
		System.out.println("A. Narendra Modi");
		System.out.println("B. Draupadi Murmu");
		System.out.println("C. Rajnath Kovind");
		System.out.println("D. Jagdeep Dhangad");
		Scanner sc2 = new Scanner(System.in);
		Ans[1] = sc.next();
		// Ans[1].toLowerCase();

		if (press[1].equals(Ans[1].toLowerCase())) {
			marks += 1;
		} else if ((Ans[1].toLowerCase()).equals("a") || (Ans[1].toLowerCase()).equals("c")
				|| (Ans[1].toLowerCase()).equals("b")) {
			marks += 0;
		} else {
			System.out.println("Please enter a valid input!!");
			// code for repeating the question.
		}
		try {
			Thread.sleep(1000);
		} catch (InterruptedException e) {
			System.out.println("NOO");
			e.printStackTrace();
		}

		// 3
		press[2] = "c";
		System.out.println("Question .3");
		System.out.println("Who was the Previous President Of India?");
		System.out.println("A. Narendra Modi");
		System.out.println("B. Draupadi Murmu");
		System.out.println("C. Rajnath Kovind");
		System.out.println("D. Jagdeep Dhangad");
		Scanner sc3 = new Scanner(System.in);
		Ans[2] = sc.next();
		// Ans[1].toLowerCase();

		if (press[2].equals(Ans[2].toLowerCase())) {
			marks += 1;
		} else if ((Ans[2].toLowerCase()).equals("a") || (Ans[2].toLowerCase()).equals("b")
				|| (Ans[2].toLowerCase()).equals("d")) {
			marks += 0;
		} else {
			System.out.println("Please enter a valid input!!");
			// code for repeating the question.
		}
		try {
			Thread.sleep(1000);
		} catch (InterruptedException e) {
			System.out.println("NOO");
			e.printStackTrace();
		}

		// 4
		press[3] = "b";
		System.out.println("Question .4");
		System.out.println("Who is the Defense Minister Of India?");
		System.out.println("A. V.P. Goyal");
		System.out.println("B. Rajnath Singh");
		System.out.println("C. B.D. Mishra");
		System.out.println("D. General Manoj Pandey");
		Scanner sc4 = new Scanner(System.in);
		Ans[3] = sc.next();
		// Ans[1].toLowerCase();

		if (press[3].equals(Ans[3].toLowerCase())) {
			marks += 1;
		} else if ((Ans[3].toLowerCase()).equals("a") || (Ans[3].toLowerCase()).equals("c")
				|| (Ans[3].toLowerCase()).equals("d")) {
			marks += 0;
		} else {
			System.out.println("Please enter a valid input!!");
			// code for repeating the question.
		}
		try {
			Thread.sleep(1000);
		} catch (InterruptedException e) {
			System.out.println("NOO");
			e.printStackTrace();
		}

		// 5
		press[4] = "d";
		System.out.println("Question .5");
		System.out.println("Who is the Cheif of Indian Army?");
		System.out.println("A. V.P. Goyal");
		System.out.println("B. Rajnath Singh");
		System.out.println("C. B.D. Mishra");
		System.out.println("D. General Manoj Pandey");
		Scanner sc5 = new Scanner(System.in);
		Ans[4] = sc.next();
		// Ans[1].toLowerCase();

		if (press[4].equals(Ans[4].toLowerCase())) {
			marks += 1;
		} else if ((Ans[4].toLowerCase()).equals("a") || (Ans[4].toLowerCase()).equals("c")
				|| (Ans[4].toLowerCase()).equals("d")) {
			marks += 0;
		} else {
			System.out.println("Please enter a valid input!!");
			// code for repeating the question.
		}
		try {
			Thread.sleep(1000);
		} catch (InterruptedException e) {
			System.out.println("NOO");
			e.printStackTrace();
		}
		
		System.out.println("You have got "+marks+" marks");
		
	}

}
