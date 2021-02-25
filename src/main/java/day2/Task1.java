package day2;

import java.util.Scanner;

public class Task1 {
	public static void main(String[] args) {
		System.out.println(" Введите номер этажа ");
		Scanner scn = new Scanner(System.in);
		int a = scn.nextInt();
		if (a >= 1 && a <= 4) {
			System.out.println(" Малоэтажный дом! ");
		} else if (a >= 5 && a <= 8) { 
				System.out.println(" Среднееэтажный дом! ");
			} else if (a >= 8 && a <= 90) { 
			System.out.println(" Многоэтажный дом! ");
		}
	}
}
