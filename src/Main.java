public class Main {

    public static void main(String[] args) {
        System.out.println("___________________Bài tập lần 1___________________\n");

        //Khoi tao

        HinhTamGiac hinhTamGiac = new HinhTamGiac(5);
        HinhChuNhat hinhChuNhat = new HinhChuNhat(4, 5);
        BangCuuChuong bangCuuChuong = new BangCuuChuong();
        SoNgauNhien soNgauNhien = new SoNgauNhien();

        System.out.println("Bài 1 \n");
        hinhChuNhat.fillFull("*");

        System.out.println("\nBài 2 \n");
        hinhChuNhat.fillBorder("*");

        System.out.println("\nBài 3 \n");
        hinhTamGiac.fillTamGiacCan("*");

        System.out.println("\nBài 4 \n");
        hinhTamGiac.fillTamGiacPascal();

        System.out.println("\nBài 5 \n");
        bangCuuChuong.display();

        System.out.println("\nBài 5 \n");
        soNgauNhien.checkSoNgauNhien(10, 99, 24);

    }
}
