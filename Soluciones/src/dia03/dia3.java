package dia03;

import java.io.File;
import java.io.FileNotFoundException;
import java.util.Scanner;

public class dia3 {

	public static void main (String [] args) {
		File f = new File("C:\\Users\\lugud\\git\\AdventOfCode2020\\Soluciones\\src\\dia03\\input.txt");
		int c1=0, c2=0, c3=0, c4=0, c5=0, c=0;
		int v1=0, v2=0, v3=0, v4=0, v5=0;
		int linea=0;
		
		try {
			
			Scanner reader = new Scanner(f);
			while (reader.hasNextLine()) {
				linea++;
				String s = reader.nextLine();
				String s1 = "";
				for(int j=0; j<=c; j++) {
					s1 = s1 + s;
				}
								
				if(s1.charAt(v1)=='#') {
					c1++;
				}
				if(s1.charAt(v2)=='#') {
					c2++;
				}
				if(s1.charAt(v3)=='#') {
					c3++;
				}
				if(s1.charAt(v4)=='#') {
					c4++;
				}
				if(linea%2 != 0 && s1.charAt(v5)=='#') {		
					c5++;
				}
					
				c++;
				v1=v1+3; //Reto 1
				v2=v2+1;
				v3=v3+5;
				v4=v4+7;
				if(linea%2!=0) {
					v5=v5+1;
				}
			}			
			reader.close();
			System.out.println("Contador reto1: "+c5);
			long valor = c1*c2*c3*c4*c5;
			System.out.println("Contador reto2: "+valor);
		} catch (FileNotFoundException e) {
			e.printStackTrace();
		}
	}
}
