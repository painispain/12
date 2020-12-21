package task4;

public class Main {
    public static void main(String[] args) {
        System.out.println();
        String str1 = "88007777777";
        System.out.println("Тест №1:\t"+PhoneNumber.normalize(str1));
        String str2 = "+7903838388";
        System.out.println("Тест №2:\t"+PhoneNumber.normalize(str2));
    }
}