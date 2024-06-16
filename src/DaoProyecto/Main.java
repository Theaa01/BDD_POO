package DaoProyecto;

import DAOInterfaces.DAOcinemaImpl;
import java.awt.BorderLayout;
import java.awt.Color;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.swing.JPanel;

public class Main extends javax.swing.JFrame {

    int xMouse;
    int yMouse;
    public Main() {
        initComponents();
        Principal p1 = new Principal();
        p1.setSize(750, 640);
        p1.setLocation(0,0);
        
        content.removeAll();
        content.add(p1, BorderLayout.CENTER);
        content.revalidate();
        content.repaint();
    }
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        Background = new javax.swing.JPanel();
        Menu = new javax.swing.JPanel();
        btn_prin = new javax.swing.JPanel();
        lbliconprincipal = new javax.swing.JLabel();
        lblprincipal = new javax.swing.JLabel();
        btn_peliculas = new javax.swing.JPanel();
        lbliconpeliculas = new javax.swing.JLabel();
        lblpeliculas = new javax.swing.JLabel();
        btn_cartelera = new javax.swing.JPanel();
        lbliconcartelera = new javax.swing.JLabel();
        lblcartelera = new javax.swing.JLabel();
        btn_función = new javax.swing.JPanel();
        lbliconfuncion = new javax.swing.JLabel();
        lblfuncion = new javax.swing.JLabel();
        btn_clientes = new javax.swing.JPanel();
        lbliconclientes = new javax.swing.JLabel();
        lblclientes = new javax.swing.JLabel();
        btn_usuarios = new javax.swing.JPanel();
        lbliconusuarios = new javax.swing.JLabel();
        lblusuarios = new javax.swing.JLabel();
        app_name = new javax.swing.JLabel();
        line1 = new javax.swing.JSeparator();
        lbliconuser = new javax.swing.JLabel();
        lbladmin = new javax.swing.JLabel();
        Title = new javax.swing.JPanel();
        red_squr = new javax.swing.JPanel();
        exit = new javax.swing.JLabel();
        slogan = new javax.swing.JLabel();
        content = new javax.swing.JPanel();
        Header = new javax.swing.JPanel();
        lbltitulo1 = new javax.swing.JLabel();
        fecha = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setBackground(new java.awt.Color(255, 255, 255));
        setCursor(new java.awt.Cursor(java.awt.Cursor.DEFAULT_CURSOR));
        setLocationByPlatform(true);
        setUndecorated(true);
        setResizable(false);
        addWindowListener(new java.awt.event.WindowAdapter() {
            public void windowActivated(java.awt.event.WindowEvent evt) {
                formWindowActivated(evt);
            }
        });

        Background.setBackground(new java.awt.Color(255, 255, 255));
        Background.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        Menu.setBackground(new java.awt.Color(13, 71, 161));
        Menu.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        btn_prin.setBackground(new java.awt.Color(21, 101, 192));
        btn_prin.setCursor(new java.awt.Cursor(java.awt.Cursor.DEFAULT_CURSOR));
        btn_prin.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseEntered(java.awt.event.MouseEvent evt) {
                btn_prinMouseEntered(evt);
            }
            public void mouseExited(java.awt.event.MouseEvent evt) {
                btn_prinMouseExited(evt);
            }
            public void mousePressed(java.awt.event.MouseEvent evt) {
                btn_prinMousePressed(evt);
            }
        });
        btn_prin.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        lbliconprincipal.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        lbliconprincipal.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Icons/menu.home.png"))); // NOI18N
        btn_prin.add(lbliconprincipal, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 10, 30, 30));

        lblprincipal.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        lblprincipal.setForeground(new java.awt.Color(255, 255, 255));
        lblprincipal.setText("Principal");
        btn_prin.add(lblprincipal, new org.netbeans.lib.awtextra.AbsoluteConstraints(50, 10, -1, 30));

        Menu.add(btn_prin, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 240, 270, 50));

        btn_peliculas.setBackground(new java.awt.Color(18, 90, 173));
        btn_peliculas.setCursor(new java.awt.Cursor(java.awt.Cursor.DEFAULT_CURSOR));
        btn_peliculas.setPreferredSize(new java.awt.Dimension(270, 51));
        btn_peliculas.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseEntered(java.awt.event.MouseEvent evt) {
                btn_peliculasMouseEntered(evt);
            }
            public void mouseExited(java.awt.event.MouseEvent evt) {
                btn_peliculasMouseExited(evt);
            }
            public void mousePressed(java.awt.event.MouseEvent evt) {
                btn_peliculasMousePressed(evt);
            }
        });
        btn_peliculas.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        lbliconpeliculas.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        lbliconpeliculas.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Icons/menu.pelicula.png"))); // NOI18N
        btn_peliculas.add(lbliconpeliculas, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 10, 30, 30));

        lblpeliculas.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        lblpeliculas.setForeground(new java.awt.Color(255, 255, 255));
        lblpeliculas.setText("Peliculas");
        btn_peliculas.add(lblpeliculas, new org.netbeans.lib.awtextra.AbsoluteConstraints(50, 10, -1, 30));

        Menu.add(btn_peliculas, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 290, -1, -1));

        btn_cartelera.setBackground(new java.awt.Color(18, 90, 173));
        btn_cartelera.setCursor(new java.awt.Cursor(java.awt.Cursor.DEFAULT_CURSOR));
        btn_cartelera.setPreferredSize(new java.awt.Dimension(270, 51));
        btn_cartelera.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseEntered(java.awt.event.MouseEvent evt) {
                btn_carteleraMouseEntered(evt);
            }
            public void mouseExited(java.awt.event.MouseEvent evt) {
                btn_carteleraMouseExited(evt);
            }
            public void mousePressed(java.awt.event.MouseEvent evt) {
                btn_carteleraMousePressed(evt);
            }
        });
        btn_cartelera.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        lbliconcartelera.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        lbliconcartelera.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Icons/menu.cartelera.png"))); // NOI18N
        btn_cartelera.add(lbliconcartelera, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 10, 30, 30));

        lblcartelera.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        lblcartelera.setForeground(new java.awt.Color(255, 255, 255));
        lblcartelera.setText("Cartelera");
        btn_cartelera.add(lblcartelera, new org.netbeans.lib.awtextra.AbsoluteConstraints(50, 10, -1, 30));

        Menu.add(btn_cartelera, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 340, -1, -1));

        btn_función.setBackground(new java.awt.Color(18, 90, 173));
        btn_función.setCursor(new java.awt.Cursor(java.awt.Cursor.DEFAULT_CURSOR));
        btn_función.setPreferredSize(new java.awt.Dimension(270, 51));
        btn_función.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseEntered(java.awt.event.MouseEvent evt) {
                btn_funciónMouseEntered(evt);
            }
            public void mouseExited(java.awt.event.MouseEvent evt) {
                btn_funciónMouseExited(evt);
            }
            public void mousePressed(java.awt.event.MouseEvent evt) {
                btn_funciónMousePressed(evt);
            }
        });
        btn_función.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        lbliconfuncion.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        lbliconfuncion.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Icons/menu.funcion.png"))); // NOI18N
        btn_función.add(lbliconfuncion, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 10, 30, 30));

        lblfuncion.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        lblfuncion.setForeground(new java.awt.Color(255, 255, 255));
        lblfuncion.setText("Función");
        btn_función.add(lblfuncion, new org.netbeans.lib.awtextra.AbsoluteConstraints(50, 10, -1, 30));

        Menu.add(btn_función, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 390, -1, -1));

        btn_clientes.setBackground(new java.awt.Color(18, 90, 173));
        btn_clientes.setCursor(new java.awt.Cursor(java.awt.Cursor.DEFAULT_CURSOR));
        btn_clientes.setPreferredSize(new java.awt.Dimension(270, 51));
        btn_clientes.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseEntered(java.awt.event.MouseEvent evt) {
                btn_clientesMouseEntered(evt);
            }
            public void mouseExited(java.awt.event.MouseEvent evt) {
                btn_clientesMouseExited(evt);
            }
            public void mousePressed(java.awt.event.MouseEvent evt) {
                btn_clientesMousePressed(evt);
            }
        });
        btn_clientes.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        lbliconclientes.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        lbliconclientes.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Icons/menu.users.png"))); // NOI18N
        btn_clientes.add(lbliconclientes, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 10, 30, 30));

        lblclientes.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        lblclientes.setForeground(new java.awt.Color(255, 255, 255));
        lblclientes.setText("Clientes");
        btn_clientes.add(lblclientes, new org.netbeans.lib.awtextra.AbsoluteConstraints(50, 10, -1, 30));

        Menu.add(btn_clientes, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 440, -1, -1));

        btn_usuarios.setBackground(new java.awt.Color(18, 90, 173));
        btn_usuarios.setCursor(new java.awt.Cursor(java.awt.Cursor.DEFAULT_CURSOR));
        btn_usuarios.setPreferredSize(new java.awt.Dimension(270, 51));
        btn_usuarios.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseEntered(java.awt.event.MouseEvent evt) {
                btn_usuariosMouseEntered(evt);
            }
            public void mouseExited(java.awt.event.MouseEvent evt) {
                btn_usuariosMouseExited(evt);
            }
            public void mousePressed(java.awt.event.MouseEvent evt) {
                btn_usuariosMousePressed(evt);
            }
        });
        btn_usuarios.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        lbliconusuarios.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        lbliconusuarios.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Icons/menu.registro.png"))); // NOI18N
        btn_usuarios.add(lbliconusuarios, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 10, 30, 30));

        lblusuarios.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        lblusuarios.setForeground(new java.awt.Color(255, 255, 255));
        lblusuarios.setText("Usuarios");
        btn_usuarios.add(lblusuarios, new org.netbeans.lib.awtextra.AbsoluteConstraints(50, 10, -1, 30));

        Menu.add(btn_usuarios, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 490, -1, -1));

        app_name.setFont(new java.awt.Font("Segoe UI", 1, 24)); // NOI18N
        app_name.setForeground(new java.awt.Color(255, 255, 255));
        app_name.setText("Bienvenido");
        Menu.add(app_name, new org.netbeans.lib.awtextra.AbsoluteConstraints(70, 20, -1, -1));

        line1.setPreferredSize(new java.awt.Dimension(50, 5));
        Menu.add(line1, new org.netbeans.lib.awtextra.AbsoluteConstraints(40, 60, 190, 20));

        lbliconuser.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        lbliconuser.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Icons/user.png"))); // NOI18N
        Menu.add(lbliconuser, new org.netbeans.lib.awtextra.AbsoluteConstraints(80, 80, 110, 100));

        lbladmin.setFont(new java.awt.Font("Roboto", 0, 18)); // NOI18N
        lbladmin.setForeground(new java.awt.Color(255, 255, 255));
        lbladmin.setText("admin");
        Menu.add(lbladmin, new org.netbeans.lib.awtextra.AbsoluteConstraints(110, 190, 70, -1));

        Background.add(Menu, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 270, 640));

        Title.setBackground(new java.awt.Color(255, 255, 255));
        Title.addMouseMotionListener(new java.awt.event.MouseMotionAdapter() {
            public void mouseDragged(java.awt.event.MouseEvent evt) {
                TitleMouseDragged(evt);
            }
        });
        Title.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mousePressed(java.awt.event.MouseEvent evt) {
                TitleMousePressed(evt);
            }
        });

        red_squr.setBackground(new java.awt.Color(255, 255, 255));
        red_squr.setCursor(new java.awt.Cursor(java.awt.Cursor.DEFAULT_CURSOR));
        red_squr.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseEntered(java.awt.event.MouseEvent evt) {
                red_squrMouseEntered(evt);
            }
            public void mouseExited(java.awt.event.MouseEvent evt) {
                red_squrMouseExited(evt);
            }
            public void mousePressed(java.awt.event.MouseEvent evt) {
                red_squrMousePressed(evt);
            }
        });

        exit.setFont(new java.awt.Font("Segoe UI", 0, 18)); // NOI18N
        exit.setForeground(new java.awt.Color(102, 102, 102));
        exit.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        exit.setText("X");
        exit.setCursor(new java.awt.Cursor(java.awt.Cursor.DEFAULT_CURSOR));
        exit.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseEntered(java.awt.event.MouseEvent evt) {
                exitMouseEntered(evt);
            }
            public void mouseExited(java.awt.event.MouseEvent evt) {
                exitMouseExited(evt);
            }
            public void mousePressed(java.awt.event.MouseEvent evt) {
                exitMousePressed(evt);
            }
        });

        javax.swing.GroupLayout red_squrLayout = new javax.swing.GroupLayout(red_squr);
        red_squr.setLayout(red_squrLayout);
        red_squrLayout.setHorizontalGroup(
            red_squrLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(exit, javax.swing.GroupLayout.PREFERRED_SIZE, 36, javax.swing.GroupLayout.PREFERRED_SIZE)
        );
        red_squrLayout.setVerticalGroup(
            red_squrLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(exit, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );

        javax.swing.GroupLayout TitleLayout = new javax.swing.GroupLayout(Title);
        Title.setLayout(TitleLayout);
        TitleLayout.setHorizontalGroup(
            TitleLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, TitleLayout.createSequentialGroup()
                .addGap(0, 984, Short.MAX_VALUE)
                .addComponent(red_squr, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
        );
        TitleLayout.setVerticalGroup(
            TitleLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, TitleLayout.createSequentialGroup()
                .addGap(0, 0, Short.MAX_VALUE)
                .addComponent(red_squr, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
        );

        Background.add(Title, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 1020, -1));

        slogan.setFont(new java.awt.Font("Segoe UI", 0, 14)); // NOI18N
        slogan.setText("Profe apruebenos");
        Background.add(slogan, new org.netbeans.lib.awtextra.AbsoluteConstraints(290, 50, 190, 30));

        content.setBackground(new java.awt.Color(255, 255, 255));
        content.setPreferredSize(new java.awt.Dimension(750, 640));

        Header.setBackground(new java.awt.Color(25, 118, 210));

        lbltitulo1.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        lbltitulo1.setForeground(new java.awt.Color(255, 255, 255));
        lbltitulo1.setText("Peliculas que te hacen aprobar el ciclo !!!");

        fecha.setFont(new java.awt.Font("Segoe UI", 0, 24)); // NOI18N
        fecha.setForeground(new java.awt.Color(255, 255, 255));

        javax.swing.GroupLayout HeaderLayout = new javax.swing.GroupLayout(Header);
        Header.setLayout(HeaderLayout);
        HeaderLayout.setHorizontalGroup(
            HeaderLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(HeaderLayout.createSequentialGroup()
                .addGap(65, 65, 65)
                .addGroup(HeaderLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(fecha, javax.swing.GroupLayout.PREFERRED_SIZE, 538, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(lbltitulo1))
                .addContainerGap(147, Short.MAX_VALUE))
        );
        HeaderLayout.setVerticalGroup(
            HeaderLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(HeaderLayout.createSequentialGroup()
                .addContainerGap(39, Short.MAX_VALUE)
                .addComponent(lbltitulo1, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addComponent(fecha, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(33, 33, 33))
        );

        javax.swing.GroupLayout contentLayout = new javax.swing.GroupLayout(content);
        content.setLayout(contentLayout);
        contentLayout.setHorizontalGroup(
            contentLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(Header, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
        );
        contentLayout.setVerticalGroup(
            contentLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(contentLayout.createSequentialGroup()
                .addGap(89, 89, 89)
                .addComponent(Header, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
        );

        Background.add(content, new org.netbeans.lib.awtextra.AbsoluteConstraints(270, 0, 750, 640));

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(Background, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(Background, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );

        pack();
        setLocationRelativeTo(null);
    }// </editor-fold>//GEN-END:initComponents

    private void formWindowActivated(java.awt.event.WindowEvent evt) {//GEN-FIRST:event_formWindowActivated
        // TODO add your handling code here:
    }//GEN-LAST:event_formWindowActivated

    private void TitleMouseDragged(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_TitleMouseDragged
        int x = evt.getXOnScreen();
        int y = evt.getYOnScreen();
        this.setLocation(x-xMouse,y-yMouse);
    }//GEN-LAST:event_TitleMouseDragged

    private void TitleMousePressed(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_TitleMousePressed
        xMouse = evt.getX();
        yMouse = evt.getY();
    }//GEN-LAST:event_TitleMousePressed

    private void btn_prinMousePressed(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_btn_prinMousePressed
        setColor(btn_prin);
        resetColor(btn_peliculas);
        resetColor(btn_cartelera);
        resetColor(btn_función);
        resetColor(btn_clientes);
        resetColor(btn_usuarios);
        
        DAOcinemaImpl Daocinema = new DAOcinemaImpl();
        Principal p1 = new Principal();
        Daocinema.ShowPanel(p1);
    }//GEN-LAST:event_btn_prinMousePressed

    private void btn_peliculasMousePressed(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_btn_peliculasMousePressed
        resetColor(btn_prin);
        setColor(btn_peliculas);
        resetColor(btn_cartelera);
        resetColor(btn_función);
        resetColor(btn_clientes);
        resetColor(btn_usuarios);
        
        DAOcinemaImpl Daocinema = new DAOcinemaImpl();
        Peliculas p2 = new Peliculas();
        Daocinema.ShowPanel(p2);
    }//GEN-LAST:event_btn_peliculasMousePressed

    private void btn_carteleraMousePressed(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_btn_carteleraMousePressed
        resetColor(btn_prin);
        resetColor(btn_peliculas);
        setColor(btn_cartelera);
        resetColor(btn_función);
        resetColor(btn_clientes);
        resetColor(btn_usuarios);
        
        DAOcinemaImpl Daocinema = new DAOcinemaImpl();
        Cartelera p3 = new Cartelera();
        Daocinema.ShowPanel(p3);
    }//GEN-LAST:event_btn_carteleraMousePressed

    private void btn_funciónMousePressed(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_btn_funciónMousePressed
        resetColor(btn_prin);
        resetColor(btn_peliculas);
        resetColor(btn_cartelera);
        setColor(btn_función);
        resetColor(btn_clientes);
        resetColor(btn_usuarios);
        
        DAOcinemaImpl Daocinema = new DAOcinemaImpl();
        Función p4 = new Función();
        Daocinema.ShowPanel(p4);
    }//GEN-LAST:event_btn_funciónMousePressed

    private void btn_clientesMousePressed(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_btn_clientesMousePressed
        resetColor(btn_prin);
        resetColor(btn_peliculas);
        resetColor(btn_cartelera);
        resetColor(btn_función);
        setColor(btn_clientes);
        resetColor(btn_usuarios);

        DAOcinemaImpl Daocinema = new DAOcinemaImpl();
        Clientes p5 = new Clientes();
        Daocinema.ShowPanel(p5);
    }//GEN-LAST:event_btn_clientesMousePressed

    private void btn_usuariosMousePressed(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_btn_usuariosMousePressed
        try {
            resetColor(btn_prin);
            resetColor(btn_peliculas);
            resetColor(btn_cartelera);
            resetColor(btn_función);
            resetColor(btn_clientes);
            setColor(btn_usuarios);
            
            DAOcinemaImpl Daocinema = new DAOcinemaImpl();
            Usuarios p5 = new Usuarios();
            Daocinema.ShowPanel(p5);
        } catch (Exception ex) {
            Logger.getLogger(Main.class.getName()).log(Level.SEVERE, null, ex);
        }
    }//GEN-LAST:event_btn_usuariosMousePressed

    private void btn_peliculasMouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_btn_peliculasMouseEntered
        if(btn_peliculas.getBackground().getRGB() == -15574355)
            setColor(btn_peliculas);
    }//GEN-LAST:event_btn_peliculasMouseEntered

    private void btn_peliculasMouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_btn_peliculasMouseExited
        if(btn_prin.getBackground().getRGB() != -15574355 || btn_cartelera.getBackground().getRGB() != -15574355
            || btn_función.getBackground().getRGB() != -15574355 || btn_clientes.getBackground().getRGB() != -15574355 || btn_usuarios.getBackground().getRGB() != -15574355)
            resetColor(btn_peliculas);
    }//GEN-LAST:event_btn_peliculasMouseExited

    private void btn_prinMouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_btn_prinMouseEntered
        if(btn_prin.getBackground().getRGB() == -15574355)
            setColor(btn_prin);
    }//GEN-LAST:event_btn_prinMouseEntered

    private void btn_prinMouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_btn_prinMouseExited
        if(btn_peliculas.getBackground().getRGB() != -15574355 || btn_cartelera.getBackground().getRGB() != -15574355
            || btn_función.getBackground().getRGB() != -15574355 || btn_clientes.getBackground().getRGB() != -15574355 || btn_usuarios.getBackground().getRGB() != -15574355)
            resetColor(btn_prin);
    }//GEN-LAST:event_btn_prinMouseExited

    private void btn_carteleraMouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_btn_carteleraMouseEntered
        if(btn_cartelera.getBackground().getRGB() == -15574355)
            setColor(btn_cartelera);
    }//GEN-LAST:event_btn_carteleraMouseEntered

    private void btn_carteleraMouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_btn_carteleraMouseExited
        if(btn_peliculas.getBackground().getRGB() != -15574355 || btn_prin.getBackground().getRGB() != -15574355
            || btn_función.getBackground().getRGB() != -15574355 || btn_clientes.getBackground().getRGB() != -15574355 || btn_usuarios.getBackground().getRGB() != -15574355)
            resetColor(btn_cartelera);
    }//GEN-LAST:event_btn_carteleraMouseExited

    private void btn_funciónMouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_btn_funciónMouseEntered
        if(btn_función.getBackground().getRGB() == -15574355)
            setColor(btn_función);
    }//GEN-LAST:event_btn_funciónMouseEntered

    private void btn_funciónMouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_btn_funciónMouseExited
        if(btn_peliculas.getBackground().getRGB() != -15574355 || btn_prin.getBackground().getRGB() != -15574355
            || btn_cartelera.getBackground().getRGB() != -15574355 || btn_clientes.getBackground().getRGB() != -15574355 || btn_usuarios.getBackground().getRGB() != -15574355)
            resetColor(btn_función);
    }//GEN-LAST:event_btn_funciónMouseExited

    private void btn_clientesMouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_btn_clientesMouseEntered
        if(btn_clientes.getBackground().getRGB() == -15574355)
            setColor(btn_clientes);
    }//GEN-LAST:event_btn_clientesMouseEntered

    private void btn_clientesMouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_btn_clientesMouseExited
        if(btn_peliculas.getBackground().getRGB() != -15574355 || btn_prin.getBackground().getRGB() != -15574355
            || btn_cartelera.getBackground().getRGB() != -15574355 || btn_función.getBackground().getRGB() != -15574355 || btn_usuarios.getBackground().getRGB() != -15574355)
            resetColor(btn_clientes);
    }//GEN-LAST:event_btn_clientesMouseExited

    private void btn_usuariosMouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_btn_usuariosMouseEntered
        if(btn_usuarios.getBackground().getRGB() == -15574355)
            setColor(btn_usuarios);
    }//GEN-LAST:event_btn_usuariosMouseEntered

    private void btn_usuariosMouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_btn_usuariosMouseExited
        if(btn_peliculas.getBackground().getRGB() != -15574355 || btn_prin.getBackground().getRGB() != -15574355
            || btn_cartelera.getBackground().getRGB() != -15574355 || btn_función.getBackground().getRGB() != -15574355 || btn_clientes.getBackground().getRGB() != -15574355)
            resetColor(btn_usuarios);
    }//GEN-LAST:event_btn_usuariosMouseExited

    private void exitMouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_exitMouseEntered
        red_squr.setBackground(new Color(204,0,0));
        exit.setForeground(Color.white);
    }//GEN-LAST:event_exitMouseEntered

    private void exitMouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_exitMouseExited
        red_squr.setBackground(new Color(255,255,255));
        exit.setForeground(new Color(102,102,102));
    }//GEN-LAST:event_exitMouseExited

    private void exitMousePressed(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_exitMousePressed
        System.exit(0);
    }//GEN-LAST:event_exitMousePressed

    private void red_squrMouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_red_squrMouseEntered
        red_squr.setBackground(new Color(204,0,0));
        exit.setForeground(Color.white);
    }//GEN-LAST:event_red_squrMouseEntered

    private void red_squrMouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_red_squrMouseExited
        red_squr.setBackground(new Color(255,255,255));
        exit.setForeground(new Color(102,102,102));
    }//GEN-LAST:event_red_squrMouseExited

    private void red_squrMousePressed(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_red_squrMousePressed
        System.exit(0);
    }//GEN-LAST:event_red_squrMousePressed

    void setColor(JPanel panel){
        panel.setBackground(new Color(21,101,192));
    }
    void resetColor(JPanel panel){
        panel.setBackground(new Color(18,90,173));
    }
    public static void main(String args[]) {
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
            java.util.logging.Logger.getLogger(Main.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(Main.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(Main.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(Main.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new Main().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JPanel Background;
    private javax.swing.JPanel Header;
    private javax.swing.JPanel Menu;
    private javax.swing.JPanel Title;
    private javax.swing.JLabel app_name;
    private javax.swing.JPanel btn_cartelera;
    private javax.swing.JPanel btn_clientes;
    private javax.swing.JPanel btn_función;
    private javax.swing.JPanel btn_peliculas;
    private javax.swing.JPanel btn_prin;
    private javax.swing.JPanel btn_usuarios;
    public static javax.swing.JPanel content;
    private javax.swing.JLabel exit;
    private javax.swing.JLabel fecha;
    private javax.swing.JLabel lbladmin;
    private javax.swing.JLabel lblcartelera;
    private javax.swing.JLabel lblclientes;
    private javax.swing.JLabel lblfuncion;
    private javax.swing.JLabel lbliconcartelera;
    private javax.swing.JLabel lbliconclientes;
    private javax.swing.JLabel lbliconfuncion;
    private javax.swing.JLabel lbliconpeliculas;
    private javax.swing.JLabel lbliconprincipal;
    private javax.swing.JLabel lbliconuser;
    private javax.swing.JLabel lbliconusuarios;
    private javax.swing.JLabel lblpeliculas;
    private javax.swing.JLabel lblprincipal;
    private javax.swing.JLabel lbltitulo1;
    private javax.swing.JLabel lblusuarios;
    private javax.swing.JSeparator line1;
    private javax.swing.JPanel red_squr;
    private javax.swing.JLabel slogan;
    // End of variables declaration//GEN-END:variables
}
