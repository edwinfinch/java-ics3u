/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
/**
 *
 * @author edwinfinch
 */
public class StatsWindow extends javax.swing.JFrame {

    /**
     * Creates new form StatsWindow
     */
    public StatsWindow() {
        initComponents();
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        titleLabel = new javax.swing.JLabel();
        winsLabel = new javax.swing.JLabel();
        lossesLabel = new javax.swing.JLabel();
        blacksLabel = new javax.swing.JLabel();
        whitesLabel = new javax.swing.JLabel();
        guessesLabel = new javax.swing.JLabel();
        winsValue = new javax.swing.JLabel();
        lossesValue = new javax.swing.JLabel();
        blacksValue = new javax.swing.JLabel();
        whitesValue = new javax.swing.JLabel();
        guessesValue = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.DISPOSE_ON_CLOSE);
        setResizable(false);

        titleLabel.setFont(new java.awt.Font("Shree Devanagari 714", 0, 36)); // NOI18N
        titleLabel.setText("MasterMind Stats");

        winsLabel.setFont(new java.awt.Font("Shree Devanagari 714", 0, 14)); // NOI18N
        winsLabel.setText("Wins");

        lossesLabel.setFont(new java.awt.Font("Shree Devanagari 714", 0, 14)); // NOI18N
        lossesLabel.setText("Losses");

        blacksLabel.setFont(new java.awt.Font("Shree Devanagari 714", 0, 14)); // NOI18N
        blacksLabel.setText("Total Blacks");

        whitesLabel.setFont(new java.awt.Font("Shree Devanagari 714", 0, 14)); // NOI18N
        whitesLabel.setText("Total Whites");

        guessesLabel.setFont(new java.awt.Font("Shree Devanagari 714", 0, 14)); // NOI18N
        guessesLabel.setText("Total Guesses");

        winsValue.setFont(new java.awt.Font("Shree Devanagari 714", 0, 24)); // NOI18N
        winsValue.setText("0");

        lossesValue.setFont(new java.awt.Font("Shree Devanagari 714", 0, 24)); // NOI18N
        lossesValue.setText("0");

        blacksValue.setFont(new java.awt.Font("Shree Devanagari 714", 0, 24)); // NOI18N
        blacksValue.setText("1");

        whitesValue.setFont(new java.awt.Font("Shree Devanagari 714", 0, 24)); // NOI18N
        whitesValue.setText("0");

        guessesValue.setFont(new java.awt.Font("Shree Devanagari 714", 0, 24)); // NOI18N
        guessesValue.setText("0");

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(layout.createSequentialGroup()
                                .addComponent(winsValue, javax.swing.GroupLayout.PREFERRED_SIZE, 118, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(46, 46, 46)
                                .addComponent(lossesValue, javax.swing.GroupLayout.PREFERRED_SIZE, 142, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addGroup(layout.createSequentialGroup()
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(winsLabel)
                                    .addComponent(whitesLabel))
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addGroup(layout.createSequentialGroup()
                                        .addGap(87, 87, 87)
                                        .addComponent(lossesLabel))
                                    .addGroup(layout.createSequentialGroup()
                                        .addGap(82, 82, 82)
                                        .addComponent(guessesLabel))))
                            .addComponent(titleLabel))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(layout.createSequentialGroup()
                                .addComponent(blacksLabel)
                                .addGap(0, 59, Short.MAX_VALUE))
                            .addComponent(blacksValue, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                        .addContainerGap())
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(whitesValue, javax.swing.GroupLayout.PREFERRED_SIZE, 141, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(18, 18, 18)
                        .addComponent(guessesValue, javax.swing.GroupLayout.PREFERRED_SIZE, 129, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(0, 0, Short.MAX_VALUE))))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(titleLabel)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(winsLabel)
                    .addComponent(lossesLabel)
                    .addComponent(blacksLabel))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addComponent(blacksValue, javax.swing.GroupLayout.DEFAULT_SIZE, 86, Short.MAX_VALUE)
                    .addComponent(winsValue, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(lossesValue, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(whitesLabel)
                    .addComponent(guessesLabel))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(whitesValue, javax.swing.GroupLayout.DEFAULT_SIZE, 126, Short.MAX_VALUE)
                    .addComponent(guessesValue, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                .addContainerGap())
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

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
            java.util.logging.Logger.getLogger(StatsWindow.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(StatsWindow.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(StatsWindow.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(StatsWindow.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new StatsWindow().setVisible(true);
            }
        });
    }
    
    Stats statistics = new Stats();
    
    private void refreshElements(){
        whitesValue.setText("" + statistics.totalWhite);
        blacksValue.setText("" + statistics.totalBlack);
        lossesValue.setText("" + statistics.totalLoses);
        winsValue.setText("" + statistics.totalWins);
        guessesValue.setText("" + statistics.totalGuesses); 
    }
    
    public void setStats(Stats stats){
        statistics = stats;
        refreshElements();
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JLabel blacksLabel;
    private javax.swing.JLabel blacksValue;
    private javax.swing.JLabel guessesLabel;
    private javax.swing.JLabel guessesValue;
    private javax.swing.JLabel lossesLabel;
    private javax.swing.JLabel lossesValue;
    private javax.swing.JLabel titleLabel;
    private javax.swing.JLabel whitesLabel;
    private javax.swing.JLabel whitesValue;
    private javax.swing.JLabel winsLabel;
    private javax.swing.JLabel winsValue;
    // End of variables declaration//GEN-END:variables
}