package aula2;

public class Cavalo extends Animal{

	private String raca;

	public Cavalo(float tamanho, String cor, String raca) {
		super(tamanho, cor);
		this.raca = raca;
	}
	
	public void fugir() {
		System.out.println("Cavalo Fugindo!");
	}

	public String getRaca() {
		return raca;
	}

	public void setRaca(String raca) {
		this.raca = raca;
	}
	
}
