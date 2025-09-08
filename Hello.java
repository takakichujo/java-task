import java.util.Scanner;

public class Hello {
    public static void main(String[] args) {
       Scanner scanner=new Scanner(System.in);
       System.out.print("0-9を入力してください > ");
       String input_text = scanner.nextLine();

       try {
        int num = Integer.parseInt(input_text);
        Validation valid=new Validation();
        valid.validationNum(num);
       }catch(NumberFormatException e) {
        System.out.println("エラー: 正しい数字を入力してください");
       }
    }
}

