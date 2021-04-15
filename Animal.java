package geekbrains.lesson.kremleva;
import java.util.InputMismatchException;
import java.util.Scanner;
public class Animal {
    public static void main(String[] args) throws InputMismatchException {

        Scanner scanner = new Scanner(System.in);

        double Run = Math.random() * 200;
        double Jump = Math.random() * 2;
        double Swim = Math.random() * 0;
        Cat cat = new Cat(Run, Jump, Swim);

        Run = Math.random()*500;
        Jump = Math.random()*0.5;
        Swim = Math.random()*10;
        Animal dog = new Dog(Run, Jump, Swim);

        Run = Math.random()*1500;
        Jump = Math.random()*3;
        Swim = Math.random()*100;
        Animal horse = new Horse(Run, Jump, Swim);

        Run = Math.random()*5;
        Jump = Math.random()*0.2;
        Swim = Math.random()*0;
        Animal bird = new Bird(Run, Jump, Swim);
        System.out.println("Кот бежит: " + cat.getAnimalRun() +
                " м. \nСобака бежит: " + dog.getAnimalRun() + " м." Лошадь бежит: " + dog.getAnimalRun() + " м."" +
            "\\nПтица бежит: \" + dog.getAnimalRun() + \" м.\");

        System.out.println("Введите дистанцию для бега:");
        double distance = scanner.nextDouble();

        System.out.println("Кот пробегает run(" + distance + "). Результат: " + Cat.run(distance));
        System.out.println("Собака пробегает run(" + distance + "). Результат: " + Dog.run(distance));
        System.out.println("Лошадь пробегает run(" + distance + "). Результат: " + Horse.run(distance));
        System.out.println("Птица пробегает run(" + distance + "). Результат: " + Bird.run(distance));
        System.out.println("\n---------------\n");

        System.out.println("Кот может прыгнуть: " + Cat.getAnimaJump() +
                " м. \nСобака может прыгнуть: " + Dog.getAnimalJump() + " м.");

        System.out.println("Введите высоту препятствия:");
        distance = scanner.nextDouble();

        System.out.println("Кошка пытается выполнить jump(" + distance + "). Результат: " + Cat.jump(distance));
        System.out.println("Собака пытается выполнить jump(" + distance + "). Результат: " + Dog.jump(distance));
        System.out.println("Лошадь пытается выполнить jump(" + distance + "). Результат: " + Horse.run(distance));
        System.out.println("Птица пытается выполнить jump(" + distance + "). Результат: " + Bird.run(distance));
        System.out.println("\n----------------\n");

        System.out.println("Лошадь может проплыть: " + Horse.getAnimalSwim() +
                " м. \nСобака может проплыть: " + Dog.getAnimalSwim() + " м.");

        System.out.println("Введите дистанцию для плавания:");
        distance = scanner.nextDouble();

        System.out.println("Лошадь пытается выполнить swim(" + distance + "). Результат: " + Horse.swim(distance));
        System.out.println("Собака пытается выполнить swim(" + distance + "). Результат: " + Dog.swim(distance));


    }


}
}
