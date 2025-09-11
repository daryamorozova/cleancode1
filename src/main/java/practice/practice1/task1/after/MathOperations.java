package practice.practice1.task1.after;

/*
1. Нарушение DRY (Don't Repeat Yourself) – дублирование кода
Задача: Устраните дублирование кода, применив перегрузку методов или использование массива аргументов.
 */

public class MathOperations {

    public int sum(int[] array) {
        int sum = 0;
        for (int i = 0; i < array.length; i++) {
            sum += array[i];
        }
        return sum;
    }

}
