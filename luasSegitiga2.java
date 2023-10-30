package Modul3Smstr3Prak;

/**
 *
 */
public class luasSegitiga2 {


    private int num1;
    private int num2;

    /**
     *
     * @param num1
     * @param num2
     */
    public luasSegitiga2(int num1 , int num2){
        this.num1=num1;
        this.num2=num2;
    }

    /**
     *
     * @return
     */
    public double calculateTriangle(){
        return 0.5 * num2 * num2;
    }

    /**
     *
     * @param args
     */
    public static void main(String[] args) {
        luasSegitiga2 luassegitiga2 = new luasSegitiga2(10,10);

        System.out.println("Luas Segitga 2 adalah " + luassegitiga2.calculateTriangle());
    }
}
