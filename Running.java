public class Running extends Exercise {
    private double distance;

    Running(double distance) {
        super("Running");
        this.distance = distance;
    }

    @Override
    public String getDetails() {
        return "Exercise: " + getName() + ", Distance: " + distance + " km.";
    }

}
