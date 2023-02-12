package Modelo;

public class Ciudadano extends Thread {
	private int numeroVoto;
	private String comunidad, rangoEdad, cantanteVotado;

	public Ciudadano(String comunidad, String rangoEdad) {
		this.numeroVoto = 0;
		this.comunidad = comunidad;
		this.rangoEdad = rangoEdad;
		this.cantanteVotado = "";
	}

	public String getCantantevotado() {
		return cantanteVotado;
	}

	public void setCantantevotado(String cantanteVotodo) {
		this.cantanteVotado = cantanteVotodo;
	}

	public int getNumeroVoto() {
		return numeroVoto;
	}

	public void setNumeroVoto(int numeroVoto) {
		this.numeroVoto = numeroVoto;
	}

	public String getComunidad() {
		return comunidad;
	}

	public void setComunidad(String comunidad) {
		this.comunidad = comunidad;
	}

	public String getRangoEdad() {
		return rangoEdad;
	}

	public void setRangoEdad(String rangoEdad) {
		this.rangoEdad = rangoEdad;
	}

	public void run() {
		numeroVoto = (int) (1 + Math.random() * 99);
		switch (rangoEdad) {
		case "RANGO_18_25":
			if (numeroVoto > 0 && numeroVoto <= 7) {
				cantanteVotado = "Joel";
			} else if (numeroVoto > 7 && numeroVoto <= 10) {
				cantanteVotado = "Victoria";
			} else if (numeroVoto > 10 && numeroVoto <= 23) {
				cantanteVotado = "Thiago";
			} else if (numeroVoto > 23 && numeroVoto <= 30) {
				cantanteVotado = "Sarah";
			} else if (numeroVoto > 30 && numeroVoto <= 37) {
				cantanteVotado = "Elton";
			} else if (numeroVoto > 37 && numeroVoto <= 51) {
				cantanteVotado = "Amie";
			} else if (numeroVoto > 51 && numeroVoto <= 61) {
				cantanteVotado = "Nahid";
			} else if (numeroVoto > 61 && numeroVoto <= 88) {
				cantanteVotado = "Marc";
			} else if (numeroVoto > 88 && numeroVoto <= 95) {
				cantanteVotado = "Alba";
			} else if (numeroVoto > 95 && numeroVoto <= 100) {
				cantanteVotado = "Julio";
			}
			break;
		case "RANGO_26_40":
			if (numeroVoto > 0 && numeroVoto <= 14) {
				cantanteVotado = "Joel";
			} else if (numeroVoto > 14 && numeroVoto <= 20) {
				cantanteVotado = "Victoria";
			} else if (numeroVoto > 20 && numeroVoto <= 33) {
				cantanteVotado = "Thiago";
			} else if (numeroVoto > 33 && numeroVoto <= 40) {
				cantanteVotado = "Sarah";
			} else if (numeroVoto > 40 && numeroVoto <= 46) {
				cantanteVotado = "Elton";
			} else if (numeroVoto > 46 && numeroVoto <= 58) {
				cantanteVotado = "Amie";
			} else if (numeroVoto > 58 && numeroVoto <= 65) {
				cantanteVotado = "Nahid";
			} else if (numeroVoto > 65 && numeroVoto <= 81) {
				cantanteVotado = "Marc";
			} else if (numeroVoto > 81 && numeroVoto <= 90) {
				cantanteVotado = "Alba";
			} else if (numeroVoto > 90 && numeroVoto <= 100) {
				cantanteVotado = "Julio";
			}
			break;
		case "RANGO_41_65":
			if (numeroVoto > 0 && numeroVoto <= 5) {
				cantanteVotado = "Joel";
			} else if (numeroVoto > 5 && numeroVoto <= 15) {
				cantanteVotado = "Victoria";
			} else if (numeroVoto > 15 && numeroVoto <= 27) {
				cantanteVotado = "Thiago";
			} else if (numeroVoto > 27 && numeroVoto <= 33) {
				cantanteVotado = "Sarah";
			} else if (numeroVoto > 33 && numeroVoto <= 40) {
				cantanteVotado = "Elton";
			} else if (numeroVoto > 40 && numeroVoto <= 54) {
				cantanteVotado = "Amie";
			} else if (numeroVoto > 54 && numeroVoto <= 61) {
				cantanteVotado = "Nahid";
			} else if (numeroVoto > 61 && numeroVoto <= 71) {
				cantanteVotado = "Marc";
			} else if (numeroVoto > 71 && numeroVoto <= 88) {
				cantanteVotado = "Alba";
			} else if (numeroVoto > 88 && numeroVoto <= 100) {
				cantanteVotado = "Julio";
			}
			break;
		case "RANGO_MAS_66":
			if (numeroVoto > 0 && numeroVoto <= 3) {
				cantanteVotado = "Joel";
			} else if (numeroVoto > 3 && numeroVoto <= 20) {
				cantanteVotado = "Victoria";
			} else if (numeroVoto > 20 && numeroVoto <= 25) {
				cantanteVotado = "Thiago";
			} else if (numeroVoto > 25 && numeroVoto <= 37) {
				cantanteVotado = "Sarah";
			} else if (numeroVoto > 37 && numeroVoto <= 49) {
				cantanteVotado = "Elton";
			} else if (numeroVoto > 49 && numeroVoto <= 58) {
				cantanteVotado = "Amie";
			} else if (numeroVoto > 58 && numeroVoto <= 65) {
				cantanteVotado = "Nahid";
			} else if (numeroVoto > 65 && numeroVoto <= 76) {
				cantanteVotado = "Marc";
			} else if (numeroVoto > 76 && numeroVoto <= 91) {
				cantanteVotado = "Alba";
			} else if (numeroVoto > 91 && numeroVoto <= 100) {
				cantanteVotado = "Julio";
			}
			break;
		}
	}
}
