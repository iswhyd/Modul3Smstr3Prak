package Modul3Smstr3;

/*
* Disini saya membuat class luasSegitiga2
* yang dimana class ini bertujuan untuk menghitung luas dari sebuah segitiga
* */
public class luasSegitiga2 {

    /*
    * Disini terdapat 2 variable untuk menampung angka dari alas dan tinggi
    * */
    private int num1;
    private int num2;

    public luasSegitiga2(int num1 , int num2){
        this.num1=num1;
        this.num2=num2;
    }
    /*
     * dibawah ini merupakan method rumus dari menghitung luas segitiga
     * */
    public double calculateTriangle(){
        return 0.5 * num2 * num2;
    }
    /*
     * dibawah ini method untuk menjalankan class tersebut
     * */
    public static void main(String[] args) {
        luasSegitiga2 luassegitiga2 = new luasSegitiga2(10,10);

        System.out.println("Luas Segitga 2 adalah " + luassegitiga2.calculateTriangle());
    }
}
