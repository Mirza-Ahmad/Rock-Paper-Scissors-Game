import java.lang.Math;
import java.util.Scanner;

class Main {
  // Created by mirza ahmad awais
  static int MySelector() {
    Scanner input = new Scanner(System.in);
    System.out.println("Do want to the close this game? \nPress 1: to continue the game \nPress 2: to exit game");
    int choice = input.nextInt();
    return choice;
  }

  public static void main(String[] args) {
    System.out.println("................ROCK PAPER SCISSORS GAME................");
    Scanner sc = new Scanner(System.in);
    System.out.println("Press any button to Start the game: ");
    String start = sc.nextLine();
    while (true) {
      System.out.println("Minimum players : 2 ");
      System.out.println("Enter your Choice:\nRock\nPaper\nScissors");
      String player1 = sc.nextLine().toLowerCase();
      String[] choices = { "rock", "paper", "sicssors" };
      int select = (int) (Math.random() * choices.length);
      String player2 = choices[select];
      System.out.println("Player 1 select: " + player1 + "\n" + "player 2 select: " + player2);
      /*
       * scissors beat paper
       * paper covers rock
       * rock beat scissors
       */
      if (player1.equals(player2)) {
        System.out.println("Both players select " + player2 + " same selection " + "Tie Game!");
        int choice1 = MySelector();
        if (choice1 == 1) {
          System.out.print("\033[H\033[2J");
          System.out.flush();
          continue;
        } else {
          break;
        }
      } else if (player1.equals("rock")) {
        if (player2.equals("scissors")) {
          System.out.println("Rock beats scissors," + "\"You win!\"");
          int choice1 = MySelector();
          if (choice1 == 1) {
            System.out.print("\033[H\033[2J");
            System.out.flush();
            continue;
          } else {
            break;
          }
        } else {
          System.out.println("\"You lose the game!\"");
          int choice1 = MySelector();
          if (choice1 == 1) {
            System.out.print("\033[H\033[2J");
            System.out.flush();
            continue;
          } else {
            break;
          }
        }
      } else if (player1.equals("paper")) {
        if (player2.equals("rock")) {
          System.out.println("Paper covers rock," + "\"You win!\"");
          int choice1 = MySelector();
          if (choice1 == 1) {
            System.out.print("\033[H\033[2J");
            System.out.flush();
            continue;
          } else {
            break;
          }
        } else {
          System.out.println("\"You lose the game!\"");
          int choice1 = MySelector();
          if (choice1 == 1) {
            System.out.print("\033[H\033[2J");
            System.out.flush();
            continue;
          } else {
            break;
          }
        }
      } else if (player1.equals("scissors")) {
        if (player2.equals("paper")) {
          System.out.println("Scissors beats paper," + "\"You win!\"");
          int choice1 = MySelector();
          if (choice1 == 1) {
            System.out.print("\033[H\033[2J");
            System.out.flush();
            continue;
          } else {
            break;
          }
        } else {
          System.out.println("\"You lose the game!\"");
          int choice1 = MySelector();
          if (choice1 == 1) {
            System.out.print("\033[H\033[2J");
            System.out.flush();
            continue;
          } else {
            break;
          }
        }
      }
    }
  }
}