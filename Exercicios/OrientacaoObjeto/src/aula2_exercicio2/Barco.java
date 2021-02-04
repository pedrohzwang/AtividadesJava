package aula2_exercicio2;

public class Barco extends Aquatico {

	private int quantidadeVelas;
	private String tipoLocomocao;
	private int quantidadeRemos;
	
	public Barco(double capacidade, float velocidadeMaxima, String tipoDirecao, int quantidadeSalvaVidas,
			int quantidadeOperadores, int quantidadeVelas, String tipoLocomocao, int quantidadeRemos) {
		super(capacidade, velocidadeMaxima, tipoDirecao, quantidadeSalvaVidas, quantidadeOperadores);
		this.quantidadeVelas = quantidadeVelas;
		this.tipoLocomocao = tipoLocomocao;
		this.quantidadeRemos = quantidadeRemos;
	}

	public int getQuantidadeVelas() {
		return quantidadeVelas;
	}

	public void setQuantidadeVelas(int quantidadeVelas) {
		this.quantidadeVelas = quantidadeVelas;
	}

	public String getTipoLocomocao() {
		return tipoLocomocao;
	}

	public void setTipoLocomocao(String tipoLocomocao) {
		this.tipoLocomocao = tipoLocomocao;
	}

	public int getQuantidadeRemos() {
		return quantidadeRemos;
	}

	public void setQuantidadeRemos(int quantidadeRemos) {
		this.quantidadeRemos = quantidadeRemos;
	}
	
}
