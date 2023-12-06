package integrador;

import java.io.BufferedReader;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;
import java.util.LinkedList;
import java.util.List;

public class Cuadrante {

	public List<Punto> readCuadrante(String archivo) {

		List<Punto> puntoAux = new LinkedList<Punto>();
		
		String linea = null;
		String[] datos;
		
		try {
			BufferedReader br = new BufferedReader(new FileReader(archivo));
			
			while((linea = br.readLine()) != null) {
				datos = linea.split(",");
				Double ejeX = Double.parseDouble(datos[0]);
				Double ejeY = Double.parseDouble(datos[1]);
				
				if(ejeX > 0 && ejeY > 0) {
					puntoAux.add(new Punto(ejeX,ejeY));
				}
			}
			br.close();
			
		} catch (FileNotFoundException fnfe) {
			fnfe.printStackTrace();
		} catch(IOException e) {
			e.printStackTrace();
		}

		return puntoAux;
	}
}
