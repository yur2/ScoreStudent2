import java.util.Scanner;
import java.util.ArrayList;

public class ScoreStudentsub2 {

 Scanner scan;
 ArrayList<Student> students;
 static int sum = 0;
 int cnt = 1;

 public ScoreStudentsub2(Scanner scan, ArrayList<Student> students) {
  this.students = students;
  this.scan = scan;

 }

 public void input() {

  Student student = new Student();

  System.out.println("자네 이름은 무엇인가~?");
  student.setName(scan.next());

  System.out.println("자네 국어 성적은 몇 점인가~?");
  student.setKor(scan.nextInt());

  System.out.println("자네 수학 성적은 몇 점인가~?");
  student.setMath(scan.nextInt());

  System.out.println("자네 영어 성적은 몇 점인가~?");
  student.setEng(scan.nextInt());

  student.setNumber(cnt);

  students.add(student);
  cnt++;
 }

 public void choose() {
  System.out.println("\n[더 입력할꺼면 1 아니면 2]");
  int n = scan.nextInt();
  if (n == 1) {
   input();
  } else if (n == 2) {
   num();
  }
 }

 public void num() {

  for (Student item : students) {

   System.out.println(item.getNumber() + "번 " + item.getName() + "학생은 " + "국어 성적 :" + item.getKor() + " 수학 성적:"
     + item.getMath() + " 영어 성적:" + item.getEng() + " 입니다~\n");

  }
  average();
  average(0);
  average(0,students.size());

 }

 public void average() {
  for (Student item : students) {
   sum = sum + item.getKor();
  }

  System.out.println("   학생들의 국어 총 평균 점수는 ? " + sum / students.size());

 }

 public void average(int sum) {
  for (Student item : students) {
   sum = sum + item.getMath();
  }

  System.out.println("\n   학생들의 수학 총 평균 점수는 ? " + sum / students.size());

 }

 public void average(int sum, int b) {
  for (Student item : students) {
   sum = sum + item.getEng();
  }

  System.out.println("\n   학생들의 영어 촣 평균 점수는 ? " + sum / b);

 }
} 

 
