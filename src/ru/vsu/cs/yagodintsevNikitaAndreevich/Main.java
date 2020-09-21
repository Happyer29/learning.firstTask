package ru.vsu.cs.yagodintsevNikitaAndreevich;

import java.util.Locale;
import java.util.Scanner;
import java.lang.Math;

public class Main {
    private static int
            speed1 = 0,
            speed2 = 0,
            acceleration1 = 0,
            acceleration2 = 0,
            distance = 0;

    public static void main(String[] args) {

        // честно говоря плохо понимаю что вообше делает эта строка
        // хоть я и прогуглил но от этого мне легче не стало
        // я так понимаю это используется чисто для правильного ввода
        // и вывода символов но тут же возникает вопрос зачем это надо
        // если достаточно знать кодировку для символов которые вводят
        // и выводятся
        Locale.setDefault(Locale.ROOT);


        setValues();
        int time = getMeetTime();
        System.out.println(time);
    }

    // get the meeting delta time (from 0 to time) of two cars
    public static int getMeetTime(){
        return (int) Math.round((-(speed1 + speed2)) + Math.sqrt(Math.pow(speed1 + speed2, 2) + (acceleration1+acceleration2)*2*distance)/(acceleration1+acceleration2));
    }

    // set default variable values
    private static void setValues(){
        Scanner scanner = new Scanner(System.in);

        System.out.print("Введите скорость первого автомобиля:");
        Main.speed1 = scanner.nextInt();

        System.out.print("Введите скорость второго автомобиля:");
        Main.speed2 = scanner.nextInt();

        System.out.print("Введите ускорение первого автомобиля:");
        Main.acceleration1 = scanner.nextInt();

        System.out.print("Введите ускорение второго автомобиля:");
        Main.acceleration2 = scanner.nextInt();

        System.out.print("Введите начальное расстояние между автомобилями:");
        Main.distance = scanner.nextInt();
    }



}
