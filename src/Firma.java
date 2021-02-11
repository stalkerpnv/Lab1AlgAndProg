import java.util.Scanner;
class Sotrudnik{
    String FIO;
    int age;
    int oklad;
    void work(){
        System.out.println(this.FIO + " is working");
    }
}

public class Firma {
    public static void main(String[]args){
        Scanner sc = new Scanner(System.in);
        System.out.println("Input count");
        int count =sc.nextInt();
        Sotrudnik[] sotr = new Sotrudnik[count];
        for (int i = 0; i < count; i++) {
           sotr[i] = new Sotrudnik();
        }
    }
}
