/**
 * Created by truon on 14/09/2016.
 */
public class HinhChuNhat {

    private int chieuRong;
    private int chieuCao;
    private static final String SPACE = " ";

    public HinhChuNhat() {
    }

    public HinhChuNhat(int chieuRong, int chieuCao) {
        this.chieuRong = chieuRong;
        this.chieuCao = chieuCao;
    }

    public int getChieuRong() {
        return chieuRong;
    }

    public void setChieuRong(int chieuRong) {
        this.chieuRong = chieuRong;
    }

    public int getChieuCao() {
        return chieuCao;
    }

    public void setChieuCao(int chieuCao) {
        this.chieuCao = chieuCao;
    }

    public void fillFull(String str) {
        for (int i = 0; i < this.getChieuCao(); i++)
        {
            for (int j = 0; j < this.getChieuRong(); j++)
            {
                System.out.print(str);
            }
            System.out.println();
        }
    }

    public void fillBorder(String str) {
        for (int i = 0; i < this.getChieuCao(); i++)
        {
            for (int j = 0; j < this.getChieuRong(); j++)
            {
                if (i == 0 || i == this.getChieuCao() - 1) {
                    System.out.print(str);
                }
                else if (j == 0 || j == this.getChieuRong() - 1) {
                    System.out.print(str);
                } else {
                    System.out.print(SPACE);
                }
            }
            System.out.println();
        }
    }
}
