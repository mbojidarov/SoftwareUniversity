package ClassBoxDataValidation;

import java.text.DecimalFormat;

public class Box {
    private double length;
    private double width;
    private double height;

    public Box(double length, double width, double height){
        this.setLength(length);
        this.setWidth(width);
        this.setHeight(height);
    }

    private boolean validateValue(double value, String prefix) {
        if (value <= 0){
            throw new IllegalArgumentException(prefix + " cannot be zero or negative.");
        }
        return true;
    }

    private void setLength(double length){
        String prefix = "Length";
       if (validateValue(length, prefix)){
           this.length = length;
       }
    }

    private void setWidth(double width){
        String prefix = "Width";
        if (validateValue(width, prefix)){
            this.width = width;
        }
    }

    private void setHeight(double height){
        String prefix = "Height";
        if (validateValue(height, prefix)){
            this.height = height;
        }
    }
    public double calculateSurfaceArea (){
        return 2 * length * width + calculateLateralSurfaceArea();
//        return 2 * length * width +  2 * length * height + 2 * width * height;
    }
    public double calculateLateralSurfaceArea (){
        return 2 * length * height +  2 * width * height;
    }
    public double calculateVolume(){
        return this.length * this.height * this.width;
    }

    @Override
    public String toString() {

        DecimalFormat formatter = new DecimalFormat("##.00##");
        return String.format("Surface Area - %s%nLateral Surface Area - %s%nVolume - %s",
                formatter.format(calculateSurfaceArea()),
                formatter.format(calculateLateralSurfaceArea()),
                formatter.format(calculateVolume()));
    }
}
