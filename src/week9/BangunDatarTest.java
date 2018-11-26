
package week9;

public class BangunDatarTest {

    
    public static void main(String[] args) {
        //Lingkaran
        BangunDatar lingkaran= new Lingkaran(20);
        lingkaran.luas();
        lingkaran.keliling();
        System.out.println("");
        //PersegiPanjang
        BangunDatar persegi_panjang = new PersegiPanjang(15, 30);
        persegi_panjang.luas();
        persegi_panjang.keliling();
        System.out.println("");
        //Persegi
        BangunDatar persegi = new Persegi(40);
        persegi.luas();
        persegi.keliling();
        System.out.println("");
    }
    
}
