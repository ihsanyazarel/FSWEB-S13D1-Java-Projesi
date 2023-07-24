import static java.lang.Math.*;
public class Main {
    public static void main(String[] args) {
        System.out.println(shouldWakeUp(true, 1));
        System.out.println(shouldWakeUp(false, 2));
        System.out.println(shouldWakeUp(true, 8));
        System.out.println(shouldWakeUp(true, -1));

        System.out.println("---------------------------");

        System.out.println(hasTeen(9,99,19));
        System.out.println(hasTeen(23,15,42));
        System.out.println(hasTeen(22,23,24));

        System.out.println("---------------------------");

        System.out.println(isCatPlaying(true,10));
        System.out.println(isCatPlaying(false,36));
        System.out.println(isCatPlaying(false,35));

        System.out.println("---------------------------");

        System.out.println(area(5.0,4.0));
        System.out.println(area(-1.0,4.0));

        System.out.println("---------------------------");

        System.out.println(area(5.0));
        System.out.println(area(-1.0));
    }

    public static boolean shouldWakeUp(boolean bark, int time) {
        return (time < 24 && time > -1) && bark && (time > 20 || time < 8);
    }
    public static boolean hasTeen(int ...args) {
        for (int i : args){
            if (i<=19 && i >= 13){
                return true;
            }
        }
        return false;
    }
    public static boolean isCatPlaying(boolean isSummer, int heat) {
        return isSummer ? heat >= 25 && heat <=45 : heat >= 25 && heat <=35;
    }
    public static double area(double length1, double length2) {
        if(length1<0 || length2 < 0){
            return -1;
        }
        return length1 * length2;
    }
    public static double area(double radius) {
        return radius<0 ? -1 : PI * radius * radius;
    }
}

