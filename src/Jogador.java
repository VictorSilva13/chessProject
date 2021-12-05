public class Jogador {
	private String nome;
	private int cor; // 0 -> BRANCAS, 1 -> PRETAS
	private boolean vezDeJogar;
	
	public String getNome() {
		return nome;
	}
	
	public void setNome(String nome) {
		this.nome = nome;
	}
	
	public int getCor() {
		return cor;
	}
	
	public void setCor(int cor) {
		this.cor = cor;
	}
	
	public boolean isVezDeJogar() {
		return this.vezDeJogar;
	}
	
	public void setVezDeJogar(boolean vez) {
		this.vezDeJogar = vez;
	}	
}