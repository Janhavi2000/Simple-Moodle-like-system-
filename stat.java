/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package myswingapp;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.ArrayList;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.swing.JOptionPane;
import javax.swing.table.DefaultTableModel;

/**
 *
 * @author hp
 */
public class stat extends javax.swing.JFrame
{

    /**
     * Creates new form stat
     */
    public String q="";
    public stat()
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

        jPanel1 = new javax.swing.JPanel();
        lblh1 = new javax.swing.JLabel();
        btnjava = new javax.swing.JButton();
        btnpython = new javax.swing.JButton();
        btnc = new javax.swing.JButton();
        btnjp = new javax.swing.JButton();
        btnjc = new javax.swing.JButton();
        btnpc = new javax.swing.JButton();
        btnjpc = new javax.swing.JButton();
        jScrollPane1 = new javax.swing.JScrollPane();
        jTable1 = new javax.swing.JTable();
        btnrefresh = new javax.swing.JButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.DO_NOTHING_ON_CLOSE);

        jPanel1.setBackground(new java.awt.Color(251, 241, 227));

        lblh1.setFont(new java.awt.Font("Tahoma", 1, 18)); // NOI18N
        lblh1.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        lblh1.setText("Statistics");

        btnjava.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        btnjava.setForeground(new java.awt.Color(255, 0, 0));
        btnjava.setText("Java");
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

        btnjp.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        btnjp.setForeground(new java.awt.Color(255, 0, 0));
        btnjp.setText("Java & Python");
        btnjp.addActionListener(new java.awt.event.ActionListener()
        {
            public void actionPerformed(java.awt.event.ActionEvent evt)
            {
                btnjpActionPerformed(evt);
            }
        });

        btnjc.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        btnjc.setForeground(new java.awt.Color(255, 0, 0));
        btnjc.setText("Java & C");
        btnjc.addActionListener(new java.awt.event.ActionListener()
        {
            public void actionPerformed(java.awt.event.ActionEvent evt)
            {
                btnjcActionPerformed(evt);
            }
        });

        btnpc.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        btnpc.setForeground(new java.awt.Color(255, 0, 0));
        btnpc.setText("Python & C");
        btnpc.addActionListener(new java.awt.event.ActionListener()
        {
            public void actionPerformed(java.awt.event.ActionEvent evt)
            {
                btnpcActionPerformed(evt);
            }
        });

        btnjpc.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        btnjpc.setForeground(new java.awt.Color(255, 0, 0));
        btnjpc.setText("Java , Python & C");
        btnjpc.addActionListener(new java.awt.event.ActionListener()
        {
            public void actionPerformed(java.awt.event.ActionEvent evt)
            {
                btnjpcActionPerformed(evt);
            }
        });

        jTable1.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][]
            {

            },
            new String []
            {
                "First Name", "Surname"
            }
        ));
        jScrollPane1.setViewportView(jTable1);

        btnrefresh.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        btnrefresh.setForeground(new java.awt.Color(255, 51, 0));
        btnrefresh.setText("REFRESH TABLE");
        btnrefresh.addActionListener(new java.awt.event.ActionListener()
        {
            public void actionPerformed(java.awt.event.ActionEvent evt)
            {
                btnrefreshActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGap(86, 86, 86)
                        .addComponent(btnjava))
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGap(76, 76, 76)
                        .addComponent(btnpython))
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGap(96, 96, 96)
                        .addComponent(btnc))
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGap(43, 43, 43)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                            .addComponent(btnjp)
                            .addComponent(lblh1, javax.swing.GroupLayout.PREFERRED_SIZE, 149, javax.swing.GroupLayout.PREFERRED_SIZE)))
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGap(77, 77, 77)
                        .addComponent(btnjc))
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGap(69, 69, 69)
                        .addComponent(btnpc))
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGap(51, 51, 51)
                        .addComponent(btnjpc))
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
                        .addContainerGap()
                        .addComponent(btnrefresh)))
                .addGap(124, 124, 124)
                .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 452, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(0, 0, Short.MAX_VALUE))
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(lblh1, javax.swing.GroupLayout.PREFERRED_SIZE, 38, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(btnjava)
                .addGap(18, 18, 18)
                .addComponent(btnpython)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(btnc)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(btnjp)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(btnjc)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(btnpc)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(btnjpc)
                .addGap(18, 18, 18)
                .addComponent(btnrefresh)
                .addContainerGap(16, Short.MAX_VALUE))
            .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 0, Short.MAX_VALUE)
        );

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel1, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );

        pack();
        setLocationRelativeTo(null);
    }// </editor-fold>//GEN-END:initComponents
    public ArrayList <Users>userList()
    {
        ArrayList<Users> userList=new ArrayList<>();
         try
        {
            Connection con=DriverManager.getConnection("jdbc:mysql://localhost:3306/student","root","root");
            Statement st=con.createStatement();
           
            
            //String query="select * from studinfo";
            ResultSet rs=st.executeQuery(q);
            Users user;
            while(rs.next())
            {
                user=new Users(rs.getString("fname"),rs.getString("lname"));
                userList.add(user);
            }
            //String query="insert into studinfo(fname,lname,age,wt,hometown,designation,gender,expr,salary) values('"+txtfname.getText()+"','"+txtlname.getText()+"','"+txtage.getText()+"','"+txtwt.getText()+"','"+txthometown.getText()+"','"+txtdesignation.getText()+"','"+txtgender.getText()+"','"+txtexpr.getText()+"','"+txtsalary.getText()+"')";
            //st.executeUpdate(query);
            //JOptionPane.showMessageDialog(null,"dispaly successful");
        }
        catch(SQLException e)
        {
            System.out.println("insert error"+e);
        }
         return userList;
    }
    public void showuser()
    {
        ArrayList<Users> list=userList();
        DefaultTableModel model=(DefaultTableModel)jTable1.getModel();
        Object[] row=new Object[4];
        for(int i=0;i<list.size();i++)
        {
            row[0]=list.get(i).getfname();
            row[1]=list.get(i).getlname();
            model.addRow(row);
        }
    }
    private void btnjavaActionPerformed(java.awt.event.ActionEvent evt)//GEN-FIRST:event_btnjavaActionPerformed
    {//GEN-HEADEREND:event_btnjavaActionPerformed
        // TODO add your handling code here:
        try
        {
            Connection con=DriverManager.getConnection("jdbc:mysql://localhost:3306/student","root","root");
            Statement st=con.createStatement();
            ResultSet rs;
            q="select * from java";
            showuser();
        } catch (SQLException ex)
        {
            System.out.println("error"+ex);
        }
    }//GEN-LAST:event_btnjavaActionPerformed

    private void btnpythonActionPerformed(java.awt.event.ActionEvent evt)//GEN-FIRST:event_btnpythonActionPerformed
    {//GEN-HEADEREND:event_btnpythonActionPerformed
        // TODO add your handling code here:
        try
        {
            Connection con=DriverManager.getConnection("jdbc:mysql://localhost:3306/student","root","root");
            Statement st=con.createStatement();
            ResultSet rs;
            q="select * from python";
            showuser();
        } catch (SQLException ex)
        {
            System.out.println("error"+ex);
        }
    }//GEN-LAST:event_btnpythonActionPerformed

    private void btncActionPerformed(java.awt.event.ActionEvent evt)//GEN-FIRST:event_btncActionPerformed
    {//GEN-HEADEREND:event_btncActionPerformed
        // TODO add your handling code here:
        try
        {
            Connection con=DriverManager.getConnection("jdbc:mysql://localhost:3306/student","root","root");
            Statement st=con.createStatement();
            ResultSet rs;
            q="select * from c";
            showuser();
        } catch (SQLException ex)
        {
            System.out.println("error"+ex);
        }
    }//GEN-LAST:event_btncActionPerformed

    private void btnjpActionPerformed(java.awt.event.ActionEvent evt)//GEN-FIRST:event_btnjpActionPerformed
    {//GEN-HEADEREND:event_btnjpActionPerformed
        // TODO add your handling code here:
        try
        {
            Connection con=DriverManager.getConnection("jdbc:mysql://localhost:3306/student","root","root");
            Statement st=con.createStatement();
            ResultSet rs;
            q="select java.fname,java.lname from java inner join python on java.fname=python.fname and java.lname=python.lname ";
            showuser();
        } catch (SQLException ex)
        {
            System.out.println("error"+ex);
        }
    }//GEN-LAST:event_btnjpActionPerformed

    private void btnjcActionPerformed(java.awt.event.ActionEvent evt)//GEN-FIRST:event_btnjcActionPerformed
    {//GEN-HEADEREND:event_btnjcActionPerformed
        // TODO add your handling code here:
        try
        {
            Connection con=DriverManager.getConnection("jdbc:mysql://localhost:3306/student","root","root");
            Statement st=con.createStatement();
            ResultSet rs;
            q="select java.fname,java.lname from java inner join c on java.fname=c.fname and java.lname=c.lname ";
            showuser();
        } catch (SQLException ex)
        {
            System.out.println("error"+ex);
        }
    }//GEN-LAST:event_btnjcActionPerformed

    private void btnpcActionPerformed(java.awt.event.ActionEvent evt)//GEN-FIRST:event_btnpcActionPerformed
    {//GEN-HEADEREND:event_btnpcActionPerformed
        // TODO add your handling code here:
        try
        {
            Connection con=DriverManager.getConnection("jdbc:mysql://localhost:3306/student","root","root");
            Statement st=con.createStatement();
            ResultSet rs;
            q="select python.fname,python.lname from python inner join c on python.fname=c.fname and python.lname=c.lname ";
            showuser();
        } catch (SQLException ex)
        {
            System.out.println("error"+ex);
        }
    }//GEN-LAST:event_btnpcActionPerformed

    private void btnjpcActionPerformed(java.awt.event.ActionEvent evt)//GEN-FIRST:event_btnjpcActionPerformed
    {//GEN-HEADEREND:event_btnjpcActionPerformed
        // TODO add your handling code here:
        try
        {
            Connection con=DriverManager.getConnection("jdbc:mysql://localhost:3306/student","root","root");
            Statement st=con.createStatement();
            ResultSet rs;
            q="select java.fname,java.lname from java inner join python on java.fname=python.fname  and java.lname=python.lname inner join c on python.fname=c.fname and python.lname=c.lname";
            showuser();
        } catch (SQLException ex)
        {
            System.out.println("error"+ex);
        }
    }//GEN-LAST:event_btnjpcActionPerformed

    private void btnrefreshActionPerformed(java.awt.event.ActionEvent evt)//GEN-FIRST:event_btnrefreshActionPerformed
    {//GEN-HEADEREND:event_btnrefreshActionPerformed
        // TODO add your handling code here:
        DefaultTableModel model=(DefaultTableModel)jTable1.getModel();
        while(model.getRowCount()>0)
            model.setRowCount(0);
    }//GEN-LAST:event_btnrefreshActionPerformed

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
            java.util.logging.Logger.getLogger(stat.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex)
        {
            java.util.logging.Logger.getLogger(stat.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex)
        {
            java.util.logging.Logger.getLogger(stat.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex)
        {
            java.util.logging.Logger.getLogger(stat.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable()
        {
            public void run()
            {
                new stat().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btnc;
    private javax.swing.JButton btnjava;
    private javax.swing.JButton btnjc;
    private javax.swing.JButton btnjp;
    private javax.swing.JButton btnjpc;
    private javax.swing.JButton btnpc;
    private javax.swing.JButton btnpython;
    private javax.swing.JButton btnrefresh;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JTable jTable1;
    private javax.swing.JLabel lblh1;
    // End of variables declaration//GEN-END:variables
}
