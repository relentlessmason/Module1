package com.techelevator;

import java.util.ArrayList;
import java.util.List;
import java.util.Map;
import java.util.Scanner;
import java.util.TreeMap;


// YOUR CODE IS HERE
abstract class Wall {
    private String name = "";
    private String color = "";

    public String getName() {
        return name;
    }
    public String getColor() {
        return color;
    }

    public Wall(String name, String color) {
        this.name = name;
        this.color = color;
    }
    public abstract int getArea();
} //// Wall ends here

class RectangleWall extends Wall {

    private int length = 0;
    private int height = 0;
    public int getLength() {
        return length;
    }
    public int getHeight() {
        return height;
    }

    public RectangleWall(String name, String color) {
        super(name, color);
    }
    public RectangleWall(String name, String color, int length, int height) {
        super(name, color);
        this.length = length;
        this.height = height;
    }

    @Override
    public int getArea() {
        return getLength() * getHeight();
    }
    public String toString() {
        return getName() + " (" + getLength() + "x" + getHeight() + ") rectangle";
    }
}
// Rectangle ends here

class SquareWall extends RectangleWall {
    private int sideLength = 0;
    public int getSideLength() {
        return sideLength;
    }

    public SquareWall(String name, String color, int sideLength) {
        super(name, color);
        this.sideLength = sideLength;
    }
    public int getArea() {
        return getSideLength()*getSideLength();
    }
    public String toString() {
        return getName() + " (" + getSideLength() + "x" + getSideLength() + ") square";
    }
}
// Square ends here

class TriangleWall extends Wall {
private int base = 0;
private int height = 0;
    public int getBase() {
        return base;
    }
    public int getHeight() {
        return height;
    }

    public TriangleWall(String name, String color, int base, int height) {
        super(name, color);
        this.base = base;
        this.height = height;
    }

    @Override
    public int getArea() {
        return (getBase()*getHeight())/2;
    }
    public String toString() {
        return getName() + " (" + getBase() + "x" + getHeight() + ") triangle";
    }
}
class PaintCalculator {

    private static Scanner userInput = new Scanner(System.in);

    public static void main(String[] args) {

        // Step One:
        List<Wall> walls = new ArrayList<Wall>();

        while (true) {
            System.out.println("[1] Add a wall");
            System.out.println("[2] Calculate paint required (and Exit)");
            System.out.print("Please choose >>> ");
            String userChoice = userInput.nextLine();

            System.out.println();

            if (userChoice.equals("1")) {
                // Step One:
                Wall newWall = null;

                System.out.println("What's the name of the new wall?");
                String name = userInput.nextLine();

                System.out.println("What color is the wall?");
                String color = userInput.nextLine();

                System.out.println("What kind of wall?");
                System.out.println("[1] Rectangle");
                System.out.println("[2] Square");
                System.out.println("[3] Triangle");
                String shapeChoice = userInput.nextLine();

                if (shapeChoice.equals("1")) {
                    System.out.println("Enter wall height >>> ");
                    int height = Integer.parseInt(userInput.nextLine());
                    System.out.println("Enter wall length >>> ");
                    int length = Integer.parseInt(userInput.nextLine());

                    // Step Two:
                    newWall = new RectangleWall(name, color, height, length);
                } else if (shapeChoice.equals("2")) {
                    System.out.println("Enter wall side length >>> ");
                    int sideLength = Integer.parseInt(userInput.nextLine());

                    // Step Three:
                    newWall = new SquareWall(name, color, sideLength);
                } else if (shapeChoice.equals("3")) {
                    System.out.println("Enter wall height >>> ");
                    int height = Integer.parseInt(userInput.nextLine());
                    System.out.println("Enter wall base >>> ");
                    int base = Integer.parseInt(userInput.nextLine());

                    // Step Four:
                    //newWall = new TriangleWall(name, color, height, base);
                }

                // Step Two:
                //System.out.println("Added " + newWall + " wall - "
                //        + newWall.getArea() + " square feet");
                //walls.add(newWall);
            } else if (userChoice.equals("2")) {

                Map<String, Integer> colorChoiceAreas = new TreeMap<>();

                int totalArea = 0;
                // Step One:
//                for (int i = 0; i < walls.size(); i++) {
//                    System.out.println(
//                            String.format("Wall %d: %s - %d square ft", i + 1,
//                                    walls.get(i), walls.get(i).getArea()));
//                    totalArea = totalArea + walls.get(i).getArea();
//                    colorChoiceAreas.put(walls.get(i).getColor(),
//                            colorChoiceAreas
//                                    .getOrDefault(walls.get(i).getColor(), 0)
//                                    + walls.get(i).getArea());
//                }

                System.out.println("===============================");
                System.out.println("Total Area: " + totalArea + " square feet");

                // 1 gallon of paint covers 400 square feet
                for (Map.Entry<String, Integer> colorEntry : colorChoiceAreas
                        .entrySet()) {
                    double gallonsRequiredForColor =
                            (double) colorEntry.getValue() / 400;
                    System.out.println(colorEntry.getKey() + " Paint Required: "
                            + gallonsRequiredForColor + " gallons");
                }

                return;
            }
        }
    }
}
