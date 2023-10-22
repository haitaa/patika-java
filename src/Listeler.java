public class Listeler {

    public static void printArray(int[] array) {
        for(int i = 0; i<array.length; i++) {
            System.out.println(array[i] + " ");
        }
    }

    public static int[] reverse(int[] array) {
        int[] result = new int[array.length];

        for(int i = 0, j = result.length -1; i < array.length; i++, j--) {
            result[j] = array[i];
        }
        return result;
    }

    public static void main(String[] args) {

        int[] list = {10, 20, 30, 40, 50, 60, 70, 80, 90, 100};
        printArray(list);
        int[] reversedList = reverse(list);
        printArray(reversedList);
    }
}
