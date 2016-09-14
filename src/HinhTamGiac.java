/**
 * Created by truon on 14/09/2016.
 */
public class HinhTamGiac {

    private int chieuCao;
    private static final String SPACE = " ";

    public HinhTamGiac() {
    }

    public HinhTamGiac(int chieuCao) {
        this.chieuCao = chieuCao;
    }

    public int getChieuCao() {
        return chieuCao;
    }

    public void setChieuCao(int chieuCao) {
        this.chieuCao = chieuCao;
    }

    public void fillTamGiacCan (String str) {
        for (int i = 0; i < this.getChieuCao(); i++) {
            for (int j = 0; j < this.getChieuCao() + i; j++) {
                if ( j < this.getChieuCao() - i - 1) {
                    System.out.print(SPACE);
                } else {
                    System.out.print(str);
                }
            }
            System.out.println();
        }
    }

    public void fillTamGiacPascal() {
        for (int i = 0; i < this.getChieuCao(); i++) {
            for (int j = 0; j < this.getChieuCao() + i; j++) {
                if ( j < this.getChieuCao() - i - 1) {
                    System.out.print(SPACE);
                } else {
                    if (j == this.getChieuCao() - 1) {
                        System.out.print(i + 1);
                    } else {
                        for (int k = 0; k <= i; k++) {
                            if (Math.abs(j - this.getChieuCao() +1) == k) {
                                System.out.print(i-k+1);
                            }
                        }
                    }
                }
            }
            System.out.println();
        }
    }
}
