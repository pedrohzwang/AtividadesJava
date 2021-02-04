package aula2_exercicio2;

public class Terrestre extends Transporte {

	private int numeroRodas;
	private int quantidadeLanternas;
	
	public Terrestre(double capacidade, float velocidadeMaxima, String tipoDirecao, int numeroRodas,
			int quantidadeLanternas) {
		super(capacidade, velocidadeMaxima, tipoDirecao);
		this.numeroRodas = numeroRodas;
		this.quantidadeLanternas = quantidadeLanternas;
	}

	public int getNumeroRodas() {
		return numeroRodas;
	}

	public void setNumeroRodas(int numeroRodas) {
		this.numeroRodas = numeroRodas;
	}

	public int getQuantidadeLanternas() {
		return quantidadeLanternas;
	}

	public void setQuantidadeLanternas(int quantidadeLanternas) {
		this.quantidadeLanternas = quantidadeLanternas;
	}
	
}
