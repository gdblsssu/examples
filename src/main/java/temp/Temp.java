package temp;

import java.util.*;
import java.util.stream.Collectors;

public class Temp {
    public static int countStudents(int[] students, int[] sandwiches) {
        LinkedList<Integer> que = new LinkedList<>();

        for(int i: students)
            que.add(i);

        int i = 0;
        while(i < sandwiches.length){
            int sizeQ = que.size();
            for(int j = 0; j < sizeQ; j++){
                int front = que.poll();
                if(front == sandwiches[i]){
                    i++;
                    break;
                }
                else
                    que.addLast(front);
            }

            if(sizeQ == que.size())
                break;

        }

        return que.size();

    }


    public static void main(String[] args) {

        countStudents(new int[]{1, 1, 0, 0}, new int[]{0, 1, 0, 1});
    }
}
