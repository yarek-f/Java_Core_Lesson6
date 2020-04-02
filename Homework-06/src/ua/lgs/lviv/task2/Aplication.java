package ua.lgs.lviv.task2;

import com.lgs.lab.interface2.MyCalculator;

public class Aplication {

	public static void main(String[] args) {
		MyCalculator calculator = new MyCalculator(12, 4);
		
		calculator.plus();
		calculator.minus();
		calculator.multiply();
		calculator.devide();

	}

}
