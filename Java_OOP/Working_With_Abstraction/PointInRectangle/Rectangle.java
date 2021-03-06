package PointInRectangle;

public class Rectangle {
    private Point bottomLeft;  //Coordinates
    private Point topRight;

public Rectangle(Point bottomLeft, Point topRight){
    this.bottomLeft = bottomLeft;
    this.topRight = topRight;
}

public boolean contains(Point point){
    return this.bottomLeft.isGreaterOrEqual(point)
            && this.topRight.isLessOrEqual(point);
}
}
