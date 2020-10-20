/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package myswingapp;
import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.logging.Level;
import java.util.logging.Logger;

/**
 *
 * @author hp
 */
public class ad2 extends javax.swing.JFrame
{

    /**
     * Creates new form ad2
     */
    public ad2()
    {
        initComponents();
        addWindowListener(new WindowClose(new ad1()));
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

        jPanel1 = new javax.swing.JPanel();
        btnsearch = new javax.swing.JButton();
        btnremove = new javax.swing.JButton();
        btnstat = new javax.swing.JButton();
        btnnotes = new javax.swing.JButton();
        btnadd = new javax.swing.JButton();
        btndisplaydb = new javax.swing.JButton();
        btnupdate = new javax.swing.JButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.DO_NOTHING_ON_CLOSE);

        jPanel1.setBackground(new java.awt.Color(251, 241, 227));

        btnsearch.setFont(new java.awt.Font("Tahoma", 1, 18)); // NOI18N
        btnsearch.setForeground(new java.awt.Color(255, 0, 0));
        btnsearch.setText("Search Student");
        btnsearch.setHorizontalTextPosition(javax.swing.SwingConstants.CENTER);
        btnsearch.addActionListener(new java.awt.event.ActionListener()
        {
            public void actionPerformed(java.awt.event.ActionEvent evt)
            {
                btnsearchActionPerformed(evt);
            }
        });

        btnremove.setFont(new java.awt.Font("Tahoma", 1, 18)); // NOI18N
        btnremove.setForeground(new java.awt.Color(255, 0, 0));
        btnremove.setText("Remove Student");
        btnremove.setHorizontalTextPosition(javax.swing.SwingConstants.CENTER);
        btnremove.addActionListener(new java.awt.event.ActionListener()
        {
            public void actionPerformed(java.awt.event.ActionEvent evt)
            {
                btnremoveActionPerformed(evt);
            }
        });

        btnstat.setFont(new java.awt.Font("Tahoma", 1, 18)); // NOI18N
        btnstat.setForeground(new java.awt.Color(255, 0, 0));
        btnstat.setText("Statistics");
        btnstat.setHorizontalTextPosition(javax.swing.SwingConstants.CENTER);
        btnstat.addActionListener(new java.awt.event.ActionListener()
        {
            public void actionPerformed(java.awt.event.ActionEvent evt)
            {
                btnstatActionPerformed(evt);
            }
        });

        btnnotes.setFont(new java.awt.Font("Tahoma", 1, 18)); // NOI18N
        btnnotes.setForeground(new java.awt.Color(255, 0, 0));
        btnnotes.setText("Add notes");
        btnnotes.setHorizontalTextPosition(javax.swing.SwingConstants.CENTER);
        btnnotes.addActionListener(new java.awt.event.ActionListener()
        {
            public void actionPerformed(java.awt.event.ActionEvent evt)
            {
                btnnotesActionPerformed(evt);
            }
        });

        btnadd.setFont(new java.awt.Font("Tahoma", 1, 18)); // NOI18N
        btnadd.setForeground(new java.awt.Color(255, 0, 0));
        btnadd.setText("Add Student");
        btnadd.setHorizontalTextPosition(javax.swing.SwingConstants.CENTER);
        btnadd.addActionListener(new java.awt.event.ActionListener()
        {
            public void actionPerformed(java.awt.event.ActionEvent evt)
            {
                btnaddActionPerformed(evt);
            }
        });

        btndisplaydb.setFont(new java.awt.Font("Tahoma", 1, 18)); // NOI18N
        btndisplaydb.setForeground(new java.awt.Color(255, 0, 0));
        btndisplaydb.setText("Display Database");
        btndisplaydb.setHorizontalTextPosition(javax.swing.SwingConstants.CENTER);
        btndisplaydb.addActionListener(new java.awt.event.ActionListener()
        {
            public void actionPerformed(java.awt.event.ActionEvent evt)
            {
                btndisplaydbActionPerformed(evt);
            }
        });

        btnupdate.setFont(new java.awt.Font("Tahoma", 1, 18)); // NOI18N
        btnupdate.setForeground(new java.awt.Color(255, 0, 0));
        btnupdate.setText("Update Student Record");
        btnupdate.setHorizontalTextPosition(javax.swing.SwingConstants.CENTER);
        btnupdate.addActionListener(new java.awt.event.ActionListener()
        {
            public void actionPerformed(java.awt.event.ActionEvent evt)
            {
                btnupdateActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addContainerGap(96, Short.MAX_VALUE)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addComponent(btnadd, javax.swing.GroupLayout.PREFERRED_SIZE, 311, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(btnnotes, javax.swing.GroupLayout.PREFERRED_SIZE, 311, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(btnstat, javax.swing.GroupLayout.PREFERRED_SIZE, 311, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(btnsearch, javax.swing.GroupLayout.PREFERRED_SIZE, 311, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(btnremove, javax.swing.GroupLayout.PREFERRED_SIZE, 311, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(btndisplaydb, javax.swing.GroupLayout.PREFERRED_SIZE, 311, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(btnupdate, javax.swing.GroupLayout.PREFERRED_SIZE, 311, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(96, 96, 96))
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
                .addContainerGap(46, Short.MAX_VALUE)
                .addComponent(btnadd, javax.swing.GroupLayout.PREFERRED_SIZE, 45, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addComponent(btnremove, javax.swing.GroupLayout.PREFERRED_SIZE, 45, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addComponent(btnsearch, javax.swing.GroupLayout.PREFERRED_SIZE, 45, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addComponent(btnstat, javax.swing.GroupLayout.PREFERRED_SIZE, 45, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addComponent(btnnotes, javax.swing.GroupLayout.PREFERRED_SIZE, 45, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addComponent(btndisplaydb, javax.swing.GroupLayout.PREFERRED_SIZE, 45, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addComponent(btnupdate, javax.swing.GroupLayout.PREFERRED_SIZE, 45, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(41, 41, 41))
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

    private void btnsearchActionPerformed(java.awt.event.ActionEvent evt)//GEN-FIRST:event_btnsearchActionPerformed
    {//GEN-HEADEREND:event_btnsearchActionPerformed
        // TODO add your handling code here:
        String path="jdbc:mysql://localhost:3306/student";
        try
        {
            Connection con=DriverManager.getConnection(path,"root","root");
            
                new searchstu().setVisible(true);
                dispose();
            
        }
        catch(SQLException ex)
        {
            System.out.println("error"+ex);
        }
    }//GEN-LAST:event_btnsearchActionPerformed

    private void btnremoveActionPerformed(java.awt.event.ActionEvent evt)//GEN-FIRST:event_btnremoveActionPerformed
    {//GEN-HEADEREND:event_btnremoveActionPerformed
        // TODO add your handling code here:
        String path="jdbc:mysql://localhost:3306/student";
        try
        {
            Connection con=DriverManager.getConnection(path,"root","root");
            
                new Remstu().setVisible(true);
                dispose();
            
        }
        catch(SQLException ex)
        {
            System.out.println("error"+ex);
        }
    }//GEN-LAST:event_btnremoveActionPerformed

    private void btnstatActionPerformed(java.awt.event.ActionEvent evt)//GEN-FIRST:event_btnstatActionPerformed
    {//GEN-HEADEREND:event_btnstatActionPerformed
        // TODO add your handling code here:
        String path="jdbc:mysql://localhost:3306/student";
        try
        {
            Connection con=DriverManager.getConnection(path,"root","root");
            
                new stat().setVisible(true);
                dispose();
            
        }
        catch(SQLException ex)
        {
            System.out.println("error"+ex);
        }
    }//GEN-LAST:event_btnstatActionPerformed

    private void btnnotesActionPerformed(java.awt.event.ActionEvent evt)//GEN-FIRST:event_btnnotesActionPerformed
    {//GEN-HEADEREND:event_btnnotesActionPerformed
        // TODO add your handling code here:
        String path="jdbc:mysql://localhost:3306/student";
        try
        {
            Connection con=DriverManager.getConnection(path,"root","root");
            
                new coursenotes().setVisible(true);
                dispose();
            
        }
        catch(SQLException ex)
        {
            System.out.println("error"+ex);
        }
    }//GEN-LAST:event_btnnotesActionPerformed

    private void btndisplaydbActionPerformed(java.awt.event.ActionEvent evt)//GEN-FIRST:event_btndisplaydbActionPerformed
    {//GEN-HEADEREND:event_btndisplaydbActionPerformed
        // TODO add your handling code here:
        String path="jdbc:mysql://localhost:3306/student";
        try
        {
            Connection con=DriverManager.getConnection(path,"root","root");
            
                new displaydb().setVisible(true);
                dispose();
            
        }
        catch(SQLException ex)
        {
            System.out.println("error"+ex);
        }
    }//GEN-LAST:event_btndisplaydbActionPerformed

    private void btnupdateActionPerformed(java.awt.event.ActionEvent evt)//GEN-FIRST:event_btnupdateActionPerformed
    {//GEN-HEADEREND:event_btnupdateActionPerformed
        // TODO add your handling code here:
        String path="jdbc:mysql://localhost:3306/student";
        try
        {
            Connection con=DriverManager.getConnection(path,"root","root");
            
                new updatestu().setVisible(true);
                dispose();
            
        }
        catch(SQLException ex)
        {
            System.out.println("error"+ex);
        }
    }//GEN-LAST:event_btnupdateActionPerformed

    private void btnaddActionPerformed(java.awt.event.ActionEvent evt)//GEN-FIRST:event_btnaddActionPerformed
    {//GEN-HEADEREND:event_btnaddActionPerformed
        // TODO add your handling code here:
        String path="jdbc:mysql://localhost:3306/student";
        try
        {
            Connection con=DriverManager.getConnection(path,"root","root");
            
                new Addstu().setVisible(true);
                dispose();
            
        }
        catch(SQLException ex)
        {
            System.out.println("error"+ex);
        }
    }//GEN-LAST:event_btnaddActionPerformed

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
            java.util.logging.Logger.getLogger(ad2.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex)
        {
            java.util.logging.Logger.getLogger(ad2.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex)
        {
            java.util.logging.Logger.getLogger(ad2.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex)
        {
            java.util.logging.Logger.getLogger(ad2.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable()
        {
            public void run()
            {
                new ad2().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btnadd;
    private javax.swing.JButton btndisplaydb;
    private javax.swing.JButton btnnotes;
    private javax.swing.JButton btnremove;
    private javax.swing.JButton btnsearch;
    private javax.swing.JButton btnstat;
    private javax.swing.JButton btnupdate;
    private javax.swing.JPanel jPanel1;
    // End of variables declaration//GEN-END:variables
}
