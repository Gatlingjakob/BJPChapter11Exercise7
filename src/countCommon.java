import java.util.*;


/**
 * Created by Jakob on 31-08-2016.
 */
public class countCommon {

    public static void main (String[] args) {

        ArrayList<Integer> list1 = new ArrayList<Integer>();
        list1.addAll(Arrays.asList(3, 7, 3, -1, 2, 3, 7, 2, 15, 15));

        ArrayList<Integer> list2 = new ArrayList<Integer>();
        list2.addAll(Arrays.asList(-5, 15, 2, -1, 7, 15, 36));

        System.out.println(countCommons(list1, list2));


    }
    public static int countCommons (ArrayList<Integer> list1, ArrayList<Integer> list2){


        int uniques1 = 0;
        int uniques2 = 0;
        int uniquesInCommon= 0;

        Set<Integer> set1= new HashSet<Integer>();

        Set<Integer> set2= new HashSet<Integer>();

        for (int i = 0; i < list1.size(); i++){

            int element = list1.get(i);
            set1.add(element);
        }

        for (int i = 0; i < list2.size(); i++){

            int element = list2.get(i);
            set2.add(element);
        }

        set1.retainAll(set2);

    uniquesInCommon = set1.size();

        return uniquesInCommon;

    }




}

