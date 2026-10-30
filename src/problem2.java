import java.util.Arrays;

public class problem2 {
    public static void main(String[] args) {
        int[] list1 = {1, 3, 5};
        int[] list2 = {2, 4, 6, 8, 10};
        int[] combinedList = combineListsAlternately(list1, list2);
        System.out.println("Combined List: " + Arrays.toString(combinedList));

    }
    public static int[] combineListsAlternately(int[] list1, int[] list2) {
        int maxLength = Math.max(list1.length, list2.length);
        int[] combinedList = new int[list1.length + list2.length];
        int index = 0;

        for (int i = 0; i < maxLength; i++) {
            if (i < list1.length) {
                combinedList[index++] = list1[i];
            }
            if (i < list2.length) {
                combinedList[index++] = list2[i];
            }
        }
        return combinedList;
    }
}
