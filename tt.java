public class tt {


    private Square wall;
    private Square window;
    private Triangle roof;
    private Circle sun;
    private Circle sun2;

    public tt()
    {
        // nothing to do... instance variables are automatically set to null
    }


    public void draw()
    {
        wall = new Square();
        wall.moveVertical(80);
        wall.changeSize(100);
        wall.makeVisible();

        window = new Square();
        window.changeColor("black");
        window.moveHorizontal(20);
        window.moveVertical(100);
        window.makeVisible();

        roof = new Triangle();
        roof.changeSize(50, 140);
        roof.moveHorizontal(60);
        roof.moveVertical(70);
        roof.makeVisible();

        sun = new Circle();
        sun.changeColor("yellow");
        sun.moveHorizontal(180);
        sun.moveVertical(-10);
        sun.changeSize(60);
        sun.makeVisible();

    }

   public void sunset()
    {
        sun.makeInvisible();

        sun2 = new Circle();
        sun2.changeColor("yellow");
        sun2.moveHorizontal(180);
        sun2.moveVertical(-10);
        sun2.changeSize(60);
        sun2.makeVisible();
        sun2.slowMoveVertical(100);
    }

    public static void main(String[] args) {
        tt picture = new tt();
        picture.draw();
        picture.sunset();
    }
}
