package homeWork004EnumPracticalTask.Task03;

import java.util.Scanner;

public enum Country {
    USA("Це текст до сша"),
    Europa("Це другий текст до європи"),
    Australia("і третій");

    String text;

    Country(String text) {
        this.text = text;
    }

    @Override
    public String toString() {
        return text;
    }
}

class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Введіть назву країни: ");
        String input = sc.nextLine();

        switch (input) {
            case "New-York":
                System.out.println("Continent - " + Country.USA);
                break;
            case "Italy":
            case "Ukraine":
            case "Poland":
                System.out.println("Continent - " + Country.Europa.toString());
                break;
            case "Sidney":
                System.out.println("Continent - " + Country.Australia);
                break;
            default:
                System.out.println("Try again");
        }
        sc.close();
    }
}
