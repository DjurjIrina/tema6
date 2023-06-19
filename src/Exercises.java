import java.util.Random;

public class Exercises {
    private static Random random = new Random();
    static int count = 0;
    static int[] numbersArray = new int[]{33, 23, 11, 56, 23, 11111, 112345, 453224, 44, 33, 24, 15, 32};


    public static void main(String[] args) {
        printSumArray();
        printOddNumbers(numbersArray);
        printBiggerNumbers(numbersArray, 777);
        calculateDonations(100);
        calculateMaxDonations(1000, 5);
        printStrings("Scoala s-a incheiat. Copiii au intrat in vacanta de vara.Adultii se pregatesc de concediu.");

    }

    public static int printSumArray() {
        int suma = 0;
        for (int numereCurente : numbersArray) {
            suma += numereCurente;
        }
        return suma;
    }


    public static int printOddNumbers(int[] numbers) {
        int counter = 0;
        for (int numereImpare : numbersArray) {
            if (numereImpare % 2 == 1) {
                counter++;

            }
        }

        return counter;

    }

    public static int printBiggerNumbers(int[] numbersArray, int checkNumber) {
        for (int count : numbersArray) {
            if (count > checkNumber) {
                System.out.println(count);
            }
        }
        return count;
    }

    public static void calculateDonations(int targetDonatii) {
        int donatie = 0;
        int suma = 0;
        while (suma <= targetDonatii) {
            suma = random.nextInt(0, 100);
            donatie += suma;
        }
        System.out.println("Ati atins suma dorita!");
    }

    public static void calculateMaxDonations(int targetDonatii, int maxDonatii) {
        int donatie = 0;
        int count = 0;
        do {
            int suma = random.nextInt();
            donatie += suma;
            count++;
        } while (donatie <= targetDonatii && count <= maxDonatii);
        if (donatie >= targetDonatii) {
            System.out.println("Ati atins suma dorita2!");
        } else {
            System.out.println("Campania s-a incheiat!");
        }
    }

    public static void printStrings(String fraze) {
        String[] propozitie = fraze.split("\\.");
        for (String currentSentence : propozitie) {
            System.out.println(currentSentence);
        }

    }

}