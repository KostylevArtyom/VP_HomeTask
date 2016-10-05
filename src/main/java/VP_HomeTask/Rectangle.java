package VP_HomeTask;

class Rectangle implements HavingArea {
    private final double side_a, side_b;

    public Rectangle(double side_a, double side_b) {
        if ((side_a < 0) || (side_b < 0))
            throw new ArithmeticException("Size < 0");
        this.side_a = side_a;
        this.side_b = side_b;
    }

    public double countArea() {
        return side_a * side_b;
    }
}