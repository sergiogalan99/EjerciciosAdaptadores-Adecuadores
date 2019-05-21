package adaptadorbridgefacade5;

import java.util.ArrayList;

public class Fachada {

	private String path="./cliente.cli";	
	private String path2="./aric.art";
	
	public void graba(Cliente cliente) {
		IAdaptador adaptadorBinario=new AdaptadorBinario();
		adaptadorBinario.grabar(path, cliente,new AdecuadorCliente());
	}

	public void graba(Articulo art) {
		IAdaptador adaptadorTexto=new AdaptadorText();
		adaptadorTexto.grabar(path2, art, new AdecuadorArticulo());
	}
	
	public ArrayList<Cliente> recuperraCliente(){
		IAdaptador adaptadorTexto=new AdaptadorBinario();
		return adaptadorTexto.leer(path, new AdecuadorCliente());
		
	}
	public ArrayList<Articulo> recuperraArticulo(){
		IAdaptador adaptadorTexto=new AdaptadorText();
		return adaptadorTexto.leer(path2, new AdecuadorArticulo());
		
	}

}
