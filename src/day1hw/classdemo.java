package com.javabasic;


    public class Static Varibles {
        static int x = 10;
        static int y;

        static void func(int z) {
            System.out.println("x=" + x);
            System.out.println("y=" + y);
            System.out.println("z=" + z);
        }

        static {
            System.out.println("Running static intialization block.");
            y = x + 5;
        }

        public static void main(String[] args) {
            func(8);
        }

    }

