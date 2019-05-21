package adaptadorbridgefacade5;

import java.util.ArrayList;

public class Consumidor {
	public static void main(String[] args) {
		Cliente cliente = new Cliente(1, "Sergio", true, 12.5f);
		Fachada fachada = new Fachada();
		fachada.graba(cliente);
		Articulo art = new Articulo(3, "brocha");
		fachada.graba(art);

		ArrayList<Cliente> arrayCliente = fachada.recuperraCliente();

		for (Cliente cliente1 : arrayCliente) {
			System.out.println(cliente1);
		}

		ArrayList<Articulo> arrayArticulo = fachada.recuperraArticulo();

		for (Articulo articulo : arrayArticulo) {
			System.out.println(articulo);
		}
	}
}
