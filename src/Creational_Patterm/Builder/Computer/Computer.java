package Creational_Patterm.Builder.Computer;
// 1. Lớp cần tạo đối tượng, việc cần tạo đối tượng thông qua nhiều bước
public class Computer {
    // 2. Xác định các thành phần phức tạp thông qua các bước
    String cpu, ram, storage, screen;

    @Override
    public String toString() {
        return "Computer{" +
                "cpu='" + cpu + '\'' +
                ", ram='" + ram + '\'' +
                ", storage='" + storage + '\'' +
                ", screen='" + screen + '\'' +
                '}';
    }

    // 4. Viết hàm khởi tạo
    private Computer(Builder b) {
        this.cpu = b.cpu;
        this.ram = b.ram;
        this.storage = b.storage;
        this.screen = b.screen;
    }

    // 3. Viết lớp Builder
    // Thành phần Builder dùng để tạo ra computer nên phải dùng static, nếu không dùng static thì xây dựng lại computer
    public static class Builder {
        String cpu, ram, storage, screen;
        // 6. Các phương thức để xây dựng từng thành phần
        public Builder buildCPU(String cpu) {
            this.cpu = cpu;
            return this;
        }

        public Builder buildRam(String ram) {
            this.ram = ram;
            return this;
        }

        public Builder buildStorage(String storage) {
            this.storage = storage;
            return this;
        }

        public Builder buildScreen(String screen) {
            this.screen = screen;
            return this;
        }

        public Computer build() {
            return new Computer(this);
        }
    }


}
