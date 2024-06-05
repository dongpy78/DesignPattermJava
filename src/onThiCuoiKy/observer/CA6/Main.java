package onThiCuoiKy.observer.CA6;

public class Main {
    public static void main(String[] args) {
        DashBoard dashBoard = new DashBoard();
        PlayerData playerData = new PlayerData(10, 20, 340);
        playerData.attach(dashBoard);
        dashBoard.listen(playerData);
        playerData.setDiem(1);
        playerData.setLuotchoi(999);
    }
}
