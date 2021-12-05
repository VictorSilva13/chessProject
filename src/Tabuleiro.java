
import javax.swing.JOptionPane;

public class Tabuleiro {

    Peca arrayDePecas[][] = new Peca[8][8];
    Vazia vazia = new Vazia();
    Peca pecaSelecionada;
    Peca pecaNoDestino;
    Peao pBranco = new Peao(0);
    Peao pPreto = new Peao(1);
    Rei reiBranco = new Rei(0);
    Rei reiPreto = new Rei(1);
    Rainha rainhaBranco = new Rainha(0);
    Rainha rainhaPreto = new Rainha(1);
    Bispo bBranco = new Bispo(0);
    Bispo bPreto = new Bispo(1);
    Torre tBranco = new Torre(0);
    Torre tPreto = new Torre(1);
    Cavalo cBranco = new Cavalo(0);
    Cavalo cPreto = new Cavalo(1);

    public void iniciarTabuleiro() {
        for (int i = 0; i < 8; i++) {
            for (int j = 0; j < 8; j++) {
                arrayDePecas[i][j] = vazia;
            }
        }

        for (int i = 1; i < 2; i++) { //PEOES PRETOS
            for (int j = 0; j < 8; j++) {
                arrayDePecas[i][j] = pPreto;
                arrayDePecas[i][j].setOcupada(true);
            }
        }

        for (int i = 6; i < 7; i++) { //PEOES BRANCOS
            for (int j = 0; j < 8; j++) {
                arrayDePecas[i][j] = pBranco;
                arrayDePecas[i][j].setOcupada(true);
            }
        }

        arrayDePecas[0][0] = tPreto;
        arrayDePecas[0][0].setOcupada(true);
        arrayDePecas[0][0].setNumMovimeto(0);
        arrayDePecas[0][1] = cPreto;
        arrayDePecas[0][1].setOcupada(true);
        arrayDePecas[0][2] = bPreto;
        arrayDePecas[0][2].setOcupada(true);
        arrayDePecas[0][3] = rainhaPreto;
        arrayDePecas[0][3].setOcupada(true);
        arrayDePecas[0][4] = reiPreto;
        arrayDePecas[0][4].setNumMovimeto(0);
        arrayDePecas[0][4].setOcupada(true);
        arrayDePecas[0][5] = bPreto;
        arrayDePecas[0][5].setOcupada(true);
        arrayDePecas[0][6] = cPreto;
        arrayDePecas[0][6].setOcupada(true);
        arrayDePecas[0][7] = tPreto;
        arrayDePecas[0][7].setNumMovimeto(0);
        arrayDePecas[0][7].setOcupada(true);

        arrayDePecas[7][0] = tBranco;
        arrayDePecas[7][0].setNumMovimeto(0);
        arrayDePecas[7][0].setOcupada(true);
        arrayDePecas[7][1] = cBranco;
        arrayDePecas[7][1].setOcupada(true);
        arrayDePecas[7][2] = bBranco;
        arrayDePecas[7][2].setOcupada(true);
        arrayDePecas[7][3] = rainhaBranco;
        arrayDePecas[7][3].setOcupada(true);
        arrayDePecas[7][4] = reiBranco;
        arrayDePecas[7][4].setNumMovimeto(0);
        arrayDePecas[7][4].setOcupada(true);
        arrayDePecas[7][5] = bBranco;
        arrayDePecas[7][5].setOcupada(true);
        arrayDePecas[7][6] = cBranco;
        arrayDePecas[7][6].setOcupada(true);
        arrayDePecas[7][7] = tBranco;
        arrayDePecas[7][7].setNumMovimeto(0);
        arrayDePecas[7][7].setOcupada(true);
    }

    public String attTab() {
        //IMPRIME O TABULEIRO COM TODOS OS OBJETOS
        String tabuleiroStr = "";

        //System.out.println("\n");
        tabuleiroStr += "  ----------------\n";
        //System.out.println("  -----------------");
        for (int i = 0; i < 8; i++) {
            tabuleiroStr += 8 - i + "|";
            //System.out.print(8-i+"| ");
            for (int j = 0; j < 8; j++) {
                if (arrayDePecas[i][j] == vazia) {
                    tabuleiroStr += vazia.getSimbolo() + " ";
                    //System.out.print(vazia.getSimbolo()+ " ");
                } else if (arrayDePecas[i][j] == pPreto) {
                    tabuleiroStr += pPreto.getSimbolo() + " ";
                    //System.out.print(pPreto.getSimbolo() + " ");
                } else if (arrayDePecas[i][j] == pBranco) {
                    tabuleiroStr += pBranco.getSimbolo() + " ";
                    //System.out.print(pBranco.getSimbolo() + " ");
                } else if (arrayDePecas[i][j] == tBranco) {
                    tabuleiroStr += tBranco.getSimbolo() + " ";
                    //System.out.print(tBranco.getSimbolo() + " ");
                } else if (arrayDePecas[i][j] == tPreto) {
                    tabuleiroStr += tPreto.getSimbolo() + " ";
                    //System.out.print(tPreto.getSimbolo() + " ");
                } else if (arrayDePecas[i][j] == cBranco) {
                    tabuleiroStr += cBranco.getSimbolo() + " ";
                    //System.out.print(cBranco.getSimbolo() + " ");
                } else if (arrayDePecas[i][j] == cPreto) {
                    tabuleiroStr += cPreto.getSimbolo() + " ";
                    //System.out.print(cPreto.getSimbolo() + " ");
                } else if (arrayDePecas[i][j] == bBranco) {
                    tabuleiroStr += bBranco.getSimbolo() + " ";
                    //System.out.print(bBranco.getSimbolo() + " ");
                } else if (arrayDePecas[i][j] == bPreto) {
                    tabuleiroStr += bPreto.getSimbolo() + " ";
                    //System.out.print(bPreto.getSimbolo() + " ");
                } else if (arrayDePecas[i][j] == rainhaBranco) {
                    tabuleiroStr += rainhaBranco.getSimbolo() + " ";
                    //System.out.print(rainhaBranco.getSimbolo() + " ");
                } else if (arrayDePecas[i][j] == rainhaPreto) {
                    tabuleiroStr += rainhaPreto.getSimbolo() + " ";
                    //System.out.print(rainhaPreto.getSimbolo() + " ");
                } else if (arrayDePecas[i][j] == reiBranco) {
                    tabuleiroStr += reiBranco.getSimbolo() + " ";
                    //System.out.print(reiBranco.getSimbolo() + " ");
                    arrayDePecas[i][j].setCoordX(i);
                    arrayDePecas[i][j].setCoordY(j);
                } else if (arrayDePecas[i][j] == reiPreto) {
                    tabuleiroStr += reiPreto.getSimbolo() + " ";
                    //System.out.print(reiPreto.getSimbolo() + " ");
                    arrayDePecas[i][j].setCoordX(i);
                    arrayDePecas[i][j].setCoordY(j);
                }

            }
            tabuleiroStr += "|\n";
            //System.out.println("|");
        }
        tabuleiroStr += "  ----------------\n";
        //System.out.println("  -----------------");
        tabuleiroStr += "  a b c d e f g h";
        //System.out.println("   a b c d e f g h");

        return tabuleiroStr;
    }

    public void fazerMovimento(int linhaOrigem, int colunaOrigem, int linhaDestino, int colunaDestino, Jogador jogador, Jogador proxJogador, int obrigatorio) {
        try {
            pecaSelecionada = arrayDePecas[linhaOrigem][colunaOrigem];
            pecaNoDestino = arrayDePecas[linhaDestino][colunaDestino];

            if (obrigatorio == 1 && pecaSelecionada.equals(vazia) == false) {
                arrayDePecas[linhaOrigem][colunaOrigem] = vazia;
                arrayDePecas[linhaOrigem][colunaOrigem].setOcupada(false);
                arrayDePecas[linhaDestino][colunaDestino] = pecaSelecionada;
                arrayDePecas[linhaDestino][colunaDestino].setOcupada(true);
                pecaSelecionada.setNumMovimeto(0);
            } else if (jogador.getCor() == pecaSelecionada.getCor() && obrigatorio == 0) {
                if (pecaSelecionada.isJogadaValida(arrayDePecas, linhaOrigem, colunaOrigem, linhaDestino, colunaDestino)) {

                    arrayDePecas[linhaOrigem][colunaOrigem] = vazia;
                    arrayDePecas[linhaOrigem][colunaOrigem].setOcupada(false);
                    arrayDePecas[linhaDestino][colunaDestino] = pecaSelecionada;
                    arrayDePecas[linhaDestino][colunaDestino].setOcupada(true);
                    pecaSelecionada.setNumMovimeto(1);

                    int numReiBranco = 0;
                    int numReiPreto = 0;

                    for (int i = 0; i < 8; i++) {
                        for (int j = 0; j < 8; j++) {
                            if (arrayDePecas[i][j].equals(reiBranco)) {
                                numReiBranco = numReiBranco + 1;
                            }
                            if (arrayDePecas[i][j].equals(reiPreto)) {
                                numReiPreto = numReiPreto + 1;
                            }
                        }
                    }

                    if (numReiBranco == 0) {
                        StringBuilder fimDeJogo = new StringBuilder();
                        fimDeJogo.append("O rei Branco foi derrotado!\nIniciar nova partida? ");
                        if (JOptionPane.showConfirmDialog(null, fimDeJogo, "Game Over :)", JOptionPane.YES_NO_OPTION) == JOptionPane.YES_OPTION) {
                            jogador.setVezDeJogar(false);
                            iniciarTabuleiro();
                            attTab();
                        } else {
                            System.exit(00);
                        }
                    }
                    if (numReiPreto == 0) {
                        StringBuilder fimDeJogo = new StringBuilder();
                        fimDeJogo.append("O rei Preto foi derrotado!\nIniciar nova partida? ");
                        if (JOptionPane.showConfirmDialog(null, fimDeJogo, "Game Over :)", JOptionPane.YES_NO_OPTION) == JOptionPane.YES_OPTION) {
                            StringBuilder inverteLado = new StringBuilder();
                            inverteLado.append("Atenção!!!\nAgora inverte-se o lado dos jogadores!");
                            JOptionPane.showMessageDialog(null, inverteLado);
                            jogador.setVezDeJogar(true);
                            iniciarTabuleiro();
                            attTab();
                        } else {
                            System.exit(00);
                        }
                    }

                } else {
                    jogador.setVezDeJogar(true);
                    proxJogador.setVezDeJogar(false);
                    throw new JogadaInvalidaException();
                }
            } else if (jogador.getCor() != pecaSelecionada.getCor()) {
                if (jogador.getCor() == 0) {
                    jogador.setVezDeJogar(true);
                    proxJogador.setVezDeJogar(false);
                    throw new JogadaInvalidaException();
                }
                if (jogador.getCor() == 1) {
                    jogador.setVezDeJogar(true);
                    proxJogador.setVezDeJogar(false);
                    throw new JogadaInvalidaException();
                }
            } else {
                jogador.setVezDeJogar(true);
                proxJogador.setVezDeJogar(false);
                throw new JogadaInvalidaException();
            }

        } catch (JogadaInvalidaException ex) {
            StringBuilder jogadaExStr = new StringBuilder();
            jogadaExStr.append("Jogada invalida!");
            JOptionPane.showMessageDialog(null, jogadaExStr);
        }

    }

    public boolean isPeao(int linha, int coluna) { // UTILIZADO NA CLASSE Jogo PARA A PROMO��O DO PE�O
        pecaSelecionada = arrayDePecas[linha][coluna];
        if (pecaSelecionada.equals(pBranco) || pecaSelecionada.equals(pPreto)) {
            return true;
        }
        return false;
    }

    public void promoverPeao(int linhaOrigem, int colunaOrigem, char novaPeca, Jogador jogador, Jogador proxJogador) {
        if (arrayDePecas[linhaOrigem][colunaOrigem].getCor() == 0 && jogador.getCor() == 0) {
            switch (novaPeca) {

                case 'T':
                    arrayDePecas[linhaOrigem][colunaOrigem] = tBranco;
                    jogador.setVezDeJogar(false);
                    proxJogador.setVezDeJogar(true);
                    break;
                case 'C':
                    arrayDePecas[linhaOrigem][colunaOrigem] = cBranco;
                    jogador.setVezDeJogar(false);
                    proxJogador.setVezDeJogar(true);
                    break;
                case 'B':
                    arrayDePecas[linhaOrigem][colunaOrigem] = bBranco;
                    jogador.setVezDeJogar(false);
                    proxJogador.setVezDeJogar(true);
                    break;
                case 'Q':
                    arrayDePecas[linhaOrigem][colunaOrigem] = rainhaBranco;
                    jogador.setVezDeJogar(false);
                    proxJogador.setVezDeJogar(true);
                    break;
                default:
                    System.out.println("Nao e possivel fazer este tipo de promocao!");
                    jogador.setVezDeJogar(true);
                    proxJogador.setVezDeJogar(false);
            }
        }
        if (arrayDePecas[linhaOrigem][colunaOrigem].getCor() == 1 && jogador.getCor() == 1) {
            switch (novaPeca) {

                case 't':
                    arrayDePecas[linhaOrigem][colunaOrigem] = tPreto;
                    jogador.setVezDeJogar(false);
                    proxJogador.setVezDeJogar(true);
                    break;
                case 'c':
                    arrayDePecas[linhaOrigem][colunaOrigem] = cPreto;
                    jogador.setVezDeJogar(false);
                    proxJogador.setVezDeJogar(true);
                    break;
                case 'b':
                    arrayDePecas[linhaOrigem][colunaOrigem] = bPreto;
                    jogador.setVezDeJogar(false);
                    proxJogador.setVezDeJogar(true);
                    break;
                case 'q':
                    arrayDePecas[linhaOrigem][colunaOrigem] = rainhaPreto;
                    jogador.setVezDeJogar(false);
                    proxJogador.setVezDeJogar(true);
                    break;
                default:
                    System.out.println("Nao e possivel fazer este tipo de promocao!");
                    jogador.setVezDeJogar(true);
                    proxJogador.setVezDeJogar(false);
            }
        }

    }

//    public boolean isXeque(int cor) {
//        if (cor == 0) {
//            for (int i = 0; i < 8; i++) {
//                for (int j = 0; j < 8; j++) {
//                    if (arrayDePecas[i][j].getCor() == 1) {
//                        if (arrayDePecas[i][j].isJogadaValida(arrayDePecas, i, j, reiBranco.getCoordX(), reiBranco.getCoordY()) == true) {
//                            System.out.println(">>> XEQUE DAS PECAS PRETAS <<<");
//                            return true;
//                        }
//                    }
//                }
//            }
//        }
//        if (cor == 1) {
//            for (int i = 0; i < 8; i++) {
//                for (int j = 0; j < 8; j++) {
//                    if (arrayDePecas[i][j].getCor() == 0) {
//                        if (arrayDePecas[i][j].isJogadaValida(arrayDePecas, i, j, reiPreto.getCoordX(), reiPreto.getCoordY()) == true) {
//                            System.out.println(">>> XEQUE DAS PECAS BRANCAS <<<");
//                            return true;
//                        }
//                    }
//
//                }
//            }
//        }
//
//        return false;
//
//    }
    public boolean isXequeDasBrancas() {
        for (int i = 0; i < 8; i++) {
            for (int j = 0; j < 8; j++) {
                if (arrayDePecas[i][j].getCor() == 0) {
                    if (arrayDePecas[i][j].isJogadaValida(arrayDePecas, i, j, reiPreto.getCoordX(), reiPreto.getCoordY()) == true) {
                        System.out.println(">>> XEQUE DAS PECAS BRANCAS <<<");
                        return true;
                    }
                }

            }
        }
        return false;
    }

    public boolean isXequeDasPretas() {
        for (int i = 0; i < 8; i++) {
            for (int j = 0; j < 8; j++) {
                if (arrayDePecas[i][j].getCor() == 1) {
                    if (arrayDePecas[i][j].isJogadaValida(arrayDePecas, i, j, reiBranco.getCoordX(), reiBranco.getCoordY()) == true) {
                        System.out.println(">>> XEQUE DAS PECAS PRETAS <<<");
                        return true;
                    }
                }
            }
        }
        return false;
    }

    public boolean roquePequeno(Jogador jogador) {
        if (jogador.getCor() == 0 && reiBranco.getNumMovimento() == 0 && arrayDePecas[7][7].equals(tBranco) && arrayDePecas[7][7].getNumMovimento() == 0) {
            if (arrayDePecas[7][5].equals(vazia) && arrayDePecas[7][6].equals(vazia) && isXequeDasPretas() == false) {

                arrayDePecas[7][5] = reiBranco;
                arrayDePecas[7][4] = vazia;

                if (isXequeDasPretas() == true) {
                    arrayDePecas[7][5] = vazia;
                    arrayDePecas[7][4] = reiBranco;
                    reiBranco.setNumMovimeto(0);
                    return false;
                } else {
                    arrayDePecas[7][5] = vazia;
                    arrayDePecas[7][6] = reiBranco;
                    if (isXequeDasPretas() == true) {
                        arrayDePecas[7][6] = vazia;
                        arrayDePecas[7][5] = vazia;
                        arrayDePecas[7][4] = reiBranco;
                        reiBranco.setNumMovimeto(0);
                        return false;
                    } else {
                        arrayDePecas[7][6] = reiBranco;
                        arrayDePecas[7][5] = tBranco;
                        arrayDePecas[7][7] = vazia;
                        reiBranco.setNumMovimeto(1);
                        tBranco.setNumMovimeto(1);
                        return true;
                    }
                }
            }
        }

        if (jogador.getCor() == 1 && reiPreto.getNumMovimento() == 0 && arrayDePecas[0][7].equals(tPreto) && arrayDePecas[0][7].getNumMovimento() == 0) {
            if (arrayDePecas[0][5].equals(vazia) && arrayDePecas[0][6].equals(vazia) && isXequeDasBrancas() == false) {

                arrayDePecas[0][5] = reiPreto;
                arrayDePecas[0][4] = vazia;

                if (isXequeDasBrancas() == true) {
                    arrayDePecas[0][5] = vazia;
                    arrayDePecas[0][4] = reiPreto;
                    reiPreto.setNumMovimeto(0);
                    return false;
                } else {
                    arrayDePecas[0][5] = vazia;
                    arrayDePecas[0][6] = reiPreto;
                    if (isXequeDasBrancas() == true) {
                        arrayDePecas[0][6] = vazia;
                        arrayDePecas[0][5] = vazia;
                        arrayDePecas[0][4] = reiPreto;
                        reiPreto.setNumMovimeto(0);
                        return false;
                    } else {
                        arrayDePecas[0][6] = reiPreto;
                        arrayDePecas[0][5] = tPreto;
                        arrayDePecas[0][7] = vazia;
                        reiPreto.setNumMovimeto(1);
                        tPreto.setNumMovimeto(1);
                        return true;
                    }
                }
            }
        }

        return false;
    }

    public boolean roqueGrande(Jogador jogador) {
        if (jogador.getCor() == 0 && reiBranco.getNumMovimento() == 0 && arrayDePecas[7][0].equals(tBranco) && arrayDePecas[7][0].getNumMovimento() == 0) {
            if (arrayDePecas[7][1].equals(vazia) && arrayDePecas[7][2].equals(vazia) && arrayDePecas[7][3].equals(vazia) && isXequeDasPretas() == false) {

                arrayDePecas[7][3] = reiBranco;
                arrayDePecas[7][4] = vazia;

                if (isXequeDasPretas() == true) {
                    arrayDePecas[7][3] = vazia;
                    arrayDePecas[7][4] = reiBranco;
                    reiBranco.setNumMovimeto(0);
                    return false;
                } else {
                    arrayDePecas[7][3] = vazia;
                    arrayDePecas[7][2] = reiBranco;
                    if (isXequeDasPretas() == true) {
                        arrayDePecas[7][2] = vazia;
                        arrayDePecas[7][3] = vazia;
                        arrayDePecas[7][4] = reiBranco;
                        reiBranco.setNumMovimeto(0);
                        return false;
                    } else {
                        arrayDePecas[7][2] = reiBranco;
                        arrayDePecas[7][3] = tBranco;
                        arrayDePecas[7][0] = vazia;
                        arrayDePecas[7][1] = vazia;
                        reiBranco.setNumMovimeto(1);
                        tBranco.setNumMovimeto(1);
                        return true;
                    }
                }
            }
        }

        if (jogador.getCor() == 1 && reiPreto.getNumMovimento() == 0 && arrayDePecas[0][0].equals(tPreto) && arrayDePecas[0][0].getNumMovimento() == 0) {
            if (arrayDePecas[0][1].equals(vazia) && arrayDePecas[0][2].equals(vazia) && arrayDePecas[0][3].equals(vazia) && isXequeDasBrancas() == false) {

                arrayDePecas[0][3] = reiPreto;
                arrayDePecas[0][4] = vazia;

                if (isXequeDasBrancas() == true) {
                    arrayDePecas[0][3] = vazia;
                    arrayDePecas[0][4] = reiPreto;
                    reiPreto.setNumMovimeto(0);
                    return false;
                } else {
                    arrayDePecas[0][3] = vazia;
                    arrayDePecas[0][2] = reiPreto;
                    if (isXequeDasBrancas() == true) {
                        arrayDePecas[0][2] = vazia;
                        arrayDePecas[0][3] = vazia;
                        arrayDePecas[0][4] = reiPreto;
                        reiPreto.setNumMovimeto(0);
                        return false;
                    } else {
                        arrayDePecas[0][2] = reiPreto;
                        arrayDePecas[0][3] = tPreto;
                        arrayDePecas[0][0] = vazia;
                        arrayDePecas[0][1] = vazia;
                        reiPreto.setNumMovimeto(1);
                        tPreto.setNumMovimeto(1);
                        return true;
                    }
                }
            }
        }
        return false;
    }

}
