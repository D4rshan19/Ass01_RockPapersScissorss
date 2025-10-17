import java.util.Scanner;

public class RPS {
    public static void main(String[] args) {
            Scanner scanner = new Scanner(System.in);
            String continueYN;

            do {
                String playerA = "";
                String playerB = "";
                boolean validInput;


                do {
                    System.out.print("Enter the move for player A [R], [P], or [S]: ");
                    playerA = scan.next();
                } while (!(playerA.equals("R") || playerA.equals("P") || playerA.equals("S") ||
                        playerA.equals("r") || playerA.equals("p") || playerA.equals("s")));


                do {
                    System.out.print("Player B, enter your move [R], [P], [S]: ");
                    playerB = scan.next();
                } while (!(playerB.equals("R") || playerB.equals("P") || playerB.equals("S") ||
                        playerB.equals("r") || playerB.equals("p") || playerB.equals("s")));


                if (playerA.equalsIgnoreCase(playerB)) {
                    System.out.println("It's a tie!");
                } else if (playerA.equalsIgnoreCase("R")) {
                    if (playerB.equalsIgnoreCase("S")) {
                        System.out.println("Rock breaks Scissors");
                        System.out.println("Player A wins!");
                    } else {
                        System.out.println("Paper covers Rock");
                        System.out.println("Player B wins!");
                    }
                } else if (playerA.equalsIgnoreCase("P")) {
                    if (playerB.equalsIgnoreCase("R")) {
                        System.out.println("Paper covers Rock");
                        System.out.println("Player A wins!");
                    } else {
                        System.out.println("Scissors cut Paper");
                        System.out.println("Player B wins!");
                    }
                } else if (playerA.equalsIgnoreCase("S")) {
                    if (playerB.equalsIgnoreCase("P")) {
                        System.out.println("Scissors cut Paper");
                        System.out.println("Player A wins!");
                    } else {
                        System.out.println("Rock breaks Scissors");
                        System.out.println("Player B wins!");
                    }
                }


                System.out.print("Do you want to play again? (Y/N): ");
                continueYN = scan.nextInt();


            } while (continueYN.equalsIgnoreCase("Y"));

            System.out.println("Thank you for playing!");
        }
    }