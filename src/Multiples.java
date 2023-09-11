public class Multiples {
    public static void main(String[] args) {
        for (int i = 1; i < 1000; i++) {
            boolean x = i % 3 == 0;
            boolean y = i % 5 == 0;
            if (x || y){
                System.out.println(i);
            }
        }
    }


}
