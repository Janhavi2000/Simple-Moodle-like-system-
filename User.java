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
class User
{
    private String fname,lname;
    private int age,wt;
    public User(String fname,String lname,int age,int wt)
    {
        this.fname=fname;
        this.lname=lname;
        this.age=age;
        this.wt=wt;
    }
    public String getfname()
    {
        return fname;
    }
    public String getlname()
    {
        return lname;
    }
    public int getage()
    {
        return age;
    }
    public int getwt()
    {
        return wt;
    }
}
