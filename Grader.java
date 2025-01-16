import java.util.Scanner;

public class Grader {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int gradesNum = Integer.parseInt(scanner.nextLine());

        for (int i = 1; i <= gradesNum; i++){
            int grade = Integer.parseInt(scanner.nextLine());

            // Two round cases:
            // 38 > x -> no change
            // x % 5 >= 3

            if (grade >= 38 && grade % 5 >= 3){
                System.out.println(grade + (5 - (grade % 5)));
            } else{
                System.out.println(grade);
            }
        }

    }
}
