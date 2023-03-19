public class Demo1 {
    public static void main(String[] args) throws Exception {
            for (int i = 0; i < 1000; i++) {
                System.out.println(i);
                Thread.sleep(1000);
            }
    }
}