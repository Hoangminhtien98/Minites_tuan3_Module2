public class Student extends Human {
    private double math;
    private double physics;
    private double chemistry;
    private double avgPoint;

    public Student( String name, int age, double math, double physics, double chemistry, double avgPoint) {
        super( name, age);
        this.math = math;
        this.physics = physics;
        this.chemistry = chemistry;
        this.avgPoint = avgPoint;
    }

    public double getMath() {
        return math;
    }

    public void setMath(double math) {
        this.math = math;
    }

    public double getPhysics() {
        return physics;
    }

    public void setPhysics(double physics) {
        this.physics = physics;
    }

    public double getChemistry() {
        return chemistry;
    }

    public void setChemistry(double chemistry) {
        this.chemistry = chemistry;
    }

    public double getAvgPoint() {
        return avgPoint;
    }

    public void setAvgPoint(double avgPoint) {
        this.avgPoint = avgPoint;
    }

    @Override
    public String toString() {
        return "Student{" + super.toString() +
                "math=" + math +
                ", physics=" + physics +
                ", chemistry=" + chemistry +
                ", avgPoint=" + avgPoint +
                '}';
    }
}
