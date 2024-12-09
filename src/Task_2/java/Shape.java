public interface Shape {
    String getFillColor();

    String getBorderColor();

    default double calculatePerimeter() {
        throw new UnsupportedOperationException("Расчет периметра не реализован");
    }

    default double calculateArea() {
        throw new UnsupportedOperationException("Расчет площади не реализован");
    }
}
