package error.v3;

import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;

public class Principal {
	public static void main(String[] args) {
		File file = new File("E://archivo.txt");

		//try with resources
		try (FileReader fr=leerArchivo(file)){
			System.out.println("Varias operaciones");
		}catch(FileNotFoundException e) {
			e.printStackTrace();
		} catch (IOException e1) {
			e1.printStackTrace();
		}
	}
	public static FileReader leerArchivo(File file) throws FileNotFoundException{
		FileReader fr = new FileReader(file);
		return fr;
	}

}
