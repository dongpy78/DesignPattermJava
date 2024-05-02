package Behavioral_Patterm.Iterator.test1;

public class MainIterator {
    public static void main(String[] args) {
        ArrayCollection63 arr = new ArrayCollection63();
        Iterator63 iterator63 = arr.createIterator();

        while(!iterator63.isDone()) {
            System.out.println(iterator63.next());
        }
    }
}
