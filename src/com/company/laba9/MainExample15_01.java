package com.company.laba9;
import java.util.*;

public class MainExample15_01 {
    public static void main(String[] args) {
        Map<Integer, Integer> newHashMap = new HashMap<>();
        SortedSet<Integer> newTreeSet = new TreeSet<>();
        List<Integer> newArrayList = new ArrayList<>();

        System.out.println("Заполним каждую из коллекций 15 000 000 элементами");
        fillTheCollection(newHashMap, 15000000);
        fillTheCollection(newTreeSet, 15000000);
        fillTheCollection(newArrayList, 15000000);

        System.out.println("Добавим в начало, середину и конец каждой коллекции элемент");
        System.out.println("Время на добавление элемента в коллекции HashMap не будет меняться");
        System.out.println("Для любого добавления элемента в HashMap время выполнения операции будет равно: " + getRunningTimeAdd(newHashMap));
        System.out.println("Время на добавление элемента в коллекции TreeSet не будет меняться");
        System.out.println("Для любого добавления элемента в TreeSet время выполнения операции будет равно: " + getRunningTimeAdd(newTreeSet));
        System.out.println("Время выполнения операции добавления элемента для ArrayList" +
                            " в начало, в середину и в конец соответственно: " + getRunningTimeAdd(newArrayList));
        System.out.println();
        System.out.println("Удалим из начала, середины и конца каждой коллекции элемент");
        System.out.println("Время на удаление элемента в коллекции HashMap не будет меняться");
        System.out.println("Для любого удаления в HashMap время выполнения операции будет равно: " + getRunningTimeRemove(newHashMap));
        System.out.println("Время на удаление элемента в коллекции TreeSet не будет меняться");
        System.out.println("Для любого удаления в TreeSet время выполнения операции будет равно: " + getRunningTimeRemove(newTreeSet));
        System.out.println("Время выполнения операции удаления элемента для ArrayList" +
                " в начале, в середине и в конце соответственно: " + getRunningTimeRemove(newArrayList));
        System.out.println();
        System.out.println("Очистим наши списки");
        newHashMap.clear();
        newTreeSet.clear();
        newArrayList.clear();
        System.out.println();

        System.out.println("Заполним списки по 10 000 000 элементов в каждом");
        fillTheCollection(newHashMap, 10000000);
        fillTheCollection(newTreeSet, 10000000);
        fillTheCollection(newArrayList, 10000000);

        System.out.println("Получм элемент у каждой коллекции, который находится под 5 000 000 индексом");
        System.out.println("Для HashMap время на получения элемента будет равно: " + getRunningTimeElemGet(newHashMap));
        System.out.println("Для TreeSet время на получения элемента будет равно: " + getRunningTimeElemGet(newTreeSet));
        System.out.println("Для ArrayList время на получения элемента будет равно: " + getRunningTimeElemGet(newArrayList));

    }
    private static void fillTheCollection(Map<Integer, Integer> hashmap, long length){
        for (int i = 0; i < length; i++) {
            hashmap.put(i, i);
        }

    }
    private static void fillTheCollection(SortedSet<Integer> treeSet, long length){
        for (int i = 0; i < length; i++){
            treeSet.add(i);
        }
    }
    private static void fillTheCollection(List<Integer> arrayList, long length){
        for (int i = 0; i < length; i++){
            arrayList.add(i);
        }
    }
    private static long getRunningTimeAdd(Map<Integer, Integer> hashmap){
        long start = System.currentTimeMillis();
        hashmap.put(-1, -1);
        long end = System.currentTimeMillis();

        return end - start;
    }
    private static long getRunningTimeAdd(SortedSet<Integer> treeSet) {
        long start, end;

        start = System.currentTimeMillis();
        treeSet.add(-1);
        end = System.currentTimeMillis();

        return end - start;
    }
    private static String getRunningTimeAdd(List<Integer> arrayList){
        long time1, time2, time3, start, end;

        start = System.currentTimeMillis();
        arrayList.add(0, 0);
        end = System.currentTimeMillis();

        time1 = end - start;

        start = System.currentTimeMillis();
        arrayList.add(7500000, 0);
        end = System.currentTimeMillis();

        time2 = end - start;

        start = System.currentTimeMillis();
        arrayList.add(15000000);
        end = System.currentTimeMillis();

        time3 = end - start;

        return time1 + " " + time2 + " " + time3;
    }
    private static long getRunningTimeRemove(Map<Integer, Integer> hashmap){
        long start, end;

        start = System.currentTimeMillis();
        hashmap.remove(7500000);
        end = System.currentTimeMillis();

        return end - start;
    }
    private static long getRunningTimeRemove(SortedSet<Integer> treeSet) {
        long start, end;

        start = System.currentTimeMillis();
        treeSet.remove(7500000);
        end = System.currentTimeMillis();

        return end - start;
    }
    private static String getRunningTimeRemove(List<Integer> arrayList){
        long time1, time2, time3, start, end;

        start = System.currentTimeMillis();
        arrayList.remove(0);
        end = System.currentTimeMillis();

        time1 = end - start;

        start = System.currentTimeMillis();
        arrayList.remove(7500000);
        end = System.currentTimeMillis();

        time2 = end - start;

        start = System.currentTimeMillis();
        arrayList.remove(15000000);
        end = System.currentTimeMillis();

        time3 = end - start;

        return time1 + " " + time2 + " " + time3;
    }
    private static long getRunningTimeElemGet(Map<Integer, Integer> hashmap){
        long start, end;

        start = System.currentTimeMillis();
        hashmap.get(5000000);
        end = System.currentTimeMillis();

        return end - start;
    }
    private static long getRunningTimeElemGet(SortedSet<Integer> treeSet){
        long start, end;

        start = System.currentTimeMillis();
        treeSet.subSet(5000000, 5000001);
        end = System.currentTimeMillis();

        return end - start;
    }
    private static long getRunningTimeElemGet(List<Integer> arrayList){
        long start, end;

        start = System.currentTimeMillis();
        arrayList.get(5000000);
        end = System.currentTimeMillis();

        return end - start;
    }
}
