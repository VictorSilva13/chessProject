
public class Peao extends Peca {
	
	private char simbolo;

	public Peao(int cor) {
		super.setCor(cor);
		this.setSimbolo();
	}
	@Override
	public int getCor() {
		return super.getCor();
	}
	@Override
	public void setCor(int cor) {
		super.setCor(cor);
	}
	public void setSimbolo() {
		if (this.getCor() == 0) {
			this.simbolo = 'P';
		} else {
			this.simbolo = 'p';
		}
	}
	
	public char getSimbolo() {
		return this.simbolo;
	}
	@Override
	public boolean isJogadaValida(Peca[][] casa, int linhaOrigem, int colunaOrigem, int linhaDestino, int colunaDestino) {
		int x = linhaOrigem-linhaDestino;
		int y = linhaDestino-linhaOrigem;
		
		if(colunaOrigem==colunaDestino) {
		
		if(this.getCor() == 0 && x==2) {
			if(linhaOrigem == 6 && casa[linhaDestino][colunaDestino].isOcupada()==false) {
				return true;
			} else {
				return false;
			}
		}
		if(this.getCor() == 0 && x==1) {
			if(casa[linhaDestino][colunaDestino].isOcupada()==false) {
				return true;
			} else {
				return false;
			}
		}
		if(this.getCor() == 1 && y==2) {
			if(linhaOrigem == 1 && casa[linhaDestino][colunaDestino].isOcupada()==false) {
				return true;
			} else {
				return false;
			}
		}
		if(this.getCor() == 1 && y==1) {
			if(casa[linhaDestino][colunaDestino].isOcupada()==false) {
				return true;
			} else {
				return false;
			}
		} else { 
			return false;
		}
		} else {
			if((this.getCor() == 0 && linhaDestino == linhaOrigem - 1)&&(colunaDestino == colunaOrigem - 1 || colunaDestino == colunaOrigem + 1)) {
				if(casa[linhaDestino][colunaDestino].getCor() == 1) {
					return true;
				}else {
					return false;
				}
			}
			if((this.getCor() == 1 && linhaDestino == linhaOrigem + 1)&&(colunaDestino == colunaOrigem - 1 || colunaDestino == colunaOrigem + 1)) {
				if(casa[linhaDestino][colunaDestino].getCor() == 0) {
					return true;
				}else {
					return false;
				}
			}else {
				return false;
			}
			
		}	
	}	
	

}