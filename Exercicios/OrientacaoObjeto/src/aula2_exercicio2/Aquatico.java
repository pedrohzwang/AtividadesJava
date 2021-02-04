package aula2_exercicio2;

public class Aquatico extends Transporte {
	private int quantidadeSalvaVidas;
	private int quantidadeOperadores;
	
	public Aquatico(double capacidade, float velocidadeMaxima, String tipoDirecao, int quantidadeSalvaVidas,
			int quantidadeOperadores) {
		super(capacidade, velocidadeMaxima, tipoDirecao);
		this.quantidadeSalvaVidas = quantidadeSalvaVidas;
		this.quantidadeOperadores = quantidadeOperadores;
	}
	public int getQuantidadeSalvaVidas() {
		return quantidadeSalvaVidas;
	}
	public void setQuantidadeSalvaVidas(int quantidadeSalvaVidas) {
		this.quantidadeSalvaVidas = quantidadeSalvaVidas;
	}
	public int getQuantidadeOperadores() {
		return quantidadeOperadores;
	}
	public void setQuantidadeOperadores(int quantidadeOperadores) {
		this.quantidadeOperadores = quantidadeOperadores;
	}
	
}
