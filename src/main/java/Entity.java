public class Entity {
    private double y;
    private double x;


    public Entity(double y, double x) {
        this.y = y;
        this.x = x;
    }

    public void move(double y, double x) {
        this.y = y;
        this.x = x;
    }

    public double getY() {
        return y;
    }

    public double getX() {
        return x;
    }

    public String toString() {
        return " координата х: " + this.x + " координата у: " + this.y;

    }

    @Override
    public boolean equals(Object ent) {
        System.out.println("я не мыл попу");
        Entity kot = (Entity) ent;
        return (this.x == kot.getX()) && (this.y == kot.getY());

    }
}


