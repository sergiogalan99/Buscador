package controlador;

import modelo.BuscadorMp3;
import vista.UI;

public class ParaUI extends UI {

	private BuscadorMp3 buscador = new BuscadorMp3();

	public ParaUI() {
		asignarActionBuscar();
	}

	public void asignarActionBuscar() {
		btnBuscar.addActionListener(new ActionBuscar(this));
	}

	public void buscar() {
		this.buscador.buscar(textRuta.getText());
	}

	public void actualizarRutas() {
		for (String i : this.buscador.getPaths()) {
			textBusqueda.setText(textBusqueda.getText() + i + "\n");

		}
	}

}
