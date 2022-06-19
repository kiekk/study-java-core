package arraylist;


import jdk.nashorn.internal.objects.annotations.Getter;

import java.util.List;

public class ArrayList {

    public static void main(String[] args) {

        List<Integer> list = new java.util.ArrayList<>();

        for(int i=0;i<=1000;i++) {
            list.add(i);
        }

        /*
        처음 사이즈는 10
        이후 15, 22, 33, 49, 73, 109, 163, 244, 366, 549, 823....
         */
    }
}
