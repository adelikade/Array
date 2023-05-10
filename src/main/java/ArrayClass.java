import java.util.Arrays;

public class ArrayClass {
    public static void main(String[] args) {
        //1.Задан массив из 5 целых чисел
        int[] numbers  = new int[] {1,2,3,4,5};
        //2.Поменяла местами 1ый и последний элемент массива с помощью переменной buffer
        int buffer = numbers[0];
        numbers[0]=numbers[numbers.length-1];
        numbers[numbers.length-1]=buffer;
        //2.1 Вывод измененных переменных
        System.out.println(Arrays.toString(numbers));
        //3.Вывод результата суммы первого и среднего элемента
        System.out.println(numbers[0]+numbers[numbers.length-3]);
    }
}
