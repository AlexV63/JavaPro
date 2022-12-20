package HW_19_12_2022;

import java.sql.Array;

import static jdk.internal.org.jline.utils.Colors.J;

public class HW_191222 {
    public static void main(String[] args) {
        getSum();
        System.out.println(getSum());
    }

    public static int getSum() {
        int[] array = {2, 4, 6, 8, 9, 11, 12, 15, 16, 17};
        for (int i = 0; i < array.length; i++) {
            int j = 0;
            if (array[i] % 2 == 0) {
                j = array[i] * 3;
                array[i] = j;
            } else {
                j = array[i] * 5;
                array[i] = j;
            }
        }
        int sum = 0;
        for (int i = 0; i < array.length; i++) {
            if (array[i] > 25) {
                sum = sum + array[i];
            }
        }
        return sum;
    }
}
