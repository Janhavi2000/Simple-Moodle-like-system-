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
import javax.swing.JOptionPane;
import javax.swing.table.DefaultTableModel;

/**
 *
 * @author hp
 */
public class displaydb extends javax.swing.JFrame
{

    /**
     * Creates new form displaydb
     */
    public displaydb()
    {
        initComponents();
        addWindowListener(new WindowClose(new ad2()));
        showuser();
    }
    public ArrayList <adminclass>userList()
    {
        ArrayList<adminclass> userList=new ArrayList<>();
         try
        {
            Connection con=DriverManager.getConnection("jdbc:mysql://localhost:3306/student","root","root");
            Statement st=con.createStatement();
           
            
            String query="select * from stud";
            ResultSet rs=st.executeQuery(query);
            adminclass user;
            while(rs.next())
            {
                user=new adminclass(rs.getString("fname"),rs.getString("lname"),rs.getString("mail"),rs.getString("mobile"),rs.getString("college"),rs.getInt("java"),rs.getInt("python"),rs.getInt("c"),rs.getInt("clgyear"),rs.getString("branch"));
                userList.add(user);
            }
            //String query="insert into studinfo(fname,lname,age,wt,hometown,designation,gender,expr,salary) values('"+txtfname.getText()+"','"+txtlname.getText()+"','"+txtage.getText()+"','"+txtwt.getText()+"','"+txthometown.getText()+"','"+txtdesignation.getText()+"','"+txtgender.getText()+"','"+txtexpr.getText()+"','"+txtsalary.getText()+"')";
            //st.executeUpdate(query);
            //JOptionPane.showMessageDialog(null,"display successful");
        }
        catch(SQLException e)
        {
            System.out.println("insert error"+e);
        }
         return userList;
    }
    public void showuser()
    {
        ArrayList<adminclass> list=userList();
        DefaultTableModel model=(DefaultTableModel)tabledisp.getModel();
        Object[] row=new Object[10];
        for(int i=0;i<list.size();i++)
        {
            row[0]=list.get(i).getfname();
            row[1]=list.get(i).getlname();
            row[2]=list.get(i).getmail();
            row[3]=list.get(i).getmobile();
            row[4]=list.get(i).getcollege();
            row[5]=list.get(i).getjava();
            row[6]=list.get(i).getpython();
            row[7]=list.get(i).getc();
            row[8]=list.get(i).getclgyear();
            row[9]=list.get(i).getbranch();
            model.addRow(row);
        }
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
        jScrollPane1 = new javax.swing.JScrollPane();
        tabledisp = new javax.swing.JTable();

        setDefaultCloseOperation(javax.swing.WindowConstants.DO_NOTHING_ON_CLOSE);

        tabledisp.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][]
            {

            },
            new String []
            {
                "fname", "lname", "mail", "mobile", "college", "java", "python", "c", "clgyear", "branch"
            }
        ));
        jScrollPane1.setViewportView(tabledisp);
        if (tabledisp.getColumnModel().getColumnCount() > 0)
        {
            tabledisp.getColumnModel().getColumn(5).setPreferredWidth(36);
            tabledisp.getColumnModel().getColumn(6).setPreferredWidth(36);
            tabledisp.getColumnModel().getColumn(7).setPreferredWidth(36);
            tabledisp.getColumnModel().getColumn(8).setPreferredWidth(36);
        }

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jScrollPane1, javax.swing.GroupLayout.DEFAULT_SIZE, 764, Short.MAX_VALUE)
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jScrollPane1, javax.swing.GroupLayout.DEFAULT_SIZE, 394, Short.MAX_VALUE)
        );

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );

        pack();
        setLocationRelativeTo(null);
    }// </editor-fold>//GEN-END:initComponents

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
            java.util.logging.Logger.getLogger(displaydb.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex)
        {
            java.util.logging.Logger.getLogger(displaydb.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex)
        {
            java.util.logging.Logger.getLogger(displaydb.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex)
        {
            java.util.logging.Logger.getLogger(displaydb.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable()
        {
            public void run()
            {
                new displaydb().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JPanel jPanel1;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JTable tabledisp;
    // End of variables declaration//GEN-END:variables
}