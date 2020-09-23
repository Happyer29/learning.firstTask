package ru.vsu.cs.yagodintsevNikitaAndreevich;

import java.util.Locale;
import java.util.Scanner;
import java.lang.Math;

public class Main {

    public static void main(String[] args) {
        int
                speed1,
                speed2,
                acceleration1,
                acceleration2,
                distance;
        double time;
        // честно говоря плохо понимаю что вообше делает эта строка
        // хоть я и прогуглил но от этого мне легче не стало
        // я так понимаю это используется чисто для правильного ввода
        // и вывода символов но тут же возникает вопрос зачем это надо
        // если достаточно знать кодировку для символов которые вводят
        // и выводятся
        Locale.setDefault(Locale.ROOT);
        Scanner scanner = new Scanner(System.in);

        System.out.print("Введите скорость первого автомобиля:");
        speed1 = scanner.nextInt();

        System.out.print("Введите скорость второго автомобиля:");
        speed2 = scanner.nextInt();

        System.out.print("Введите ускорение первого автомобиля:");
        acceleration1 = scanner.nextInt();

        System.out.print("Введите ускорение второго автомобиля:");
        acceleration2 = scanner.nextInt();

        System.out.print("Введите начальное расстояние между автомобилями:");
        distance = scanner.nextInt();


        time = getMeetTime(speed1, speed2, acceleration1, acceleration2, distance);
        System.out.println(time);
    }

    // get the meeting delta time (from 0 to time) of two cars
    private static double getMeetTime(int speed1, int speed2, int acceleration1, int acceleration2, int distance){
        return ((-(speed1 + speed2)) + Math.sqrt(Math.pow(speed1 + speed2, 2) + (acceleration1+acceleration2)*2*distance))/2;
    }



}
