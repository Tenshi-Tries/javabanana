import java.util.*;
public class Activity3{
public static void main(String[] args){

Scanner in = new Scanner(System.in);

String Name, Address, s1, s2, s3, s4, s5, course;
int Age, Student_id, u1, u2, u3, u4, u5, allUnits, allUnits2, choice ;
double tuition, tTuition, discount, p2, p3, p4, in2,in3,in4,pd2,pd3,pd4, cash, payment, remainingTF;
double g1, g2, g3, ug1, ug2, ug3,allGrades, gwa;

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
tTuition = tuition+10300;
discount = tTuition*0.1;
cash = tTuition-discount;
in2 = (tTuition*0.05);
in3 = (tTuition*0.08);
in4 = (tTuition*0.1);
p2 = tTuition + in2;
p3 = tTuition + in3;
p4 = tTuition + in4;
pd2 = p2/2;
pd3 = p3/3;
pd4 = p4/4;

System.out.println("-----------------------------------------------------");
System.out.println("                       Enrollment                      ");
System.out.println("USN: " + Student_id + "\t\tCourse: " + course);
System.out.println("Name: " + Name + "\t\tAddress: " + Address );

System.out.println("-----------------------------------------------------");
System.out.println("                       Subjects                      ");
System.out.println("Subject\t\tUnits ");
System.out.println(s1 +"\t\t"+ u1);
System.out.println(s2 +"\t\t"+ u2);
System.out.println(s3 +"\t\t"+ u3);
System.out.println(s4 +"\t\t"+ u4);
System.out.println(s5 +"\t\t"+ u5);

System.out.println("Total Units: " + allUnits2);
System.out.println("Tuition fee: " + tuition);
System.out.println("Misc: 10500");
System.out.println("Total Tuition:" + tTuition);
System.out.println("------------------------------------------------------------------------");
System.out.println("                    Term Payment                     ");
System.out.println("\t\t1st\t\t2nd\t\t3rd\t\t4th");
System.out.println("Cash\t\t"+tTuition+"\t\t"+tTuition+"\t\t"+tTuition+"\t\t"+tTuition);
System.out.println("Discount\t"+discount+"\t\t0"+"\t\t0"+"\t\t0");
System.out.println("Interest\t0"+"\t\t"+in2+"\t\t"+in3+"\t\t"+in4);
System.out.println("\t\t-------------------------------------------------------");
System.out.println("Total\t\t"+cash+"\t\t"+p2+"\t\t"+p3+"\t\t"+p4);
System.out.println("\t\t\t\t"+pd2+"\t\t"+pd3+"\t\t"+pd4);
System.out.println("\t\t\t\t"+pd2+"\t\t"+pd3+"\t\t"+pd4);
System.out.println("\t\t\t\t\t\t"+pd3+"\t\t"+pd4);
System.out.println("\t\t\t\t\t\t\t\t"+pd4);
System.out.println("------------------------------------------------------------------------");
System.out.println("1.) Cash \t3.)3 Payments\n2.)2 Payments\t4.)4 Payments");
System.out.println("Enter Payment Mode: ");
choice = in.nextInt();
switch(choice){
    case 1:
        System.out.println("Enter Payment: ");
        payment = in.nextDouble();
        if(payment <= cash){
            System.out.println("Insufficient Balance: " + (cash-payment));
            System.out.println("Remaining Tuition Fee: "+ (cash-payment));
        }
        else{
            System.out.println("Change: " + (payment-cash));
            System.out.println("You have fully paid your tuition fee.");
        }
        System.out.println("-----------------------------------------------------");
        break;
    case 2:
        System.out.println("Enter Payment: ");
        payment = in.nextDouble();
        if(payment <= pd2){
            System.out.println("Insufficient Balance: " + (pd2-payment));
            remainingTF = p2 - payment;
            System.out.println("Remaining Tuition Fee: "+ remainingTF);
	}
        else{
            System.out.println("Change: " + (payment-pd2));
            remainingTF = p2 - pd2;
	        System.out.println("Remaining Tuition Fee: "+ remainingTF);
        }
        System.out.println("-----------------------------------------------------");
        break;
    case 3:
        System.out.println("Enter Payment: ");
        payment = in.nextDouble();
        if(payment <= pd3){
            System.out.println("Insufficient Balance: " + (pd3-payment));
            remainingTF = p3 - payment;
            System.out.println("Remaining Tuition Fee: "+ remainingTF);
	}
        else{
            System.out.println("Change: " + (payment-pd3));
            remainingTF = p3 - pd3;
	        System.out.println("Remaining Tuition Fee: "+ remainingTF);
        }
        System.out.println("-----------------------------------------------------");
        break;
    case 4:
        System.out.println("Enter Payment: ");
        payment = in.nextDouble();
        if(payment <= pd4){
            System.out.println("Insufficient Balance: " + (pd4-payment));
            remainingTF = p4 - payment;
            System.out.println("Remaining Tuition Fee: "+ remainingTF);
            }
        else{
            System.out.println("Change: " + (payment-pd4));
            remainingTF = p4 - pd4;
	        System.out.println("Remaining Tuition Fee: "+ remainingTF);
        }
        System.out.println("-----------------------------------------------------");
        break;
}
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
System.out.println("Student ID: " + Student_id + "\t\tAge: " + Age);
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