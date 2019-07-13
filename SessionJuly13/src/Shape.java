public class Shape {

    double height;
    double width;

    public Shape(double height, double width) {
        this.height = height;
        this.width = width;
    }

    public void setHeight(double height) {
        this.height = height;
    }


    public void printType(){
        if(this.height == this.width) {
            System.out.println("Squaure");
        }else {
            System.out.println("Rentangle");
        }
    }


}
