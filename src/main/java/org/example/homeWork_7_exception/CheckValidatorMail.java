package org.example.homeWork_7_exception;

import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class CheckValidatorMail {
    private static final String EMAIL_REGEX = "^[a-zA-Z0-9_+&*-]+(?:\\.[a-zA-Z0-9_+&*-]+)*@(?:[a-zA-Z0-9-]+\\.)+[a-zA-Z]{2,6}$";
    private static final Pattern pattern = Pattern.compile(EMAIL_REGEX);

    public static void checkMail(String mail) throws MailValidate{

        Matcher matcher = pattern.matcher(mail);
        if(!matcher.matches()){
            throw  new MailValidate("Некорректный маил");
        }else System.out.println("Емали принят");
    }
}
