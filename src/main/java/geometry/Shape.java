package geometry;

enum FillType{
    FILLED,
    NOT_FILLED
}

public class Shape {
    String color;
    FillType type;
    public Shape(String color, FillType type){
        this.color = color;
        this.type = type;
    }
}
