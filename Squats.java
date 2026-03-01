public class Squats extends Exercise{
    private int sets, reps;

    Squats(int sets, int reps){
        super("Squats"); // call parent (Exercise) constructor (name)
        this.sets = sets;
        this.reps = reps;
    }

    @Override
    public String getDetails() {
        return "Exercise: " + getName() + ", " + sets+ " sets x " + reps + " reps";
    }
}
