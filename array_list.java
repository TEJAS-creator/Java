import java.util.*;

public class main{
    public static void main(String[] args) {
        ArrayList<Integer> list1 = new ArrayList<Integer>();
        ArrayList<String> list2 = new ArrayList<String>();
        ArrayList<Float> list3 = new ArrayList<Float>();

        // add
        list1.add(0);
        list1.add(20);
        list1.add(10);
        list1.add(30);
        System.out.println("List 1: "+list1);

        // get 
        System.out.println("Element at index 1: "+list1.get(1));


        // add at a particular index
        // list1.add(index,element_to_add)
        list1.add(2,50);
        System.out.println("New array list1: "+list1);


        // delete an element
        list1.remove(2);
        System.out.println("Array list1 after removal: "+list1);

        // size of list
        System.out.println("Array list1 size: "+list1.size());

        // looping in array list
        System.out.println("Array list looping: ");
        for(int i=0;i<list1.size();i++){
            System.out.println(list1.get(i));
        }
        System.out.println();

        // sorting
        Collections.sort(list1);
        System.out.println("Sorted array list: "+list1);
    }
}
