
class Ball {
    double radius;
    String s;
}

class Box {
    double height;
    Ball ball;

    double radius(){
        return ball.radius;
    }

    double volume(){
        return height * height * height;
    }

    Box(){
        height = 5.0;
    }

    Box(double h){
        height = h;
    }
}

public class News {

    public static void main(String[] args) {

        Ball bigBall = new Ball();
        bigBall.radius = 2.0;
        bigBall.s = "red";
        System.out.println(bigBall.radius + bigBall.s);

        Box korobka = new Box();
        korobka.ball = bigBall;
        korobka.height = 2.0;
        System.out.println(korobka.ball.radius);

        System.out.println(korobka.radius());
        System.out.println(korobka.volume());

        Box bigBox = new Box();
        System.out.println(bigBox.height);
        System.out.println(bigBox.volume());

        Box someBox = new Box(10);
        System.out.println(someBox.volume());
    }
}
