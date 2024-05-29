package bai_tap.change_of_res.doveso;

public class MainVeSo {
    public static void main(String[] args) {
        AbstractDoVeSo g8 = new GiaiThuong("Giai 8", new String[] {"1"});
        AbstractDoVeSo g7 = new GiaiThuong("Giai 7", new String[] {"11", "12"});
        AbstractDoVeSo g6 = new GiaiThuong("Giai 6", new String[] {"50"});
        AbstractDoVeSo g5 = new GiaiThuong("Giai 5", new String[] {"90"});
        AbstractDoVeSo g4 = new GiaiThuong("Giai 4", new String[] {"56"});
        AbstractDoVeSo gdb = new GiaiThuong("Giai Vip", new String[] {"23"});
        gdb.veSoKeTiep(g4).veSoKeTiep(g5).veSoKeTiep(g6).veSoKeTiep(g7).veSoKeTiep(g8);
        System.out.println(gdb.doveSo("23"));


    }
}
