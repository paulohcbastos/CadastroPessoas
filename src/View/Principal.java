package View;

import Model.Pessoa;
import Dao.PessoaDao;
import java.util.ArrayList;
import javax.swing.JOptionPane;
import javax.swing.table.DefaultTableModel;

/**
 * @author Paulo Bastos
 */
public class Principal extends javax.swing.JFrame {

    ArrayList<Pessoa> listaAmigos;
    String modo;
    PessoaDao pDao = new PessoaDao();

    public void readTablePessoa() {
        DefaultTableModel modelo = new DefaultTableModel(new Object[]{"ID", "Nome", "Nascimento", "RG", "CPF"}, 0);

        for (int i = 0; i < listaAmigos.size(); i++) {
            Object linha[] = new Object[]{listaAmigos.get(i).getId(),
                listaAmigos.get(i).getNome(),
                listaAmigos.get(i).getNascimento(),
                listaAmigos.get(i).getRg(),
                listaAmigos.get(i).getCpf()};
            modelo.addRow(linha);
        }

        tbl_Nomes.setModel(modelo);
        tbl_Nomes.getColumnModel().getColumn(0).setPreferredWidth(30);
        tbl_Nomes.getColumnModel().getColumn(1).setPreferredWidth(200);
        tbl_Nomes.getColumnModel().getColumn(2).setPreferredWidth(50);
        tbl_Nomes.getColumnModel().getColumn(3).setPreferredWidth(50);
        tbl_Nomes.getColumnModel().getColumn(4).setPreferredWidth(50);

        tbl_Nomes.setModel(modelo);
    }

    /**
     * Creates new form Principal
     */
    public Principal() {
        initComponents();
        setLocationRelativeTo(null);
        listaAmigos = new ArrayList();
        modo = "Navegar";
        ManipulaInterfacePessoa();
    }

    //Modos de Interface para liberar/bloquear botões e campos
    public final void ManipulaInterfacePessoa() {
        switch (modo) {
            case "Navegar":
                btn_salvar.setEnabled(false);
                btn_cancelar.setEnabled(false);
                c_buscar.setEnabled(true);
                btn_buscar.setEnabled(true);
                c_id.setEnabled(false);
                c_nome.setEnabled(false);
                c_nasc.setEnabled(false);
                c_rg.setEnabled(false);
                c_cpf.setEnabled(false);
                btn_novo.setEnabled(true);
                btn_editar.setEnabled(false);
                btn_excluir.setEnabled(false);
                break;

            case "Novo":
                btn_salvar.setEnabled(true);
                btn_cancelar.setEnabled(true);
                c_buscar.setEnabled(false);
                btn_buscar.setEnabled(false);
                c_id.setEnabled(false);
                c_nome.setEnabled(true);
                c_nasc.setEnabled(true);
                c_rg.setEnabled(true);
                c_cpf.setEnabled(true);
                btn_novo.setEnabled(false);
                btn_editar.setEnabled(false);
                btn_excluir.setEnabled(false);
                break;

            case "Editar":
                btn_salvar.setEnabled(true);
                btn_cancelar.setEnabled(true);
                c_buscar.setEnabled(false);
                btn_buscar.setEnabled(false);
                c_id.setEnabled(false);
                c_nome.setEnabled(true);
                c_nasc.setEnabled(true);
                c_rg.setEnabled(true);
                c_cpf.setEnabled(true);
                btn_novo.setEnabled(false);
                btn_editar.setEnabled(false);
                btn_excluir.setEnabled(false);
                break;

            case "Excluir":
                btn_salvar.setEnabled(false);
                btn_cancelar.setEnabled(false);
                c_buscar.setEnabled(true);
                btn_buscar.setEnabled(true);
                c_id.setEnabled(false);
                c_nome.setEnabled(false);
                c_nasc.setEnabled(false);
                c_rg.setEnabled(false);
                c_cpf.setEnabled(false);
                btn_novo.setEnabled(true);
                btn_editar.setEnabled(true);
                btn_excluir.setEnabled(false);
                break;

            case "Selecao":
                btn_salvar.setEnabled(false);
                btn_cancelar.setEnabled(false);
                c_id.setEnabled(false);
                c_nome.setEnabled(false);
                c_nasc.setEnabled(false);
                c_rg.setEnabled(false);
                c_cpf.setEnabled(false);
                btn_novo.setEnabled(true);
                btn_editar.setEnabled(true);
                btn_excluir.setEnabled(true);
                break;
                
            case "Limpar":
                btn_salvar.setEnabled(false);
                btn_cancelar.setEnabled(false);
                c_buscar.setEnabled(true);
                btn_buscar.setEnabled(false);
                c_id.setEnabled(false);
                c_nome.setEnabled(false);
                c_nasc.setEnabled(false);
                c_rg.setEnabled(false);
                c_cpf.setEnabled(false);
                btn_novo.setEnabled(true);
                btn_editar.setEnabled(false);
                btn_excluir.setEnabled(false);
                c_nome.setText("");
                c_nasc.setText("");
                c_rg.setText("");
                c_cpf.setText("");
                break;    

            default:
                System.out.println("Modo inválido");

        }

    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
//Comandos do Painel JFrame
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        tbl_pessoas = new javax.swing.JTabbedPane();
        jPanel1 = new javax.swing.JPanel();
        jScrollPane1 = new javax.swing.JScrollPane();
        tbl_Nomes = new javax.swing.JTable();
        jPanel3 = new javax.swing.JPanel();
        lbl_id = new javax.swing.JLabel();
        c_id = new javax.swing.JTextField();
        lbl_nome = new javax.swing.JLabel();
        c_nome = new javax.swing.JTextField();
        btn_salvar = new javax.swing.JButton();
        btn_cancelar = new javax.swing.JButton();
        lbl_nasc = new javax.swing.JLabel();
        lbl_rg = new javax.swing.JLabel();
        lbl_cpf = new javax.swing.JLabel();
        c_nasc = new javax.swing.JTextField();
        c_rg = new javax.swing.JTextField();
        c_cpf = new javax.swing.JTextField();
        btn_novo = new javax.swing.JButton();
        btn_editar = new javax.swing.JButton();
        btn_excluir = new javax.swing.JButton();
        btn_buscar = new javax.swing.JButton();
        c_buscar = new javax.swing.JTextField();
        jPanel2 = new javax.swing.JPanel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        tbl_Nomes.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0)));
        tbl_Nomes.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {
                {null, null, null, null, null},
                {null, null, null, null, null},
                {null, null, null, null, null},
                {null, null, null, null, null},
                {null, null, null, null, null},
                {null, null, null, null, null}
            },
            new String [] {
                "ID", "Nome", "Nascimento", "RG", "CPF"
            }
        ) {
            Class[] types = new Class [] {
                java.lang.Integer.class, java.lang.String.class, java.lang.Object.class, java.lang.Object.class, java.lang.Object.class
            };

            public Class getColumnClass(int columnIndex) {
                return types [columnIndex];
            }
        });
        tbl_Nomes.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                tbl_NomesMouseClicked(evt);
            }
        });
        tbl_Nomes.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyReleased(java.awt.event.KeyEvent evt) {
                tbl_NomesKeyReleased(evt);
            }
        });
        jScrollPane1.setViewportView(tbl_Nomes);
        if (tbl_Nomes.getColumnModel().getColumnCount() > 0) {
            tbl_Nomes.getColumnModel().getColumn(0).setPreferredWidth(30);
            tbl_Nomes.getColumnModel().getColumn(1).setPreferredWidth(200);
            tbl_Nomes.getColumnModel().getColumn(2).setPreferredWidth(50);
            tbl_Nomes.getColumnModel().getColumn(3).setPreferredWidth(50);
            tbl_Nomes.getColumnModel().getColumn(4).setPreferredWidth(50);
        }

        jPanel3.setBorder(javax.swing.BorderFactory.createTitledBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0)), "Novo Cadastro"));

        lbl_id.setText("ID:");

        lbl_nome.setText("Nome:");

        btn_salvar.setText("Salvar");
        btn_salvar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btn_salvarActionPerformed(evt);
            }
        });

        btn_cancelar.setText("Cancelar");
        btn_cancelar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btn_cancelarActionPerformed(evt);
            }
        });

        lbl_nasc.setText("Nascimento");

        lbl_rg.setText("RG");

        lbl_cpf.setText("CPF");

        c_nasc.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                c_nascActionPerformed(evt);
            }
        });

        c_rg.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                c_rgActionPerformed(evt);
            }
        });

        c_cpf.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                c_cpfActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout jPanel3Layout = new javax.swing.GroupLayout(jPanel3);
        jPanel3.setLayout(jPanel3Layout);
        jPanel3Layout.setHorizontalGroup(
            jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel3Layout.createSequentialGroup()
                .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel3Layout.createSequentialGroup()
                        .addContainerGap()
                        .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                            .addComponent(lbl_nasc, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(lbl_id)
                            .addComponent(lbl_nome, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(c_id, javax.swing.GroupLayout.PREFERRED_SIZE, 81, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(c_nome, javax.swing.GroupLayout.PREFERRED_SIZE, 574, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(c_nasc, javax.swing.GroupLayout.PREFERRED_SIZE, 160, javax.swing.GroupLayout.PREFERRED_SIZE)))
                    .addGroup(jPanel3Layout.createSequentialGroup()
                        .addGap(58, 58, 58)
                        .addComponent(btn_salvar, javax.swing.GroupLayout.PREFERRED_SIZE, 86, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(44, 44, 44)
                        .addComponent(btn_cancelar))
                    .addGroup(jPanel3Layout.createSequentialGroup()
                        .addContainerGap()
                        .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(lbl_rg)
                            .addComponent(lbl_cpf))
                        .addGap(46, 46, 46)
                        .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(c_rg, javax.swing.GroupLayout.PREFERRED_SIZE, 160, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(c_cpf, javax.swing.GroupLayout.PREFERRED_SIZE, 160, javax.swing.GroupLayout.PREFERRED_SIZE))))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        jPanel3Layout.setVerticalGroup(
            jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel3Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(lbl_id)
                    .addComponent(c_id, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel3Layout.createSequentialGroup()
                        .addComponent(lbl_nome, javax.swing.GroupLayout.PREFERRED_SIZE, 22, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(0, 0, Short.MAX_VALUE))
                    .addGroup(jPanel3Layout.createSequentialGroup()
                        .addGap(1, 1, 1)
                        .addComponent(c_nome)))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(lbl_nasc)
                    .addComponent(c_nasc, javax.swing.GroupLayout.PREFERRED_SIZE, 20, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(9, 9, 9)
                .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(lbl_rg)
                    .addComponent(c_rg, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(c_cpf, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(lbl_cpf))
                .addGap(18, 18, 18)
                .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(btn_salvar)
                    .addComponent(btn_cancelar)))
        );

        btn_novo.setText("Novo");
        btn_novo.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btn_novoActionPerformed(evt);
            }
        });

        btn_editar.setText("Editar");
        btn_editar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btn_editarActionPerformed(evt);
            }
        });

        btn_excluir.setText("Excluir");
        btn_excluir.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btn_excluirActionPerformed(evt);
            }
        });

        btn_buscar.setText("Buscar");
        btn_buscar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btn_buscarActionPerformed(evt);
            }
        });

        c_buscar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                c_buscarActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jScrollPane1, javax.swing.GroupLayout.DEFAULT_SIZE, 787, Short.MAX_VALUE)
                    .addComponent(jPanel3, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addComponent(btn_novo, javax.swing.GroupLayout.PREFERRED_SIZE, 110, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(btn_editar, javax.swing.GroupLayout.PREFERRED_SIZE, 110, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(btn_excluir, javax.swing.GroupLayout.PREFERRED_SIZE, 110, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(78, 78, 78)
                        .addComponent(c_buscar)
                        .addGap(18, 18, 18)
                        .addComponent(btn_buscar)
                        .addGap(17, 17, 17)))
                .addContainerGap())
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 215, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(91, 91, 91)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(btn_editar, javax.swing.GroupLayout.PREFERRED_SIZE, 31, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(btn_novo, javax.swing.GroupLayout.PREFERRED_SIZE, 31, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(btn_excluir, javax.swing.GroupLayout.PREFERRED_SIZE, 31, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(0, 2, Short.MAX_VALUE))
                    .addComponent(c_buscar)
                    .addComponent(btn_buscar, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jPanel3, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(731, 731, 731))
        );

        tbl_pessoas.addTab("Pessoas", jPanel1);

        javax.swing.GroupLayout jPanel2Layout = new javax.swing.GroupLayout(jPanel2);
        jPanel2.setLayout(jPanel2Layout);
        jPanel2Layout.setHorizontalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 807, Short.MAX_VALUE)
        );
        jPanel2Layout.setVerticalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 1299, Short.MAX_VALUE)
        );

        tbl_pessoas.addTab("", jPanel2);

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(tbl_pessoas)
                .addContainerGap())
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(tbl_pessoas)
                .addContainerGap())
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void btn_excluirActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btn_excluirActionPerformed

        if (tbl_Nomes.getSelectedRow() != -1) {

            Pessoa p = new Pessoa();
            PessoaDao dao = new PessoaDao();

            p.setId((int) tbl_Nomes.getValueAt(tbl_Nomes.getSelectedRow(), 0));
            dao.delete(p);

            c_nome.setText("");
            c_nasc.setText("");
            c_rg.setText("");
            c_cpf.setText("");

            readTablePessoa();
        } else {
            JOptionPane.showMessageDialog(null, "Selecione uma Pessoa para Excluir ");
        }
    }//GEN-LAST:event_btn_excluirActionPerformed

    private void btn_editarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btn_editarActionPerformed

        if (tbl_Nomes.getSelectedRow() != -1) {

            Pessoa p = new Pessoa();
            modo = "Editar";
            ManipulaInterfacePessoa();

            p.setNome(c_nome.getText());
            p.setNascimento(c_nasc.getText());
            p.setRg(c_rg.getText());
            p.setCpf(c_cpf.getText());

        }
    }//GEN-LAST:event_btn_editarActionPerformed

    private void btn_novoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btn_novoActionPerformed
        modo = "Novo";
        ManipulaInterfacePessoa();
        c_nome.setFocusable(true);
    }//GEN-LAST:event_btn_novoActionPerformed

    private void c_cpfActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_c_cpfActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_c_cpfActionPerformed

    private void c_rgActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_c_rgActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_c_rgActionPerformed

    private void c_nascActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_c_nascActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_c_nascActionPerformed

    private void btn_cancelarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btn_cancelarActionPerformed
        modo = "Limpar";   
        ManipulaInterfacePessoa();
    }//GEN-LAST:event_btn_cancelarActionPerformed

    private void btn_salvarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btn_salvarActionPerformed

        int id = 0;
        if (modo.equals("Editar")) {
            id = Integer.parseInt(c_id.getText());
        }

        String nome = c_nome.getText();
        String nasc = c_nasc.getText();
        String rg = c_rg.getText();
        String cpf = c_cpf.getText();
        Pessoa p = new Pessoa(id, nome, nasc, rg, cpf);
        if (modo.equals("Novo")) {
            pDao.create(p);
        } else if (modo.equals("Editar")) {
            pDao.update(p);
            readTablePessoa();
        }

        //LoadTablePessoas();
        //readTablePessoas();
        modo = "Navegar";
        ManipulaInterfacePessoa();
        c_id.setText("");
        c_nome.setText("");
        c_nasc.setText("");
        c_rg.setText("");
        c_cpf.setText("");
    }//GEN-LAST:event_btn_salvarActionPerformed

    private void tbl_NomesKeyReleased(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_tbl_NomesKeyReleased
        // TODO add your handling code here:

        if (tbl_Nomes.getSelectedRow() != -1) {
            c_nome.setText(tbl_Nomes.getValueAt(tbl_Nomes.getSelectedRow(), 1).toString());
            c_nasc.setText(tbl_Nomes.getValueAt(tbl_Nomes.getSelectedRow(), 2).toString());
            c_rg.setText(tbl_Nomes.getValueAt(tbl_Nomes.getSelectedRow(), 3).toString());
            c_cpf.setText(tbl_Nomes.getValueAt(tbl_Nomes.getSelectedRow(), 4).toString());
        }
    }//GEN-LAST:event_tbl_NomesKeyReleased

    private void tbl_NomesMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_tbl_NomesMouseClicked
        int index = tbl_Nomes.getSelectedRow();
        if (index >= 0 && index < listaAmigos.size()) {
            Pessoa P = listaAmigos.get(index);
            c_id.setText(String.valueOf(P.getId()));
            c_nome.setText(P.getNome());
            c_nasc.setText(P.getNascimento());
            c_rg.setText(P.getRg());
            c_cpf.setText(P.getCpf());
            modo = "Selecao";
            ManipulaInterfacePessoa();
            c_buscar.setText("");
        }
    }//GEN-LAST:event_tbl_NomesMouseClicked

    private void c_buscarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_c_buscarActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_c_buscarActionPerformed

    private void btn_buscarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btn_buscarActionPerformed
        if (c_buscar.getText().equals("")) {
            listaAmigos.addAll(pDao.read());
        } else {
            listaAmigos.addAll(pDao.readForNome(c_buscar.getText()));
        }
        readTablePessoa();

        // TODO add your handling code here:
    }//GEN-LAST:event_btn_buscarActionPerformed

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
                if ("Windows".equals(info.getName())) {
                    javax.swing.UIManager.setLookAndFeel(info.getClassName());
                    break;
                }
            }
        } catch (ClassNotFoundException ex) {
            java.util.logging.Logger.getLogger(Principal.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(Principal.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(Principal.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(Principal.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new Principal().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btn_buscar;
    private javax.swing.JButton btn_cancelar;
    private javax.swing.JButton btn_editar;
    private javax.swing.JButton btn_excluir;
    private javax.swing.JButton btn_novo;
    private javax.swing.JButton btn_salvar;
    private javax.swing.JTextField c_buscar;
    private javax.swing.JTextField c_cpf;
    private javax.swing.JTextField c_id;
    private javax.swing.JTextField c_nasc;
    private javax.swing.JTextField c_nome;
    private javax.swing.JTextField c_rg;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPanel jPanel2;
    private javax.swing.JPanel jPanel3;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JLabel lbl_cpf;
    private javax.swing.JLabel lbl_id;
    private javax.swing.JLabel lbl_nasc;
    private javax.swing.JLabel lbl_nome;
    private javax.swing.JLabel lbl_rg;
    private javax.swing.JTable tbl_Nomes;
    private javax.swing.JTabbedPane tbl_pessoas;
    // End of variables declaration//GEN-END:variables

}
