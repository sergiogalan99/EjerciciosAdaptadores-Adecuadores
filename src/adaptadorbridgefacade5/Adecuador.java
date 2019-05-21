package adaptadorbridgefacade5;

import java.io.Closeable;
import java.util.ArrayList;

public interface Adecuador {
	public boolean graba(Closeable flujoW, Object objeto);

	public void recupera(Closeable flujoR, ArrayList lista);
}
