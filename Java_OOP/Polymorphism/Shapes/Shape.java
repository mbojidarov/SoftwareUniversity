package Shapes;

public abstract class Shape {
    private Double perimeter;
    private Double area;

    protected abstract Double calculatePerimeter();

    protected abstract Double calculateArea();


    public Double getPerimeter() {
        return this.perimeter;
    }

    private void setPerimeter(Double perimeter) {
        this.perimeter = perimeter;
    }

    public Double getArea() {
        return this.area;
    }

    private void setArea(Double area) {
        this.area = area;
    }
}
