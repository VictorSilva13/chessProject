
import javax.swing.JOptionPane;
import javax.swing.JRootPane;

/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
/**
 *
 * @author Augusto
 */
public class MyJFrame extends javax.swing.JFrame {

    private  Tabuleiro tb;
    private  Jogador j1, j2;

    /**
     * Creates new form MyJFrame
     */
    public MyJFrame(Jogador j1, Jogador j2) {
        this.tb = new Tabuleiro();
        this.j1 = j1;
        this.j2 = j2;
        initComponents();
        tb.iniciarTabuleiro();
        txtAreaTabuleiro.setText(tb.attTab());
        lblVez.setText("Vez de: "+ j1.getNome());
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jRadioButton1 = new javax.swing.JRadioButton();
        jPanelPrincipal = new javax.swing.JPanel();
        jScrollPane1 = new javax.swing.JScrollPane();
        txtAreaTabuleiro = new javax.swing.JTextArea();
        txtFieldJogada = new javax.swing.JTextField();
        lblSuaJogada = new javax.swing.JLabel();
        btnJogar = new javax.swing.JButton();
        btnDesistir = new javax.swing.JButton();
        btnAjuda = new javax.swing.JButton();
        lblVez = new javax.swing.JLabel();

        jRadioButton1.setText("jRadioButton1");

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        txtAreaTabuleiro.setEditable(false);
        txtAreaTabuleiro.setColumns(50);
        txtAreaTabuleiro.setFont(new java.awt.Font("Monospaced", 0, 18)); // NOI18N
        txtAreaTabuleiro.setLineWrap(true);
        txtAreaTabuleiro.setRows(1);
        txtAreaTabuleiro.setTabSize(0);
        txtAreaTabuleiro.setWrapStyleWord(true);
        txtAreaTabuleiro.setEnabled(false);
        jScrollPane1.setViewportView(txtAreaTabuleiro);

        lblSuaJogada.setText("Sua Jogada:");

        btnJogar.setText("JOGAR");
        btnJogar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnJogarActionPerformed(evt);
            }
        });

        btnDesistir.setText("DESISTIR");
        btnDesistir.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnDesistirActionPerformed(evt);
            }
        });

        btnAjuda.setText("AJUDA");
        btnAjuda.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnAjudaActionPerformed(evt);
            }
        });

        lblVez.setText("Vez de: ");

        javax.swing.GroupLayout jPanelPrincipalLayout = new javax.swing.GroupLayout(jPanelPrincipal);
        jPanelPrincipal.setLayout(jPanelPrincipalLayout);
        jPanelPrincipalLayout.setHorizontalGroup(
            jPanelPrincipalLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanelPrincipalLayout.createSequentialGroup()
                .addContainerGap()
                .addComponent(btnAjuda)
                .addGap(70, 70, 70)
                .addGroup(jPanelPrincipalLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanelPrincipalLayout.createSequentialGroup()
                        .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 268, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(18, 18, Short.MAX_VALUE)
                        .addGroup(jPanelPrincipalLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanelPrincipalLayout.createSequentialGroup()
                                .addComponent(btnDesistir)
                                .addContainerGap())
                            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanelPrincipalLayout.createSequentialGroup()
                                .addGroup(jPanelPrincipalLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                                    .addComponent(lblSuaJogada, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                    .addComponent(txtFieldJogada, javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(btnJogar, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                                .addGap(96, 96, 96))))
                    .addGroup(jPanelPrincipalLayout.createSequentialGroup()
                        .addComponent(lblVez, javax.swing.GroupLayout.PREFERRED_SIZE, 106, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(0, 0, Short.MAX_VALUE))))
        );
        jPanelPrincipalLayout.setVerticalGroup(
            jPanelPrincipalLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanelPrincipalLayout.createSequentialGroup()
                .addGap(20, 20, 20)
                .addComponent(lblVez)
                .addGap(18, 18, 18)
                .addGroup(jPanelPrincipalLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanelPrincipalLayout.createSequentialGroup()
                        .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 291, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(0, 31, Short.MAX_VALUE))
                    .addGroup(jPanelPrincipalLayout.createSequentialGroup()
                        .addGap(0, 0, Short.MAX_VALUE)
                        .addComponent(lblSuaJogada)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(txtFieldJogada, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(18, 18, 18)
                        .addComponent(btnJogar)
                        .addGap(121, 121, 121)
                        .addGroup(jPanelPrincipalLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(btnAjuda)
                            .addComponent(btnDesistir))
                        .addGap(9, 9, 9))))
        );

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanelPrincipal, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanelPrincipal, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void btnJogarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnJogarActionPerformed

        String notacao;
        notacao = txtFieldJogada.getText();
        int colunaOrigem, linhaOrigem, colunaDestino, linhaDestino;
        String corRoque = "";

        try {

            if (j1.isVezDeJogar() == true) {
                
                    j2.setVezDeJogar(true);
                    j1.setVezDeJogar(false);
                    
                    if (isNotacaoValida(notacao, 0) == true) {
                        colunaOrigem = converterCharToNum(notacao.charAt(0));
                        linhaOrigem = adaptarLinhaParaMatriz(Character.getNumericValue(notacao.charAt(1)));
                        colunaDestino = converterCharToNum(notacao.charAt(3));
                        linhaDestino = adaptarLinhaParaMatriz(Character.getNumericValue(notacao.charAt(4)));

                        tb.fazerMovimento(linhaOrigem, colunaOrigem, linhaDestino, colunaDestino, j1, j2, 0);

                        if (tb.isPeao(linhaDestino, colunaDestino) == true && linhaDestino == 0) {
                            String novaNotacao = JOptionPane.showInputDialog("Promova seu peao: ");

                            if (isNotacaoValida(novaNotacao, 1) == true) { // PROMOVER PEAO
                                int coluna = converterCharToNum(novaNotacao.charAt(0));
                                int linha = adaptarLinhaParaMatriz(Character.getNumericValue(novaNotacao.charAt(1)));
                                char novaPeca = novaNotacao.charAt(3);

                                tb.promoverPeao(linha, coluna, novaPeca, j1, j2);
                            }
                        }

                        if (tb.isXequeDasPretas() == true) {
                            j2.setVezDeJogar(false);
                            j1.setVezDeJogar(true);
                            tb.fazerMovimento(linhaDestino, colunaDestino, linhaOrigem, colunaOrigem, j1, j2, 1);
                            throw new ReiXequeException();
                        }

                        txtAreaTabuleiro.setText(tb.attTab());

                    } else if (isNotacaoValida(notacao, 2) == true) { //ROQUE PEQUENO
                        if (tb.roquePequeno(j1) == true) {
                            tb.roquePequeno(j1);

                            txtAreaTabuleiro.setText(tb.attTab());
                        } else {
                            corRoque = "Branco";
                            throw new RoqueInvalidoException();
                            //THROW EXCEPTION
                        }
                    } else if (isNotacaoValida(notacao, 3) == true) { //ROQUE GRANDE
                        if (tb.roqueGrande(j1) == true) {
                            tb.roqueGrande(j1);

                            txtAreaTabuleiro.setText(tb.attTab());
                        } else {
                            corRoque = "Branco";
                            throw new RoqueInvalidoException();
                            //THROW EXCEPTION
                        }
                    } else {
                        StringBuilder msgNotacaoInvalida = new StringBuilder();
                        msgNotacaoInvalida.append("Notacao invalida!");
                        JOptionPane.showMessageDialog(null, msgNotacaoInvalida);
                        j2.setVezDeJogar(false);
                        j1.setVezDeJogar(true);

                    }
                    if (tb.isXequeDasBrancas() == true) {
                        j1.setVezDeJogar(false);
                        j2.setVezDeJogar(true);
                        throw new ReiXequeException();
                    }
                    if(j1.isVezDeJogar() == true){
                        lblVez.setText("Vez de: " + j1.getNome());
                    }
                    if(j2.isVezDeJogar() == true){
                        lblVez.setText("Vez de: " + j2.getNome());
                    }
                    txtFieldJogada.setText("");
                    

            }

            else if (j2.isVezDeJogar() == true) {
                    j2.setVezDeJogar(false);
                    j1.setVezDeJogar(true);

                    if (isNotacaoValida(notacao, 0)) {
                        colunaOrigem = converterCharToNum(notacao.charAt(0));
                        linhaOrigem = adaptarLinhaParaMatriz(Character.getNumericValue(notacao.charAt(1)));
                        colunaDestino = converterCharToNum(notacao.charAt(3));
                        linhaDestino = adaptarLinhaParaMatriz(Character.getNumericValue(notacao.charAt(4)));

                        tb.fazerMovimento(linhaOrigem, colunaOrigem, linhaDestino, colunaDestino, j2, j1, 0);

                        if (tb.isPeao(linhaDestino, colunaDestino) == true && linhaDestino == 7) {
                            String novaNotacao = JOptionPane.showInputDialog("Promova seu peao: ");

                            if (isNotacaoValida(novaNotacao, 1) == true) { // PROMOVER PEAO
                                int coluna = converterCharToNum(novaNotacao.charAt(0));
                                int linha = adaptarLinhaParaMatriz(Character.getNumericValue(novaNotacao.charAt(1)));
                                char novaPeca = novaNotacao.charAt(3);

                                tb.promoverPeao(linha, coluna, novaPeca, j2, j1);

                            }
                        }

                        if (tb.isXequeDasBrancas() == true) {
                            j1.setVezDeJogar(false);
                            j2.setVezDeJogar(true);
                            tb.fazerMovimento(linhaDestino, colunaDestino, linhaOrigem, colunaOrigem, j2, j1, 1);
                            throw new ReiXequeException();
                        }

                        txtAreaTabuleiro.setText(tb.attTab());

                    } else if (isNotacaoValida(notacao, 2)) { //ROQUE PEQUENO
                        if (tb.roquePequeno(j2) == true) {
                            tb.roquePequeno(j2);

                            txtAreaTabuleiro.setText(tb.attTab());
                        } else {
                            corRoque = "Preto";
                            throw new RoqueInvalidoException();
                            //THROW EXCEPTION
                        }
                    } else if (isNotacaoValida(notacao, 3)) {
                        if (tb.roqueGrande(j2) == true) {
                            tb.roqueGrande(j2);

                            txtAreaTabuleiro.setText(tb.attTab());
                        } else {
                            corRoque = "Preto";
                            throw new RoqueInvalidoException();
                            //THROW EXCEPTION
                        }
                    } else {
                        StringBuilder msgNotacaoInvalida = new StringBuilder();
                        msgNotacaoInvalida.append("Notacao invalida!");
                        JOptionPane.showMessageDialog(null, msgNotacaoInvalida);
                        j1.setVezDeJogar(false);
                        j2.setVezDeJogar(true);
                    }
                    if (tb.isXequeDasPretas() == true) {
                        j1.setVezDeJogar(true);
                        j2.setVezDeJogar(false);
                        throw new ReiXequeException();
                    }
                    txtFieldJogada.setText("");
                   if(j1.isVezDeJogar() == true){
                        lblVez.setText("Vez de: " + j1.getNome());
                    }
                    if(j2.isVezDeJogar() == true){
                        lblVez.setText("Vez de: " + j2.getNome());
                    }
            }

        } catch (ReiXequeException reiException) {

            StringBuilder reiExStr = new StringBuilder();
            reiExStr.append(">>> REI EM XEQUE <<<");
            JOptionPane.showMessageDialog(rootPane, reiExStr);
            txtFieldJogada.setText("");

        } catch (RoqueInvalidoException roqueException) {
            if (corRoque.equals("Branco")) {
                j1.setVezDeJogar(true);
                j2.setVezDeJogar(false);
            }
            if (corRoque.equals("Preto")) {
                j2.setVezDeJogar(true);
                j1.setVezDeJogar(false);
            }
            StringBuilder roqueExStr = new StringBuilder();
            roqueExStr.append("Não é possível fazer esse roque!");
            JOptionPane.showMessageDialog(rootPane, roqueExStr);
            txtFieldJogada.setText("");
        }


    }//GEN-LAST:event_btnJogarActionPerformed

    private void btnAjudaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnAjudaActionPerformed
        StringBuilder msgAjuda = new StringBuilder();
        msgAjuda.append("As jogadas devem ser realizadas em notacao algebrica.\nMOVIMENTOS\na2:a4 -> A peca na posicao a2 se move ate a posicao a4\nCAPTURAS\na4xb5 -> A peca na posicao a4 captura a peca inimiga em b5\nPROMOCAO DE PEAO\ne8=Q -> O peao em e8 promove-se para Rainha");

        JOptionPane.showMessageDialog(null, msgAjuda);
    }//GEN-LAST:event_btnAjudaActionPerformed

    private void btnDesistirActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnDesistirActionPerformed

        StringBuilder msgDesistir = new StringBuilder();
        msgDesistir.append("Deseja realmente desistir?");
        StringBuilder msgDone = new StringBuilder();
        
        if (JOptionPane.showConfirmDialog(rootPane, msgDesistir, "Giving up? ;-;", JOptionPane.YES_NO_OPTION) == JOptionPane.YES_OPTION) {
            if(j1.isVezDeJogar() == true){
                msgDone.append(j1.getNome()+" desistiu!");
                JOptionPane.showMessageDialog(null, msgDone);
            }
            if(j2.isVezDeJogar() == true){
                msgDone.append(j2.getNome()+" desistiu!");
                JOptionPane.showMessageDialog(null, msgDone);
            }
            System.exit(00);
        } else {

        }


    }//GEN-LAST:event_btnDesistirActionPerformed

    public boolean isNotacaoValida(String notacao, int tipoJogada) { // tipoJogada = 0 para mover ou capturar 
        // tipoJogada = 1 para promover peca 
        // tipoJogada = 2 para roque pequeno
        //tipoJogada = 3 para roque grande

        if (tipoJogada == 0) {
            if (notacao.length() == 5 && (notacao.charAt(2) == 'x' || notacao.charAt(2) == ':')) {
                if ((notacao.charAt(0) >= 97 && notacao.charAt(0) <= 104)
                        && (notacao.charAt(3) >= 97 && notacao.charAt(3) <= 104)) {
                    if ((notacao.charAt(1) >= 49 && notacao.charAt(1) <= 56)
                            && (notacao.charAt(1) >= 49 && notacao.charAt(1) <= 56)) {
                        return true;
                    }
                }
            }
        }
        if (tipoJogada == 1) {
            if (notacao.length() == 4 && notacao.charAt(2) == '=') {
                if (notacao.charAt(0) >= 97 && notacao.charAt(0) <= 104) {
                    if (notacao.charAt(1) == '8' || notacao.charAt(1) == '1') {
                        return true;
                    }
                }
            }
        }
        if (tipoJogada == 2) {
            if (notacao.equals("0-0")) {
                return true;
            }
        }
        if (tipoJogada == 3) {
            if (notacao.equals("0-0-0")) {
                return true;
            }
        }
        return false;
    }

    /**
     *
     * @param letra
     * @return
     */
    public int converterCharToNum(char letra) {
        int coluna = 10;
        switch (letra) {
            case 'a':
                coluna = 0;
                break;
            case 'b':
                coluna = 1;
                break;
            case 'c':
                coluna = 2;
                break;
            case 'd':
                coluna = 3;
                break;
            case 'e':
                coluna = 4;
                break;
            case 'f':
                coluna = 5;
                break;
            case 'g':
                coluna = 6;
                break;
            case 'h':
                coluna = 7;
                break;
            default:
                System.out.println("Nota��o inv�lida para coluna (a, b, ..., h)");
        }
        return coluna;
    }

    /**
     *
     * @param numlinha
     * @return
     */
    public int adaptarLinhaParaMatriz(int numlinha) {
        int linha = 10;
        switch (numlinha) {
            case 1:
                linha = 7;
                break;
            case 2:
                linha = 6;
                break;
            case 3:
                linha = 5;
                break;
            case 4:
                linha = 4;
                break;
            case 5:
                linha = 3;
                break;
            case 6:
                linha = 2;
                break;
            case 7:
                linha = 1;
                break;
            case 8:
                linha = 0;
                break;
            default:
                System.out.println("Nota��o inv�lida para linha (1, 2, ..., 8)");
        }
        return linha;
    }

    /**
     * @param args the command line arguments
     */
    public static void main(String args[]) {
        /* Set the Nimbus look and feel */
        //<editor-fold defaultstate="collapsed" desc=" Look and feel setting code (optional) ">
        /* If Nimbus (introduced in Java SE 6) is not available, stay with the default look and feel.
         * For details see http://download.oracle.com/javase/tutorial/uiswing/lookandfeel/plaf.html 
         */
        try {
            for (javax.swing.UIManager.LookAndFeelInfo info : javax.swing.UIManager.getInstalledLookAndFeels()) {
                if ("Nimbus".equals(info.getName())) {
                    javax.swing.UIManager.setLookAndFeel(info.getClassName());
                    break;
                }
            }
        } catch (ClassNotFoundException ex) {
            java.util.logging.Logger.getLogger(MyJFrame.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(MyJFrame.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(MyJFrame.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(MyJFrame.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        Jogador j1 = new Jogador();
        Jogador j2 = new Jogador();
        StringBuilder mensagemBoasVindas = new StringBuilder();

        //System.out.print("Jogador 1, digite seu nome (Pecas brancas 'LETRAS MAIUSCULAS') -> ");
        String nome1 = JOptionPane.showInputDialog("Jogador 1, digite seu nome (Pecas brancas 'LETRAS MAIUSCULAS'):");

        j1.setNome(nome1);
        j1.setCor(0);
        j1.setVezDeJogar(true);

        //System.out.print("Jogador 2, digite seu nome (Pecas pretas 'letras minusculas') -> ");
        String nome2 = JOptionPane.showInputDialog("Jogador 2, digite seu nome (Pecas pretas 'letras minusculas'):");

        j2.setNome(nome2);
        j2.setCor(1);
        j2.setVezDeJogar(false);

        mensagemBoasVindas.append("Olá, ").append(nome1).append(" e ").append(nome2).append("!").append(" \nTenham um bom jogo!");
        JOptionPane.showMessageDialog(null, mensagemBoasVindas);

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new MyJFrame(j1, j2).setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btnAjuda;
    private javax.swing.JButton btnDesistir;
    private javax.swing.JButton btnJogar;
    private javax.swing.JPanel jPanelPrincipal;
    private javax.swing.JRadioButton jRadioButton1;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JLabel lblSuaJogada;
    private javax.swing.JLabel lblVez;
    private javax.swing.JTextArea txtAreaTabuleiro;
    private javax.swing.JTextField txtFieldJogada;
    // End of variables declaration//GEN-END:variables
}
