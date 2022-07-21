package view;

import javax.script.ScriptEngine;
import javax.script.ScriptEngineManager;
import javax.script.ScriptException;

public class Interface extends javax.swing.JFrame {

    private String visor;
    private double total;
    private String ultimo_valor = "";

    Object obj;

    public Interface() {
        initComponents();
        setResizable(false);
        setDefaultCloseOperation(EXIT_ON_CLOSE);
        setLocationRelativeTo(null);
        setTitle("Calculadora");
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        painel_principal = new javax.swing.JPanel();
        valor1 = new javax.swing.JButton();
        valor2 = new javax.swing.JButton();
        valor3 = new javax.swing.JButton();
        valor4 = new javax.swing.JButton();
        valor5 = new javax.swing.JButton();
        valor6 = new javax.swing.JButton();
        valor7 = new javax.swing.JButton();
        valor8 = new javax.swing.JButton();
        valor9 = new javax.swing.JButton();
        virgula = new javax.swing.JButton();
        valor0 = new javax.swing.JButton();
        painel_funcoes = new javax.swing.JPanel();
        adicao = new javax.swing.JButton();
        subtracao = new javax.swing.JButton();
        multiplicacao = new javax.swing.JButton();
        divisao = new javax.swing.JButton();
        limpar_resultado = new javax.swing.JButton();
        igual = new javax.swing.JButton();
        apagar_ultimo = new javax.swing.JButton();
        painel_resultado = new javax.swing.JPanel();
        campo = new javax.swing.JTextField();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setBackground(new java.awt.Color(255, 255, 255));
        setMinimumSize(new java.awt.Dimension(543, 600));
        setName(""); // NOI18N
        setSize(new java.awt.Dimension(543, 600));

        painel_principal.setBackground(new java.awt.Color(255, 255, 255));
        painel_principal.setMaximumSize(new java.awt.Dimension(543, 600));
        painel_principal.setMinimumSize(new java.awt.Dimension(543, 600));
        painel_principal.setPreferredSize(new java.awt.Dimension(543, 600));

        valor1.setBackground(new java.awt.Color(255, 204, 0));
        valor1.setFont(new java.awt.Font("Tahoma", 1, 24)); // NOI18N
        valor1.setForeground(new java.awt.Color(255, 255, 255));
        valor1.setText("1");
        valor1.setMaximumSize(new java.awt.Dimension(75, 75));
        valor1.setMinimumSize(new java.awt.Dimension(75, 75));
        valor1.setPreferredSize(new java.awt.Dimension(75, 75));
        valor1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                valor1ActionPerformed(evt);
            }
        });

        valor2.setBackground(new java.awt.Color(255, 204, 0));
        valor2.setFont(new java.awt.Font("Tahoma", 1, 24)); // NOI18N
        valor2.setForeground(new java.awt.Color(255, 255, 255));
        valor2.setText("2");
        valor2.setMaximumSize(new java.awt.Dimension(75, 75));
        valor2.setMinimumSize(new java.awt.Dimension(75, 75));
        valor2.setPreferredSize(new java.awt.Dimension(75, 75));
        valor2.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                valor2ActionPerformed(evt);
            }
        });

        valor3.setBackground(new java.awt.Color(255, 204, 0));
        valor3.setFont(new java.awt.Font("Tahoma", 1, 24)); // NOI18N
        valor3.setForeground(new java.awt.Color(255, 255, 255));
        valor3.setText("3");
        valor3.setMaximumSize(new java.awt.Dimension(75, 75));
        valor3.setMinimumSize(new java.awt.Dimension(75, 75));
        valor3.setPreferredSize(new java.awt.Dimension(75, 75));
        valor3.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                valor3ActionPerformed(evt);
            }
        });

        valor4.setBackground(new java.awt.Color(255, 204, 0));
        valor4.setFont(new java.awt.Font("Tahoma", 1, 24)); // NOI18N
        valor4.setForeground(new java.awt.Color(255, 255, 255));
        valor4.setText("4");
        valor4.setMaximumSize(new java.awt.Dimension(75, 75));
        valor4.setMinimumSize(new java.awt.Dimension(75, 75));
        valor4.setPreferredSize(new java.awt.Dimension(75, 75));
        valor4.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                valor4ActionPerformed(evt);
            }
        });

        valor5.setBackground(new java.awt.Color(255, 204, 0));
        valor5.setFont(new java.awt.Font("Tahoma", 1, 24)); // NOI18N
        valor5.setForeground(new java.awt.Color(255, 255, 255));
        valor5.setText("5");
        valor5.setMaximumSize(new java.awt.Dimension(75, 75));
        valor5.setMinimumSize(new java.awt.Dimension(75, 75));
        valor5.setPreferredSize(new java.awt.Dimension(75, 75));
        valor5.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                valor5ActionPerformed(evt);
            }
        });

        valor6.setBackground(new java.awt.Color(255, 204, 0));
        valor6.setFont(new java.awt.Font("Tahoma", 1, 24)); // NOI18N
        valor6.setForeground(new java.awt.Color(255, 255, 255));
        valor6.setText("6");
        valor6.setMaximumSize(new java.awt.Dimension(75, 75));
        valor6.setMinimumSize(new java.awt.Dimension(75, 75));
        valor6.setPreferredSize(new java.awt.Dimension(75, 75));
        valor6.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                valor6ActionPerformed(evt);
            }
        });

        valor7.setBackground(new java.awt.Color(255, 204, 0));
        valor7.setFont(new java.awt.Font("Tahoma", 1, 24)); // NOI18N
        valor7.setForeground(new java.awt.Color(255, 255, 255));
        valor7.setText("7");
        valor7.setMaximumSize(new java.awt.Dimension(75, 75));
        valor7.setMinimumSize(new java.awt.Dimension(75, 75));
        valor7.setPreferredSize(new java.awt.Dimension(75, 75));
        valor7.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                valor7ActionPerformed(evt);
            }
        });

        valor8.setBackground(new java.awt.Color(255, 204, 0));
        valor8.setFont(new java.awt.Font("Tahoma", 1, 24)); // NOI18N
        valor8.setForeground(new java.awt.Color(255, 255, 255));
        valor8.setText("8");
        valor8.setMaximumSize(new java.awt.Dimension(75, 75));
        valor8.setMinimumSize(new java.awt.Dimension(75, 75));
        valor8.setPreferredSize(new java.awt.Dimension(75, 75));
        valor8.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                valor8ActionPerformed(evt);
            }
        });

        valor9.setBackground(new java.awt.Color(255, 204, 0));
        valor9.setFont(new java.awt.Font("Tahoma", 1, 24)); // NOI18N
        valor9.setForeground(new java.awt.Color(255, 255, 255));
        valor9.setText("9");
        valor9.setMaximumSize(new java.awt.Dimension(75, 75));
        valor9.setMinimumSize(new java.awt.Dimension(75, 75));
        valor9.setPreferredSize(new java.awt.Dimension(75, 75));
        valor9.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                valor9ActionPerformed(evt);
            }
        });

        virgula.setBackground(new java.awt.Color(255, 204, 0));
        virgula.setFont(new java.awt.Font("Tahoma", 1, 24)); // NOI18N
        virgula.setForeground(new java.awt.Color(255, 255, 255));
        virgula.setText(".");
        virgula.setMaximumSize(new java.awt.Dimension(75, 75));
        virgula.setMinimumSize(new java.awt.Dimension(75, 75));
        virgula.setPreferredSize(new java.awt.Dimension(75, 75));
        virgula.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                virgulaActionPerformed(evt);
            }
        });

        valor0.setBackground(new java.awt.Color(255, 204, 0));
        valor0.setFont(new java.awt.Font("Tahoma", 1, 24)); // NOI18N
        valor0.setForeground(new java.awt.Color(255, 255, 255));
        valor0.setText("0");
        valor0.setMaximumSize(new java.awt.Dimension(75, 75));
        valor0.setMinimumSize(new java.awt.Dimension(75, 75));
        valor0.setPreferredSize(new java.awt.Dimension(75, 75));
        valor0.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                valor0ActionPerformed(evt);
            }
        });

        painel_funcoes.setBackground(new java.awt.Color(255, 255, 255));

        adicao.setBackground(new java.awt.Color(255, 204, 0));
        adicao.setFont(new java.awt.Font("Tahoma", 1, 24)); // NOI18N
        adicao.setForeground(new java.awt.Color(255, 255, 255));
        adicao.setText("+");
        adicao.setMaximumSize(new java.awt.Dimension(80, 80));
        adicao.setMinimumSize(new java.awt.Dimension(80, 80));
        adicao.setPreferredSize(new java.awt.Dimension(80, 80));
        adicao.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                adicaoActionPerformed(evt);
            }
        });

        subtracao.setBackground(new java.awt.Color(255, 204, 0));
        subtracao.setFont(new java.awt.Font("Tahoma", 1, 24)); // NOI18N
        subtracao.setForeground(new java.awt.Color(255, 255, 255));
        subtracao.setText("-");
        subtracao.setMaximumSize(new java.awt.Dimension(80, 80));
        subtracao.setMinimumSize(new java.awt.Dimension(80, 80));
        subtracao.setName(""); // NOI18N
        subtracao.setPreferredSize(new java.awt.Dimension(80, 80));
        subtracao.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                subtracaoActionPerformed(evt);
            }
        });

        multiplicacao.setBackground(new java.awt.Color(255, 204, 0));
        multiplicacao.setFont(new java.awt.Font("Tahoma", 1, 24)); // NOI18N
        multiplicacao.setForeground(new java.awt.Color(255, 255, 255));
        multiplicacao.setText("x");
        multiplicacao.setMaximumSize(new java.awt.Dimension(80, 80));
        multiplicacao.setMinimumSize(new java.awt.Dimension(80, 80));
        multiplicacao.setName(""); // NOI18N
        multiplicacao.setPreferredSize(new java.awt.Dimension(80, 80));
        multiplicacao.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                multiplicacaoActionPerformed(evt);
            }
        });

        divisao.setBackground(new java.awt.Color(255, 204, 0));
        divisao.setFont(new java.awt.Font("Tahoma", 1, 24)); // NOI18N
        divisao.setForeground(new java.awt.Color(255, 255, 255));
        divisao.setText("÷");
        divisao.setMaximumSize(new java.awt.Dimension(80, 80));
        divisao.setMinimumSize(new java.awt.Dimension(80, 80));
        divisao.setName(""); // NOI18N
        divisao.setPreferredSize(new java.awt.Dimension(80, 80));
        divisao.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                divisaoActionPerformed(evt);
            }
        });

        limpar_resultado.setBackground(new java.awt.Color(255, 204, 0));
        limpar_resultado.setFont(new java.awt.Font("Tahoma", 1, 24)); // NOI18N
        limpar_resultado.setForeground(new java.awt.Color(255, 255, 255));
        limpar_resultado.setText("C");
        limpar_resultado.setPreferredSize(new java.awt.Dimension(50, 50));
        limpar_resultado.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                limpar_resultadoActionPerformed(evt);
            }
        });

        igual.setBackground(new java.awt.Color(255, 204, 0));
        igual.setFont(new java.awt.Font("Tahoma", 1, 24)); // NOI18N
        igual.setForeground(new java.awt.Color(255, 255, 255));
        igual.setText("=");
        igual.setMaximumSize(new java.awt.Dimension(75, 75));
        igual.setMinimumSize(new java.awt.Dimension(75, 75));
        igual.setPreferredSize(new java.awt.Dimension(75, 75));
        igual.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                igualActionPerformed(evt);
            }
        });

        apagar_ultimo.setBackground(new java.awt.Color(255, 204, 0));
        apagar_ultimo.setFont(new java.awt.Font("Times New Roman", 1, 24)); // NOI18N
        apagar_ultimo.setForeground(new java.awt.Color(255, 255, 255));
        apagar_ultimo.setText("←");
        apagar_ultimo.setPreferredSize(new java.awt.Dimension(80, 80));
        apagar_ultimo.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                apagar_ultimoActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout painel_funcoesLayout = new javax.swing.GroupLayout(painel_funcoes);
        painel_funcoes.setLayout(painel_funcoesLayout);
        painel_funcoesLayout.setHorizontalGroup(
            painel_funcoesLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(painel_funcoesLayout.createSequentialGroup()
                .addGroup(painel_funcoesLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addGroup(painel_funcoesLayout.createSequentialGroup()
                        .addGroup(painel_funcoesLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                            .addComponent(limpar_resultado, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(adicao, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                        .addGap(18, 18, 18)
                        .addGroup(painel_funcoesLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                            .addComponent(subtracao, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(apagar_ultimo, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)))
                    .addGroup(painel_funcoesLayout.createSequentialGroup()
                        .addComponent(multiplicacao, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(18, 18, 18)
                        .addComponent(divisao, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                    .addComponent(igual, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                .addGap(0, 35, Short.MAX_VALUE))
        );
        painel_funcoesLayout.setVerticalGroup(
            painel_funcoesLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(painel_funcoesLayout.createSequentialGroup()
                .addGap(0, 0, Short.MAX_VALUE)
                .addGroup(painel_funcoesLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(limpar_resultado, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.PREFERRED_SIZE, 78, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(apagar_ultimo, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.PREFERRED_SIZE, 80, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(painel_funcoesLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(adicao, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(subtracao, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(painel_funcoesLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(multiplicacao, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(divisao, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addComponent(igual, javax.swing.GroupLayout.PREFERRED_SIZE, 80, javax.swing.GroupLayout.PREFERRED_SIZE))
        );

        subtracao.getAccessibleContext().setAccessibleName("");
        multiplicacao.getAccessibleContext().setAccessibleName("");
        divisao.getAccessibleContext().setAccessibleName("");

        painel_resultado.setBackground(new java.awt.Color(0, 0, 0));

        campo.setEditable(false);
        campo.setBackground(new java.awt.Color(255, 255, 255));
        campo.setFont(new java.awt.Font("Times New Roman", 1, 36)); // NOI18N
        campo.setHorizontalAlignment(javax.swing.JTextField.RIGHT);
        campo.setCursor(new java.awt.Cursor(java.awt.Cursor.DEFAULT_CURSOR));
        campo.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                campoActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout painel_resultadoLayout = new javax.swing.GroupLayout(painel_resultado);
        painel_resultado.setLayout(painel_resultadoLayout);
        painel_resultadoLayout.setHorizontalGroup(
            painel_resultadoLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(painel_resultadoLayout.createSequentialGroup()
                .addGap(28, 28, 28)
                .addComponent(campo, javax.swing.GroupLayout.PREFERRED_SIZE, 487, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        painel_resultadoLayout.setVerticalGroup(
            painel_resultadoLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, painel_resultadoLayout.createSequentialGroup()
                .addContainerGap(24, Short.MAX_VALUE)
                .addComponent(campo, javax.swing.GroupLayout.PREFERRED_SIZE, 81, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap())
        );

        javax.swing.GroupLayout painel_principalLayout = new javax.swing.GroupLayout(painel_principal);
        painel_principal.setLayout(painel_principalLayout);
        painel_principalLayout.setHorizontalGroup(
            painel_principalLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, painel_principalLayout.createSequentialGroup()
                .addContainerGap(29, Short.MAX_VALUE)
                .addGroup(painel_principalLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(painel_principalLayout.createSequentialGroup()
                        .addComponent(valor1, javax.swing.GroupLayout.PREFERRED_SIZE, 75, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(18, 18, 18)
                        .addComponent(valor2, javax.swing.GroupLayout.PREFERRED_SIZE, 75, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(18, 18, 18)
                        .addComponent(valor3, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(painel_principalLayout.createSequentialGroup()
                        .addComponent(valor4, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(18, 18, 18)
                        .addComponent(valor5, javax.swing.GroupLayout.PREFERRED_SIZE, 75, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(18, 18, 18)
                        .addComponent(valor6, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(painel_principalLayout.createSequentialGroup()
                        .addComponent(valor7, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(18, 18, 18)
                        .addComponent(valor8, javax.swing.GroupLayout.PREFERRED_SIZE, 75, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(18, 18, 18)
                        .addComponent(valor9, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(painel_principalLayout.createSequentialGroup()
                        .addComponent(virgula, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(18, 18, 18)
                        .addComponent(valor0, javax.swing.GroupLayout.PREFERRED_SIZE, 75, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addGap(48, 48, 48)
                .addComponent(painel_funcoes, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
            .addComponent(painel_resultado, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );
        painel_principalLayout.setVerticalGroup(
            painel_principalLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(painel_principalLayout.createSequentialGroup()
                .addComponent(painel_resultado, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addGroup(painel_principalLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(painel_principalLayout.createSequentialGroup()
                        .addGroup(painel_principalLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(valor1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(valor2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(valor3, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(18, 18, 18)
                        .addGroup(painel_principalLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(valor4, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(valor5, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(valor6, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(18, 18, 18)
                        .addGroup(painel_principalLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(valor7, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(valor9, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(valor8, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(18, 18, 18)
                        .addGroup(painel_principalLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(virgula, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(valor0, javax.swing.GroupLayout.PREFERRED_SIZE, 75, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(53, 53, 53))
                    .addGroup(painel_principalLayout.createSequentialGroup()
                        .addComponent(painel_funcoes, javax.swing.GroupLayout.PREFERRED_SIZE, 349, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))))
        );

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(painel_principal, javax.swing.GroupLayout.DEFAULT_SIZE, 551, Short.MAX_VALUE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(painel_principal, javax.swing.GroupLayout.PREFERRED_SIZE, 516, Short.MAX_VALUE)
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents


    private void campoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_campoActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_campoActionPerformed

    private void valor7ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_valor7ActionPerformed
        acao("7");
        ultimo_valor = "";
    }//GEN-LAST:event_valor7ActionPerformed

    private void subtracaoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_subtracaoActionPerformed
        sinal("-", "*", "+", "/", ".");
    }//GEN-LAST:event_subtracaoActionPerformed

    private void multiplicacaoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_multiplicacaoActionPerformed
        sinal("*", "-", "+", "/", ".");
    }//GEN-LAST:event_multiplicacaoActionPerformed

    private void igualActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_igualActionPerformed
        try {
            if (campo.getText().substring(campo.getText().length() - 1).equals("+") || campo.getText().substring(campo.getText().length() - 1).equals("-") || campo.getText().substring(campo.getText().length() - 1).equals("*") || campo.getText().substring(campo.getText().length() - 1).equals("/")) {
                campo.setText(campo.getText().substring(0, campo.getText().length() - 1));
            }

            campo.setText(String.valueOf(eval(campo.getText())));

        } catch (NullPointerException | StringIndexOutOfBoundsException e) {
           
        }
    }//GEN-LAST:event_igualActionPerformed

    private void valor5ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_valor5ActionPerformed
        acao("5");
        ultimo_valor = "";
    }//GEN-LAST:event_valor5ActionPerformed

    private void valor6ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_valor6ActionPerformed
        acao("6");
        ultimo_valor = "";
    }//GEN-LAST:event_valor6ActionPerformed

    private void valor1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_valor1ActionPerformed
        acao("1");
        ultimo_valor = "";
    }//GEN-LAST:event_valor1ActionPerformed

    private void valor2ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_valor2ActionPerformed
        acao("2");
        ultimo_valor = "";
    }//GEN-LAST:event_valor2ActionPerformed

    private void valor3ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_valor3ActionPerformed
        acao("3");
        ultimo_valor = "";
    }//GEN-LAST:event_valor3ActionPerformed

    private void adicaoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_adicaoActionPerformed
        sinal("+", "-", "*", "/", ".");
    }//GEN-LAST:event_adicaoActionPerformed

    private void valor4ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_valor4ActionPerformed
        acao("4");
        ultimo_valor = "";
    }//GEN-LAST:event_valor4ActionPerformed

    private void valor8ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_valor8ActionPerformed
        acao("8");
        ultimo_valor = "";
    }//GEN-LAST:event_valor8ActionPerformed

    private void valor9ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_valor9ActionPerformed
        acao("9");
        ultimo_valor = "";
    }//GEN-LAST:event_valor9ActionPerformed

    private void valor0ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_valor0ActionPerformed
        acao("0");
        ultimo_valor = "";
    }//GEN-LAST:event_valor0ActionPerformed

    private void virgulaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_virgulaActionPerformed
        sinal(".", "-", "+", "*", "/");
    }//GEN-LAST:event_virgulaActionPerformed

    private void divisaoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_divisaoActionPerformed
        sinal("/", "-", "+", "*", ".");
    }//GEN-LAST:event_divisaoActionPerformed

    private void apagar_ultimoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_apagar_ultimoActionPerformed
        try {
            campo.setText(campo.getText().substring(0, campo.getText().length() - 1));
            ultimo_valor = "";
        } catch (StringIndexOutOfBoundsException e) {

        }
    }//GEN-LAST:event_apagar_ultimoActionPerformed

    private void limpar_resultadoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_limpar_resultadoActionPerformed
        campo.setText("");
        ultimo_valor = "";
    }//GEN-LAST:event_limpar_resultadoActionPerformed

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
        } catch (ClassNotFoundException | InstantiationException | IllegalAccessException | javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(Interface.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>
        //</
        java.awt.EventQueue.invokeLater(() -> {
            new Interface().setVisible(true);
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton adicao;
    private javax.swing.JButton apagar_ultimo;
    private javax.swing.JTextField campo;
    private javax.swing.JButton divisao;
    private javax.swing.JButton igual;
    private javax.swing.JButton limpar_resultado;
    private javax.swing.JButton multiplicacao;
    private javax.swing.JPanel painel_funcoes;
    private javax.swing.JPanel painel_principal;
    private javax.swing.JPanel painel_resultado;
    private javax.swing.JButton subtracao;
    private javax.swing.JButton valor0;
    private javax.swing.JButton valor1;
    private javax.swing.JButton valor2;
    private javax.swing.JButton valor3;
    private javax.swing.JButton valor4;
    private javax.swing.JButton valor5;
    private javax.swing.JButton valor6;
    private javax.swing.JButton valor7;
    private javax.swing.JButton valor8;
    private javax.swing.JButton valor9;
    private javax.swing.JButton virgula;
    // End of variables declaration//GEN-END:variables

    public void acao(String numero) {
        visor = campo.getText();

        visor += numero;

        campo.setText(visor);
    }

    public void sinal(String atual, String fora1, String fora2, String fora3, String fora4) {
        if (!campo.getText().equals("")) {
            try {
                if ((ultimo_valor).equals(fora1) || (ultimo_valor).equals(fora2)
                        || (ultimo_valor).equals(fora3) || (ultimo_valor).equals(fora4)) {
                    campo.setText(campo.getText().substring(0, campo.getText().length() - 1));
                    acao(atual);
                } else {
                    if (!ultimo_valor.equals(atual)) {
                        acao(atual);
                    }

                }
                ultimo_valor = atual;
            } catch (StringIndexOutOfBoundsException e) {

            }
        }
    }

    public double eval(final String str) {
        return new Object() {
            int pos = -1, ch;

            void nextChar() {
                ch = (++pos < str.length()) ? str.charAt(pos) : -1;
            }

            boolean eat(int charToEat) {
                while (ch == ' ') {
                    nextChar();
                }
                if (ch == charToEat) {
                    nextChar();
                    return true;
                }
                return false;
            }

            double parse() {
                nextChar();
                double x = parseExpression();
                if (pos < str.length()) {
                    throw new RuntimeException("Unexpected: " + (char) ch);
                }
                return x;
            }

            double parseExpression() {
                double x = parseTerm();
                for (;;) {
                    if (eat('+')) {
                        x += parseTerm(); // addition
                    } else if (eat('-')) {
                        x -= parseTerm(); // subtraction
                    } else {
                        return x;
                    }
                }
            }

            double parseTerm() {
                double x = parseFactor();
                for (;;) {
                    if (eat('*')) {
                        x *= parseFactor(); // multiplication
                    } else if (eat('/')) {
                        x /= parseFactor(); // division
                    } else {
                        return x;
                    }
                }
            }

            double parseFactor() {
                if (eat('+')) {
                    return +parseFactor(); // unary plus
                }
                if (eat('-')) {
                    return -parseFactor(); // unary minus
                }
                double x;
                int startPos = this.pos;
                if (eat('(')) { // parentheses
                    x = parseExpression();
                    if (!eat(')')) {
                        throw new RuntimeException("Missing ')'");
                    }
                } else if ((ch >= '0' && ch <= '9') || ch == '.') { // numbers
                    while ((ch >= '0' && ch <= '9') || ch == '.') {
                        nextChar();
                    }
                    x = Double.parseDouble(str.substring(startPos, this.pos));
                } else if (ch >= 'a' && ch <= 'z') { // functions
                    while (ch >= 'a' && ch <= 'z') {
                        nextChar();
                    }
                    String func = str.substring(startPos, this.pos);
                    if (eat('(')) {
                        x = parseExpression();
                        if (!eat(')')) {
                            throw new RuntimeException("Missing ')' after argument to " + func);
                        }
                    } else {
                        x = parseFactor();
                    }
                    if (func.equals("sqrt")) {
                        x = Math.sqrt(x);
                    } else if (func.equals("sin")) {
                        x = Math.sin(Math.toRadians(x));
                    } else if (func.equals("cos")) {
                        x = Math.cos(Math.toRadians(x));
                    } else if (func.equals("tan")) {
                        x = Math.tan(Math.toRadians(x));
                    } else {
                        throw new RuntimeException("Unknown function: " + func);
                    }
                } else {
                    throw new RuntimeException("Unexpected: " + (char) ch);
                }

                if (eat('^')) {
                    x = Math.pow(x, parseFactor()); // exponentiation
                }
                return x;
            }
        }.parse();
    }
}
