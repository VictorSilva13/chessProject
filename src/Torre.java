
public class Torre extends Peca{
	
	private char simbolo;
	
	public Torre(int cor) {
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
				 this.simbolo = 'T';
			} else {
				 this.simbolo = 't';
			}
		}
		
		public char getSimbolo() {
			return this.simbolo;
		}
		
		@Override
		public boolean isJogadaValida(Peca[][] casa, int linhaOrigem, int colunaOrigem, int linhaDestino, int colunaDestino) {
			int x = Math.abs(linhaOrigem-linhaDestino);
			int y = Math.abs(colunaOrigem-colunaDestino);
			int contadora = 0;
			boolean paraCima = true;
			boolean paraBaixo = true;
			boolean paraDireita = true;
			boolean paraEsquerda = true;
			
			if(this.getCor() == 0 || this.getCor() == 1) {
				if(linhaOrigem == linhaDestino && colunaOrigem == colunaDestino) {
					return false;
				}
				else if(linhaDestino < linhaOrigem && colunaOrigem == colunaDestino) {
					paraCima = true;
					paraBaixo = false;
					paraDireita = false;
					paraEsquerda = false;
				}
				else if(linhaDestino > linhaOrigem && colunaOrigem == colunaDestino) {
					paraBaixo = true;
					paraCima = false;
					paraDireita = false;
					paraEsquerda = false;
				}
				else if(colunaDestino < colunaOrigem && linhaOrigem == linhaDestino) {
					paraEsquerda = true;
					paraDireita = false;
					paraCima = false;
					paraBaixo = false;
				}
				else if(colunaDestino > colunaOrigem && linhaOrigem == linhaDestino) {
					paraDireita = true;
					paraEsquerda = false;
					paraCima = false;
					paraBaixo = false;
				}else {
					return false;
				}
			} 
			
			if(this.getCor() == 0) {
				if(paraCima == true) {
					for(int i = 1; i <= x; i++) {
						if(casa[Math.abs(linhaOrigem-i)][colunaOrigem].isOcupada()==false) {
							contadora = contadora + 1;
						} else {
							contadora = contadora - 0;
						}
					}
				}
				if(paraBaixo == true) {
					for(int i = 1; i <= x; i++) {
						if(casa[linhaOrigem+i][colunaOrigem].isOcupada()==false) {
							contadora = contadora + 1;
						} else {
							contadora = contadora - 0;
						}
					}
				}
				if(paraDireita == true) {
					for(int i = 1; i <= y; i++) {
						if(casa[linhaOrigem][colunaOrigem+i].isOcupada()==false) {
							contadora = contadora + 1;
						} else {
							contadora = contadora - 0;
						}
					}
				}
				if(paraEsquerda == true) {
					for(int i = 1; i <= y; i++) {
						if(casa[linhaOrigem][Math.abs(colunaOrigem-i)].isOcupada()==false) {
							contadora = contadora + 1;
						} else {
							contadora = contadora - 0;
						}
					}
				}
			}
			
			if(this.getCor() == 1) {
				if(paraCima == true) {
					for(int i = 1; i <= x; i++) {
						if(casa[Math.abs(linhaOrigem-i)][colunaOrigem].isOcupada()==false) {
							contadora = contadora + 1;
						} else {
							contadora = contadora - 0;
						}
					}
				}
				if(paraBaixo == true) {
					for(int i = 1; i <= x; i++) {
						if(casa[linhaOrigem+i][colunaOrigem].isOcupada()==false) {
							contadora = contadora + 1;
						} else {
							contadora = contadora - 0;
						}
					}
				}
				if(paraDireita == true) {
					for(int i = 1; i <= y; i++) {
						if(casa[linhaOrigem][colunaOrigem+i].isOcupada()==false) {
							contadora = contadora + 1;
						} else {
							contadora = contadora - 0;
						}
					}
				}
				if(paraEsquerda == true) {
					for(int i = 1; i <= y; i++) {
						if(casa[linhaOrigem][Math.abs(colunaOrigem-i)].isOcupada()==false) {
							contadora = contadora + 1;
						} else {
							contadora = contadora - 0;
						}
					}
				}
			}
			
			if(contadora == x && y == 0) {
				if(casa[linhaDestino][colunaDestino].getCor() == 5) {
					return true;
				}
				else {
					return false;
				}
			}
			if(contadora == y && x == 0) {
				if(casa[linhaDestino][colunaDestino].getCor() == 5) {
					return true;
				}
				else {
					return false;
				}
			}
			else {
				if(contadora == x-1 && y == 0) {
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
				if(contadora == y-1 && x == 0) {
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

		
}