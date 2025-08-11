package org.example.homeWork_7_exception;

public class AgeValidator {
    public static void checkAge(int age) throws ExceptionAge{
        if(age < 0 || age > 150){
            throw new ExceptionAge("Возраст не существует");
        }

    }
}
