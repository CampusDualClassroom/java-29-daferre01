package com.campusdual.classroom;

public class Exercise29 {
    public static void main(String[] args) {
        try {
            int a=10/0;
            System.out.println(a);
        }catch(Exception e){
            System.out.println("El error que te da es de "+e.getMessage());
        }
    }
}
