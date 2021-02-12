package Stream;

import java.util.*;
import java.util.ArrayList;

public class Test4 {
    public static void main(String[] args) {
        List<Integer> list = new ArrayList<>();
        list.add(5);
        list.add(8);
        list.add(2);
        list.add(4);
        list.add(3);

        int result = list.stream().reduce((accumulator, element) ->accumulator*element).get();
        //System.out.println(result);
        //5,8,2,4,3
        //accumulator - chto to nakaplivaet = 5   40   80   320   960
        //element = 8   2   4    3

//        List<Integer> list100 = new ArrayList<>();
//        Optional<Integer> o = list.stream().reduce((accumulator, element) ->accumulator*element);
//        if(o.isPresent()){
//            System.out.println(o.get());
//        }
//        else{
//            System.out.println("Not present");
//        }
        int result2= list.stream().reduce(1,(accumulator, element) ->accumulator*element);
        System.out.println(result2);
        //5,8,2,4,3
        //accumulator - chto to nakaplivaet = 1   5   40   80   320   960
        //element =                           5   8   2     4    3

        List<String> list3 = new ArrayList<>();
        list3.add("privet");
        list3.add("kak dela?");
        list3.add("OK");
        list3.add("poka");
        String result3 = list3.stream().reduce((a,e)->a+ " " + e).get();
        System.out.println(list3);


    }

}
