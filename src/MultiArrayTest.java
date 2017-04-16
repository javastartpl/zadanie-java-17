public class MultiArrayTest {
    public static void main(String[] args) {
        MultiArray multiArray = new MultiArray(5, 10);
        multiArray.print();
        System.out.println("Największy element w tablicy to: " + multiArray.findMax());
        System.out.println("Najmniejszy element w tablicy to: " + multiArray.findMin());
    }
}
