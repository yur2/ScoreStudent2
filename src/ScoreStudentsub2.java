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

  System.out.println("�ڳ� �̸��� �����ΰ�~?");
  student.setName(scan.next());

  System.out.println("�ڳ� ���� ������ �� ���ΰ�~?");
  student.setKor(scan.nextInt());

  System.out.println("�ڳ� ���� ������ �� ���ΰ�~?");
  student.setMath(scan.nextInt());

  System.out.println("�ڳ� ���� ������ �� ���ΰ�~?");
  student.setEng(scan.nextInt());

  student.setNumber(cnt);

  students.add(student);
  cnt++;
 }

 public void choose() {
  System.out.println("\n[�� �Է��Ҳ��� 1 �ƴϸ� 2]");
  int n = scan.nextInt();
  if (n == 1) {
   input();
  } else if (n == 2) {
   num();
  }
 }

 public void num() {

  for (Student item : students) {

   System.out.println(item.getNumber() + "�� " + item.getName() + "�л��� " + "���� ���� :" + item.getKor() + " ���� ����:"
     + item.getMath() + " ���� ����:" + item.getEng() + " �Դϴ�~\n");

  }
  average();
  average(0);
  average(0,students.size());

 }

 public void average() {
  for (Student item : students) {
   sum = sum + item.getKor();
  }

  System.out.println("   �л����� ���� �� ��� ������ ? " + sum / students.size());

 }

 public void average(int sum) {
  for (Student item : students) {
   sum = sum + item.getMath();
  }

  System.out.println("\n   �л����� ���� �� ��� ������ ? " + sum / students.size());

 }

 public void average(int sum, int b) {
  for (Student item : students) {
   sum = sum + item.getEng();
  }

  System.out.println("\n   �л����� ���� �c ��� ������ ? " + sum / b);

 }
} 

 
