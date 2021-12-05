
public class Cavalo extends Peca{
	
	private char simbolo;
	
	public Cavalo(int cor) {
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
			if(this.getCor() == 0) {
				 this.simbolo = 'C';
			} else {
				 this.simbolo = 'c';
			}
		}
		
		public char getSimbolo() {
			return this.simbolo;
		}
		
		@Override
		public boolean isJogadaValida(Peca[][] casa, int linhaOrigem, int colunaOrigem, int linhaDestino, int colunaDestino) {
			int x = Math.abs(linhaDestino - linhaOrigem);
			int y = Math.abs(colunaDestino - colunaOrigem);
			
			if((x == 1 && y == 2) || (x == 2 && y == 1)) {
				if(this.getCor() == 0 && casa[linhaDestino][colunaDestino].getCor() == 0) {
					return false;
				}
				if(this.getCor() == 1 && casa[linhaDestino][colunaDestino].getCor() == 1) {
					return false;
				}
				else {
					return true;
				}
			}
			return false;
		}

}