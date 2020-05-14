package com.company;


import java.util.Scanner;

public class Main {


    public static void main(String[] args) {
        System.out.println("Введите точки координат");
        Vector vect = new Vector();
        System.out.println("Длинна отрезка = "+ vect.Length());
    }
}
    class Pointer {
        Scanner scanner = new Scanner(System.in);
        public double x;
        public double y;

        public Pointer(double x, double y) {
            this.x = scanner.nextDouble();
            this.y = scanner.nextDouble();
        }

    }

    class Vector {
        private final Pointer begin;
        private final Pointer end;

        /** конструктор по умолчанию */
        Vector() {
            begin = new Pointer(0.0,0.0);
            end = new Pointer(0.0,0.0);
        }

        Vector(double x_begin, double y_begin, double x_end, double y_end) {
            begin = new Pointer(x_begin, y_begin);
            end = new Pointer(x_end, y_end);
        }

        public Vector (Pointer begin, Pointer end)
        {
            this.begin=begin;
            this.end=end;
        }

        /** вычисление длины */
        public double Length() {
            return Math.sqrt(VectorLength(begin.x, end.x) + VectorLength(begin.y, end.y));
        }

        private double VectorLength(double begin, double end) {
            return ((begin-end) * (begin-end));
        }
    }