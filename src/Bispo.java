
public class Bispo extends Peca{
	private char simbolo;
	
		public Bispo(int cor) {
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
				 this.simbolo = 'B';
			} else {
				 this.simbolo = 'b';
			}
		}
		
		public char getSimbolo() {
			return this.simbolo;
		}
		
		@Override
		public boolean isJogadaValida(Peca[][] casa, int linhaOrigem, int colunaOrigem, int linhaDestino, int colunaDestino) {
			int x = Math.abs(linhaDestino-linhaOrigem);
			int y = Math.abs(colunaDestino-colunaOrigem);
			int contadora = 0;
			
			boolean paraCima = true;
			boolean paraBaixo = true;
			boolean paraDireita = true;
			boolean paraEsquerda = true;
			
			if(this.getCor() == 0 || this.getCor() == 1) {
				if(x != y) {
					return false;
				}
				if(linhaDestino == linhaOrigem && colunaDestino == colunaOrigem) {
					return false;
				}
				if(linhaDestino < linhaOrigem && colunaDestino > colunaOrigem) {
					paraCima = true;
					paraBaixo = false;
					paraDireita = true;
					paraEsquerda = false;
				}
				if(linhaDestino < linhaOrigem && colunaDestino < colunaOrigem) {
					paraCima = true;
					paraBaixo = false;
					paraEsquerda = true;
					paraDireita = false;
				}
				if(linhaDestino > linhaOrigem && colunaDestino > colunaOrigem) {
					paraBaixo = true;
					paraCima = false;
					paraDireita = true;
					paraEsquerda = false;
				}
				if(linhaDestino > linhaOrigem && colunaDestino < colunaOrigem) {
					paraBaixo = true;
					paraCima = false;
					paraEsquerda = true;
					paraDireita = false;
				}
			}
			
			if(this.getCor() == 0) {
				if(paraCima == true && paraDireita == true) {
					for(int i = 1; i <= x; i++) {
						if(casa[Math.abs(linhaOrigem-i)][colunaOrigem+i].isOcupada()==false) {
							contadora = contadora + 1;
						} else {
							contadora = contadora - 0;;
						}
					}
				}
				if(paraCima == true && paraEsquerda == true) {
					for(int i = 1; i <= x; i++) {
						if(casa[Math.abs(linhaOrigem-i)][Math.abs(colunaOrigem-i)].isOcupada()==false) {
							contadora = contadora + 1;
						} else {
							contadora = contadora - 0;
						}
					}
				}
				if(paraBaixo == true && paraDireita == true) {
					for(int i = 1; i<= x; i++) {
						if(casa[linhaOrigem+i][colunaOrigem+i].isOcupada() == false) {
							contadora = contadora + 1;
						} else {
							contadora = contadora - 0;
						}
					}
				}
				if(paraBaixo == true && paraEsquerda == true) {
					for(int i = 1; i<= x; i++) {
						if(casa[linhaOrigem+i][Math.abs(colunaOrigem-i)].isOcupada() == false) {
							contadora = contadora + 1;
						} else {
							contadora = contadora - 0;
						}
					}
				}
			}
			
			if(this.getCor() == 1) {
				if(paraCima == true && paraDireita == true) {
					for(int i = 1; i<= x; i++) {
						if(casa[Math.abs(linhaOrigem - i)][colunaOrigem + i].isOcupada() == false) {
							contadora = contadora + 1;
						} else {
							contadora = contadora - 0;
						}
					}	
				}
				if(paraCima == true && paraEsquerda == true) {
					for(int i = 1; i<= x; i++) {
						if(casa[Math.abs(linhaOrigem-i)][Math.abs(colunaOrigem-i)].isOcupada()==false) {
							contadora = contadora + 1;
						} else {
							contadora = contadora - 0;
						}
					}
				}
				if(paraBaixo == true && paraDireita == true) {
					for(int i = 1; i <= x; i++) {
						if(casa[linhaOrigem+i][colunaOrigem+i].isOcupada() == false) {
							contadora = contadora + 1;
						} else {
							contadora = contadora - 0;
						}
					}
				}
				if(paraBaixo == true && paraEsquerda == true) {
					for(int i = 1; i <= x; i++) {
						if(casa[linhaOrigem+i][Math.abs(colunaOrigem-i)].isOcupada() == false) {
							contadora = contadora + 1;
						} else {
							contadora = contadora - 0;
						}
					}
				}
			}
			
			if(contadora == x) {
				if(casa[linhaDestino][colunaDestino].getCor() == 5) {
					return true;
				}
				else {
					return false;
				}
			}
			if(contadora == x-1) {
				if(this.getCor() == 0 && casa[linhaDestino][colunaDestino].getCor() == 1) {
					return true;
				}
				if(this.getCor() == 1 && casa[linhaDestino][colunaDestino].getCor() == 0) {
					return true;
				}
				else {
					return false;
				}
			}
				return false;
			
			
		}	

}