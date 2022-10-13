package at.ac.fhcampuswien;

import java.util.Scanner;

public class App {

    Scanner scanner = new Scanner(System.in);
    //todo Task 1
    public void largestNumber(){
        // input your solution here
        // case 1: bis Input 0
        // do while
        double number, largest;
        int x = 1;
        largest = 1;



       /* do {
            System.out.print("Number " + x + ": ");
            number = scanner.nextDouble();

            if( (number <= 0) && (x==1)){
                System.out.print("No number entered.");
                x++;
            }else if ((number <=0) && (x>1)) {
                System.out.print("The largest number is ");
                System.out.printf("%.2f", largest);
                System.out.println();
                x++;
            }else if (number > largest) {
                largest = number;
                x++;
            }else
                x++;
        }while (number != 0) ;*/


    }

    //todo Task 2
    public void stairs(){
        // input your solution here
        // keine Arrays verwenden
        //debugger benutzen
        //Schleife verschachteln
        /*int n, counter;
        int rows;
        int cols;
        counter = 1;
        System.out.print("n: ");
        n = scanner.nextInt();


        for (rows = 0; rows < n; rows++){
            for (cols = 0; cols <= rows; cols++, counter++ ){
                System.out.print(counter + " ");
            }System.out.println("");
        }*/




    }

    //todo Task 3
    public void printPyramid(){
        // input your solution here
       /* int rows = 6;




        for (int z = 0; z < rows; z++ ){
            for (int spaces = rows - 1; spaces > z ; spaces--){
                System.out.print(" ");
            }for (int stars = 0; stars <=z*2; stars++ ){
                System.out.print("*");
            }
            System.out.println();



        }*/


    }

    //todo Task 4
    public void printRhombus(){
        // input your solution here
        int h;
        char c;

        System.out.print("h: ");
        h = scanner.nextInt();
        System.out.print("c: ");
        c = scanner.next().charAt(0); //stackoverflow.com
        int letter = c ;
        int count = 0;
        int number = 0;



        for ( int i = 1; i <= h ; i++){

            if ( i <= h/2 + 1){
                count = 2 * i - 1;
                number = i;
            }else{
                count = count - 2;
                number = i;
            }
            for( int j = 1; j <= count ; j++){
                System.out.print(number);
            }





            System.out.println();
        }







    }

    //todo Task 5
    public void marks(){
        // input your solution here
        //
    }

    //todo Task 6
    public void happyNumbers(){
        // input your solution here
        //aufhören bei 1 oder 4
        int n;
        System.out.print("n: ");
        n = scanner.nextInt();




    }

    public static void main(String[] args){
        App exercise2 = new App();

        System.out.println("Task 1: Largest Number");
        exercise2.largestNumber();

        System.out.println("\nTask 2: Stairs");
        exercise2.stairs();

        System.out.println("\nTask 3: Pyramide");
        exercise2.printPyramid();

        System.out.println("\nTask 4: Raute");
        exercise2.printRhombus();

        System.out.println("\nTask 5: Notendurchschnitt");
        exercise2.marks();

        System.out.println("\nTask 6: Fröhliche Zahlen");
        exercise2.happyNumbers();
    }
}