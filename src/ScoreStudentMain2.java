import java.util.ArrayList;
import java.util.Scanner;

public class ScoreStudentMain2 {

 static Scanner scan = new Scanner(System.in);
 static ArrayList<Student> students = new ArrayList<>();

 public static void main(String[] args) {

  ScoreStudentsub2 score = new ScoreStudentsub2(scan, students);

  System.out.println("\n============ �л� ���� ���� ���α׷� ============\n\n");

  score.input();

   //for (Student item : students) {
  for (int i = 0; i <= students.size(); i++) {
   score.choose();

  }

 }
} 
