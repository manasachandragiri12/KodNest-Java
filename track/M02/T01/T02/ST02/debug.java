public class debug {
    public static void main(String[] args) {
        int[] original = { 14, 18, 22, 26 };
        int updateIndex = 1;
        int updateedValue = 25;
        int requestedIndex = 4;

        int[] snapshot = new int[original.length];
        for (int i = 0; i < original.length; i++) {
            snapshot[i] = original[i];
        }

        int[] liveView = original;
        if (updateIndex >= 0 && updateIndex < liveView.length) {
            liveView[updateIndex] = updateedValue;
        }

        System.out.print("Original: ");
        for (int i = 0; i < original.length; i++) {
            System.out.print(original[i] + " ");
        }
        System.out.println();

        System.out.print("Snapshot: ");
        for (int i = 0; i < snapshot.length; i++) {
            System.out.print(snapshot[i] + " ");
        }
        System.out.println();

        System.out.println("Same object: " + (liveView == original));

        if (requestedIndex >= 0 && requestedIndex < original.length) {
            System.out.println("Requested value: " + original[requestedIndex]);
        } else {
            System.out.println("Requested value: Invalid index");
        }
    }
}