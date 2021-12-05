
public class Rei extends Peca{
	private char simbolo;
	
	public Rei(int cor) {
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
				 this.simbolo = 'K';
			} else {
				 this.simbolo = 'k';
			}
		}
		
		public char getSimbolo() {
			return this.simbolo;
		}
		
		@Override
		public boolean isJogadaValida(Peca[][] casa, int linhaOrigem, int colunaOrigem, int linhaDestino, int colunaDestino) {
			int x = Math.abs(linhaOrigem - linhaDestino);
			int y = Math.abs(colunaOrigem - colunaDestino);
			
			if(x == 0 && y == 0) {
				return false;
			}
			
			if(x > 1 || y > 1) {
				return false;
			}
			
			if(casa[linhaDestino][colunaDestino].getCor() == 5) {
				return true;
			}
			
			if(this.getCor() == 0 && casa[linhaDestino][colunaDestino].getCor() == 1) {
				return true;
			}
			
			if(this.getCor() == 1 && casa[linhaDestino][colunaDestino].getCor() == 0) {
				return true;
			}
			
			return false;
		}
		
}