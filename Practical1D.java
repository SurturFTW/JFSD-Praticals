import java.util.HashSet;
public class Practical1D {
    public static void main(String[] args) {
        HashSet<String> colors = new HashSet<>();
        HashSet<String> shapes = new HashSet<>();
        colors.add("Red");
        colors.add("Green");
        colors.add("Brown");
        colors.add("Yellow");
        shapes.add("Square");
        shapes.add("Triangle");
        shapes.add("Circle");
        System.out.println("Colors: " + colors);
        System.out.println("Shapes: " + shapes);
        colors.addAll(shapes);
        System.out.println("Colors and shapes:  " + colors);
        colors.remove("Yellow");
        System.out.println("Updated colors:  " + colors);
        String search = "Circle";
        if (colors.contains(search)) {
            System.out.println(search + " is found in colors.");
        } else {
            System.out.println(search + " is not found in colors.");
        }
    }
}
