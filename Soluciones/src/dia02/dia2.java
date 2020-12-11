package dia02;

import java.io.File;
import java.io.FileNotFoundException;
import java.util.Scanner;

public class dia2 {
	
	public static void main (String [] args) {
		File f = new File("C:\\Users\\lugud\\git\\AdventOfCode2020\\Soluciones\\src\\dia02\\input.txt");
		int validas=0;
		int v1 = 0,v2 = 0;
		try {
			Scanner reader = new Scanner(f);
			while (reader.hasNextLine()) {
				String s1 = reader.next();
				String s2 = reader.next();
				String s3 = reader.next();
				
				for(int i=0; i<s1.length(); i++) {
					if(s1.charAt(i)=='-') {
						v1 = Integer.parseInt(s1.substring(0,i));
						v2 = Integer.parseInt(s1.substring(i+1,s1.length()));
						break;
					}
				}	
				
				char c = s2.charAt(0);			
				int contador = 0;
				
				for(int i=0; i<s3.length(); i++) {
					if(s3.charAt(i)==c) {
						contador++;
					}
				}	
				
				System.out.println("Pass: "+s3+", Letra: "+c+", Repetidas: "+contador+", Min-Max: "+v1+"-"+v2);
				
				if(contador<=v2 && contador>=v1) {
					validas++;
					System.out.println(validas);
				}
			}

			reader.close();
		} catch (FileNotFoundException e) {
			e.printStackTrace();
		}
		
	}
}
