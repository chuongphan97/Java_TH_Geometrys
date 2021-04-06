public class Circle extends Shape {
    private double radius = 1.0;
    public Circle(String color, boolean filled, double radius){
        super(color, filled);
        this.radius = radius;
    }
    public Circle(double radius){
        this.radius = radius;
    }

    public Circle() {

    }

    public double getRadius() {
        return radius;
    }

    public void setRadius(double radius) {
        this.radius = radius;
    }
    public double getArea(){
        return this.radius*this.radius*Math.PI;
    }
    public double getPerimeter(){
        return 2*this.radius*Math.PI;
    }
    public String toString(){
        return "A Circle with radius = " + this.getRadius() + ", which is a subclass of" + super.toString();
    }
}
