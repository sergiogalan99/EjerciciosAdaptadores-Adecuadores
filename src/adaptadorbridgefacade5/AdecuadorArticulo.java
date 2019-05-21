package adaptadorbridgefacade5;

import java.io.BufferedReader;
import java.io.Closeable;
import java.io.DataInputStream;
import java.io.DataOutputStream;
import java.io.File;
import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;
import java.io.Reader;
import java.util.ArrayList;

public class AdecuadorArticulo implements Adecuador {

	@Override
	public boolean graba(Closeable flujoW, Object objeto) {
		boolean retorno = false;
		FileWriter flujoMio = (FileWriter) flujoW;
		Articulo articulo = (Articulo) objeto;
		try {
			insertaCampo(String.valueOf(articulo.getNumeroID()), flujoMio, false);
			insertaCampo(String.valueOf(articulo.getNombre()), flujoMio, true);
			retorno = true;
		} catch (IOException e) {
		}
		return retorno;
	}

	private void insertaCampo(String objeto, FileWriter flujoW, boolean last) throws IOException {
		flujoW.write(objeto);
		if (!last) {
			flujoW.write(":");
		} else {
			flujoW.write("\n");
		}
	}

	@Override
	public void recupera(Closeable flujoR, ArrayList lista) {
		BufferedReader bufferR=new BufferedReader((Reader) flujoR);
		try {
			String line;
			while ((line=bufferR.readLine())!=null) {
				String[] split = line.split(":");
				Articulo articulo= new Articulo(Integer.parseInt(split[0]), split[1]);
				lista.add(articulo);
			}
		} catch (NumberFormatException | IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	
				


	}

	

}
