package adaptadorbridgefacade5;

import java.io.BufferedReader;
import java.io.DataInputStream;
import java.io.File;
import java.io.FileInputStream;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;
import java.io.InputStream;
import java.util.ArrayList;

public class AdaptadorText implements IAdaptador {

	@Override
	public ArrayList leer(String path, Adecuador adecuador) {
		assert path != null;
		File file = new File(path);
		ArrayList  objetos = new ArrayList<>();
		FileReader flujoR = null;
		if (file.exists()) {
			try {
				flujoR = new FileReader(file);
				adecuador.recupera(flujoR, objetos);
			} catch (IOException e) {
				e.printStackTrace();
			}
			try {
				flujoR.close();
			} catch (IOException e) {
				e.printStackTrace();
			}
		}
		return objetos;
	}

	@Override
	public boolean grabar(String path, Object objeto, Adecuador adecuador) {
		assert path != null && objeto != null;
		File file = new File(path);
		boolean retorno = false;
		FileWriter flujoW = null;
		try {
			flujoW = new FileWriter(file);
			retorno = adecuador.graba(flujoW, objeto);
		} catch (IOException e) {
			e.printStackTrace();
		}
		try {
			flujoW.close();
		} catch (IOException e1) {
			e1.printStackTrace();
		}
		return retorno;
	}


	

}
