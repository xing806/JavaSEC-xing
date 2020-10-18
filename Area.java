
class Trapezoid {
    private double top;
    private double bottom;
    private double height;

    Trapezoid(double atop,double abottom,double aheight){
        top = atop;
        bottom = abottom;
        height = aheight;
    }
    public double getTrapezoidArea(){
        double TrapezoidArea = (top + bottom) * height / 2;
        return TrapezoidArea;
    }
}
class Circle{
    private double radius;
    Circle(double aradius){
        radius = aradius;
    }
    public double getCircleArea(){
        double CircleArea = 3.14 * radius * radius;
        return CircleArea;
    }
}
class GetArea{
    public static void main(String[] args){
        Trapezoid s = new Trapezoid(2.5,4.5,2);
        System.out.println("The area of the Trapezoid is " + s.getTrapezoidArea());
        Circle n = new Circle(2);
        System.out.println("The area of the Circle is " + n.getCircleArea());
    }
}


