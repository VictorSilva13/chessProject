
public abstract class Peca {
	private int coordX;
	private int coordY;
	private boolean isOcupada;
	private int cor;
	private int numMovimeto;

	public void setOcupada(boolean isOcupada) {
		this.isOcupada = isOcupada;
	}

	public boolean isOcupada() {
		return isOcupada;
	}

	public boolean isJogadaValida(Peca[][] casa, int linhaOrigem, int colunaOrigem, int linhaDestino,
			int colunaDestino) {
		return false;
	}

	public int getCor() {
		return cor;
	}

	public void setCor(int cor) {
		this.cor = cor;
	}

	public int getCoordX() {
		return coordX;
	}

	public void setCoordX(int coordX) {
		this.coordX = coordX;
	}

	public int getCoordY() {
		return coordY;
	}

	public void setCoordY(int coordY) {
		this.coordY = coordY;
	}

	public int getNumMovimento() {
		return this.numMovimeto;
	}

	public void setNumMovimeto(int validade) { // validade = 1 -> movimento foi validado então soma +1
												// validade = 0 -> movimento nao foi validado então -1
		if (validade == 1) {
			this.numMovimeto = this.numMovimeto + 1;
		}
		if (validade == 0) {
			if (this.numMovimeto == 0) {

			} else {
				this.numMovimeto = this.numMovimeto - 1;
			}
		}

	}

}