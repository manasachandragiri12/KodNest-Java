public class NestedProgram {
    public static void main(String[] args) {
        for (int i = 1; i <= 4; i++) {
            for (int j = 1; j <= i; j++) {
                if (i == 2) {
                    continue;
                }
                System.out.println("i : " + i + " j : " + j);
            }
        }
    }
}
