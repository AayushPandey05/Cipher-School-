import java.util.Scanner;

public class Question_10 {
    private String name;
    private int rollNumber;
    private float marks;

    public Question_10(String name, int rollNumber, float marks) {
        this.name = name;
        this.rollNumber = rollNumber;
        this.marks = marks;
    }

    public void displayDetails() {
        System.out.println("Name: " + name + ", Roll Number: " + rollNumber + ", Marks: " + marks);
    }

    public void updateMarks(float newMarks) {
        this.marks = newMarks;
    }

    public void updateMarksByPercentage(float percentageIncrease) {
        this.marks += (this.marks * percentageIncrease / 100);
    }

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.println("Enter student details:");
        System.out.print("Name: ");
        String name = scanner.nextLine();
        System.out.print("Roll Number: ");
        int rollNumber = scanner.nextInt();
        scanner.nextLine();
        System.out.print("Marks: ");
        float marks = scanner.nextFloat();
        scanner.nextLine();

        Question_10 student = new Question_10(name, rollNumber, marks);

        System.out.println("\nUpdate marks:");
        System.out.print("New Marks: ");
        float newMarks = scanner.nextFloat();
        scanner.nextLine();
        student.updateMarks(newMarks);
        student.displayDetails();

        System.out.println("\nUpdate marks by percentage increase:");
        System.out.print("Percentage: ");
        float percentageIncrease = scanner.nextFloat();
        scanner.nextLine();
        student.updateMarksByPercentage(percentageIncrease);
        student.displayDetails();

        scanner.close();
    }
}