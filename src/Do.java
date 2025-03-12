public class Do {
    public static void main(String[] args) {
        int num = 2;
        int limit = 20;

        System.out.println("Even numbers from 1 to " + 20 + " are:");

        do {
            System.out.println(num + " ");
            num += 2;
        } while (num <=20);
    }
}
