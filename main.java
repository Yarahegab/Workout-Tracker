import java.util.Scanner;
import java.util.ArrayList;

public class main {
    public static void main(String[] args) {
        
        Scanner scanner = new Scanner(System.in);
        ArrayList<Workout> workouts = new ArrayList<>();
        boolean on = true;

        System.out.println("\nWelcome to the Workout Tracker!");

        while(on){
            System.out.println("\n====== MENU ======");
            System.out.println("1. Create a new workout");
            System.out.println("2. View workouts");
            System.out.println("3. Reset workout");
            System.out.println("4. Exit");
            System.out.print("Choose an option: ");
            int choice = scanner.nextInt();
            scanner.nextLine(); 

            switch(choice) {
                case 1:
                    System.out.print("Enter workout date: ");
                    String date = scanner.nextLine();
                    Workout workout = new Workout(date);

                    boolean add = true;
                    while(add) {
                        System.out.println("\n====== Add an exercise ======");
                        System.out.println("1. Squats");
                        System.out.println("2. Pushups");
                        System.out.println("3. Plank");
                        System.out.println("4. Running");
                        System.out.println("5. Done adding exercises");
                        System.out.print("Choose an exercise: ");
                        int exChoice = scanner.nextInt();
                        scanner.nextLine(); 
                        

                        switch(exChoice) {
                            case 1:
                                System.out.print("Enter sets: ");
                                int sets = scanner.nextInt();
                                System.out.print("Enter reps: ");
                                int reps = scanner.nextInt();
                                workout.addExercise(new Squats(sets, reps));
                                System.out.println("\nSquats added.");
                                break;
                            case 2:
                                System.out.print("Enter sets: ");
                                sets = scanner.nextInt();
                                System.out.print("Enter reps: ");
                                reps = scanner.nextInt();
                                workout.addExercise(new Pushups(sets, reps));
                                System.out.println("\nPushups added.");
                                break;
                            case 3:
                                System.out.print("Enter duration in seconds: ");
                                int duration = scanner.nextInt();
                                workout.addExercise(new Plank(duration));
                                System.out.println("\nPlank added.");
                                break;
                            case 4:
                                System.out.print("Enter distance in km: ");
                                double distance = scanner.nextDouble();
                                workout.addExercise(new Running(distance));
                                System.out.println("\nRunning added.");
                                break;
                            case 5:
                                add = false;
                                break;
                            default:
                                System.out.println("Invalid choice. Try again.");
                        }
                    }
                    workouts.add(workout);
                    break;
                case 2:
                    if(workouts.isEmpty()){
                        System.out.println("\nNo workouts added yet.");
                        break;
                    }
                    for(Workout w : workouts) {
                        w.displayWorkout();
                    }
                    break;
                case 3:
                    if(workouts.isEmpty()) {
                        System.out.println("\nNo workouts to reset.");
                        break;
                    }
                    System.out.println("\n====== Available workouts ======");
                    for(int i = 0; i < workouts.size(); i++) {
                        System.out.println((i+1)+". " + workouts.get(i).getDate()); 
                    }
                    System.out.print("Choose workout number to reset: ");
                    while(true) {
                        int workoutNum = scanner.nextInt();
                        if(workoutNum < 1 || workoutNum > workouts.size()) {
                            System.out.println("Invalid workout number.");
                        } else {
                            workouts.get(workoutNum - 1).reset();
                            workouts.remove(workoutNum - 1);
                            break;
                        }
                    }
                    break;
                case 4:
                    on = false;
                    System.out.println("\nExiting...");
                    return;
                default:
                    System.out.println("\nInvalid option. try again.");
            }
        }
    }
} 