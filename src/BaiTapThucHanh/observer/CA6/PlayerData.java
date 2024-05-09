package BaiTapThucHanh.observer.CA6;

public class PlayerData {
    PlayerDataListener playerDataListener;
    int thoiGian, soLuotChoi, diem;
   public void attach(PlayerDataListener player) {
       if(playerDataListener == null) playerDataListener = player;
   }

   public void notifyy() {
       playerDataListener.listen(this);
   }

    public PlayerData(int thoiGian, int soLuotChoi, int diem) {
        this.thoiGian = thoiGian;
        this.soLuotChoi = soLuotChoi;
        this.diem = diem;
    }

    public PlayerDataListener getPlayerDataListener() {
        return playerDataListener;
    }

    public void setPlayerDataListener(PlayerDataListener playerDataListener) {
        this.playerDataListener = playerDataListener;
    }

    public int getThoiGian() {
        return thoiGian;
    }

    public void setThoiGian(int thoiGian) {
        this.thoiGian = thoiGian;
        playerDataListener.listen(this);
    }

    public int getSoLuotChoi() {
        return soLuotChoi;
    }

    public void setSoLuotChoi(int soLuotChoi) {
        this.soLuotChoi = soLuotChoi;
        playerDataListener.listen(this);
    }

    public int getDiem() {
        return diem;
    }

    public void setDiem(int diem) {
        this.diem = diem;
        playerDataListener.listen(this);
    }
}
