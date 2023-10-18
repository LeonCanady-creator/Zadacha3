import java.util.Scanner;
public class Main {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        System.out.print("Введите имя: ");
        String name = in.next();
        char[] name_Dif = name.toCharArray();
        if (name_Dif[name_Dif.length - 1] == ('а')) {
            System.out.println("Приветик!");
        } else if (name_Dif[name_Dif.length - 1] =='я') {
            System.out.println("Приветик!");
        } else if (name_Dif[name_Dif.length - 1] =='и') {
            System.out.println("Приветик!");
        } else {
            System.out.println("Здарова!");
        }
        }
    }
