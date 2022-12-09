package Arraylist;
import java.util.*;
public class maxelement {
    public static void main(String args[]){
        ArrayList<Integer> number = new ArrayList<>();
        number.add(2);
        number.add(5);
        number.add(9);
        number.add(3);
        number.add(6);
        System.out.println(number);
        int max = Integer.MIN_VALUE;
        for(int i = 0; i<number.size(); i++){
           // if(max < number.get(i)){
            //    max = number.get(i);
          //  }
            max = Math.max(max,number.get(i));
        }
        System.out.println("The maximum element in array is "+max);
    }

}
