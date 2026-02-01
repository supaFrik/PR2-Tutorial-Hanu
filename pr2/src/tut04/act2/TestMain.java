package tut04.act2;

public class TestMain {
    public static void main(String[] args) {

        // Test Point
        Point p1 = new Point(1.5f, 2.5f);
        System.out.println(p1);              // (1.5,2.5)

        p1.setXY(3.0f, 4.0f);
        float[] xy = p1.getXY();
        System.out.println("x=" + xy[0] + ", y=" + xy[1]);

        // Test MovablePoint
        MovablePoint mp1 = new MovablePoint(1.0f, 1.0f, 0.5f, 0.5f);
        System.out.println(mp1);             // (x,y),speed=(xs,ys)

        mp1.move();                          // move once
        System.out.println("After move: " + mp1);

        mp1.setSpeed(1.0f, 1.5f);
        mp1.move().move();                   // chain move
        System.out.println("After 2 moves: " + mp1);
    }
}
