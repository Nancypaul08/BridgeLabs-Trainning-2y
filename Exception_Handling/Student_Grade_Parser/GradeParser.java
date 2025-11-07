package Student_Grade_Parser;

public class GradeParser {
    public static void main(String[] args) {
        String[] grades = {"90", "A+", "85", "B", "70"}; // sample grade list

        for (String grade : grades) {
            try {
                int numericGrade = Integer.parseInt(grade); // converting to integer
                System.out.println("Valid Grade: " + numericGrade);
            } catch (NumberFormatException e) {
                System.out.println("Invalid grade input: " + grade);
            }
        }
    }
}

