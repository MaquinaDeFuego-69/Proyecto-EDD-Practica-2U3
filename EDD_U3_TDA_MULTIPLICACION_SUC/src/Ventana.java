
import java.awt.event.KeyEvent;


/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author Erick
 */
public class Ventana extends javax.swing.JFrame {

    /**
     * Creates new form Ventana
     */
    public Ventana() {
        initComponents();
        this. setLocationRelativeTo(null); 
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jLabel1 = new javax.swing.JLabel();
        xTxt = new javax.swing.JTextField();
        jLabel2 = new javax.swing.JLabel();
        yTxt = new javax.swing.JTextField();
        CalcularBtn = new javax.swing.JButton();
        resultadoTxt = new javax.swing.JTextField();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        getContentPane().setLayout(new java.awt.GridLayout(3, 2));

        jLabel1.setText("X:");
        getContentPane().add(jLabel1);
        getContentPane().add(xTxt);

        jLabel2.setText("Y:");
        getContentPane().add(jLabel2);

        yTxt.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyPressed(java.awt.event.KeyEvent evt) {
                yTxtKeyPressed(evt);
            }
        });
        getContentPane().add(yTxt);

        CalcularBtn.setText("Calcular");
        CalcularBtn.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                CalcularBtnActionPerformed(evt);
            }
        });
        getContentPane().add(CalcularBtn);
        getContentPane().add(resultadoTxt);

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void CalcularBtnActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_CalcularBtnActionPerformed
      int r =  Proceso.Proceso(Integer.parseInt(xTxt.getText()), Integer.parseInt(yTxt.getText()));
      resultadoTxt.setText(Integer.toString(r));
    }//GEN-LAST:event_CalcularBtnActionPerformed

    private void yTxtKeyPressed(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_yTxtKeyPressed
        if(evt.getKeyCode() == KeyEvent.VK_ENTER){
             int r =  Proceso.Proceso(Integer.parseInt(xTxt.getText()), Integer.parseInt(yTxt.getText()));
             resultadoTxt.setText(Integer.toString(r));
        }
    }//GEN-LAST:event_yTxtKeyPressed

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
            java.util.logging.Logger.getLogger(Ventana.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(Ventana.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(Ventana.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(Ventana.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new Ventana().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton CalcularBtn;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JTextField resultadoTxt;
    private javax.swing.JTextField xTxt;
    private javax.swing.JTextField yTxt;
    // End of variables declaration//GEN-END:variables
}
