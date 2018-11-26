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
public class PersegiPanjang implements BangunDatar{
    private float panjang,lebar;
    public PersegiPanjang(float panjang,float lebar){
        this.panjang = panjang;
        this.lebar = lebar;
    }
    public float getLebar() {
        return lebar;
    }

    public void setLebar(float lebar) {
        this.lebar = lebar;
    }

    public float getPanjang() {
        return panjang;
    }

    public void setPanjang(float panjang) {
        this.panjang = panjang;
    }
    
    @Override
    public void luas() {
        float luas = panjang * lebar;
        System.out.println("Luas Persegi Panjang = "+luas);
    }

    @Override
    public void keliling() {
        float keliling = 2*(panjang+lebar);
        System.out.println("Keliling Persegi Panjang = "+keliling);
    }
    
}
