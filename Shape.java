abstract class Shape {

    private String color;

    // empty getArea method for overriding
    public abstract double getArea();

    public abstract double getParameter();


    public String getColor() {
        return color;
    }

    public void setColor(String color) {
        this.color = color;
    }


}


