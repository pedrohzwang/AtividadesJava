package aula2_exercicio2;

public class Aviao extends Aereo{

	private int quantidadeAsas;
	private int quantidadeFlaps;
	
	public Aviao(double capacidade, float velocidadeMaxima, String tipoDirecao, String metodoVoo, int quantidadePilotos,
			int quantidadeAsas, int quantidadeFlaps) {
		super(capacidade, velocidadeMaxima, tipoDirecao, metodoVoo, quantidadePilotos);
		this.quantidadeAsas = quantidadeAsas;
		this.quantidadeFlaps = quantidadeFlaps;
	}

	public int getQuantidadeAsas() {
		return quantidadeAsas;
	}

	public void setQuantidadeAsas(int quantidadeAsas) {
		this.quantidadeAsas = quantidadeAsas;
	}

	public int getQuantidadeFlaps() {
		return quantidadeFlaps;
	}

	public void setQuantidadeFlaps(int quantidadeFlaps) {
		this.quantidadeFlaps = quantidadeFlaps;
	}
	
}
