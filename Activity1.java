import java.util.*;
public class Activity1{
public static void main(String[]args){

Scanner in = new Scanner(System.in);

String Name, Address, s1, s2, s3;
int Age, Student_id, u1, u2, u3, allUnits ;
double g1, g2, g3, ug1, ug2, ug3,allGrades, gwa;

System.out.println("Enter Student ID: ");
Student_id = in.nextInt();

System.out.println("Enter Name: ");
Name = in.next();

System.out.println("Enter Age: ");
Age = in.nextInt();

System.out.println("Enter Address: ");
Address = in.next();

System.out.println("Student ID: " + Student_id + "\tAge: " + Age);
System.out.println("Name: " + Name + "\t\tAddress: " + Address );


System.out.println("Enter Subject 1: ");
s1 = in.next();
System.out.println("Units: ");
u1 = in.nextInt();
System.out.println("Grades: ");
g1 = in.nextDouble();


System.out.println("Enter Subject 2: ");
s2 = in.next();
System.out.println("Units: ");
u2 = in.nextInt();
System.out.println("Grades: ");
g2 = in.nextDouble();

System.out.println("Enter Subject 3: ");
s3 = in.next();
System.out.println("Units: ");
u3 = in.nextInt();
System.out.println("Grades: ");
g3 = in.nextDouble();

System.out.println("Subject 1: " + s1);
System.out.println("Units: " + u1);
System.out.println("Grades: " + g1);

System.out.println("Subject 1: " + s2);
System.out.println("Units: " + u2);
System.out.println("Grades: " + g2);

System.out.println("Subject 3: " + s3);
System.out.println("Units: " + u3);
System.out.println("Grades: " + g3);

allUnits = u1+u2+u3;
ug1 = u1*g1;
ug2 = u2*g2;
ug3 = u3*g3;
allGrades = ug1+ ug2 + ug3;
gwa = allGrades/allUnits; 
System.out.println("-----------------------------------------------------");
System.out.println("                       Outputs                      ");
System.out.println("Student ID: " + Student_id + "\tAge: " + Age);
System.out.println("Name: " + Name + "\t\tAddress: " + Address );

System.out.println("-----------------------------------------------------");
System.out.println("                       Subjects                      ");
System.out.println("Subject\tUnits\tGrades ");

System.out.println(s1 +"\t"+ u1 + "\t" + g1);
System.out.println(s2 +"\t"+ u2 + "\t" + g2);
System.out.println(s3 +"\t"+ u3 + "\t" + g3);

System.out.println("\t\t\tGWA: " + gwa);
System.out.println("-----------------------------------------------------");
}
}