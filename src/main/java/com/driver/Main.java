package com.driver;

public class Main {

    public static class Product{
        public int product(int x, int y) {
            return x*y;
        }
        public int product(int x, int y, int z) {
            return x*y*z;
        }
        public double product(double x, double y) {
            return x*y;
        }

    }

     public static void main(String[] args) {
        Product p=new Product();
       int a= p.product(3,2);
       int b= p.product(3,2,4);
       double c= p.product(3.78,87.56);
         System.out.println(a);
         System.out.println(b);
         System.out.println(c);
    }
}