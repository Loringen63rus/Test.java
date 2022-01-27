package Current;

public class Test {
    public static void main(String[] args) {
        int[] array = {1,2,3,4,5,6,7,8,9,0};
        int[] arrayTmp = new int[array.length];

        for (int i = array.length - 1, j = 0; i >= 0; i--, j++) {
            arrayTmp[j] = array[i];

        }
        for (int i = 0; i < array.length; i++) {
            array[i] = arrayTmp[i];
        }


        for (int i = 0; i < arrayTmp.length; i++) {
            System.out.println(array[i]);
        }


    }
}
