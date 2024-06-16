
package DaoProyecto;

import DAOInterfaces.DAOcinemaImpl;
import java.awt.Color;
import java.awt.event.KeyEvent;
import java.sql.SQLException;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.swing.JOptionPane;
import DAOInterfaces.DAOcinema;




public class Login extends javax.swing.JFrame  {
    private DAOcinema daoProductos;
    
    int xMouse, yMouse;
    
    public Login() {  
 
        initComponents();
        setLocationRelativeTo(null);
        daoProductos = new DAOcinemaImpl(); // Instancia del DAO concreto
        //txtcorreo.setText("");
        txtcorreo.setForeground(Color.black);
        txtcorreo.setText("ccarrascal21@gmail.com");
        txtcontraseña.setText("123");
    }

    
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jSeparator1 = new javax.swing.JSeparator();
        jTextField1 = new javax.swing.JTextField();
        jPanel1 = new javax.swing.JPanel();
        Main = new javax.swing.JPanel();
        Aside = new javax.swing.JPanel();
        lbllogo = new javax.swing.JLabel();
        Article = new javax.swing.JPanel();
        lbltitulologin = new javax.swing.JLabel();
        line = new javax.swing.JSeparator();
        lblclose = new javax.swing.JLabel();
        lbltipousuario = new javax.swing.JLabel();
        btncliente = new javax.swing.JButton();
        btnadmin = new javax.swing.JButton();
        lblcorreo = new javax.swing.JLabel();
        txtcorreo = new javax.swing.JTextField();
        line2 = new javax.swing.JSeparator();
        lblcontraseña = new javax.swing.JLabel();
        txtcontraseña = new javax.swing.JPasswordField();
        line3 = new javax.swing.JSeparator();
        cbrecordar = new javax.swing.JCheckBox();
        btningresar = new javax.swing.JButton();

        jTextField1.setText("jTextField1");

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setUndecorated(true);

        jPanel1.addMouseMotionListener(new java.awt.event.MouseMotionAdapter() {
            public void mouseDragged(java.awt.event.MouseEvent evt) {
                jPanel1MouseDragged(evt);
            }
        });
        jPanel1.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mousePressed(java.awt.event.MouseEvent evt) {
                jPanel1MousePressed(evt);
            }
        });

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 740, Short.MAX_VALUE)
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 32, Short.MAX_VALUE)
        );

        Main.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        Aside.setBackground(new java.awt.Color(0, 0, 51));
        Aside.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        lbllogo.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        lbllogo.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Icons/logo.png"))); // NOI18N
        Aside.add(lbllogo, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 130, 230, 212));

        Main.add(Aside, new org.netbeans.lib.awtextra.AbsoluteConstraints(5, 0, 280, 470));

        Article.setBackground(new java.awt.Color(255, 255, 255));
        Article.setForeground(new java.awt.Color(153, 204, 0));
        Article.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        lbltitulologin.setBackground(new java.awt.Color(22, 105, 170));
        lbltitulologin.setFont(new java.awt.Font("Century Gothic", 1, 30)); // NOI18N
        lbltitulologin.setForeground(new java.awt.Color(22, 105, 170));
        lbltitulologin.setText("Iniciar sesion");
        Article.add(lbltitulologin, new org.netbeans.lib.awtextra.AbsoluteConstraints(50, 30, 268, -1));

        line.setForeground(new java.awt.Color(153, 153, 255));
        Article.add(line, new org.netbeans.lib.awtextra.AbsoluteConstraints(50, 80, 230, 10));

        lblclose.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        lblclose.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Icons/hr.close.png"))); // NOI18N
        lblclose.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        lblclose.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                lblcloseMouseClicked(evt);
            }
        });
        Article.add(lblclose, new org.netbeans.lib.awtextra.AbsoluteConstraints(400, 20, 30, 30));

        lbltipousuario.setFont(new java.awt.Font("Century Gothic", 0, 14)); // NOI18N
        lbltipousuario.setText("Tipo de usuario:");
        Article.add(lbltipousuario, new org.netbeans.lib.awtextra.AbsoluteConstraints(110, 120, 160, -1));

        btncliente.setBackground(new java.awt.Color(204, 204, 204));
        btncliente.setFont(new java.awt.Font("Century Gothic", 0, 12)); // NOI18N
        btncliente.setForeground(new java.awt.Color(255, 255, 255));
        btncliente.setText("Cliente");
        btncliente.setBorder(new javax.swing.border.LineBorder(new java.awt.Color(0, 102, 255), 1, true));
        btncliente.setBorderPainted(false);
        btncliente.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        btncliente.setDefaultCapable(false);
        btncliente.setEnabled(false);
        btncliente.setFocusPainted(false);
        btncliente.setFocusable(false);
        btncliente.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseEntered(java.awt.event.MouseEvent evt) {
                btnclienteMouseEntered(evt);
            }
            public void mouseExited(java.awt.event.MouseEvent evt) {
                btnclienteMouseExited(evt);
            }
        });
        btncliente.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnclienteActionPerformed(evt);
            }
        });
        Article.add(btncliente, new org.netbeans.lib.awtextra.AbsoluteConstraints(200, 150, 90, 30));

        btnadmin.setBackground(new java.awt.Color(102, 153, 255));
        btnadmin.setFont(new java.awt.Font("Century Gothic", 0, 12)); // NOI18N
        btnadmin.setForeground(new java.awt.Color(255, 255, 255));
        btnadmin.setText("Admin");
        btnadmin.setBorder(new javax.swing.border.LineBorder(new java.awt.Color(0, 102, 255), 1, true));
        btnadmin.setBorderPainted(false);
        btnadmin.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        btnadmin.setDefaultCapable(false);
        btnadmin.setFocusPainted(false);
        btnadmin.setFocusable(false);
        btnadmin.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseEntered(java.awt.event.MouseEvent evt) {
                btnadminMouseEntered(evt);
            }
            public void mouseExited(java.awt.event.MouseEvent evt) {
                btnadminMouseExited(evt);
            }
        });
        btnadmin.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnadminActionPerformed(evt);
            }
        });
        Article.add(btnadmin, new org.netbeans.lib.awtextra.AbsoluteConstraints(110, 150, 90, 30));

        lblcorreo.setFont(new java.awt.Font("Century Gothic", 0, 14)); // NOI18N
        lblcorreo.setText("Correo:");
        Article.add(lblcorreo, new org.netbeans.lib.awtextra.AbsoluteConstraints(110, 190, 58, 30));

        txtcorreo.setFont(new java.awt.Font("Roboto", 0, 12)); // NOI18N
        txtcorreo.setForeground(new java.awt.Color(204, 204, 204));
        txtcorreo.setText("Ingrese su correo electronico");
        txtcorreo.setBorder(null);
        txtcorreo.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mousePressed(java.awt.event.MouseEvent evt) {
                txtcorreoMousePressed(evt);
            }
        });
        txtcorreo.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyPressed(java.awt.event.KeyEvent evt) {
                txtcorreoKeyPressed(evt);
            }
        });
        Article.add(txtcorreo, new org.netbeans.lib.awtextra.AbsoluteConstraints(110, 220, 230, 30));

        line2.setForeground(new java.awt.Color(153, 153, 153));
        Article.add(line2, new org.netbeans.lib.awtextra.AbsoluteConstraints(110, 250, 230, 10));

        lblcontraseña.setFont(new java.awt.Font("Century Gothic", 0, 14)); // NOI18N
        lblcontraseña.setText("Contraseña:");
        Article.add(lblcontraseña, new org.netbeans.lib.awtextra.AbsoluteConstraints(110, 270, 92, 30));

        txtcontraseña.setText("********");
        txtcontraseña.setBorder(null);
        txtcontraseña.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mousePressed(java.awt.event.MouseEvent evt) {
                txtcontraseñaMousePressed(evt);
            }
        });
        txtcontraseña.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyPressed(java.awt.event.KeyEvent evt) {
                txtcontraseñaKeyPressed(evt);
            }
        });
        Article.add(txtcontraseña, new org.netbeans.lib.awtextra.AbsoluteConstraints(110, 300, 230, 30));

        line3.setForeground(new java.awt.Color(153, 153, 153));
        Article.add(line3, new org.netbeans.lib.awtextra.AbsoluteConstraints(110, 330, 230, 10));

        cbrecordar.setBackground(new java.awt.Color(255, 255, 255));
        cbrecordar.setText("Recordar");
        cbrecordar.setFocusPainted(false);
        cbrecordar.setFocusable(false);
        cbrecordar.setRequestFocusEnabled(false);
        cbrecordar.setRolloverEnabled(false);
        Article.add(cbrecordar, new org.netbeans.lib.awtextra.AbsoluteConstraints(110, 360, 95, -1));

        btningresar.setBackground(new java.awt.Color(0, 0, 102));
        btningresar.setFont(new java.awt.Font("Roboto", 1, 13)); // NOI18N
        btningresar.setForeground(new java.awt.Color(255, 255, 255));
        btningresar.setText("Ingresar");
        btningresar.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 102, 255)));
        btningresar.setBorderPainted(false);
        btningresar.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        btningresar.setDefaultCapable(false);
        btningresar.setFocusPainted(false);
        btningresar.setFocusable(false);
        btningresar.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseEntered(java.awt.event.MouseEvent evt) {
                btningresarMouseEntered(evt);
            }
            public void mouseExited(java.awt.event.MouseEvent evt) {
                btningresarMouseExited(evt);
            }
        });
        btningresar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btningresarActionPerformed(evt);
            }
        });
        Article.add(btningresar, new org.netbeans.lib.awtextra.AbsoluteConstraints(170, 410, 140, 30));

        Main.add(Article, new org.netbeans.lib.awtextra.AbsoluteConstraints(280, 0, 460, 470));

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addComponent(Main, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(0, 6, Short.MAX_VALUE))
            .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                    .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addContainerGap()))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(Main, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addContainerGap())
            .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                .addGroup(layout.createSequentialGroup()
                    .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addGap(0, 450, Short.MAX_VALUE)))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void btningresarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btningresarActionPerformed
        String correo = txtcorreo.getText().trim();
        String contraseña = String.valueOf(txtcontraseña.getPassword());

        try {
            if (daoProductos.validarCredenciales(correo, contraseña)) {

                JOptionPane.showMessageDialog(this, "Inicio de sesión exitoso");
                Main principal = new Main();
                principal.setVisible(true);
                this.dispose();
            } else {
                JOptionPane.showMessageDialog(this, "Credenciales incorrectas", "Error", JOptionPane.ERROR_MESSAGE);
            }
        } catch (SQLException ex) {
            Logger.getLogger(Login.class.getName()).log(Level.SEVERE, null, ex);
        }
    }//GEN-LAST:event_btningresarActionPerformed

    private void lblcloseMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_lblcloseMouseClicked
        System.exit(0);
    }//GEN-LAST:event_lblcloseMouseClicked

    private void txtcorreoKeyPressed(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_txtcorreoKeyPressed
        if (evt.getKeyCode() == KeyEvent.VK_ENTER){
        txtcontraseña.requestFocus();
        txtcontraseña.setText("");
        
        }
        
    }//GEN-LAST:event_txtcorreoKeyPressed

    private void btningresarMouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_btningresarMouseExited
        btningresar.setBackground(new Color(0,0,102));
    }//GEN-LAST:event_btningresarMouseExited

    private void btningresarMouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_btningresarMouseEntered
        btningresar.setBackground(new Color(0,0,29));
    }//GEN-LAST:event_btningresarMouseEntered

    private void txtcontraseñaKeyPressed(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_txtcontraseñaKeyPressed
        if (evt.getKeyCode() == KeyEvent.VK_ENTER){
            String correo = txtcorreo.getText().trim();
            String contraseña = String.valueOf(txtcontraseña.getPassword());

            try {
                if (daoProductos.validarCredenciales(correo, contraseña)) {

                    JOptionPane.showMessageDialog(this, "Inicio de sesión exitoso");
                    Main principal = new Main();
                    principal.setVisible(true);
                    this.dispose();
                } else {
                    JOptionPane.showMessageDialog(this, "Credenciales incorrectas", "Error", JOptionPane.ERROR_MESSAGE);
                }
            } catch (SQLException ex) {
                Logger.getLogger(Login.class.getName()).log(Level.SEVERE, null, ex);
            }
        }
    }//GEN-LAST:event_txtcontraseñaKeyPressed

    private void txtcorreoMousePressed(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_txtcorreoMousePressed
        if (txtcorreo.getText().equals("Ingrese su correo electronico")) {
            txtcorreo.setText("");
            txtcorreo.setForeground(Color.black);
        }
        if (String.valueOf(txtcontraseña.getPassword()).isEmpty()) {
            txtcontraseña.setText("********");
            txtcontraseña.setForeground(Color.gray);
        }
    }//GEN-LAST:event_txtcorreoMousePressed

    private void txtcontraseñaMousePressed(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_txtcontraseñaMousePressed
        if (String.valueOf(txtcontraseña.getPassword()).equals("********")) {
            txtcontraseña.setText("");
            txtcontraseña.setForeground(Color.black);
        }
        if (txtcorreo.getText().isEmpty()) {
            txtcorreo.setText("Ingrese su correo electronico");
            txtcorreo.setForeground(Color.gray);
        }
    }//GEN-LAST:event_txtcontraseñaMousePressed

    private void jPanel1MouseDragged(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jPanel1MouseDragged
        int x = evt.getXOnScreen();
        int y = evt.getYOnScreen();
        this.setLocation(x - xMouse, y - yMouse);
    }//GEN-LAST:event_jPanel1MouseDragged

    private void jPanel1MousePressed(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jPanel1MousePressed
        xMouse = evt.getX();
        yMouse = evt.getY();
    }//GEN-LAST:event_jPanel1MousePressed

    private void btnclienteActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnclienteActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_btnclienteActionPerformed

    private void btnclienteMouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_btnclienteMouseExited
        // TODO add your handling code here:
    }//GEN-LAST:event_btnclienteMouseExited

    private void btnclienteMouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_btnclienteMouseEntered
        // TODO add your handling code here:
    }//GEN-LAST:event_btnclienteMouseEntered

    private void btnadminActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnadminActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_btnadminActionPerformed

    private void btnadminMouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_btnadminMouseExited
        // TODO add your handling code here:
    }//GEN-LAST:event_btnadminMouseExited

    private void btnadminMouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_btnadminMouseEntered
        // TODO add your handling code here:
    }//GEN-LAST:event_btnadminMouseEntered

    
    

    public static void main(String args[]) {
  
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new Login().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JPanel Article;
    private javax.swing.JPanel Aside;
    private javax.swing.JPanel Main;
    private javax.swing.JButton btnadmin;
    private javax.swing.JButton btncliente;
    private javax.swing.JButton btningresar;
    private javax.swing.JCheckBox cbrecordar;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JSeparator jSeparator1;
    private javax.swing.JTextField jTextField1;
    private javax.swing.JLabel lblclose;
    private javax.swing.JLabel lblcontraseña;
    private javax.swing.JLabel lblcorreo;
    private javax.swing.JLabel lbllogo;
    private javax.swing.JLabel lbltipousuario;
    private javax.swing.JLabel lbltitulologin;
    private javax.swing.JSeparator line;
    private javax.swing.JSeparator line2;
    private javax.swing.JSeparator line3;
    private javax.swing.JPasswordField txtcontraseña;
    private javax.swing.JTextField txtcorreo;
    // End of variables declaration//GEN-END:variables
}
