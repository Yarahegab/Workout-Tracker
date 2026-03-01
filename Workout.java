import java.util.ArrayList;

public class Workout {
    private String date;
    private ArrayList<Exercise> exercises;

    Workout(String date) {
        this.date = date;
        exercises = new ArrayList<>();
    }

    public void addExercise(Exercise exercise) {
        exercises.add(exercise);
    }

    public String getDate() {
        return date;
    }

    public void reset(){
        exercises.clear();
        System.out.println("Workout reset. All exercises on " + date + " cleared.");
    }

    public void displayWorkout() {
        System.out.println();
        System.out.println("Workout Date: " + date);
        if(exercises.isEmpty()) {
            System.out.println("No exercises added yet.");
            return;
        }
        for (Exercise exercise : exercises) {
            System.out.println(" - " + exercise.getDetails());
        }
        System.out.println("Total exercises: " + exercises.size());
    }
}
