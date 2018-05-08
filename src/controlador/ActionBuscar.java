package controlador;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class ActionBuscar implements ActionListener {
	ParaUI paraUI;

	public ActionBuscar(ParaUI paraUI) {
		this.paraUI = paraUI;
	}

	@Override
	public void actionPerformed(ActionEvent e) {
		this.paraUI.buscar();
		this.paraUI.actualizarRutas();

	}

}
