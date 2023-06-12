
package hitung;


public class MatematikaBeraksi {
    
    public static void main(String[] args) {
        Matematika syauqi = new Matematika(8,4);
        System.out.println("Hasil Penjumlahan : "+syauqi.setPenjumlahan());
        System.out.println("Hasil Pengurangan : "+syauqi.setPengurangan());
        System.out.println("Hasil Perkalian : "+syauqi.setPerkalian());
        System.out.println("Hasil Pembagian : "+syauqi.setPembagian());
    }
}
