import java.util.ArrayList;
import java.util.LinkedList;
import java.util.List;

public class Main {
    private static final int TEST_ITERATIONS = 2000;

    public static void main(String[] args) {
        List<Integer> arrayList = new ArrayList<>();
        List<Integer> linkedList = new LinkedList<>();

        // Тестируем метод add
        long arrayListAddTime = testAddMethod(arrayList);
        long linkedListAddTime = testAddMethod(linkedList);

        // Тестируем метод delete
        long arrayListDeleteTime = testDeleteMethod(arrayList);
        long linkedListDeleteTime = testDeleteMethod(linkedList);

        // Тестируем метод get
        long arrayListGetTime = testGetMethod(arrayList);
        long linkedListGetTime = testGetMethod(linkedList);

        // Выводим результаты
        System.out.println("Метод\t\t\tКоличество вызовов\t\tВремя выполнения (мс)");
        System.out.println("------------------------------------------------------");
        System.out.println("ArrayList add\t\t" + TEST_ITERATIONS + "\t\t\t" + arrayListAddTime);
        System.out.println("LinkedList add\t\t" + TEST_ITERATIONS + "\t\t\t" + linkedListAddTime);
        System.out.println("ArrayList delete\t" + TEST_ITERATIONS + "\t\t\t" + arrayListDeleteTime);
        System.out.println("LinkedList delete\t" + TEST_ITERATIONS + "\t\t\t" + linkedListDeleteTime);
        System.out.println("ArrayList get\t\t" + TEST_ITERATIONS + "\t\t\t" + arrayListGetTime);
        System.out.println("LinkedList get\t\t" + TEST_ITERATIONS + "\t\t\t" + linkedListGetTime);
    }

    private static long testAddMethod(List<Integer> list) {
        long startTime = System.currentTimeMillis();

        for (int i = 0; i < TEST_ITERATIONS; i++) {
            list.add(i);
        }

        long endTime = System.currentTimeMillis();
        return endTime - startTime;
    }

    private static long testDeleteMethod(List<Integer> list) {
        long startTime = System.currentTimeMillis();

        for (int i = 0; i < TEST_ITERATIONS; i++) {
            list.remove(0);
        }

        long endTime = System.currentTimeMillis();
        return endTime - startTime;
    }

    private static long testGetMethod(List<Integer> list) {
        for (int i = 0; i < TEST_ITERATIONS; i++) {
            list.add(i);
        }

        long startTime = System.currentTimeMillis();

        for (int i = 0; i < TEST_ITERATIONS; i++) {
            list.get(i);
        }

        long endTime = System.currentTimeMillis();
        return endTime - startTime;
    }
}