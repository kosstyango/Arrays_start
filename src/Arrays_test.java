import java.lang.reflect.Array;
import java.util.Arrays;

public class Arrays_test {
    public static void main(String[] args) {
        int intArray[] = new int[5];
        intArray[0] = 10;
        intArray[1] = 12;
        intArray[2] = 14;
        intArray[3] = 8;
        intArray[4] = 16;
        Arrays.fill(intArray, 3); //заполняем массив тройками
        //Arrays.sort(intArray); //сортируем массив
        System.out.println(Arrays.toString(intArray));
    }
}
