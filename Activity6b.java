import java.util.*;
public class Activity6b{
public static void main(String[] args){

Scanner in = new Scanner(System.in);

String name, address, course;
int misc, age,studentID, subInput, choice, pmChoice;
double tTuition, discount,p2, p3, p4, in2,in3,in4,pd2,pd3,pd4, cash, payment, remainingTF;


System.out.print("Enter a program:\n1.)Enrollment\n2.)View Grades\n");
choice = in.nextInt();

if(choice == 1){
    System.out.println("Enrollment");
    System.out.println("Enter Student ID: ");
    studentID = in.nextInt();
    
    System.out.println("Enter Name: ");
    in.nextLine();
    name = in.nextLine();
    
    System.out.println("Enter Course: ");
    course = in.nextLine();
    
    System.out.println("Enter Address: ");
    address = in.nextLine();

    System.out.println("Enter how many subjects you have: ");
    subInput = in.nextInt();
    in.nextLine();

    String subjectName[] = new String[subInput];
    int units[] = new int[subInput];
    int totalUnits = 0;

    for(int i=0; i < subInput ; i++){
        System.out.println("Enter subject name: ");
        subjectName[i] = in.nextLine();
        System.out.println("Enter units: ");
        units[i] = in.nextInt();
        in.nextLine();
        totalUnits += units[i];
    }

    tTuition = (totalUnits*1500) + 10300;
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
    System.out.println("USN: " + studentID + "\t\t\t\tCourse: " + course);
    System.out.println("Name: " + name + "\t\t\t\tAddress: " + address );

    System.out.println("-----------------------------------------------------");
    System.out.println("                       Subjects                      ");
    for(int i=0 ; i < subInput ; i++){
        System.out.println(subjectName[i] + "\t\t" + units[i]);}
    System.out.println("Total Units: " + totalUnits);
    System.out.println("Tuition fee: " + (tTuition-10500));
    System.out.println("Misc: 10500");
    System.out.println("Total Tuition:" + tTuition);
    System.out.println("------------------------------------------------------------------------");
    System.out.println("                    Term Payment Plan                     ");
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
    System.out.println("Payment Plans: ");
    System.out.println("1.) Full \t3.)3 Payments\n2.)2 Payments\t4.)4 Payments");
    System.out.println("Enter Payment Plan: ");
    choice = in.nextInt();
    
String cardType, bank, chequeName, cardNum;
int approvalNum, chequeNum;

System.out.println("Payment Modes: ");
System.out.println("1.) Card\n2.) Cash\n3.) Cheque");
System.out.println("Enter Payment Mode: ");
pmChoice= in.nextInt();
switch(pmChoice){
    case 1:
        System.out.println("You have chosen to pay with a card.");
        System.out.println("Enter your card type: [visa/amex/mastercard]");
        in.nextLine();
        cardType = in.nextLine();
        /*this should have a loop wherein if use inputs a value with no more or less than 13 digits --- length?? */
        do{
            System.out.println("Enter your card number: ");
            cardNum = in.nextLine();
            if (cardNum.length() != 13){
                System.out.println("\nInput 13 digits please.");
            }
        } while(cardNum.length() != 13);
        /*******************************************************************/
        System.out.println("Enter your approval number: ");
        approvalNum = in.nextInt();
        if(choice == 1){
            System.out.println("You have fully paid for your tuition fee.");
            choice = 5;
        }else if(choice == 2){
            remainingTF = p2 - pd2;
	        System.out.println("Remaining Tuition Fee: "+ remainingTF);
            choice = 5;
        }else if(choice == 3){
            remainingTF = p3 - pd3;
	        System.out.println("Remaining Tuition Fee: "+ remainingTF);
            choice = 5;
        }else if(choice == 4){
            remainingTF = p4 - pd4;
	        System.out.println("Remaining Tuition Fee: "+ remainingTF);
            choice = 5;
        }
        break;
    case 2:
        System.out.println("You have chosen to pay in cash.");
        break;
    case 3:
        System.out.println("You have chosen to pay with a cheque.");
        System.out.println("Enter your bank's name: ");
        in.nextLine();
        bank = in.nextLine();
        System.out.println("Enter your cheque number: ");
        chequeNum = in.nextInt();
        System.out.println("Enter the name in your cheque: ");
        in.nextLine();
        chequeName = in.nextLine();
        break;
}
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
    case 5:
        System.out.println("You are now officially enrolled. See you in class!.");
    }
}
else{
    System.out.println("View Grades");

    System.out.println("Enter Student ID: ");
    studentID = in.nextInt();
    System.out.println("Enter Name: ");
    in.nextLine();
    name = in.nextLine();

    System.out.println("Enter Age: ");
    age = in.nextInt();

    System.out.println("Enter Address: ");
    in.nextLine();
    address = in.nextLine();

    System.out.println("Enter how many subjects you have: ");
    subInput = in.nextInt();
    in.nextLine();

    String subjectName[] = new String[subInput];
    int units[] = new int[subInput];
    double grades[] = new double[subInput];
    int totalUnits = 0;

    for(int i=0; i < subInput; i++){
        System.out.println("Enter subject: ");
        subjectName[i] = in.nextLine();
        System.out.println("Units: ");
        units[i] = in.nextInt();
        System.out.println("Grades: ");
        grades[i] = in.nextDouble();
        in.nextLine();
        totalUnits += units[i];
    }

    double unitGrade[] = new double[subjectName.length];
    double allGrades = 0;
    for(int i = 0; i < subjectName.length; i++){
        unitGrade[i] = (units[i])*(grades[i]);
        allGrades += unitGrade[i];
    }
    double gwa = allGrades/totalUnits;
    System.out.println("-----------------------------------------------------");
    System.out.println("                   View Grades                      ");
    System.out.println("Student ID: " + studentID + "\t\t\t\tAge: " + age);
    System.out.println("Name: " + name + "\t\t\t\tAddress: " + address );

    System.out.println("-----------------------------------------------------");
    System.out.println("                       Subjects                      ");
    System.out.println("Subject\t\t\tUnits\tGrades ");
    for(int i = 0; i < subjectName.length; i++){
        System.out.println(subjectName[i] + "\t\t\t" + units[i] + "\t" + grades[i] );
    }
    System.out.println("\t\t\tGWA: " + gwa);
    System.out.println("-----------------------------------------------------");
}
}
}
