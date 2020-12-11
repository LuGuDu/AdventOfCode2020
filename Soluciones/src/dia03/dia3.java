package dia03;

import java.io.File;
import java.io.FileNotFoundException;
import java.util.Scanner;

public class dia3 {

	public static void main (String [] args) {
		File f = new File("C:\\Users\\lugud\\git\\AdventOfCode2020\\Soluciones\\src\\dia03\\input.txt");
		int contador=0, c=0;
		int i=0;
		try {
			
			Scanner reader = new Scanner(f);
			while (reader.hasNextLine()) {
				String s = reader.nextLine();
				String s1 = "";
				for(int j=0; j<=c; j++) {
					s1 = s1 + s;
				}				
				if(s1.charAt(i)=='#') {
					contador++;
				}
				c++;
				i=i+3;
			}			
			reader.close();
			System.out.println("Contador: "+contador);
		} catch (FileNotFoundException e) {
			e.printStackTrace();
		}
	}
}
