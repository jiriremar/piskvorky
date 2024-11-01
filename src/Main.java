// Created Jiri Remar owner
import java.util.Scanner;

public class Main {

    //Nastaveni tabulky na prazdnou hodnotu
    public static void eraseTable(String[][] table) {
        for (int i = 0; i < table.length; i++) {
            for (int j = 0; j < table[i].length; j++) {
                table[i][j] = " ";
            }
        }
    }

    //Zobrazeni aktualni hraci plochy
    public static void showTable(String[][] table) {
        for (int i = 0; i < table.length; i++) {
            System.out.println();
            System.out.println("-------");
            System.out.print("|");
            for (int j = 0; j < table[i].length; j++) {

                System.out.print(table[i][j] + "|");
            }
        }
        System.out.println();
        System.out.println("-------");
    }

    //Start hry
    public static void startIntro() {
        System.out.println("Vítejte ve hře piškvorky");
        System.out.println("První hráč má X");
        System.out.println("Druhý hráč má O");
        System.out.println("Zadej číslo od 1 - 9 pro zapsání znaku.\n1-3 prvni řádek, 4 - 6 druhý řádek a 7 - 9 třetí řádek");
    }


    ////////////////////////////////////////////////////////////////////////////////////////////////
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        String[][] gameField = new String[3][3];
        int numberOfField = 0;
        int moveNumber = 0;
        eraseTable(gameField);
        startIntro();
        showTable(gameField);
        String checkFreePosition = "free";
        while (true) {                                // prvni hrac
            while (true) {
                System.out.println("Hraje první hráč. X ");
                System.out.print("Zadej číslo: ");
                try {
                    numberOfField = scanner.nextInt();
                    if (numberOfField >= 1 && numberOfField <= 9) {
                        switch (numberOfField) {
                            case 1 -> checkFreePosition = gameField[0][0];
                            case 2 -> checkFreePosition = gameField[0][1];
                            case 3 -> checkFreePosition = gameField[0][2];
                            case 4 -> checkFreePosition = gameField[1][0];
                            case 5 -> checkFreePosition = gameField[1][1];
                            case 6 -> checkFreePosition = gameField[1][2];
                            case 7 -> checkFreePosition = gameField[2][0];
                            case 8 -> checkFreePosition = gameField[2][1];
                            case 9 -> checkFreePosition = gameField[2][2];
                            default -> System.out.println();
                        }
                        if (checkFreePosition == " " || checkFreePosition == " "){
                            break;
                        }else {
                            System.out.println("Toto pole je už obsazené");
                        }

                    } else {
                        System.out.println("Neplatná volba");
                    }
                } catch (Exception e) {
                    System.out.println("Neplatná volba");
                    scanner.nextLine();
                }
            }
            switch (numberOfField) {
                case 1 -> gameField[0][0] = "X";
                case 2 -> gameField[0][1] = "X";
                case 3 -> gameField[0][2] = "X";
                case 4 -> gameField[1][0] = "X";
                case 5 -> gameField[1][1] = "X";
                case 6 -> gameField[1][2] = "X";
                case 7 -> gameField[2][0] = "X";
                case 8 -> gameField[2][1] = "X";
                case 9 -> gameField[2][2] = "X";
                default -> System.out.println();
            }

            if ((gameField[0][0].equals("X") && gameField[0][1].equals("X") && gameField[0][2].equals("X")) ||
                    ((gameField[1][0].equals("X") && gameField[1][1].equals("X") && gameField[1][2].equals("X"))) ||
                    ((gameField[2][0].equals("X") && gameField[2][1].equals("X") && gameField[2][2].equals("X"))) ||
                    ((gameField[0][0].equals("X") && gameField[1][1].equals("X") && gameField[2][2].equals("X"))) ||
                    ((gameField[2][0].equals("X") && gameField[1][1].equals("X") && gameField[0][2].equals("X"))) ||
                    ((gameField[0][0].equals("X") && gameField[1][0].equals("X") && gameField[2][0].equals("X"))) ||
                    ((gameField[0][1].equals("X") && gameField[1][1].equals("X") && gameField[2][1].equals("X"))) ||
                    ((gameField[0][2].equals("X") && gameField[1][2].equals("X") && gameField[2][2].equals("X")))) {
                System.out.println();
                System.out.println();
                System.out.println("VYHRÁL PRVNÍ HRÁČ");
                showTable(gameField);
                System.exit(0);
            }
            moveNumber++;
            showTable(gameField);
            if (moveNumber == 9) {
                System.out.println("NEROZHODNĚ");
                System.exit(0);
            }

            // Druhy hrac
            while (true) {
                System.out.println("Hraje druhý hráč. O ");
                System.out.print("Zadej číslo: ");
                try {
                    numberOfField = scanner.nextInt();
                    if (numberOfField >= 1 && numberOfField <= 9) {
                        switch (numberOfField) {
                            case 1 -> checkFreePosition = gameField[0][0];
                            case 2 -> checkFreePosition = gameField[0][1];
                            case 3 -> checkFreePosition = gameField[0][2];
                            case 4 -> checkFreePosition = gameField[1][0];
                            case 5 -> checkFreePosition = gameField[1][1];
                            case 6 -> checkFreePosition = gameField[1][2];
                            case 7 -> checkFreePosition = gameField[2][0];
                            case 8 -> checkFreePosition = gameField[2][1];
                            case 9 -> checkFreePosition = gameField[2][2];
                            default -> System.out.println();
                        }
                        if (checkFreePosition == " " || checkFreePosition == " "){
                            break;
                        }else {
                            System.out.println("Toto pole je už obsazené");
                        }

                    } else {
                        System.out.println("Neplatná volba");
                    }
                } catch (Exception e) {
                    System.out.println("Neplatná volba");
                    scanner.nextLine();
                }
            }
            switch (numberOfField) {
                case 1 -> gameField[0][0] = "O";
                case 2 -> gameField[0][1] = "O";
                case 3 -> gameField[0][2] = "O";
                case 4 -> gameField[1][0] = "O";
                case 5 -> gameField[1][1] = "O";
                case 6 -> gameField[1][2] = "O";
                case 7 -> gameField[2][0] = "O";
                case 8 -> gameField[2][1] = "O";
                case 9 -> gameField[2][2] = "O";
                default -> System.out.println();
            }

            if ((gameField[0][0].equals("O") && gameField[0][1].equals("O") && gameField[0][2].equals("O")) ||
                    ((gameField[1][0].equals("O") && gameField[1][1].equals("O") && gameField[1][2].equals("O"))) ||
                    ((gameField[2][0].equals("O") && gameField[2][1].equals("O") && gameField[2][2].equals("O"))) ||
                    ((gameField[0][0].equals("O") && gameField[1][1].equals("O") && gameField[2][2].equals("O"))) ||
                    ((gameField[2][0].equals("O") && gameField[1][1].equals("O") && gameField[0][2].equals("O"))) ||
                    ((gameField[0][0].equals("O") && gameField[1][0].equals("O") && gameField[2][0].equals("O"))) ||
                    ((gameField[0][1].equals("O") && gameField[1][1].equals("O") && gameField[2][1].equals("O"))) ||
                    ((gameField[0][2].equals("O") && gameField[1][2].equals("O") && gameField[2][2].equals("O")))) {
                System.out.println();
                System.out.println();
                System.out.println("VYHRÁL DRUHÝ HRÁČ");
                showTable(gameField);
                System.exit(0);
            }
            moveNumber++;
            showTable(gameField);

        }
    }
}
