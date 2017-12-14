import org.apache.commons.lang3.ArrayUtils;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.Scanner;

public class Main {

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        int limit = sc.nextInt();
        System.out.println(Arrays.toString(calc(limit)));

    }


    public static int[] calc(int limit){

        List<Integer> list = new ArrayList<>();
        list.add(2);
        boolean flag;
        for (int i = 2; i < limit; i++){
            if (i % 2 != 0){
                flag = false;
                for (int j = Math.round(i / 2); j > 2; j--){
                    if (i % j == 0) {
                        flag = true;
                        break;
                    }
                }
                if (flag) continue;

                list.add(i);
            }
        }
        return ArrayUtils.toPrimitive(list.toArray(new Integer[0]));
    }
}
