
public class Rainha extends Peca {
	private char simbolo;
	
	public Rainha(int cor) {
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
				 this.simbolo = 'Q';
			} else {
				 this.simbolo = 'q';
			}
		}
		
		public char getSimbolo() {
			return this.simbolo;
		}
		public boolean isJogadaValida(Peca[][] casa, int linhaOrigem, int colunaOrigem, int linhaDestino, int colunaDestino) {
			int x = Math.abs(linhaOrigem-linhaDestino);
			int y = Math.abs(colunaOrigem-colunaDestino);
			int contadora = 0;
			
			boolean paraCima = true;
			boolean paraBaixo = true;
			boolean paraDireita = true;
			boolean paraEsquerda = true;
			
			if(this.getCor() == 0 || this.getCor() == 1) {
				if(linhaDestino == linhaOrigem && colunaDestino == colunaOrigem) {
					return false;
				}
				//PROPRIEDADES DO BISPO
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
				//PROPRIEDADES DA TORRE
				if(linhaDestino < linhaOrigem && colunaOrigem == colunaDestino) {
					paraCima = true;
					paraBaixo = false;
					paraDireita = false;
					paraEsquerda = false;
				}
				if(linhaDestino > linhaOrigem && colunaOrigem == colunaDestino) {
					paraBaixo = true;
					paraCima = false;
					paraDireita = false;
					paraEsquerda = false;
				}
				if(colunaDestino < colunaOrigem && linhaOrigem == linhaDestino) {
					paraEsquerda = true;
					paraDireita = false;
					paraCima = false;
					paraBaixo = false;
				}
				if(colunaDestino > colunaOrigem && linhaOrigem == linhaDestino) {
					paraDireita = true;
					paraEsquerda = false;
					paraCima = false;
					paraBaixo = false;
				}
			}
			
			if(this.getCor() == 0) { //PARA PECAS BRANCAS
				if(x == y) {
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
				}else {
					if(paraCima == true && paraBaixo == false && paraDireita == false && paraEsquerda == false) {
						for(int i = 1; i <= x; i++) {
							if(casa[Math.abs(linhaOrigem-i)][colunaOrigem].isOcupada()==false) {
								contadora = contadora + 1;
							} else {
								contadora = contadora - 0;
							}
						}
					}
					if(paraBaixo == true && paraCima == false && paraDireita == false && paraEsquerda == false) {
						for(int i = 1; i <= x; i++) {
							if(casa[linhaOrigem+i][colunaOrigem].isOcupada()==false) {
								contadora = contadora + 1;
							} else {
								contadora = contadora - 0;
							}
						}
					}
					if(paraDireita == true && paraEsquerda == false && paraCima == false && paraBaixo == false) {
						for(int i = 1; i <= y; i++) {
							if(casa[linhaOrigem][colunaOrigem+i].isOcupada()==false) {
								contadora = contadora + 1;
							} else {
								contadora = contadora - 0;
							}
						}
					}
					if(paraEsquerda == true && paraDireita == false && paraCima == false && paraBaixo == false) {
						for(int i = 1; i <= y; i++) {
							if(casa[linhaOrigem][Math.abs(colunaOrigem-i)].isOcupada()==false) {
								contadora = contadora + 1;
							} else {
								contadora = contadora - 0;
							}
						}
					}
				}
			}
			
			if(this.getCor() == 1) { //PARA PECAS PRETAS
				if(x == y) {
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
				}else {
					if(paraCima == true && paraBaixo == false && paraDireita == false && paraEsquerda == false ) {
						for(int i = 1; i <= x; i++) {
							if(casa[Math.abs(linhaOrigem-i)][colunaOrigem].isOcupada()==false) {
								contadora = contadora + 1;
							} else {
								contadora = contadora - 0;
							}
						}
					}
					if(paraBaixo == true && paraCima == false && paraDireita == false && paraEsquerda == false) {
						for(int i = 1; i <= x; i++) {
							if(casa[linhaOrigem+i][colunaOrigem].isOcupada()==false) {
								contadora = contadora + 1;
							} else {
								contadora = contadora - 0;
							}
						}
					}
					if(paraDireita == true && paraEsquerda == false && paraCima == false && paraBaixo == false) {
						for(int i = 1; i <= y; i++) {
							if(casa[linhaOrigem][colunaOrigem+i].isOcupada()==false) {
								contadora = contadora + 1;
							} else {
								contadora = contadora - 0;
							}
						}
					}
					if(paraEsquerda == true && paraDireita == false && paraCima == false && paraBaixo == false) {
						for(int i = 1; i <= y; i++) {
							if(casa[linhaOrigem][Math.abs(colunaOrigem-i)].isOcupada()==false) {
								contadora = contadora + 1;
							} else {
								contadora = contadora - 0;
							}
						}
					}
				}
			}
			
			if(x != y) {
				if(x == contadora && y == 0) {
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
			}else {
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
			}
			return false;
			
		}

}