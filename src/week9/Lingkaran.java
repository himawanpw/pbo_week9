/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package week9;

public class Lingkaran implements BangunDatar{
    private float jejari;
    public Lingkaran(float jejari){
        this.jejari = jejari;
    }
    public float getJejari() {
        return jejari;
    }

    public void setJejari(float jejari) {
        this.jejari = jejari;
    }
   
    @Override
    public void luas() {
        double luas = Math.PI * jejari * jejari;
        System.out.println("Luas Lingkaran = "+luas);
    }

    @Override
    public void keliling() {
        double keliling = 2 * Math.PI * jejari;
        System.out.println("Keliling Lingkaran = "+keliling);
    }
    
}
