package fr.operateurs.console;

import java.util.Scanner;

import javax.swing.plaf.synth.SynthSeparatorUI;

public class OperateursApp {

	public static void main(String[] args){
		
		System.out.println("***** Application Opératuers ****");
		System.out.println("Veuillez saisir le premier nombre...");	
		Scanner questionUser1 = new Scanner(System.in);
		int a = questionUser1.nextInt(); //question 1
		
		System.out.println("Veuillez saisir le second nombre...");
		Scanner questionUser2 = new Scanner(System.in);
		int b = questionUser2.nextInt(); //question 2
		
		System.out.println(+ a + " + " + b + " = " + (a + b));
		System.out.println(+ a + " - " + b + " = " + (a - b));
		System.out.println(+ a + " * " + b + " = " + (a * b));
		System.out.println(+ a + " / " + b + " = " + (a / b));
		System.out.println(+ a + " % " + b + " = " + (a % b));
		
	}
}
