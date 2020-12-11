package dia01;

import java.io.File;
import java.io.FileNotFoundException;
import java.util.Scanner;

public class dia1 {
	
	public static void main(String [] args) {
		
		File f = new File("/Soluciones/src/dia01/input.txt");
		Scanner reader;
		try {
			reader = new Scanner(f);
			int valor = Integer.parseInt(reader.nextLine());
			System.out.println(valor);
		} catch (FileNotFoundException e) {
			e.printStackTrace();
		}
		

	}
}
