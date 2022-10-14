package at.ac.fhcampuswien;

import java.util.Scanner;

public class App {

    Scanner scanner = new Scanner(System.in);
    //todo Task 1
    public void largestNumber(){
        // input your solution here
        // case 1: bis Input 0
        // do while
        double number;
        int x = 1;
        double largest;

        System.out.print("Number 1: ");
        number = scanner.nextDouble();
        largest = number;

        if( (number <= 0) && (x==1)){
            System.out.println("No number entered.");

        }else {
            while (number > 0) {
                x++;
                System.out.print("Number " + x + ": ");
                number = scanner.nextDouble();

                if (number > largest)
                    largest = number;
            }
            System.out.print("The largest number is ");
            System.out.printf("%,.2f", largest);
            System.out.println();
        }




    }

    //todo Task 2
    public void stairs(){
        // input your solution here
        // keine Arrays verwenden
        //debugger benutzen
        //Schleife verschachteln
        int n, counter;
        int rows;
        int cols;
        counter = 1;
        System.out.print("n: ");
        n = scanner.nextInt();
        if (n<0){
            System.out.println("Invalid number!");
        }


        for (rows = 0; rows < n; rows++){
            for (cols = 0; cols <= rows; cols++, counter++ ){
                System.out.print(counter + " ");
            }System.out.println("");
        }




    }

    //todo Task 3
    public void printPyramid(){
        // input your solution here
        int rows = 6;




        for (int z = 0; z < rows; z++ ){
            for (int spaces = rows - 1; spaces > z ; spaces--){
                System.out.print(" ");
            }for (int stars = 0; stars <=z*2; stars++ ){
                System.out.print("*");
            }
            System.out.println();



        }


    }

    //todo Task 4
    public void printRhombus(){
        // input your solution here
        int h; // size of rhombus
        char c; // we will use this later as a number
        int i, j, k;


        System.out.print("h: ");
        h = scanner.nextInt();
        System.out.print("c: ");
        c = scanner.next().charAt(0);
        if (h%2==0){
            System.out.println("Invalid number!");
            return;
        }

        int columns = 1, spaces = h/2 , count , middle;
        char d;

        for ( i = 1; i <= h ; i++){


            for (j = 1; j <= spaces; j++){
                System.out.print(" ");

            }if( i < h/2 +1){
                count = i;
                d = (char) (c - count + 1) ;
                spaces--;
            }else{
                count = h + 1 - i;
                d = (char) (c - count + 1);
                spaces++;
            }

            for (k = 1 ; k <= columns; k++){
                middle = columns/2+1;
                System.out.print(d);

                if(k < middle){
                    count--;
                    d++;
                }else{
                    count++;
                    d--;
                }

            }
            System.out.println();
            if( i < h/2 +1){
                columns = columns + 2;
            }else{
                columns = columns - 2;
            }
        }








    }

    //todo Task 5
    public void marks(){
        // input your solution here


        int negative = 0;
        int counter = 1;
        double sum = 0;
        double average = 0;




        System.out.print("Mark " + counter + ": ");
        int mark = scanner.nextInt();

        while(mark != 0){

            if (mark>5 || mark<0){
                System.out.println("Invalid mark!");

            }else if (mark ==5){
                sum = sum + mark;
                negative++;
                counter++;

            }else{
                sum = sum + mark;
                counter++;

            }
            System.out.print("Mark "+ counter + ": ");
            mark = scanner.nextInt();
            average = sum / (counter - 1);

        }
        System.out.print("Average: " );
        System.out.printf("%.2f", average);
        System.out.println();
        System.out.println("Negative marks: " + negative);





    }

    //todo Task 6
    public void happyNumbers() {
        // input your solution here
        //aufhören bei 1 oder 4
        int sum = 0;
        int remainder, result = 0;

        System.out.print("n: ");
        int number = scanner.nextInt();

        while( result != 4 && result != 1) {

            while (number > 0) {
                remainder = number % 10;
                sum = sum + (remainder * remainder);
                number = number / 10;
            }
            result = sum;
            number = sum;
            sum = 0;
            }

            if (result == 1) {
                System.out.println("Happy number!");
            }
            else {
                System.out.println("Sad number!");
            }









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
