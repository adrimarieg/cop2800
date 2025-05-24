/*
The distance a vehicle travels can be calculated as follows:

For example, if a train travels 40 miles-per-hour for 3 hours, the distance traveled is 120 miles. Write a complete program that asks for the speed of a vehicle 
(in mph) and the number of hours it has traveled. Both values are assumed to be integers. It should use a loop to display the distance the vehicle has traveled 
for each hour of the specified time period.

The following sample run shows an example of the program's output in which the user enters 40 for the vehicle's speed and 3 for the traveling time:

Enter vehicle speed (in mph): 40
Enter traveling time (in hours): 3
After 1 hour(s) the distance is 40 miles.
After 2 hour(s) the distance is 80 miles.
After 3 hour(s) the distance is 120 miles.

In the sample run shown above, look carefully at the wording of the messages and the placement of spaces and punctuation. Your program's output must match this.

Do not accept a negative number for speed and do not accept any value less than 1 for traveling time.

Program Class Name: The name of your program's class should be Distance.
*/

import java.util.Scanner;

public class Distance {
    public static void main(String[] args) {
        Scanner keyboard = new Scanner(System.in);
        int speed;
        int hours;

        do {
            System.out.print("Enter vehicle speed (in mph): ");
            speed = keyboard.nextInt();
        } while (speed < 0);

        do { 
            System.out.print("Enter traveling time (in hours): ");
            hours = keyboard.nextInt();
        } while (hours < 0);

        for (int i = 1; i <= hours; i++) {
            System.out.println("After " + (i) + " hour(s) the distance is " + (speed * i) + "miles.");
        }
    }
}
