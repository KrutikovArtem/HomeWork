package org.example.homeWork_7_exception;

public class Main {

    public static void main(String[] args) {
        MyFileNotFoundException.openFile();
        MyArithmeticException.calcul(5,0);

        try {
            AgeValidator.checkAge(400);
        }catch (ExceptionAge e){
            System.out.println("Некорректный возраст");
        }

        try {
            CheckValidatorMail.checkMail("qwdqwdqwd@mail.ru");
        } catch (MailValidate e) {
            System.out.println("Некорректный маил");
        }


    }
}
