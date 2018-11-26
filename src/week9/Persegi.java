/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package week9;

/**
 *
 * @author A C E R
 */
public class Persegi implements BangunDatar{
    private float sisi;
    public Persegi(float sisi){
        this.sisi = sisi;
    }

    public void setSisi(float sisi) {
        this.sisi = sisi;
    }

    public float getSisi() {
        return sisi;
    }
    
    @Override
    public void luas() {
        float luas = sisi*sisi;
        System.out.println("Luas Persegi = "+luas);
    }

    @Override
    public void keliling() {
        float keliling = 4*sisi;
        System.out.println("Keliling Persegi = "+keliling);
    }
    
}
