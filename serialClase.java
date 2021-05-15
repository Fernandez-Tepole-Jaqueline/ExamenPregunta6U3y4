package poo.ito.clases;

import ito.poo.interfaces.Serial;

public class serialClase implements Serial {

	private long numero;
	private int contador;
	public serialClase() {
		super();
		this.numero=0;
		this.contador=0;
	}
	
	@Override
	public void reinicia() {
		this.numero=this.numero-(this.contador*5);
		this.contador=0;
	}

	@Override
	public void inicia(long x) {
		this.numero=x;
	}

	@Override
	public long siguiente() {
		this.contador=(this.contador+1);
		return this.numero=(this.numero+5L);
	}

}