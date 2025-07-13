/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/GUIForms/JFrame.java to edit this template
 */
package vista;

/**
 *
 * @author leona
 */
public class Inicio extends javax.swing.JFrame {

    /**
     * Creates new form Inicio
     */
    public Inicio() {
        initComponents();
        this.setLocationRelativeTo(null); 
        iniciarCarga();
        
        
    }
    private void iniciarCarga() {
    
    timer = new javax.swing.Timer(40, new java.awt.event.ActionListener() {
        private int progreso = 0;

        @Override
        public void actionPerformed(java.awt.event.ActionEvent e) {
            progreso++;
            barraProgreso.setValue(progreso);
            LoadingProgreso.setText(progreso + "%");

            if (progreso == 20) {
                LoadingLavel.setText("Cargando...");
            }
            if (progreso == 50) {
                LoadingLavel.setText("Cargando...");
            }
            if (progreso == 80) {
                LoadingLavel.setText("Casi listo...");
            }

            if (progreso >= 100) {
                timer.stop();
               
                 Login login = new Login();
                 login.setVisible(true);
                 login.setLocationRelativeTo(null);
         
                Inicio.this.dispose();
            }
        }
    });

    timer.start(); 
}

    
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        BackGroundPanel = new GradientPanel();
        bannerLabel = new javax.swing.JLabel();
        mensajeLabel = new javax.swing.JLabel();
        LoadingProgreso = new javax.swing.JLabel();
        LoadingLavel = new javax.swing.JLabel();
        barraProgreso = new javax.swing.JProgressBar();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        BackGroundPanel.setBackground(new java.awt.Color(25, 45, 70));
        BackGroundPanel.setPreferredSize(new java.awt.Dimension(550, 650));
        BackGroundPanel.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        bannerLabel.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        bannerLabel.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Imagenes/logo-cine.png"))); // NOI18N
        BackGroundPanel.add(bannerLabel, new org.netbeans.lib.awtextra.AbsoluteConstraints(75, 108, -1, -1));

        mensajeLabel.setFont(new java.awt.Font("Georgia", 1, 24)); // NOI18N
        mensajeLabel.setForeground(new java.awt.Color(245, 240, 220));
        mensajeLabel.setHorizontalAlignment(javax.swing.SwingConstants.RIGHT);
        mensajeLabel.setText("Bienvenidos");
        BackGroundPanel.add(mensajeLabel, new org.netbeans.lib.awtextra.AbsoluteConstraints(198, 463, -1, -1));

        LoadingProgreso.setFont(new java.awt.Font("Segoe UI", 0, 14)); // NOI18N
        LoadingProgreso.setText("0%");
        BackGroundPanel.add(LoadingProgreso, new org.netbeans.lib.awtextra.AbsoluteConstraints(520, 560, -1, -1));

        LoadingLavel.setFont(new java.awt.Font("Segoe UI", 0, 14)); // NOI18N
        LoadingLavel.setText("Loading...");
        BackGroundPanel.add(LoadingLavel, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 560, -1, -1));
        BackGroundPanel.add(barraProgreso, new org.netbeans.lib.awtextra.AbsoluteConstraints(-4, 590, 560, -1));

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(BackGroundPanel, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(BackGroundPanel, javax.swing.GroupLayout.DEFAULT_SIZE, 602, Short.MAX_VALUE)
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JPanel BackGroundPanel;
    private javax.swing.JLabel LoadingLavel;
    private javax.swing.JLabel LoadingProgreso;
    private javax.swing.JLabel bannerLabel;
    private javax.swing.JProgressBar barraProgreso;
    private javax.swing.JLabel mensajeLabel;
    // End of variables declaration//GEN-END:variables
    private javax.swing.Timer timer;
}
