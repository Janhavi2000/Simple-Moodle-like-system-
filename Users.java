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
class Users
{
    private String fname,lname;
    public Users(String fname,String lname)
    {
        this.fname=fname;
        this.lname=lname;
    }
    public String getfname()
    {
        return fname;
    }
    public String getlname()
    {
        return lname;
    }
}
