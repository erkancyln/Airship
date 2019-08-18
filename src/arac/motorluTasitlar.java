/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package arac;
public class motorluTasitlar extends karaTasitlari
{
    private int yakitTuru;
    public int getyakitTuru()
    {
        return yakitTuru;
    }
    public void setyakitTuru(int yakitTuru)
    {
        this.yakitTuru = yakitTuru;
    }
    public void Motor()
    {
        System.out.println("Motorludur.");
        
    }
}
