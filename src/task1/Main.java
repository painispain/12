package task1;

public class Main {
    public static void main(String[] args) {
        Person person1 = new Person("Иванова", "Ирина", "Иоганновна");
        System.out.println();
        System.out.println(person1.getName());
        Person person2 = new Person("Шестов", "Павел");
        System.out.println(person2.getName());
        Person person3 = new Person("Никитина");
        System.out.println(person3.getName());
    }
}