package mojbackup;

import java.awt.Toolkit;
import java.io.File;
import java.io.IOException;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.swing.JFileChooser;
import org.apache.commons.io.*;

/**
 *
 * @author Michał
 */
public class Window extends javax.swing.JFrame 
{

    public Window() 
    {
        initComponents();
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jFileChooser1 = new javax.swing.JFileChooser();
        jPanel1 = new javax.swing.JPanel();
        jLabelBackUp = new javax.swing.JLabel();
        jButtonToLocation = new javax.swing.JButton();
        jButtonDoIt = new javax.swing.JButton();
        jScrollPane1 = new javax.swing.JScrollPane();
        jTextAreaOutputSource = new javax.swing.JTextArea();
        jLabelCurrentSource = new javax.swing.JLabel();
        jButtonAbort = new javax.swing.JButton();
        jButtonExit = new javax.swing.JButton();
        jProgressBar1 = new javax.swing.JProgressBar(0, 100);

        jFileChooser1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jFileChooser1ActionPerformed(evt);
            }
        });

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setTitle("BackUp");
        setLocationByPlatform(true);
        setResizable(false);

        jLabelBackUp.setFont(new java.awt.Font("Tahoma", 1, 18)); // NOI18N
        jLabelBackUp.setText("BackUp");

        jButtonToLocation.setText("To location");
        jButtonToLocation.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButtonToLocationActionPerformed(evt);
            }
        });

        jButtonDoIt.setText("Do it!");
        jButtonDoIt.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButtonDoItActionPerformed(evt);
            }
        });

        jTextAreaOutputSource.setColumns(20);
        jTextAreaOutputSource.setFont(new java.awt.Font("Times New Roman", 0, 18)); // NOI18N
        jTextAreaOutputSource.setRows(5);
        jScrollPane1.setViewportView(jTextAreaOutputSource);

        jLabelCurrentSource.setFont(new java.awt.Font("Tahoma", 0, 18)); // NOI18N
        jLabelCurrentSource.setText("Current source:");

        jButtonAbort.setText("Abort");
        jButtonAbort.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButtonAbortActionPerformed(evt);
            }
        });

        jButtonExit.setText("Exit");
        jButtonExit.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButtonExitActionPerformed(evt);
            }
        });

        jProgressBar1.setStringPainted(true);

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addComponent(jLabelBackUp)
                        .addGap(0, 0, Short.MAX_VALUE))
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
                        .addContainerGap()
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                            .addComponent(jScrollPane1, javax.swing.GroupLayout.DEFAULT_SIZE, 507, Short.MAX_VALUE)
                            .addComponent(jProgressBar1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 25, Short.MAX_VALUE)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                            .addComponent(jButtonExit, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(jButtonToLocation, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(jButtonDoIt, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(jButtonAbort, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))))
                .addContainerGap())
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jLabelCurrentSource)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addComponent(jLabelBackUp)
                .addGap(18, 18, 18)
                .addComponent(jLabelCurrentSource)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addComponent(jButtonToLocation)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(jButtonDoIt)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(jButtonAbort))
                    .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 127, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addComponent(jButtonExit, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(jProgressBar1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void jButtonExitActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButtonExitActionPerformed
       System.exit(0);
    }//GEN-LAST:event_jButtonExitActionPerformed

    private void jButtonDoItActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButtonDoItActionPerformed
        try 
        {
            if (directoryTo == null)
                {
                    System.out.println("You have to set location!\n");
                    jTextAreaOutputSource.setText("You have to set location!\n");
                }
            else
                {
                     copyFileFromTo();
                }
        } 
        catch (IOException ex)
        {
            Logger.getLogger(Window.class.getName()).log(Level.SEVERE, null, ex);
        }
    }//GEN-LAST:event_jButtonDoItActionPerformed

    private void jFileChooser1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jFileChooser1ActionPerformed
      
    }//GEN-LAST:event_jFileChooser1ActionPerformed

    private void jButtonToLocationActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButtonToLocationActionPerformed
        saveTo();
        System.out.println("Location to " + directoryTo);
        jTextAreaOutputSource.setText(jTextAreaOutputSource.getText() + "Location to " + directoryTo + "\n");
    }//GEN-LAST:event_jButtonToLocationActionPerformed

    private void jButtonAbortActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButtonAbortActionPerformed
     Thread.interrupted();
     System.out.println("ABORT BY USER");
     jTextAreaOutputSource.setText((jTextAreaOutputSource.getText()) + "ABORT BY USER");
    }//GEN-LAST:event_jButtonAbortActionPerformed

    public void copyFileFromTo() throws IOException
    {
        String [] pathDirectoryFrom =   {
                                        "C:\\Users\\Michał\\Desktop\\A\\Example",
                                        "C:\\Users\\Michał\\Desktop\\A\\Example2",
                                        "C:\\Users\\Michał\\Desktop\\A\\Example3",
                                        "C:\\Users\\Michał\\Desktop\\A\\Example4",
                                        "C:\\Users\\Michał\\Desktop\\A\\Example5",
                                        "C:\\Users\\Michał\\Desktop\\A\\Example6",
        }; 
        
        File [] locationFrom = new File[pathDirectoryFrom.length];
                    
        for (int i = 0; i < pathDirectoryFrom.length; i++) 
            {
                locationFrom[i] = (new File(pathDirectoryFrom[i]));
            }
              
        File locationTo = (new File(directoryTo));
  
        Thread worker = new Thread()
         {
            @Override
            public void run()
            {
               int progress = 0; 
               int temp = 0;
                for (int i = 0; i < pathDirectoryFrom.length; i++) 
                {
                    try 
                    {
                        progress = 100 / pathDirectoryFrom.length;
                        FileUtils.copyDirectoryToDirectory(locationFrom[i], locationTo);
                        System.out.println((i+1 + ". ") + pathDirectoryFrom[i]);
                        jTextAreaOutputSource.setText(jTextAreaOutputSource.getText() + (i+1 + ". ") + pathDirectoryFrom[i] + "\n");
                        jProgressBar1.setValue(temp += progress);
                    } 
                    catch (IOException ex) 
                    {
                        Logger.getLogger(Window.class.getName()).log(Level.SEVERE, null, ex);
                        continue;
                    }
                }
                jProgressBar1.setValue(100);
                Toolkit.getDefaultToolkit().beep();
                new DoneWindow().setVisible(rootPaneCheckingEnabled); 
            }
         };
         
        worker.start();
    }
        
    public File saveTo()
    {
        userSelection = jFileChooser1.showSaveDialog(jPanel1);
        if (userSelection == JFileChooser.APPROVE_OPTION)
        {
            pathFileTo = jFileChooser1.getSelectedFile();
            directoryTo = pathFileTo.getAbsolutePath();
        }
     
        return pathFileTo;
    }
    
    
    public static void main(String args[]) 
    {
        /* Set the Nimbus look and feel */
        //<editor-fold defaultstate="collapsed" desc=" Look and feel setting code (optional) ">
        /* If Nimbus (introduced in Java SE 6) is not available, stay with the default look and feel.
         * For details see http://download.oracle.com/javase/tutorial/uiswing/lookandfeel/plaf.html 
         */

        try 
        {
            for (javax.swing.UIManager.LookAndFeelInfo info : javax.swing.UIManager.getInstalledLookAndFeels()) { 
                if ("Nimbus".equals(info.getName())) { 
                    javax.swing.UIManager.setLookAndFeel(info.getClassName());
                    break;
                }
            }
        } 
        
        catch (ClassNotFoundException ex) {
            java.util.logging.Logger.getLogger(Window.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(Window.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(Window.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(Window.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        
        //</editor-fold>
     
        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable()
        {
            public void run()
            {
                new Window().setVisible(true);
            }
        });
    }
    
    
    

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton jButtonAbort;
    private javax.swing.JButton jButtonDoIt;
    private javax.swing.JButton jButtonExit;
    private javax.swing.JButton jButtonToLocation;
    private javax.swing.JFileChooser jFileChooser1;
    private javax.swing.JLabel jLabelBackUp;
    private javax.swing.JLabel jLabelCurrentSource;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JProgressBar jProgressBar1;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JTextArea jTextAreaOutputSource;
    // End of variables declaration//GEN-END:variables
    File pathFileTo = null;
    String directoryTo = null;
    int userSelection;
    
}