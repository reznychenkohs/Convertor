package SearchAndSort;

import java.util.Arrays;
import java.util.Random;
import java.util.Scanner;

import static SearchAndSort.ArrayUtils.binarySearch;
import static SearchAndSort.ArrayUtils.mergeSort;

public class Main {

    public static void main(String[] args) {
        int[] array = new int[10];
        
        Random random = new Random();
        for (int i = 0; i < array.length ; i++) {
            array[i] = random.nextInt(100);
        }

        System.out.println("Вхідний масив: " + Arrays.toString(array));

        mergeSort(array, 0, array.length - 1);

        System.out.println("Відсортований масив: " + Arrays.toString(array));

        Scanner scanner = new Scanner(System.in);
        System.out.println( "Введіть число для пошуку: ");
        int target = scanner.nextInt();

        int index = binarySearch(array, target);

        if(index !=-1)

        {
            System.out.println("Елемент " + target + " знайдено за індексом " + index);
        } else

        {
            System.out.println("Елемент " + target + " не знайдено у масиві");
            }
    }
}
