package Creational_Patterm.Builder.Computer;

public class MainComputer {
    public static void main(String[] args) {
        Computer c  = new Computer.Builder().buildCPU("a").buildRam("b").buildStorage("s").buildScreen("screen").build();
        System.out.println(c);
    }
}
