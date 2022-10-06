package arraylistdemo;

import java.util.ArrayList;

public class ArrayListDemo {

    public static void main(String[] args) {
        ArrayList elements = new ArrayList();

        //An element is added to our arraylist with the Add function.
        elements.add(1);
        elements.add(10);
        elements.add("Ankara");

        for (Object i : elements) {
            System.out.println(i);
        }

        System.out.println("------------------------");

        //We see the number of elements of our arraylist with the size function.
        System.out.println(elements.size());

        System.out.println("------------------------");

        //With the get function, we see the element of the arraylist that we want permission.
        System.out.println(elements.get(0));

        System.out.println("------------------------");

        //With the set function, we change the element of the arraylist that we want the permission.
        elements.set(1, 100);
        System.out.println(elements.get(1));

        System.out.println("------------------------");

        //With the Remove function, we delete the element of the arraylist that we want permission.
        elements.remove(0);
        System.out.println(elements.get(0));

        System.out.println("------------------------");

        //With the clear function we delete our arraylist completely.
        elements.clear();
        System.out.println(elements.size());

    }

}
