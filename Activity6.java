import java.util.*;
public class Activity6{
public static void main(String[] args){

Scanner in = new Scanner(System.in);

int subInput, tTuition, misc;
System.out.println("Enter how many subjects you have: ");
subInput = in.nextInt();
in.nextLine();

String subjectName[] = new String[subInput];
int units[] = new int[subInput];

for(int i=0; i < subInput ; i++){
    System.out.println("Enter subject name: ");
    subjectName[i] = in.nextLine();
    System.out.println("Enter units: ");
    units[i] = in.nextInt();
    in.nextLine();
}
System.out.println("---------------------------------------");
int sum = 0;
for(int i=0 ; i < subInput ; i++){
    System.out.println("Subjects\tUnits");
    System.out.println(subjectName[i] + "\t\t" + units[i]);
    sum += units[i];
}
System.out.println("---------------------------------------");
misc = 10300;
System.out.println("Misc fee: " + misc);
tTuition = (sum*1500) + misc;
System.out.println("Total Tuition: " + tTuition);
}
}
