import java.util.Scanner;

class Country {
    String name;
    double square;
}

public class InfoAboutCountries {
    static Scanner sc;
    public static Country[] setCountry(int count) {
        Country [] countries = new Country[count];
        System.out.println("Введите инфо о странах");
        for (int i = 0; i < count; i++) {
            countries[i] = new Country();
            System.out.println("Input name " + (i+1));
            countries[i].name = sc.nextLine();
            System.out.println("Input square " + (i+1));
            countries[i].square = sc.nextDouble();
            sc.nextLine();
        }
        return countries;
    }

    public static void showCountries(Country[] countries){
        for (int i = 0; i < countries.length; i++) {
            System.out.println("Country name =" + countries[i].name +
                    "square = " + countries[i].square);
        }
    }

    public static int findMaxIndex(Country[] countries){
        int indexMax = 0;
        double max = countries[indexMax].square;
        for (int i = 1; i < countries.length; i++) {
            if(countries[i].square>max){
                max = countries[i].square;
                indexMax = i;
            }
        }
        return indexMax;
    }

    public static void showCountry(Country country){
        System.out.println("Name: " + country.name + " Square: " + country.square);
    }

    public static void main(String[] args) {
        sc = new Scanner(System.in);
        System.out.println("Count->");
        int count = sc.nextInt();
        sc.nextLine();
        Country [] countries = setCountry(count);
        showCountries(countries);
        int maxIndex = findMaxIndex(countries);
        showCountry(countries[maxIndex]);

        /*Country [] countries = new Country[count];
        for (int i = 0; i < count; i++) {
            countries[i] = new Country();
            System.out.println("Input name " + (i+1));
            countries[i].name = sc.nextLine();
            System.out.println("Input square " + (i+1));
            countries[i].square = sc.nextDouble();
            sc.nextLine();
        }

        for (int i = 0; i < countries.length; i++) {
            System.out.println("Country name =" + countries[i].name +
                               "square = " + countries[i].square);
        }

        int indexMax = 0;
        double max = countries[indexMax].square;
        for (int i = 1; i < count; i++) {
            if(countries[i].square>max){
                max = countries[i].square;
                indexMax = i;
            }
        }
        System.out.println("Страна с " + indexMax + " индексом" +
                " где площадь равна" + countries[indexMax].square);*/

    }
}
