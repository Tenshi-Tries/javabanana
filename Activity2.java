import java.util.*;
public class Activity2{
public static void main(String[] args){

Scanner in = new Scanner(System.in);

String Name, Address, s1, s2, s3, s4, s5, course;
int Age, Student_id, u1, u2, u3, u4, u5, allUnits, allUnits2, choice ;
double g1, g2, g3, ug1, ug2, ug3,allGrades,tuition, tTuition, gwa, payment;

System.out.print("Enter a program:\n1.)Enrollment\n2.)View Grades\n");
choice = in.nextInt();

if(choice == 1){
System.out.println("Enrollment");
System.out.println("Enter Student ID: ");
Student_id = in.nextInt();

System.out.println("Enter Name: ");
Name = in.next();

System.out.println("Enter Course: ");
course = in.next();

System.out.println("Enter Address: ");
Address = in.next();


System.out.println("Enter Subject 1: ");
s1 = in.next();
System.out.println("Units: ");
u1 = in.nextInt();


System.out.println("Enter Subject 2: ");
s2 = in.next();
System.out.println("Units: ");
u2 = in.nextInt();

System.out.println("Enter Subject 3: ");
s3 = in.next();
System.out.println("Units: ");
u3 = in.nextInt();

System.out.println("Enter Subject 4: ");
s4 = in.next();
System.out.println("Units: ");
u4 = in.nextInt();

System.out.println("Enter Subject 5: ");
s5 = in.next();
System.out.println("Units: ");
u5 = in.nextInt();

allUnits2 = u1+u2+u3+u4+u5;
tuition = allUnits2*1500;
tTuition = tuition+10500;

System.out.println("-----------------------------------------------------");
System.out.println("                       Enrollment                      ");
System.out.println("USN: " + Student_id + "\tCourse: " + course);
System.out.println("Name: " + Name + "\t\tAddress: " + Address );

System.out.println("-----------------------------------------------------");
System.out.println("                       Subjects                      ");
System.out.println("Subject\tUnits ");
System.out.println(s1 +"\t"+ u1);
System.out.println(s2 +"\t"+ u2);
System.out.println(s3 +"\t"+ u3);
System.out.println(s4 +"\t"+ u4);
System.out.println(s5 +"\t"+ u5);

System.out.println("\t\tTotal Units: " + allUnits2);
System.out.println("Tuition fee: " + tuition);
System.out.println("Misc: 10500");
System.out.println("\nTotal Tuition:" + tTuition);
System.out.println("Enter Payment: ");
payment = in.nextDouble();
if(payment < tTuition){
    System.out.println("Change: 0");
}
else{
    System.out.println("Change: " + (payment-tTuition));
}
System.out.println("-----------------------------------------------------");
}



else{
    System.out.println("View Grades");
    System.out.println("Enter Student ID: ");
Student_id = in.nextInt();

System.out.println("Enter Name: ");
Name = in.next();

System.out.println("Enter Age: ");
Age = in.nextInt();

System.out.println("Enter Address: ");
Address = in.next();

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
}
