/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/GUIForms/JFrame.java to edit this template
 */
package GUI;

import javax.swing.JOptionPane;
import java.time.LocalDate;
import java.util.List;
import java.util.ArrayList;
import classes.Aluno;

/**
 *
 * @author exd
 */
public class FrCadAluno extends javax.swing.JFrame {
    private List<Aluno> listaDeAlunos;
    /**
     * Creates new form FrCadAluno
     */
    public FrCadAluno() {
        initComponents();
        listaDeAlunos = new ArrayList<Aluno>();
        
        clearInputs();
        swapButtonsAndPanelVisibility();
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        panTop = new javax.swing.JPanel();
        lblTitulo = new javax.swing.JLabel();
        panTopBtns = new javax.swing.JPanel();
        btnNovoOuCancelar = new javax.swing.JButton();
        btnEditar = new javax.swing.JButton();
        btnExcluir = new javax.swing.JButton();
        btnSalvar = new javax.swing.JButton();
        panCore = new javax.swing.JPanel();
        panTextInputs = new javax.swing.JPanel();
        lblNome = new javax.swing.JLabel();
        lblIdade = new javax.swing.JLabel();
        lblSexo = new javax.swing.JLabel();
        jLabel4 = new javax.swing.JLabel();
        edtNome = new javax.swing.JTextField();
        edtSexo = new javax.swing.JComboBox<>();
        edtMatricula = new javax.swing.JTextField();
        edtIdade = new javax.swing.JSpinner();
        lblIdade1 = new javax.swing.JLabel();
        edtAnoIngresso = new javax.swing.JTextField();
        jScrollPane1 = new javax.swing.JScrollPane();
        edtAreaDepuracao = new javax.swing.JTextArea();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        lblTitulo.setFont(new java.awt.Font("Century Gothic", 1, 36)); // NOI18N
        lblTitulo.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        lblTitulo.setText("Cadastro de Aluno");

        btnNovoOuCancelar.setFont(new java.awt.Font("Century Gothic", 0, 18)); // NOI18N
        btnNovoOuCancelar.setIcon(new javax.swing.ImageIcon(getClass().getResource("/resources/cruz.png"))); // NOI18N
        btnNovoOuCancelar.setText("Cancelar");
        btnNovoOuCancelar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnNovoOuCancelarActionPerformed(evt);
            }
        });

        btnEditar.setFont(new java.awt.Font("Century Gothic", 0, 18)); // NOI18N
        btnEditar.setIcon(new javax.swing.ImageIcon(getClass().getResource("/resources/editar.png"))); // NOI18N
        btnEditar.setText("Editar");
        btnEditar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnEditarActionPerformed(evt);
            }
        });

        btnExcluir.setFont(new java.awt.Font("Century Gothic", 0, 18)); // NOI18N
        btnExcluir.setIcon(new javax.swing.ImageIcon(getClass().getResource("/resources/lixo.png"))); // NOI18N
        btnExcluir.setText("Excluir");
        btnExcluir.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnExcluirActionPerformed(evt);
            }
        });

        btnSalvar.setFont(new java.awt.Font("Century Gothic", 0, 18)); // NOI18N
        btnSalvar.setIcon(new javax.swing.ImageIcon(getClass().getResource("/resources/disco.png"))); // NOI18N
        btnSalvar.setText("Salvar");
        btnSalvar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnSalvarActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout panTopBtnsLayout = new javax.swing.GroupLayout(panTopBtns);
        panTopBtns.setLayout(panTopBtnsLayout);
        panTopBtnsLayout.setHorizontalGroup(
            panTopBtnsLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(panTopBtnsLayout.createSequentialGroup()
                .addContainerGap()
                .addComponent(btnNovoOuCancelar)
                .addGap(18, 18, 18)
                .addComponent(btnEditar)
                .addGap(18, 18, 18)
                .addComponent(btnExcluir)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(btnSalvar)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        panTopBtnsLayout.setVerticalGroup(
            panTopBtnsLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, panTopBtnsLayout.createSequentialGroup()
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addGroup(panTopBtnsLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(btnNovoOuCancelar, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(btnEditar, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(btnExcluir, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(btnSalvar))
                .addContainerGap())
        );

        javax.swing.GroupLayout panTopLayout = new javax.swing.GroupLayout(panTop);
        panTop.setLayout(panTopLayout);
        panTopLayout.setHorizontalGroup(
            panTopLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(lblTitulo, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
            .addGroup(panTopLayout.createSequentialGroup()
                .addComponent(panTopBtns, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addContainerGap())
        );
        panTopLayout.setVerticalGroup(
            panTopLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(panTopLayout.createSequentialGroup()
                .addComponent(lblTitulo, javax.swing.GroupLayout.PREFERRED_SIZE, 54, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(panTopBtns, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(174, 174, 174))
        );

        lblNome.setFont(new java.awt.Font("Century Gothic", 0, 18)); // NOI18N
        lblNome.setText("Nome:");

        lblIdade.setFont(new java.awt.Font("Century Gothic", 0, 18)); // NOI18N
        lblIdade.setText("Idade:");

        lblSexo.setFont(new java.awt.Font("Century Gothic", 0, 18)); // NOI18N
        lblSexo.setText("Sexo:");

        jLabel4.setFont(new java.awt.Font("Century Gothic", 0, 18)); // NOI18N
        jLabel4.setText("Matrícula:");

        edtSexo.setFont(new java.awt.Font("Century Gothic", 0, 12)); // NOI18N
        edtSexo.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Masculino", "Feminino" }));

        lblIdade1.setFont(new java.awt.Font("Century Gothic", 0, 18)); // NOI18N
        lblIdade1.setText("Ano de Ingresso:");

        javax.swing.GroupLayout panTextInputsLayout = new javax.swing.GroupLayout(panTextInputs);
        panTextInputs.setLayout(panTextInputsLayout);
        panTextInputsLayout.setHorizontalGroup(
            panTextInputsLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(panTextInputsLayout.createSequentialGroup()
                .addContainerGap()
                .addGroup(panTextInputsLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addGroup(panTextInputsLayout.createSequentialGroup()
                        .addComponent(lblNome)
                        .addGap(18, 18, 18)
                        .addComponent(edtNome, javax.swing.GroupLayout.PREFERRED_SIZE, 429, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(18, 18, 18)
                        .addComponent(lblSexo)
                        .addGap(18, 18, 18)
                        .addComponent(edtSexo, javax.swing.GroupLayout.PREFERRED_SIZE, 182, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(panTextInputsLayout.createSequentialGroup()
                        .addComponent(jLabel4)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(edtMatricula, javax.swing.GroupLayout.PREFERRED_SIZE, 235, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(18, 18, 18)
                        .addComponent(lblIdade)
                        .addGap(18, 18, 18)
                        .addComponent(edtIdade, javax.swing.GroupLayout.PREFERRED_SIZE, 74, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(18, 18, 18)
                        .addComponent(lblIdade1)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(edtAnoIngresso)))
                .addContainerGap(23, Short.MAX_VALUE))
        );
        panTextInputsLayout.setVerticalGroup(
            panTextInputsLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(panTextInputsLayout.createSequentialGroup()
                .addContainerGap()
                .addGroup(panTextInputsLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(lblNome)
                    .addComponent(edtNome, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(edtSexo, javax.swing.GroupLayout.PREFERRED_SIZE, 25, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(lblSexo))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(panTextInputsLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel4)
                    .addComponent(edtMatricula, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(edtIdade, javax.swing.GroupLayout.DEFAULT_SIZE, 25, Short.MAX_VALUE)
                    .addComponent(lblIdade)
                    .addComponent(lblIdade1)
                    .addComponent(edtAnoIngresso, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addContainerGap())
        );

        edtAreaDepuracao.setColumns(20);
        edtAreaDepuracao.setRows(5);
        jScrollPane1.setViewportView(edtAreaDepuracao);

        javax.swing.GroupLayout panCoreLayout = new javax.swing.GroupLayout(panCore);
        panCore.setLayout(panCoreLayout);
        panCoreLayout.setHorizontalGroup(
            panCoreLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(panTextInputs, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
            .addGroup(panCoreLayout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jScrollPane1)
                .addContainerGap())
        );
        panCoreLayout.setVerticalGroup(
            panCoreLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, panCoreLayout.createSequentialGroup()
                .addContainerGap()
                .addComponent(panTextInputs, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(jScrollPane1, javax.swing.GroupLayout.DEFAULT_SIZE, 199, Short.MAX_VALUE)
                .addContainerGap())
        );

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(panTop, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
            .addComponent(panCore, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addComponent(panTop, javax.swing.GroupLayout.PREFERRED_SIZE, 113, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(panCore, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void btnNovoOuCancelarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnNovoOuCancelarActionPerformed
        swapButtonsAndPanelVisibility();
    }//GEN-LAST:event_btnNovoOuCancelarActionPerformed

    private void btnSalvarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnSalvarActionPerformed
        // Checar se os inputs tinham algum valor vazio ou inválido
        if (edtNome.getText().isEmpty()) {
            JOptionPane.showMessageDialog(null, "Por favor, preencha o campo de Nome.", "Aviso", JOptionPane.WARNING_MESSAGE);
            edtNome.requestFocus();
            return;
        } else if (edtSexo.getSelectedIndex() < 0 || edtSexo.getSelectedIndex() > edtSexo.getItemCount()) {
            JOptionPane.showMessageDialog(null, "Por favor, selecione um Sexo válido.", "Aviso", JOptionPane.WARNING_MESSAGE);
            edtSexo.requestFocus();
            return;
        } else if ((int) edtIdade.getValue() <= 0) {
            JOptionPane.showMessageDialog(null, "Por favor, insira uma Idade válida.", "Aviso", JOptionPane.WARNING_MESSAGE);
            edtIdade.requestFocus();
            return;
        } else if (edtMatricula.getText().isEmpty()) {
            JOptionPane.showMessageDialog(null, "Por favor, preencha o campo Matrícula.", "Aviso", JOptionPane.WARNING_MESSAGE);
            edtMatricula.requestFocus();
            return;
        } else if (edtAnoIngresso.getText().isEmpty() || Integer.parseInt(edtAnoIngresso.getText()) < 0) {
            JOptionPane.showMessageDialog(null, "Por favor, preencha o campo Ano de Ingresso.", "Aviso", JOptionPane.WARNING_MESSAGE);
            edtAnoIngresso.requestFocus();
            return;
        }
        
        String nome = edtNome.getText();
        char sexo = edtSexo.getSelectedItem().equals("Feminino") ? 'F' : 'M';
        int idade = (int) edtIdade.getValue();
        String matricula = edtMatricula.getText();
        int anoIngresso = Integer.parseInt(edtAnoIngresso.getText());
        
        // Cria um novo objeto Aluno e define seus campos com os valores dos campos de texto
        Aluno aluno = new Aluno();
        aluno.setNome(nome);
        aluno.setSexo(sexo);
        aluno.setIdade(idade);
        aluno.setMatricula(matricula);
        aluno.setAnoIngresso(anoIngresso);
        
        Aluno resultado = pesquisarAlunoPorMatricula(matricula);
        if (resultado != null)
            listaDeAlunos.remove(resultado);

        listaDeAlunos.add(aluno);
        edtAreaDepuracao.setText(edtAreaDepuracao.getText() + aluno.toString());
        
        if (resultado != null)
            refreshAreaDepuracao();
        
        clearInputs();
        swapButtonsAndPanelVisibility();
    }//GEN-LAST:event_btnSalvarActionPerformed

    private void btnExcluirActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnExcluirActionPerformed
        String matricula = JOptionPane.showInputDialog("Informe a matrícula do aluno que você deseja apagar:", "");
        
        Aluno resultado = pesquisarAlunoPorMatricula(matricula);
        if (resultado == null)
        {
            JOptionPane.showMessageDialog(null, "Matrícula não encontrada", "Aviso", JOptionPane.WARNING_MESSAGE);
            return;
        }
        
        listaDeAlunos.remove(resultado);
        refreshAreaDepuracao();
    }//GEN-LAST:event_btnExcluirActionPerformed

    private void btnEditarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnEditarActionPerformed
        String matricula = JOptionPane.showInputDialog("Informe a matrícula do aluno que você deseja alterar:", "");
        
        Aluno resultado = pesquisarAlunoPorMatricula(matricula);
        if (resultado == null)
        {
            JOptionPane.showMessageDialog(null, "Matrícula não encontrada", "Aviso", JOptionPane.WARNING_MESSAGE);
            return;
        }
        
        if (!isTextInputsVisible())
            swapButtonsAndPanelVisibility();
        
        setInputs(resultado);
    }//GEN-LAST:event_btnEditarActionPerformed

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btnEditar;
    private javax.swing.JButton btnExcluir;
    private javax.swing.JButton btnNovoOuCancelar;
    private javax.swing.JButton btnSalvar;
    private javax.swing.JTextField edtAnoIngresso;
    private javax.swing.JTextArea edtAreaDepuracao;
    private javax.swing.JSpinner edtIdade;
    private javax.swing.JTextField edtMatricula;
    private javax.swing.JTextField edtNome;
    private javax.swing.JComboBox<String> edtSexo;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JLabel lblIdade;
    private javax.swing.JLabel lblIdade1;
    private javax.swing.JLabel lblNome;
    private javax.swing.JLabel lblSexo;
    private javax.swing.JLabel lblTitulo;
    private javax.swing.JPanel panCore;
    private javax.swing.JPanel panTextInputs;
    private javax.swing.JPanel panTop;
    private javax.swing.JPanel panTopBtns;
    // End of variables declaration//GEN-END:variables
    
    /* Alterar o estilo do botão de ver os Inputs de texto */
    private void swapButtonsAndPanelVisibility()
    {
        if (btnNovoOuCancelar.getText() == "Cancelar")
        {
            btnNovoOuCancelar.setText("Adicionar");
            btnNovoOuCancelar.setIcon(new javax.swing.ImageIcon(getClass().getResource("/resources/adicionar.png")));
            panTextInputs.setVisible(false);
            btnSalvar.setVisible(false);
        }
        else
        {
            btnNovoOuCancelar.setText("Cancelar");
            btnNovoOuCancelar.setIcon(new javax.swing.ImageIcon(getClass().getResource("/resources/cruz.png"))); // NOI18N
            panTextInputs.setVisible(true);
            btnSalvar.setVisible(true);
        }
    }
    
    private Boolean isTextInputsVisible()
    {
        return (panTextInputs.isVisible());
    }
    
    private void clearInputs()
    {
        this.edtNome.setText(null);
        this.edtSexo.setSelectedIndex(0);
        this.edtMatricula.setText(null);
        this.edtIdade.setValue(1);
        this.edtAnoIngresso.setText(Integer.toString(LocalDate.now().getYear()));
    }
    
    private void setInputs(Aluno aluno)
    {
        if (aluno == null) return;
        this.edtNome.setText(aluno.getNome());
        this.edtSexo.setSelectedIndex(aluno.getSexo() == 'M' ? 0 : 1);
        this.edtMatricula.setText(aluno.getMatricula());
        this.edtIdade.setValue(aluno.getIdade());
        this.edtAnoIngresso.setText(String.valueOf(aluno.getAnoIngresso()));
    }
    
    private Aluno pesquisarAlunoPorMatricula(String pesquisar)
    {
        if (this.listaDeAlunos.isEmpty())
            return null;
        
        for (Aluno aluno : this.listaDeAlunos)
        {
            if (aluno.getMatricula().equals(pesquisar))
            {
                return aluno;
            }
        }
        
        return null;
    }
    
    private void refreshAreaDepuracao()
    {
        edtAreaDepuracao.setText(null);
        
        if (listaDeAlunos.isEmpty()) return;
        
        for (Aluno aluno : this.listaDeAlunos)
        {
            edtAreaDepuracao.setText(edtAreaDepuracao.getText() + aluno.toString());
        }
    }
}
