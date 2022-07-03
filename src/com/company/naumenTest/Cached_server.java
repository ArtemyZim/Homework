package com.company.naumenTest;

import java.io.*;
import java.util.*;

public class Cached_server {
    public static void main(String[] args){

        int serverRequestCount = 0;
        int cachedNum;
        int requestsCount;

        String pathInput = "./input.txt";
        String pathOutput = "./output.txt";

        List <Long> requestsList = new LinkedList<>();
        Map <Long, Integer> hashKeysCount = new HashMap<>();
        Map <Long, Integer> cachedRequests = new HashMap<>();
        Map <Long, Integer> requestsNextPositionCount = new HashMap<>();

        try(BufferedReader rd = new BufferedReader(new FileReader(pathInput));
            PrintWriter out = new PrintWriter(pathOutput)) {

            String [] nums = rd.readLine().split(" ");
            cachedNum = Integer.parseInt(nums[0]);
            requestsCount = Integer.parseInt(nums[1]);

            long requestNum;
            for (int i = 0; i < requestsCount; i++){

                requestNum = Long.parseLong(rd.readLine());
                requestsList.add(requestNum);

                if (hashKeysCount.get(requestNum) == null) hashKeysCount.put(requestNum, 1);
                else hashKeysCount.replace(requestNum, hashKeysCount.get(requestNum) + 1);
            }

            long currentNum;
            for (int i = 0; i < requestsCount; i++){

                currentNum = requestsList.get(i);
                hashKeysCount.replace(currentNum, hashKeysCount.get(currentNum) - 1);

                if (hashKeysCount.get(currentNum) != 0) {

                    for (int j = i + 1, k = 1; j < requestsCount; j++, k++) {
                        if (currentNum == requestsList.get(j)) {
                            requestsNextPositionCount.put(currentNum, k);
                            break;
                        }
                    }

                    if (!cachedRequests.containsKey(currentNum)) {

                        if (cachedRequests.size() < cachedNum) {
                            cachedRequests.put(currentNum, requestsNextPositionCount.get(currentNum));
                        } else {
                            long key = Collections.max(cachedRequests.entrySet(), Map.Entry.comparingByValue()).getKey();

                            if (cachedRequests.get(key) > requestsNextPositionCount.get(currentNum)) {
                                cachedRequests.remove(key);
                                cachedRequests.put(currentNum, requestsNextPositionCount.get(currentNum));
                            }
                        }
                        serverRequestCount++;
                    }
                }
                else if (!cachedRequests.containsKey(currentNum)) serverRequestCount++;

                else {
                    cachedRequests.remove(currentNum);
                    requestsNextPositionCount.remove(currentNum);
                }

                for (Map.Entry<Long, Integer> entry : requestsNextPositionCount.entrySet()){
                    requestsNextPositionCount.replace(entry.getKey(), entry.getValue() - 1);

                    if (cachedRequests.containsKey(entry.getKey())) {
                        cachedRequests.replace(entry.getKey(), requestsNextPositionCount.get(entry.getKey()));
                    }
                }
            }
            out.print(serverRequestCount);

        } catch (IOException | NullPointerException e){
            System.out.println("Error! " + e.getMessage());
        }
    }
}