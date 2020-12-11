package dia01;

import java.io.File;
import java.io.FileNotFoundException;
import java.util.Scanner;

public class dia1 {
	
	public static void main(String [] args) {
		
		File f = new File("C:\\Users\\lugud\\git\\AdventOfCode2020\\Soluciones\\src\\dia01\\input.txt");
		Scanner reader;
		int contador = 0;
		try {
			reader = new Scanner(f);
			int [] valor = new int [(int)f.length()];
			while(reader.hasNextLine()) {
				int v = Integer.parseInt(reader.nextLine());
				valor[contador]=v;
				contador++;
				System.out.println(v);
			}
			
			for(int i=0; i<valor.length; i++) {
				for(int j=0; j<valor.length; j++) {	
					if(valor[i]+valor[j]==2020) {
						System.out.println(valor[i]+" + "+valor[j]+" = "+ (valor[i]+valor[j]));
						System.out.println("Su multiplicacion vale: "+(valor[i]*valor[j]));
					}	
				}
			}
			
			reader.close();
		} catch (FileNotFoundException e) {
			e.printStackTrace();
		}
		
		

	}
}
