import java.util.Scanner;

void main() {
    System.out.println("Popa");
    System.out.println(3e3); /* короче тут 3 эт число e это степень 1,10,100,1000 и т.д. а 3 в данном случае значит 1000
                                если поменять на 2 то будет возведение в 100, а вывод 300, так же можно указать отрицательное
                                число и число будет дробным? короче после ноля тип 0.3 */
    System.out.println(3.2e4);

    Scanner in = new Scanner(System.in);
    System.out.print("Введите число: ");
    int num = in.nextInt();

    System.out.print("Число: ");
    System.out.println(num);
    in.close();
}
