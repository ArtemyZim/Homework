package com.company.naumenTest;

import java.io.*;
import java.util.*;

public class Cached_server {
    public static void main(String[] args) {

        int serverRequestCount = 0;         // Счетчик обращений к распределенной системе
        int cachedNum;                      // Максимальное число запросов, которое может быть закэшировано
        int requestsCount;                  // Число запросов

        String pathInput = "src/com/company/naumenTest/input.txt";
        String pathOutput = "src/com/company/naumenTest/output.txt";

        List <Long> requestsList = new LinkedList<>();      //Создается связный список, который содержит номера запросов
        Map <Long, Integer> hashKeyCount = new HashMap<>(); //Создается хэшмапа, которая содержит пары "номер запроса, количество"
        Map <Long, Integer> cachedRequest = new HashMap<>();     //Создается хэшмапа, в которой будут храниться кэшированные запросы

        BufferedReader rd;
        PrintWriter out;

        try {
            rd = new BufferedReader(new InputStreamReader(new FileInputStream(pathInput)));
            out = new PrintWriter(pathOutput);

            String [] nums = rd.readLine().split(" ");  /* Считываем первую строку в исходном файле и присваиваем
                                                                нашим переменным соответствующие значения */
            cachedNum = Integer.parseInt(nums[0]);
            requestsCount = Integer.parseInt(nums[1]);

            long requestNum;                            // Переменная, которая содержит номер считываемого запроса
            for (int i = 0; i < requestsCount; i++){

                requestNum = Long.parseLong(rd.readLine());
                requestsList.add(requestNum);           // Добавление запросов в список

                // Добавление запросов в хэшмапу.
                // Каждый запрос добавляется как ключ, а значение в данном ключе - количество таких запросов в файле
                if (hashKeyCount.get(requestNum) == null) hashKeyCount.put(requestNum, 1);
                else hashKeyCount.replace(requestNum, hashKeyCount.get(requestNum) + 1);
            }
            rd.close();

            long currentNum;                            // Переменная, содержащая текущий запрос, извлекаемый из списка
            for (int i = 0; i < requestsCount; i++){
                currentNum = requestsList.get(i);

                if (!cachedRequest.containsKey(currentNum)){  // Если в кэше нет текущего запроса (ключа)

                    if (cachedRequest.size() < cachedNum){    // Если кэш не "забит" данными
                        cachedRequest.put(currentNum, hashKeyCount.get(currentNum));   // Добавление текущего запроса в кэш
                    }
                    else {
                         // Получение ключа из кэша с минимальным значением
                         long key = Collections.min(cachedRequest.entrySet(), Map.Entry.comparingByValue()).getKey();

                         if (cachedRequest.get(key) < hashKeyCount.get(currentNum)){  // Если значение ключа текущего запроса больше
                             cachedRequest.remove(key);                               // Заменяем ключ с наименьшим значением на текущий
                             cachedRequest.put(currentNum, hashKeyCount.get(currentNum) - 1);
                         }
                    }
                    serverRequestCount++;
                }
                hashKeyCount.replace(currentNum, hashKeyCount.get(currentNum) - 1);   // Уменьшаем значение текущего ключа на 1
            }

            out.print(serverRequestCount);
            out.flush();
            out.close();

        } catch (IOException e){
            System.out.println("Ошибка! " + e);
        }
    }
}
