package modelo;

import java.io.File;
import java.io.IOException;
import java.util.ArrayList;

public class BuscadorMp3 {
	private File file;
	private ArrayList<String> paths;

	public BuscadorMp3() {
		super();
		this.paths = new ArrayList<>();
	}

	// Crea una instancia de tipo file con un path que se le pasa por parametro
	// porque proviene de una caja de texto de la vista
	private void crear(String path) {
		this.file = new File(path);
	}

	// Metodo Recursivo
	private void buscar(File file) {
		if (file.isDirectory()) {
			for (int i = 0; i < file.listFiles().length; i++) {
				try {
					if (isRutaValida(file)) {
						this.paths.add(file.getCanonicalPath());
					}
					
				} catch (IOException e) {
					this.paths.add("No se ha podido capturar la chambea");
				}
				buscar(file.listFiles()[i]);
			}
		} else {
			try {
				this.paths.add(file.getCanonicalPath());
			} catch (IOException e) {
				this.paths.add("No se ha podido capturar la chambea");
			}
		}

	}

	public void buscar(String path) {
		crear(path);
		buscar(this.file);

	}
	
	private boolean isRutaValida(File file) {
		for (String path : this.paths) {
			try {
				if(path == file.getCanonicalPath()) {
					return false;
				}
			} catch (IOException e) {
				return false;
			}
		}

		return true;
	}

	public ArrayList<String> getPaths() {
		return paths;
	}
	
	

}
