/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package myswingapp;

import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.SQLException;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.swing.JOptionPane;

/**
 *
 * @author hp
 */
public class coursenotes extends javax.swing.JFrame
{

    /**
     * Creates new form coursenotes
     */
    public coursenotes()
    {
        initComponents();
        addWindowListener(new WindowClose(new ad2()));
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents()
    {

        jButton3 = new javax.swing.JButton();
        jPanel1 = new javax.swing.JPanel();
        jLabel1 = new javax.swing.JLabel();
        btnjava = new javax.swing.JButton();
        btnpython = new javax.swing.JButton();
        btnc = new javax.swing.JButton();
        jLabel2 = new javax.swing.JLabel();
        txtpath = new javax.swing.JTextField();

        jButton3.setText("jButton3");

        setDefaultCloseOperation(javax.swing.WindowConstants.DO_NOTHING_ON_CLOSE);

        jPanel1.setBackground(new java.awt.Color(251, 241, 227));

        jLabel1.setFont(new java.awt.Font("Tahoma", 1, 18)); // NOI18N
        jLabel1.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel1.setText("Click on course to add notes");

        btnjava.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        btnjava.setForeground(new java.awt.Color(255, 0, 0));
        btnjava.setText("JAVA");
        btnjava.addActionListener(new java.awt.event.ActionListener()
        {
            public void actionPerformed(java.awt.event.ActionEvent evt)
            {
                btnjavaActionPerformed(evt);
            }
        });

        btnpython.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        btnpython.setForeground(new java.awt.Color(255, 0, 0));
        btnpython.setText("Python");
        btnpython.addActionListener(new java.awt.event.ActionListener()
        {
            public void actionPerformed(java.awt.event.ActionEvent evt)
            {
                btnpythonActionPerformed(evt);
            }
        });

        btnc.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        btnc.setForeground(new java.awt.Color(255, 0, 0));
        btnc.setText("C");
        btnc.addActionListener(new java.awt.event.ActionListener()
        {
            public void actionPerformed(java.awt.event.ActionEvent evt)
            {
                btncActionPerformed(evt);
            }
        });

        jLabel2.setFont(new java.awt.Font("Tahoma", 1, 18)); // NOI18N
        jLabel2.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel2.setText("Paste the path of file here:");

        txtpath.setFont(new java.awt.Font("Tahoma", 0, 18)); // NOI18N
        txtpath.addActionListener(new java.awt.event.ActionListener()
        {
            public void actionPerformed(java.awt.event.ActionEvent evt)
            {
                txtpathActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGap(179, 179, 179)
                .addComponent(btnc)
                .addGap(0, 0, Short.MAX_VALUE))
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
                .addContainerGap(32, Short.MAX_VALUE)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(btnpython)
                            .addComponent(btnjava, javax.swing.GroupLayout.PREFERRED_SIZE, 79, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(158, 158, 158))
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
                        .addComponent(jLabel1, javax.swing.GroupLayout.PREFERRED_SIZE, 290, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(46, 46, 46))
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
                        .addComponent(txtpath, javax.swing.GroupLayout.PREFERRED_SIZE, 337, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(31, 31, 31))
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
                        .addComponent(jLabel2, javax.swing.GroupLayout.PREFERRED_SIZE, 290, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(52, 52, 52))))
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jLabel2, javax.swing.GroupLayout.PREFERRED_SIZE, 33, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addComponent(txtpath, javax.swing.GroupLayout.DEFAULT_SIZE, 34, Short.MAX_VALUE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(jLabel1, javax.swing.GroupLayout.PREFERRED_SIZE, 49, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(btnjava, javax.swing.GroupLayout.PREFERRED_SIZE, 35, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addComponent(btnpython, javax.swing.GroupLayout.PREFERRED_SIZE, 33, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addComponent(btnc, javax.swing.GroupLayout.PREFERRED_SIZE, 33, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap())
        );

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(0, 0, Short.MAX_VALUE))
        );

        pack();
        setLocationRelativeTo(null);
    }// </editor-fold>//GEN-END:initComponents

    private void btnjavaActionPerformed(java.awt.event.ActionEvent evt)//GEN-FIRST:event_btnjavaActionPerformed
    {//GEN-HEADEREND:event_btnjavaActionPerformed
        // TODO add your handling code here:
        try
        {
            Connection con=DriverManager.getConnection("jdbc:mysql://localhost:3306/student","root","root");
            PreparedStatement st=con.prepareStatement("insert into javanotes(textfile1,path1) values(?,?)");
            String p=txtpath.getText();
            File f=new File(p);
            try
            {
                FileReader fr=new FileReader(f);
                st.setInt(1,101);
                st.setCharacterStream(1,fr,(int)f.length());
                st.setNString(2,p);
                int i=st.executeUpdate();
                //System.out.println(i+"records affected");
                JOptionPane.showMessageDialog(null,"insert successful");
            } catch (FileNotFoundException ex)
            {
                Logger.getLogger(ad2.class.getName()).log(Level.SEVERE, null, ex);
            }
            
            
            
            
        } catch (SQLException ex)
        {
            Logger.getLogger(ad2.class.getName()).log(Level.SEVERE, null, ex);
        }
    }//GEN-LAST:event_btnjavaActionPerformed

    private void txtpathActionPerformed(java.awt.event.ActionEvent evt)//GEN-FIRST:event_txtpathActionPerformed
    {//GEN-HEADEREND:event_txtpathActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_txtpathActionPerformed

    private void btnpythonActionPerformed(java.awt.event.ActionEvent evt)//GEN-FIRST:event_btnpythonActionPerformed
    {//GEN-HEADEREND:event_btnpythonActionPerformed
        // TODO add your handling code here:
        try
        {
            Connection con=DriverManager.getConnection("jdbc:mysql://localhost:3306/student","root","root");
            PreparedStatement st=con.prepareStatement("insert into pythonnotes(textfile2,path2) values(?,?)");
            String p=txtpath.getText();
            File f=new File(p);
            try
            {
                FileReader fr=new FileReader(f);
                st.setInt(1,101);
                st.setCharacterStream(1,fr,(int)f.length());
                st.setNString(2,p);
                int i=st.executeUpdate();
                //System.out.println(i+"records affected");
                JOptionPane.showMessageDialog(null,"insert successful");
            } catch (FileNotFoundException ex)
            {
                Logger.getLogger(ad2.class.getName()).log(Level.SEVERE, null, ex);
            }
            
            
            
            
        } catch (SQLException ex)
        {
            Logger.getLogger(ad2.class.getName()).log(Level.SEVERE, null, ex);
        }
    }//GEN-LAST:event_btnpythonActionPerformed

    private void btncActionPerformed(java.awt.event.ActionEvent evt)//GEN-FIRST:event_btncActionPerformed
    {//GEN-HEADEREND:event_btncActionPerformed
        // TODO add your handling code here:
        try
        {
            Connection con=DriverManager.getConnection("jdbc:mysql://localhost:3306/student","root","root");
            PreparedStatement st=con.prepareStatement("insert into cnotes(textfile3,path3) values(?,?)");
            String p=txtpath.getText();
            File f=new File(p);
            try
            {
                FileReader fr=new FileReader(f);
                st.setInt(1,101);
                st.setCharacterStream(1,fr,(int)f.length());
                st.setNString(2,p);
                int i=st.executeUpdate();
                //System.out.println(i+"records affected");
                JOptionPane.showMessageDialog(null,"insert successful");
            } catch (FileNotFoundException ex)
            {
                Logger.getLogger(ad2.class.getName()).log(Level.SEVERE, null, ex);
            }
            
            
            
            
        } catch (SQLException ex)
        {
            Logger.getLogger(ad2.class.getName()).log(Level.SEVERE, null, ex);
        }
    }//GEN-LAST:event_btncActionPerformed

    /**
     * @param args the command line arguments
     */
    public static void main(String args[])
    {
        /* Set the Nimbus look and feel */
        //<editor-fold defaultstate="collapsed" desc=" Look and feel setting code (optional) ">
        /* If Nimbus (introduced in Java SE 6) is not available, stay with the default look and feel.
         * For details see http://download.oracle.com/javase/tutorial/uiswing/lookandfeel/plaf.html 
         */
        try
        {
            for (javax.swing.UIManager.LookAndFeelInfo info : javax.swing.UIManager.getInstalledLookAndFeels())
            {
                if ("Nimbus".equals(info.getName()))
                {
                    javax.swing.UIManager.setLookAndFeel(info.getClassName());
                    break;
                }
            }
        } catch (ClassNotFoundException ex)
        {
            java.util.logging.Logger.getLogger(coursenotes.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex)
        {
            java.util.logging.Logger.getLogger(coursenotes.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex)
        {
            java.util.logging.Logger.getLogger(coursenotes.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex)
        {
            java.util.logging.Logger.getLogger(coursenotes.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable()
        {
            public void run()
            {
                new coursenotes().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btnc;
    private javax.swing.JButton btnjava;
    private javax.swing.JButton btnpython;
    private javax.swing.JButton jButton3;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JTextField txtpath;
    // End of variables declaration//GEN-END:variables
}
