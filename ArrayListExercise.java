import java.util.ArrayList;

public class ArrayListExercise {
    public static void main(String[] args) {
       
        ArrayList<String> colors = new ArrayList<>();

        colors.add("Red");
        colors.add("Green");
        colors.add("Blue");
        colors.add("Yellow");
        colors.add("Orange");

       
        for (String color : colors) {
            System.out.println(color);
        }

        colors.add(2, "Purple");
      
        colors.remove(1);
       
        System.out.println(colors);

     
        searchColor(colors, "Blue");

        ArrayList<String> colorsWithoutDuplicates = removeDuplicates(colors);
        System.out.println("ArrayList without duplicates: " + colorsWithoutDuplicates);
    }

 
    public static void searchColor(ArrayList<String> colors, String searchTerm) {
        int position = colors.indexOf(searchTerm);
        if (position != -1) {
            System.out.println("Color '" + searchTerm + "' found at position " + (position + 1));
        } else {
            System.out.println("Color '" + searchTerm + "' not found in the ArrayList.");
        }
    }

  
    public static ArrayList<String> removeDuplicates(ArrayList<String> list) {
        ArrayList<String> newList = new ArrayList<>();
        for (String element : list) {
            if (!newList.contains(element)) {
                newList.add(element);
            }
        }
        return newList;
    }
}