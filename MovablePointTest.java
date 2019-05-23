package Lession4;

public class MovablePointTest {
    public static void main(String[] args){
        MovablePoint movapoint = new MovablePoint();
        movapoint = new MovablePoint(5,5);
        System.out.println(movapoint);
        movapoint = new MovablePoint(3,3,7,7);
        System.out.println(movapoint);

        movapoint.move();
        System.out.println(movapoint);
    }
}
