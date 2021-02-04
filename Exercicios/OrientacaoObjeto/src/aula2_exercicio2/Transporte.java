package aula2_exercicio2;

public class Transporte {
	
	private double capacidade;
	private float velocidadeMaxima;
	private String tipoDirecao;

	public Transporte(double capacidade, float velocidadeMaxima, String tipoDirecao) {
		this.capacidade = capacidade;
		this.velocidadeMaxima = velocidadeMaxima;
		this.tipoDirecao = tipoDirecao;
	}

	public double getCapacidade() {
		return capacidade;
	}

	public void setCapacidade(double capacidade) {
		this.capacidade = capacidade;
	}

	public float getVelocidadeMaxima() {
		return velocidadeMaxima;
	}

	public void setVelocidadeMaxima(float velocidadeMaxima) {
		this.velocidadeMaxima = velocidadeMaxima;
	}
	
	public String getTipoDirecao() {
		return tipoDirecao;
	}

	public void setTipoDirecao(String tipoDirecao) {
		this.tipoDirecao = tipoDirecao;
	}

	public void mover() {
		System.out.println("Movendo-se!");
	}

}
