public class ShapeFactory {

    public Shape getShape(String hinh){
        if(hinh.equals("Circle")){
            return new Circle();
        }
        else if(hinh.equals("Rectangle")){
            return new Rectangle();
        }
        else if(hinh.equals("Square")){
            return new Square();
        }
        else {
            System.out.println("Shape not available");
            return null;
        }
    }
}
