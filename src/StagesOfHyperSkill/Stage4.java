package StagesOfHyperSkill;

import java.util.InputMismatchException;
import java.util.Scanner;

public class Stage4 {
    public static void main(String[] args) throws Exception {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter cells: ");
        char[] cells = sc.next().toUpperCase().toCharArray();
        System.out.println("---------");
        char[][] newCells = {{cells[0], cells[1], cells[2]}, {cells[3], cells[4], cells[5]}, {cells[6], cells[7], cells[8]}};
        System.out.print("| ");
        for (int i = 0; i < 3; i++) {
            for (int j = 0; j < 3; j++) {
                if (newCells[i][j] == '_') {
                    newCells[i][j] = ' ';
                }
                System.out.print(newCells[i][j] + " ");
            }
            if (i != 2) {
                System.out.print("|\n| ");
            } else {
                System.out.println("|");
            }
        }
        System.out.println("---------");


        while (true) {
            System.out.print("Enter the coordinates: ");
            int row = 0;
            int column = 0;
            int indexRow = 0;
            int indexColumn = 0;
            boolean validInput = false;

            while (!validInput) {
                try {
                    row = sc.nextInt();
                    column = sc.nextInt();
                    validInput = true;
                } catch (InputMismatchException e) {
                    System.out.println("You should enter numbers!");
                    System.out.print("Enter the coordinates: ");
                    sc.nextLine();
                }
            }
            char[][] AnotherCells = {{cells[0], cells[1], cells[2]}, {cells[3], cells[4], cells[5]}, {cells[6], cells[7], cells[8]}};
            if (row == 1 && column == 1) {
                indexRow = 2;
                indexColumn = 0;
            } else if (row == 1 && column == 2) {
                indexRow = 1;
                indexColumn = 0;
            } else if (row == 1 && column == 3) {
                indexRow = 0;
                indexColumn = 0;
            } else if (row == 2 && column == 1) {
                indexRow = 2;
                indexColumn = 1;
            } else if (row == 2 && column == 2) {
                indexRow = 1;
                indexColumn = 1;
            } else if (row == 2 && column == 3) {
                indexRow = 0;
                indexColumn = 1;
            } else if (row == 3 && column == 1) {
                indexRow = 2;
                indexColumn = 2;
            } else if (row == 3 && column == 2) {
                indexRow = 1;
                indexColumn = 2;
            } else if (row == 3 && column == 3) {
                indexRow = 0;
                indexColumn = 2;
            }
            if (AnotherCells[indexRow][indexColumn] != '_') {
                System.out.println("This cell is occupied! Choose another one!");
                continue;
            }
            if (row > 3 || column > 3) {
                System.out.println("Coordinates should be from 1 to 3!");
                continue;
            }

            System.out.println("---------");
            System.out.print("| ");
            for (int i = 0; i < 3; i++) {
                for (int j = 0; j < 3; j++) {
                    if (AnotherCells[i][j] == '_') {
                        AnotherCells[i][j] = ' ';
                    }
                    if (AnotherCells[indexRow][indexColumn] == '_' || AnotherCells[indexRow][indexColumn] == ' ') {
                        AnotherCells[indexRow][indexColumn] = 'X';
                    }
                    System.out.print(AnotherCells[i][j] + " ");
                }
                if (i != 2) {
                    System.out.print("|\n| ");
                } else {
                    System.out.println("|");
                }
            }
            System.out.println("---------");
            break;
        }
    }

}
