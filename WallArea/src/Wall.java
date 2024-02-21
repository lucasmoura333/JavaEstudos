public class Wall {

    private double width;
    private double height;

    public Wall() {}

    public Wall(double width, double height){
        setHeight(height);
        setWidth(width);
    }

    public void setWidth(double width){
        if (width < 0){
            width = 0;
        }
        this.width = width;
    }

    public double getWidth(){
        return width;
    }

    public void setHeight(double height){
        if (height < 0){
            height = 0;
        }
        this.height = height;
    }
    public double getHeight(){
        return height;
    }

    public double getArea(){
        return width * height;
    }

}
