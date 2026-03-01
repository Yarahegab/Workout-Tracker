public class Pushups extends Exercise {
    private int sets, reps;

    Pushups(int sets, int reps){
        super("Pushups"); 
        this.sets = sets;
        this.reps = reps;
    }

    @Override
    public String getDetails(){
        return "Exercise: " + getName() + ", " + sets+ " sets x " + reps + " reps";
    }

}
