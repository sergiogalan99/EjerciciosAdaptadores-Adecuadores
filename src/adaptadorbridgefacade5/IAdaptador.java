package adaptadorbridgefacade5;

import java.util.ArrayList;

public interface IAdaptador {

	public  ArrayList leer(String path,Adecuador adecuador);

	public boolean grabar(String path, Object objeto,Adecuador adecuador);
}
