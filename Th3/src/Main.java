public class Main {
    public static void main(String[] args) {
        double volume = Cylinder.getVolume(2, 5);
        System.out.println("Thể tích của hình trụ là: " + volume);

        double volumes = Cylinder.getPerimeter(6);
        System.out.println("Chu vi của hình trụ là: " + volumes);

        double isVolume = Cylinder.getBaseArea(10);
        System.out.println("Diện tích đáy của hình trụ là: " + isVolume);
    }
}