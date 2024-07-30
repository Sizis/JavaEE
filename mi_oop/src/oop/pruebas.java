package oop;

import java.util.ArrayList;
import java.util.HashSet;
import java.util.Scanner;
import java.util.StringTokenizer;

public class pruebas {
	public static void main(String[] args) {
		var arr1 = new ArrayList<String>(5);
		var arr = new HashSet<String>(5);
		
		var s1 = new String("hola");
		var s2 = new String("hola");
		
		arr.add(s1);
		arr.add(s2);
		System.out.println(arr); 

		s2 = "adios";
		System.out.println(s1 + " " + s2);
		System.out.println(arr);
		
		arr.add(s2);
		System.out.println(arr);
		
		Scanner sc = new Scanner(System.in);
		String line;
		while (!(line = sc.nextLine()).isEmpty()) {
			System.out.println(line);
		}
		sc.close();
		var st = new StringTokenizer(line, " ,");
		line.split(",");
	}
	String s = "hola";
}
