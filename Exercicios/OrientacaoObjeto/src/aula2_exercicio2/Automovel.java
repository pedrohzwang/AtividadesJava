package aula2_exercicio2;

public class Automovel extends Terrestre {
	
	private String cor;
	private int numeroPortas;
	private String placa;
	private float tamanhoRoda;
	private int quantidadeEscapamentos;
	
	public Automovel(double capacidade, float velocidadeMaxima, String tipoDirecao, int numeroRodas,
			int quantidadeLanternas, String cor, int numeroPortas, String placa, float tamanhoRoda,
			int quantidadeEscapamentos) {
		super(capacidade, velocidadeMaxima, tipoDirecao, numeroRodas, quantidadeLanternas);
		this.cor = cor;
		this.numeroPortas = numeroPortas;
		this.placa = placa;
		this.tamanhoRoda = tamanhoRoda;
		this.quantidadeEscapamentos = quantidadeEscapamentos;
	}

	public String getCor() {
		return cor;
	}

	public void setCor(String cor) {
		this.cor = cor;
	}

	public int getNumeroPortas() {
		return numeroPortas;
	}

	public void setNumeroPortas(int numeroPortas) {
		this.numeroPortas = numeroPortas;
	}

	public String getPlaca() {
		return placa;
	}

	public void setPlaca(String placa) {
		this.placa = placa;
	}

	public float getTamanhoRoda() {
		return tamanhoRoda;
	}

	public void setTamanhoRoda(float tamanhoRoda) {
		this.tamanhoRoda = tamanhoRoda;
	}

	public int getQuantidadeEscapamentos() {
		return quantidadeEscapamentos;
	}

	public void setQuantidadeEscapamentos(int quantidadeEscapamentos) {
		this.quantidadeEscapamentos = quantidadeEscapamentos;
	}
	
}
