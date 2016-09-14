/**
 * Created by truon on 14/09/2016.
 */
public class BangCuuChuong {
    public void display() {
        for (int i = 1; i <= 9; i++) {
            System.out.println();
            for (int j = 1; j <= 10; j++) {
                System.out.println(i + " * " + j + " = " + j*i);
            }
        }
    }
}
