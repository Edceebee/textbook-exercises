package Chapter16;

import java.util.ArrayList;
import java.util.Collection;
import java.util.Iterator;
import java.util.List;

public class ClassExample {

    public static void main(String[] args) {
        // add elements in colors array to list
        String[] colors = {"MAGENTA", "RED", "WHITE", "BLUE", "CYAN"};
        List<String> list = new ArrayList<String>();

        for (String color : colors)
            list.add(color); // adds color to end of list

        String[] removeColors = {"RED", "WHITE", "BLUE"};
        List<String> removeList = new ArrayList<String>();

        for (String color : removeColors)
            removeList.add(color);

        System.out.println("ArrayList: ");

        for (int count = 0; count < list.size(); count++)
            System.out.printf("%s ", list.get(count));

        // remove from list the colors contained in removeList
        removeColors(list, removeList);

        // output list contents
        System.out.printf("%n%nArrayList after calling removeColors:%n");

        for (String color : list)
            System.out.printf("%s ", color);
    }


        private static void removeColors( Collection<String> collection1, Collection<String> collection2)
        {

            Iterator<String> iterator = collection1.iterator();
            while (iterator.hasNext())
            {
                if(collection2.contains(iterator.next()))
                    iterator.remove(); // remove current element)
            }
        }
    }






