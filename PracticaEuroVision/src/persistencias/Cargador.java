package persistencias;

import javax.swing.JProgressBar;

public class Cargador extends Thread{
private JProgressBar barra;

public Cargador(JProgressBar barra) {
	super();
	this.barra = barra;
}

public JProgressBar getBarra() {
	return barra;
}

public void setBarra(JProgressBar barra) {
	this.barra = barra;
}

public void run() {
	adelantar();
}

private void adelantar() {
	while(barra.getValue()!=100) {
		barra.setValue(barra.getValue()+10);
		try {
			sleep(1000);
		} catch (InterruptedException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}
}
}
