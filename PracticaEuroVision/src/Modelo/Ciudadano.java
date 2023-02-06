package Modelo;

public class Ciudadano extends Thread{
	private int numerovoto;
	private String comunidad,rangoedad,cantantevotado;
	public Ciudadano(String comunidad, String rangoedad) {
		super();
		this.numerovoto=0;
		this.comunidad = comunidad;
		this.rangoedad = rangoedad;
		this.cantantevotado="";
	}
	
	public String getCantantevotado() {
		return cantantevotado;
	}

	public void setCantantevotado(String cantantevotado) {
		this.cantantevotado = cantantevotado;
	}

	public int getNumerovoto() {
		return numerovoto;
	}
	public void setNumerovoto(int numerovoto) {
		this.numerovoto = numerovoto;
	}
	public String getComunidad() {
		return comunidad;
	}
	public void setComunidad(String comunidad) {
		this.comunidad = comunidad;
	}
	public String getRangoedad() {
		return rangoedad;
	}
	public void setRangoedad(String rangoedad) {
		this.rangoedad = rangoedad;
	}
	
	public void run() {
		numerovoto=(int) (1+Math.random()*99);
		switch(rangoedad) {
		case "RANGO_18_25":
			if(numerovoto>0&&numerovoto<=7) {
				cantantevotado="Joel";
			}else if(numerovoto>7&&numerovoto<=10) {
				cantantevotado="Victoria";
			}else if(numerovoto>10&&numerovoto<=23) {
				cantantevotado="Thiago";
			}else if(numerovoto>23&&numerovoto<=30) {
				cantantevotado="Sarah";
			}else if(numerovoto>30&&numerovoto<=37) {
				cantantevotado="Elton";
			}else if(numerovoto>37&&numerovoto<=51) {
				cantantevotado="Amie";
			}else if(numerovoto>51&&numerovoto<=61) {
				cantantevotado="Nahid";
			}else if(numerovoto>61&&numerovoto<=88) {
				cantantevotado="Marc";
			}else if(numerovoto>88&&numerovoto<=95) {
				cantantevotado="Alba";
			}else if(numerovoto>95&&numerovoto<=100) {
				cantantevotado="Julio";
			}
			break;
		case "RANGO_26_40":
			if(numerovoto>0&&numerovoto<=14) {
				cantantevotado="Joel";
			}else if(numerovoto>14&&numerovoto<=20) {
				cantantevotado="Victoria";
			}else if(numerovoto>20&&numerovoto<=33) {
				cantantevotado="Thiago";
			}else if(numerovoto>33&&numerovoto<=40) {
				cantantevotado="Sarah";
			}else if(numerovoto>40&&numerovoto<=46) {
				cantantevotado="Elton";
			}else if(numerovoto>46&&numerovoto<=58) {
				cantantevotado="Amie";
			}else if(numerovoto>58&&numerovoto<=65) {
				cantantevotado="Nahid";
			}else if(numerovoto>65&&numerovoto<=81) {
				cantantevotado="Marc";
			}else if(numerovoto>81&&numerovoto<=90) {
				cantantevotado="Alba";
			}else if(numerovoto>90&&numerovoto<=100) {
				cantantevotado="Julio";
			}
			break;
		case "RANGO_41_65":
			if(numerovoto>0&&numerovoto<=5) {
				cantantevotado="Joel";
			}else if(numerovoto>5&&numerovoto<=15) {
				cantantevotado="Victoria";
			}else if(numerovoto>15&&numerovoto<=27) {
				cantantevotado="Thiago";
			}else if(numerovoto>27&&numerovoto<=33) {
				cantantevotado="Sarah";
			}else if(numerovoto>33&&numerovoto<=40) {
				cantantevotado="Elton";
			}else if(numerovoto>40&&numerovoto<=54) {
				cantantevotado="Amie";
			}else if(numerovoto>54&&numerovoto<=61) {
				cantantevotado="Nahid";
			}else if(numerovoto>61&&numerovoto<=71) {
				cantantevotado="Marc";
			}else if(numerovoto>71&&numerovoto<=88) {
				cantantevotado="Alba";
			}else if(numerovoto>88&&numerovoto<=100) {
				cantantevotado="Julio";
			}
			break;
		case "RANGO_MAS_66":
			if(numerovoto>0&&numerovoto<=3) {
				cantantevotado="Joel";
			}else if(numerovoto>3&&numerovoto<=20) {
				cantantevotado="Victoria";
			}else if(numerovoto>20&&numerovoto<=25) {
				cantantevotado="Thiago";
			}else if(numerovoto>25&&numerovoto<=37) {
				cantantevotado="Sarah";
			}else if(numerovoto>37&&numerovoto<=49) {
				cantantevotado="Elton";
			}else if(numerovoto>49&&numerovoto<=58) {
				cantantevotado="Amie";
			}else if(numerovoto>58&&numerovoto<=65) {
				cantantevotado="Nahid";
			}else if(numerovoto>65&&numerovoto<=76) {
				cantantevotado="Marc";
			}else if(numerovoto>76&&numerovoto<=91) {
				cantantevotado="Alba";
			}else if(numerovoto>91&&numerovoto<=100) {
				cantantevotado="Julio";
			}
			break;
		}
	}
}
