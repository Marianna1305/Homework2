import java.util.function.BooleanSupplier;

public class Main {
    public static void main(String[] args) {
//  Задание 1
        var dog = 8;
        var cat = 3.6;
        var paper = 763789;
        System.out.println(dog);
        System.out.println(cat);
        System.out.println(paper);
//  Задание 2
        dog = dog + 4;
        cat = cat + 4;
        paper = paper + 4;
        System.out.println(dog);
        System.out.println(cat);
        System.out.println(paper);
//  Задание 3
        dog = dog - 3;
        cat = cat - 1.6;
        paper = paper - 7639;
        System.out.println(dog);
        System.out.println(cat);
        System.out.println(paper);
//  Задание 4
        var friend = 19;
        System.out.println(friend);
        friend = friend + 2;
        System.out.println(friend);
        friend = friend / 7;
        System.out.println(friend);
//  Задание 5
        var frog = 3.5;
        System.out.println(frog);
        frog = frog * 10;
        System.out.println(frog);
        frog = frog / 3.5;
        System.out.println(frog);
        frog = frog + 4;
        System.out.println(frog);
//  Задание 6
        var BoxerFirstWeight = 78.2;
        var BoxerSecondWeight = 82.7;
        var BoxerTotalWeight = BoxerFirstWeight + BoxerSecondWeight;
        System.out.println(BoxerTotalWeight);
        var BoxerDifferenceWeight = BoxerSecondWeight - BoxerFirstWeight;
        System.out.println(BoxerDifferenceWeight);
//  Задание 7
        BoxerDifferenceWeight = BoxerSecondWeight % BoxerFirstWeight;
        System.out.println(BoxerDifferenceWeight);
//  Задание 8
        var WorkCapacity = 640;
        var EmployeeWorkTime = 8;
        var EmployeeTotal = (640 - 640 % EmployeeWorkTime) / EmployeeWorkTime;
        System.out.println("Всего работников в компании " + EmployeeTotal + " человек");
        EmployeeTotal = EmployeeTotal + 94;
        WorkCapacity = EmployeeTotal * EmployeeWorkTime;
        System.out.println("Если в компании работает " + EmployeeTotal + " человек, то всего " + WorkCapacity + " часов работы может быть поделено между сотрудниками.");


    }
}