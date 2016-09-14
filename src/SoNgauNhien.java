import java.util.Random;

/**
 * Created by truon on 14/09/2016.
 */
public class SoNgauNhien {

    public int rand(int min, int max) {
        Random random = new Random();
        int range = max  - min + 1;
        int randomNum = min + random.nextInt(range);
        return randomNum;
    }

    public void checkSoNgauNhien(int min, int max, int number) {
        SoNgauNhien soNgauNhien = new SoNgauNhien();
        int ranN = soNgauNhien.rand(min, max);
        int soBuoc = 0;
        while (ranN != number) {
            soBuoc++;
            System.out.println("Bước " + soBuoc + " : số ngẫu nhiên - " + ranN);
            ranN = soNgauNhien.rand(min, max);
        }

        System.out.println("Bước " + (soBuoc + 1) + " : số ngẫu nhiên - " + ranN + " = " + number);
    }
}
