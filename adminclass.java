/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package myswingapp;

/**
 *
 * @author hp
 */
public class adminclass
{
    private String fname,lname,mail,mobile,college,branch;
    private int clgyear,java,python,c; 
    public adminclass(String fname,String lname,String mail,String mobile,String college,int java,int python,int c,int clgyear,String branch)
    {
        this.fname=fname;
        this.lname=lname;
        this.mail=mail;
        this.mobile=mobile;
        this.college=college;
        this.branch=branch;
        this.clgyear=clgyear;
        this.java=java;
        this.python=python;
        this.c=c;
    }       
    public String getfname()
    {
        return fname;
    }
    public String getlname()
    {
        return lname;
    }
    public String getmail()
    {
        return mail;
    }
    public String getmobile()
    {
        return mobile;
    }
    public String getcollege()
    {
        return college;
    }
    public String getbranch()
    {
        return branch;
    }
    public int getclgyear()
    {
        return clgyear;
    }
    public int getjava()
    {
        return java;
    }
    public int getpython()
    {
        return python;
    }
    public int getc()
    {
        return c;
    }
}
