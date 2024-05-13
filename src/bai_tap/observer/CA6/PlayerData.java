package bai_tap.observer.CA6;

public class PlayerData {
    IListenerPlayerData playerDatas;
    int thoiGian, luotChoi, diem;

    public PlayerData(int thoiGian, int luotChoi, int diem) {
        this.thoiGian = thoiGian;
        this.luotChoi = luotChoi;
        this.diem = diem;
    }

    public void attach(IListenerPlayerData listener) {
        if(playerDatas == null) playerDatas = listener;
    }

    public IListenerPlayerData getPlayerDatas() {
        return playerDatas;
    }

    public void setPlayerDatas(IListenerPlayerData playerDatas) {
        this.playerDatas = playerDatas;
        playerDatas.listen(this);
    }

    public int getThoiGian() {
        return thoiGian;
    }

    public void setThoiGian(int thoiGian) {
        this.thoiGian = thoiGian;
        playerDatas.listen(this);
    }

    public int getLuotChoi() {
        return luotChoi;
    }

    public void setLuotChoi(int luotChoi) {
        this.luotChoi = luotChoi;
        playerDatas.listen(this);
    }

    public int getDiem() {
        return diem;
    }

    public void setDiem(int diem) {
        this.diem = diem;
    }


}
