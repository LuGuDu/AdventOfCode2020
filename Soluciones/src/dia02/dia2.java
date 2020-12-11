package dia02;

import java.io.File;
import java.io.FileNotFoundException;
import java.util.Scanner;

public class dia2 {
	
	File f = new File("C:\\Users\\lugud\\git\\AdventOfCode2020\\Soluciones\\src\\dia02\\input.txt");
	Scanner reader;
	try
	{
		while (reader.hasNextLine()) {
			int v = Integer.parseInt(reader.nextLine());
		}
	} catch (FileNotFoundException e) {
		e.printStackTrace();
	}
}
