package VP_HomeTask;

class Disk implements HavingArea {
    private final double radius;

    public Disk(double radius) {
        if (radius < 0)
            throw new ArithmeticException("Radius < 0");
        this.radius = radius;
    }

    public double countArea() {
        return Math.PI * radius * radius;
    }
}