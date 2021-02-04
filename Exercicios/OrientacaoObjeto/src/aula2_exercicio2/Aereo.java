package aula2_exercicio2;

public class Aereo extends Transporte {
	private String metodoVoo;
	private int quantidadePilotos;
	
	public Aereo(double capacidade, float velocidadeMaxima, String tipoDirecao, String metodoVoo,
			int quantidadePilotos) {
		super(capacidade, velocidadeMaxima, tipoDirecao);
		this.metodoVoo = metodoVoo;
		this.quantidadePilotos = quantidadePilotos;
	}

	public String getMetodoVoo() {
		return metodoVoo;
	}

	public void setMetodoVoo(String metodoVoo) {
		this.metodoVoo = metodoVoo;
	}

	public int getQuantidadePilotos() {
		return quantidadePilotos;
	}

	public void setQuantidadePilotos(int quantidadePilotos) {
		this.quantidadePilotos = quantidadePilotos;
	}
	
}
