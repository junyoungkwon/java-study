package oop.inter;

import oop.inherit.Animal;

public class Print implements PrintSome{
	
	@Override
	public void printString(String str) {
		System.out.println(str);
	}

	@Override
	public void printChar(char c) {
		System.out.println(c);
	}
	
	@Override
	public void printInt(int num) {
		System.out.println(num);
	}
	
	public static void main(String[] args) {
		Print p= new Print();
		p.printString("abc");
		
		PrintSome ps = new Print(); 
		Animal a = new Animal();
		a.run(); // 접근제어자 public으로 변경 후 어떤 위치에서도 사용가능
	}

	
}
