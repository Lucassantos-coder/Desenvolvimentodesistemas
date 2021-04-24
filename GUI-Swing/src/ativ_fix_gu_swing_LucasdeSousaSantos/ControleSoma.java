package ativ_fix_gu_swing_LucasdeSousaSantos;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class ControleSoma implements ActionListener {
	private MainViewer context;
	private SomaBeam Soma;
	public ControleSoma() {
		
	}
	public ControleSoma(MainViewer context) {
		if(context == null) {
			this.context = context;
		}
	}
	
	@Override
	public void actionPerformed(ActionEvent e) {
		// TODO Auto-generated method stub
		Soma = new SomaBeam(context.getNum1TextField().getText(), context.getNum2TextField().getText());
		
		context.getTxtpnResultado().setText(Soma.getResultado());
	}

}
