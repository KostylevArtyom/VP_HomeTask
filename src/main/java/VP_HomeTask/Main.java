package VP_HomeTask;

import java.util.ArrayList;
import java.util.Random;
import java.util.Scanner;

public class Main
{
    public static void main(String[] args) {
        int rectangleCount = readInt("Please, type rectangle count:");
        int diskCount = readInt("Please, type disk count:");
        int triangleCount = readInt("Please, type triangle count:");

        ArrayList<HavingArea> scopes = new ArrayList<>(rectangleCount + diskCount + triangleCount);

        for(int i = 0; i < rectangleCount; i++)
            scopes.add(createRandomRectangle(Utils.SIZE_MAX));

        for(int i = 0; i < diskCount; i++)
            scopes.add(createRandomDisk(Utils.SIZE_MAX));

        for(int i = 0; i < triangleCount; i++)
            scopes.add(createRandomTriangle(Utils.SIZE_MAX));

        for(int i = 0; i < scopes.size(); i++)
            System.out.println(scopes.get(i).countArea());
    }

    private static int readInt(String prompt) {
        System.out.println(prompt);

        Scanner sc = new Scanner(System.in);
        int count;

        while(true) {
            while(!sc.hasNextInt())
                sc.next();
            count = sc.nextInt();
            if (count >= 0)
                return count;
        }
    }

    private static Rectangle createRandomRectangle(int size_max) {
        Random rand = new Random();
        return new Rectangle(size_max * rand.nextDouble(), size_max * rand.nextDouble());
    }

    private static Disk createRandomDisk(int size_max) {
        Random rand = new Random();
        return new Disk(size_max * rand.nextDouble());
    }

    private static Triangle createRandomTriangle(int size_max) {
        Random rand = new Random();
        try {
            return new Triangle(size_max * rand.nextDouble(), size_max * rand.nextDouble(), size_max * rand.nextDouble());
        }
        catch (ArithmeticException e) {
            return createRandomTriangle(size_max);
        }
    }
}