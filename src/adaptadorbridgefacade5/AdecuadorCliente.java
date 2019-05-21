package adaptadorbridgefacade5;

import java.io.Closeable;
import java.io.DataInputStream;
import java.io.DataOutputStream;
import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.OutputStream;
import java.util.ArrayList;

public class AdecuadorCliente implements Adecuador {

	@Override
	public boolean graba(Closeable flujoW, Object objeto) {
		boolean retorno = true;
		DataOutputStream conversorW = new DataOutputStream((FileOutputStream) flujoW);
		retorno=escribirCliente(conversorW, (Cliente) objeto);
		return retorno;
	}

	private boolean escribirCliente(DataOutputStream conversorW, Cliente cliente) {
		boolean retorno=false;
		
		try {
			conversorW.writeInt(cliente.getNumero());
			conversorW.writeUTF(cliente.getNombre());
			conversorW.writeBoolean(cliente.isPreferente());
			conversorW.writeFloat(cliente.getSaldo());
			retorno=true;
		} catch (IOException e) {
			e.printStackTrace();
		}
		return retorno;
	}
	
	
	
	@Override
	public void recupera(Closeable flujoR, ArrayList lista) {
		DataInputStream conservorR=new DataInputStream((FileInputStream) flujoR);
		Cliente cliente = agregarCliente(conservorR);
		while (cliente != null) {
			lista.add(cliente);
			cliente = agregarCliente(conservorR);
		}
	}
	
	private Cliente agregarCliente(DataInputStream conversorR) {
		Cliente cliente = null;
		try {
			cliente = new Cliente(conversorR.readInt(), conversorR.readUTF(), conversorR.readBoolean(),
					conversorR.readFloat());
		} catch (IOException e) {
		}
		return cliente;
	}
	
}
