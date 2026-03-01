public class Plank extends Exercise {
    private int duration; // in seconds

    Plank(int duration) {
        super("Plank");
        this.duration = duration;
    }

    @Override
    public String getDetails() {
        return "Exercise: " + getName() + ", Duration: " + duration + " seconds";
    }

}
