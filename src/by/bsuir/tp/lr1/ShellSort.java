package by.bsuir.tp.lr1;

import java.util.Random;

public class ShellSort {

    public static void shellSort(int massSize) {
        int[] targetArray = new int[massSize];
        int step = massSize / 2;

        Random random = new Random();
        for (int i = 0; i < targetArray.length; i++){
            targetArray[i] = random.nextInt(1000) + 1;
        }

        printArray(targetArray, "Исходный массив:");

        while (step > 0) {
            for (int i = 0; i < massSize - step; i++) {
                int j = i + step;
                int buffer = targetArray[j];
                while (j >= step && buffer > targetArray[j-step]) {
                    targetArray[j] = targetArray[j - step];
                    j -= step;
                }
                targetArray[j] = buffer;
            }
            if (step == 2) {
                step = 1;
            }
            else {
                step /= 2.2;
            }
        }

        printArray(targetArray, "Отсортированный массив:");
    }

    private static void printArray(int[] array, String message) {
        System.out.println(message);

        for (int number: array){
            System.out.print(number + ", ");
        }
        System.out.println();
    }
}
