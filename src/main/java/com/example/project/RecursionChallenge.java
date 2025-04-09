    package com.example.project;

    public class RecursionChallenge {

            public static int bunnyEars(int n){
                if (n == 0) { return 0; }
                return 2 + bunnyEars(n - 1);
            }
        
            public static int factorial(int n){
                if (n == 0) { return 1; }
                return n * factorial(n - 1);
            }

            public static int sumNumbers(int n){
                if (n == 0) { return 0; }
                return n + sumNumbers(n - 1);
            }

            public static String countDown(int n){
                if (n == 0) { return "Blast Off!"; }
                return n + "," + countDown(n - 1);
            }

            public static int power(int x, int n){
                if (n == 0) { return 1; }
                return x * power(x, n - 1);
            }

            public static int fib(int n){
                if (n == 0) { return 0; }
                if (n == 1) { return 1; }
                return fib(n - 1) + fib(n - 2);
            }

            public static int countX(String s){
                if (s.length() == 0) { return 0; }
                int found = 0;
                if (s.startsWith("x")) { found++; }
                return found + countX(s.substring(1));
            }

            public static String changePi(String s){
                if (s.length() == 0) { return ""; }
                String prefix = s.substring(0, 1);
                int offset = 0;
                if (s.startsWith("pi")) {
                    prefix = "3.14";
                    offset = 1;
                }
                return prefix + changePi(s.substring(1 + offset));
            }

            public static String reverse(String s){
                if (s.length() == 0) { return ""; }
                return s.substring(s.length() - 1) + reverse(s.substring(0, s.length() - 1));
            }

            public static Boolean isPalindrome(String s){
                if (s.length() == 0 || s.length() == 1) { return true; }
                String next = s.substring(1, s.length() - 1);
                return s.substring(0, 1).equals(s.substring(s.length() - 1)) && isPalindrome(next);
            }

    }