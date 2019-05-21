package adaptadorbridgefacade5;

import java.io.BufferedReader;
import java.io.File;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;

public class AdaptadorTextOld {
/*
	@Override
	public Cliente leer(String path) {
		File file = new File(path);
		boolean retorno = false;
		Cliente cliente = null;
		FileReader flujoR = null;
		if (file.exists()) {
			try {
				flujoR = new FileReader(file);
				String lectura=new BufferedReader(flujoR).readLine();
				String[] split = lectura.split(":");
				cliente=new Cliente(Integer.parseInt(split[0]), split[1], Boolean.parseBoolean(split[2]), Float.parseFloat(split[3]));
				
			} catch (IOException e) {
				e.printStackTrace();
			}
			try {
				flujoR.close();
			} catch (IOException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
		}

		return cliente;
	}

	private void insertaCampo(String objeto, FileWriter flujoW, boolean last) throws IOException {
		flujoW.write(objeto);
		if (last) {
			flujoW.write("\n");
		} else {
			flujoW.write(":");
		}
	}

	@Override
	public boolean grabar(String path, Cliente objeto) {
		assert path != null && objeto != null;
		File file = new File(path);
		boolean retorno = false;
		FileWriter flujoW = null;
		try {
			flujoW = new FileWriter(file);
			insertaCampo(String.valueOf(objeto.getNumero()), flujoW,false);
			insertaCampo(String.valueOf(objeto.getNombre()), flujoW,false);
			insertaCampo(String.valueOf(objeto.isPreferente()), flujoW,false);
			insertaCampo(String.valueOf(objeto.getSaldo()), flujoW,true);
			retorno = true;
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
	*/

}
