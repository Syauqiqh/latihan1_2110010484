
package hitung;

public class Matematika {
    //variable yang akan dibuat
    double bil1,bil2;

    //constructor
    public Matematika(double bil1, double bil2) {
        this.bil1 = bil1;
        this.bil2 = bil2;
    }
    //method penjumlahan
    public double setPenjumlahan(){
        return bil1 + bil2;
    }
    
    //method pengurangan
    public double setPengurangan(){
        return bil1 - bil2;
    }
    //method perkalian
    public double setPerkalian(){
        return bil1 * bil2;
    }
    //method pembagian
    public double setPembagian(){
        return bil1 / bil2;
    }
}
