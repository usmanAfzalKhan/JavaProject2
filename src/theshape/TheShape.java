/*Usman Khan
9915703330
Assignment 2
27th September, 2019
*/
package theshape;
import java.util.Scanner;
/*importing java.util.Scanner, since this program will be taking input from 
user*/
public class TheShape {
    public static void main(String[] args) {
        Scanner k= new Scanner (System.in);
        System.out.println("Enter 1 to get the area for Triangle.");
        System.out.println("Enter 2 to get the area for Reactangle.");
        System.out.println("Enter 3 to get the area for Circle.");
        double shape= k.nextDouble();
        /*Double is used so if the user wants, they can use decimal 
        numbers too,to input values for their respective shapes*/
        /*Prompting the user to type in 1,2 or 3 in order for the code to
        calculate the area/ perimeter of the shape they want*/
        if (shape==1){
            /*If the user types 1 then it will calculate the area of 
            triangle, which is under this if statement*/
            /*If user types in 1 that means its a triangle, 
            calculations for the area of triangle*/
            System.out.println("Enter the height of your triangle: ");
            /*Prompting the user for the height of triangle*/
            double height= k.nextDouble();
            if (height<0){
                /*If the height will be a negative number, the program will 
                say negative number and end*/
                System.out.println("Negative numbers are not allowed.");}
            else{
                System.out.println("Enter the base of your triangle: ");
                double base = k.nextDouble();
                if (base<0){
                    /*If the base will be negative it will 
                    say negative number and end program*/
                    System.out.println("Negative numbers are  not allowed");}
                else{
                    double triangleArea= base*height*0.5;
                    /*Actual calculation, where users 
                    inputted base and height will be multiplied 
                    by each other and by 0.5 to calculate the area*/
                    System.out.println("The area of your triangle is: "+
                            triangleArea);/*Printing out the triangle area
                */}}}
        else if (shape==2){
            /*If user types in 2 that means its a rectangle,  
            calculations for the area of rectangle*/
            /*Area and perimeter of the rectangle will calculated under 
            this if statement*/
            System.out.println("Enter the length of your rectangle: ");
            /*prompting the user to type in the lenght of the rectangle*/
            double length= k.nextDouble();
            if (length<0){
                /*if the length value will be in negative, it will say 
                negative number and end*/
            System.out.println("Negative numbers are  not allowed.");}
            else{
                /*if theres a value which is not negative for rectangle's 
                lenght then the program will continue and ask the user for 
                width*/
                System.out.println("Enter the width of your reactangle: ");
                /*Prompting for width*/
                double width= k.nextDouble();
                if (width<0){
                    /*If width is negative then it will end program*/
                    System.out.println("Negative numbers are  not allowed");}
                else{
                    double rectangleArea= length*width;
                    /*Actual calculation for rectangle area, where length
                    and width are being multiplied together*/
                    double rectanglePerimeter= 2* (length+width);
                    /*Actual calculation for rectangle perimeter,
                    where length and width are added and then 
                    multiplied by 2*/
                    System.out.println("The area of your reactangle is: "
                            +rectangleArea);
                    /*Printing out rectangle area*/
                    System.out.println("The perimeter of your reactangle"
                            + "is: "
                            +rectanglePerimeter);/*Printing out the 
                    rectangle perimeter*/}}} 
        else if (shape == 3){
            /*If the user types in 3 that means its a circle*/
            System.out.println("Enter the radius of your circle");
            /*Prompting the user for radius*/
            double radius= k.nextDouble();
            System.out.println((radius<0)? "Neegative numbers are  "
                    + "not allowed": ("The radius is of your circle is: "
                            +radius*2 ));/*Usage of conditional operator, 
        where if the input is negative then it ends if not then it 
            multplied by 2 and then prints the diameter*/}
        else if(shape < 0){
            /*If the user types in something negative or any value 
            less than 1 it will say its not */
            System.out.println("Negative numbers are  not allowed");}
        else if (shape>3 || shape==0){
            /*If value of shape is more than 3 or equal to 0 then its 
            in valid */
            System.out.println("Invalid");
        }
        else{
            /*If the user types in a decimal or a number more than 3,
            it will say it is invalid*/
             System.out.println("Invalid number");}
        System.out.println("UMAN KHAN");
        System.out.println("Student #: 991570330");
    }
}