/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package myswingapp;

import java.awt.Frame;
import java.awt.Window;
import java.awt.event.WindowAdapter;
import java.awt.event.WindowEvent;

/**
 *
 * @author hp
 */
public class WindowClose extends WindowAdapter
{
    Frame obj;
    public WindowClose()
    {
        
    }
    public WindowClose(Frame f)
    {
        obj=f;
    }
    public void windowClosing(WindowEvent e)
    {
        Window w=e.getWindow();
        obj.setVisible(true);
        w.dispose();
    }
}
