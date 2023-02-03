import java.util.*;
public class Activity4{
public static void main(String[] args){

Scanner in = new Scanner(System.in);
int i, a, wChoice, pChoice, quizOA, quiz, pt, ptOA, weightGChoice;
double ptSum, ptOASum, quizSum, quizOASum, exam, examOA;
double quizGrade, ptGrade, examGrade, core, applied, tvl;
char yn;

/*palibot sa buong code itong for loop na'to */
for (a = 1 ; a >= 1 ; ){
    
    do{
        System.out.println("1. Core\n2. Applied\n3. Specialize/TVL-Track");
        System.out.println("Enter Weight Component: ");
        weightGChoice = in.nextInt();
        if((weightGChoice >= 4) || (weightGChoice <=0)){
            System.out.println("\n\nPlease enter a number within the choices. Try again.");
        }

    }while(((weightGChoice >= 4) || (weightGChoice <=0)) && true );

   /***************************Written Works*********************************/
    System.out.println("Enter the number of written works you have: ");
    wChoice = in.nextInt();
    for(i=1, quizSum=0, quizOASum=0 ; i <= wChoice ; i++){
        System.out.println("Enter quiz " + i + " overall score: ");
        quizOA = in.nextInt();
        quizOASum += quizOA;
        System.out.println("Enter quiz " + i + " score: ");
        quiz = in.nextInt();
        quizSum += quiz;
    }
    System.out.println("\n\nTotal OA Quiz Score: "+quizOASum);
    System.out.println("Total Quiz Score: "+quizSum);

    quizGrade = quizSum/quizOASum*100;
    System.out.println("Quiz Grade: " + quizGrade);


    /************************Performance Tasks*****************************/
    System.out.println("\n\nEnter the number of Performance Tasks you have: ");
    pChoice = in.nextInt();
    for(i=1, ptSum=0, ptOASum=0 ; i <= pChoice ; i++){
        System.out.println("Enter Performance Task " + i + " overall score: ");
        ptOA = in.nextInt();
        ptOASum += ptOA;
        System.out.println("Enter Performance Task " + i + " score: ");
        pt = in.nextInt();
        ptSum += pt;
    }
    System.out.println("\n\nTotal OA Performance Score: "+ptOASum);
    System.out.println("Total Performance Score: "+ptSum);

    ptGrade = ptSum/ptOASum*100;
    System.out.println("PT Grade: " +ptGrade);


    /*********************************Exam***************************************/

    System.out.println("\n\nEnter Exam overall score: ");
    examOA = in.nextDouble();
    System.out.println("Enter Exam score: ");
    exam = in.nextDouble();
    examGrade = exam/examOA*100;
    System.out.println("Exam Grade: " +examGrade+"\n\n");

/********************************Weighted Grades*************************************/
    switch(weightGChoice){
        case 1:
            core = (quizGrade*.25)+(ptGrade*.5)+(examGrade*.25);
            System.out.println("Your Core Subject grade is: " + core);
            if(core >= 75){
                System.out.println("You passed.");
            }
            else{
                System.out.println("You failed.");
            }
            break;
        case 2:
            applied = (quizGrade*.25)+(ptGrade*.45)+(examGrade*.3);
            System.out.println("Your Applied Subject grade is: " + applied);
            if(applied >= 75){
                System.out.println("You passed.");
            }
            else{
                System.out.println("You failed.");
            }
            break;
        case 3:
            tvl = (quizGrade*.2)+(ptGrade*.6)+(examGrade*.2);
            System.out.println("Your Specialization Grade is: " + tvl);
            if(tvl >= 75){
                System.out.println("You passed.");
            }
            else{
                System.out.println("You failed.");
            }
            break;
    }
/*since sa for loop na nasa simula ng code, ay may condition na ang 'a' ay mag-ra run kapag may value na mahigit kaysa sa 1...*/
    do{
        System.out.println("\n\nDo you still want to use this program? [y/n] : ");
        yn = in.next().charAt(0);
            if (yn == 'y')
            {
                a++; /* increment sa value ng 'a' dahil ang condition natin sa taas ay a >= 1  para mag loop*/
            }
            else if (yn == 'n'){
                System.out.println("Thank you for using my program.");
                a = 0;} /* gawing 0 ang 'a' para mag stop ang buong code */
            else {
                    System.out.println("Error input. Try Again.");} /*pansalo lang pag hindi y/n ang input */
            } while (yn != 'n' && yn != 'y'); /*kaya [yn != n,y] kasi hindi mag l-loop pag hindi y/n ang kinabit mo. pangalawa itong pansalo */
    }
}
}