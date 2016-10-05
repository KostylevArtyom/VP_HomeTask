package VP_HomeTask;

class Triangle implements HavingArea {
    private final double side_a, side_b, side_c;

    public Triangle(double side_a, double side_b, double side_c) {
        if ((side_a < 0) || (side_b < 0) || (side_c < 0))
            throw new ArithmeticException("Size < 0");
        if ((side_a + side_b < side_c) || (side_a + side_c < side_b) || (side_b + side_c < side_a))
            throw new ArithmeticException("One size is bigger than two others");
        this.side_a = side_a;
        this.side_b = side_b;
        this.side_c = side_c;
    }

    public double countArea() {
        //Heron's formula: S = sqrt(p * (p - a) * (p - b) * (p - c))
        //                 p = (a + b + c)/2
        double semiperimeter = (side_a + side_b + side_c) / 2;
        return Math.sqrt(semiperimeter * (semiperimeter - side_a) * (semiperimeter - side_b) * (semiperimeter - side_c));
    }
}