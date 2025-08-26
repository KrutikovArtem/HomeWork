import org.example.homeWork_11_testing.*;
import org.junit.jupiter.api.Test;

import java.util.NoSuchElementException;

import static org.junit.jupiter.api.Assertions.*;

public class TestHomeWork {

    @Test
    public void testEvenNumber2(){
        EvenNumbers evenNumbers = new EvenNumbers();
        assertTrue(evenNumbers.isEven(2));
        assertTrue(evenNumbers.isEven(10));
    }
    @Test
    public void testEvenNumber3(){
        EvenNumbers evenNumbers = new EvenNumbers();
        assertFalse(evenNumbers.isEven(3));
        assertFalse(evenNumbers.isEven(5));
    }
    @Test
    public void testEvenNumberZero(){
        EvenNumbers evenNumbers = new EvenNumbers();
        assertTrue(evenNumbers.isEven(0));
    }
    @Test
    public void testEvenNumberNegative3(){
        EvenNumbers evenNumbers = new EvenNumbers();
        assertFalse(evenNumbers.isEven(-3));
        assertFalse(evenNumbers.isEven(-5));
    }
    @Test
    public void testEvenNumberNegative2(){
        EvenNumbers evenNumbers = new EvenNumbers();
        assertTrue(evenNumbers.isEven(-50));
        assertTrue(evenNumbers.isEven(-4));
    }

    //Тесты должны проверять:
    //Разные строки ("hello", "java", "AEIOU", "")
    //null (должно выбрасываться исключение)
    //Строки без гласных

    @Test
    public void testVowersNorm(){
        Vowels vowels = new Vowels();
        assertEquals(2,vowels.countVowels("hello"));
        assertEquals(2,vowels.countVowels("java"));
        assertEquals(5,vowels.countVowels("AEIOU"));
    }

    @Test
    public void testVowersNull(){
        try {
            Vowels vowels = new Vowels();
            vowels.countVowels(null);
            fail("Ошибка , не должен быть нал");
        }catch (IllegalArgumentException e){
            assertEquals("Input cannot be null", e.getMessage());
        }
    }

    @Test
    public void testVowersNegative(){
        Vowels vowels = new Vowels();
        assertEquals(0,vowels.countVowels("wwqqwq") );
    }


    //Обычные строки
    //Пустую строку
    //null (должно возвращаться null)

    @Test
    public void testReverseNorm(){
        Reverse reverse = new Reverse();
        assertEquals("qwerty",reverse.reverse("ytrewq"));
    }

    @Test
    public void testReverseVoid(){
        Reverse reverse = new Reverse();
        assertEquals("",reverse.reverse(""));
    }

    @Test
    public void testReverseNull(){
        Reverse reverse = new Reverse();
        assertEquals(null,reverse.reverse(null));
    }

    //Обычный массив ([3, 5, 7, 2])
    //Один элемент в массиве
    //Отрицательные числа
    //Пустой массив (должно выбрасываться исключение)
    @Test
    public void simpleArroy(){
        int[] arroy = {3, 5, 7, 2};
        FindMax findMax = new FindMax();
        assertEquals(7, findMax.findMax(arroy));
    }
    @Test
    public void oneElementArroy(){
        int[] arroy = {3};
        FindMax findMax = new FindMax();
        assertEquals(3, findMax.findMax(arroy));
    }

    @Test
    public void simpleArroyNegative(){
        int[] arroy = {-3, -5, -7, -2};
        FindMax findMax = new FindMax();
        assertEquals(-2, findMax.findMax(arroy));
    }

    @Test
    public void testEmtyArroy(){
        int[] arroy={};
        FindMax findMax = new FindMax();
        assertThrows(NoSuchElementException.class, () -> {
            findMax.findMax(arroy);
        });
    }

    //Обычные годы
    //Високосные (2020, 2000, 1600)
    //Года, которые делятся на 100, но не на 400 (1900, 2100)

    @Test
    public void simpleYear(){
        IsLeapYear isLeapYear = new IsLeapYear();
        assertFalse(isLeapYear.isLeapYear(2021));
    }

    @Test
    public void testIsLeapYear(){
        IsLeapYear isLeapYear = new IsLeapYear();
        assertTrue(isLeapYear.isLeapYear(2020));
        assertTrue(isLeapYear.isLeapYear(2000));
        assertTrue(isLeapYear.isLeapYear(1600));
    }

    @Test
    public void testIsLeapYear100(){
        IsLeapYear isLeapYear = new IsLeapYear();
        assertFalse(isLeapYear.isLeapYear(1900));
        assertFalse(isLeapYear.isLeapYear(2100));

    }

    //Корректные и некорректные email ("test@example.com", "bad@.com", "no-at-symbol")
    //null
    @Test
    public void tryMail(){
        IsValidEmail isValidEmail = new IsValidEmail();
        assertTrue(isValidEmail.isValidEmail("test@example.com"));
    }

    @Test
    public void noTryMail(){
        IsValidEmail isValidEmail = new IsValidEmail();
        assertFalse(isValidEmail.isValidEmail("bad@.com"));
        assertFalse(isValidEmail.isValidEmail("no-at-symbol"));
    }

    @Test
    public void mailNull(){
        IsValidEmail isValidEmail = new IsValidEmail();
        assertFalse(isValidEmail.isValidEmail(null));
    }


    //0! = 1
    //Маленькие числа (1!, 5!, 7!)
    //Отрицательные числа (должно выбрасываться исключение)

    @Test
    public void factorial0(){
        Factorial factorial = new Factorial();
        assertEquals(1,factorial.factorial(0));
    }

    @Test
    public void smallNumber(){
        Factorial factorial = new Factorial();
        assertEquals(1,factorial.factorial(1));
        assertEquals(120,factorial.factorial(5));
        assertEquals(5040,factorial.factorial(7));
    }

    @Test
    public void negativeNumbers(){
        Factorial factorial = new Factorial();
        assertThrows(IllegalArgumentException.class, () -> {
            factorial.factorial(-4);
        });
    }


    //Обычные массивы
    //Массив с одинаковыми числами
    //Один элемент в массиве (должно выбрасываться исключение)

    @Test
    public void simpleArroyTest(){
        FindSecondMax findSecondMax = new FindSecondMax();
        int[] arroy = {5,6,23,4,7};
        assertEquals(7,findSecondMax.findSecondMax(arroy));
    }

    @Test
    public void cloneArroyTest(){
        FindSecondMax findSecondMax = new FindSecondMax();
        int[] arroy = {5,5,5,5,5};
        assertThrows(NoSuchElementException.class, () -> {
            findSecondMax.findSecondMax(arroy);
        });
    }

    @Test
    public void oneElementArroyTest(){
        FindSecondMax findSecondMax = new FindSecondMax();
        int[] arroy = {5};
        assertThrows(NoSuchElementException.class, () -> {
            findSecondMax.findSecondMax(arroy);
        });
    }

    @Test
    public void voidArroyTest(){
        FindSecondMax findSecondMax = new FindSecondMax();
        int[] arroy = {};
        assertThrows(IllegalArgumentException.class, () -> {
            findSecondMax.findSecondMax(arroy);
        });
    }


    //Пустую строку
    //null
   // Строку с несколькими пробелами
    @Test
    public void testCountWorld(){
        CountWords countWords = new CountWords();
        assertEquals(0,countWords.countWords(""));
        assertEquals(2,countWords.countWords("Hello world"));
        assertEquals(3,countWords.countWords("Java     is awesome "));
        assertEquals(0,countWords.countWords("             "));
    }

    @Test
    public void NullTestCountWorld(){
        CountWords countWords = new CountWords();
        assertThrows(NullPointerException.class, () -> {
            countWords.countWords(null);
        });
    }

    //Корректные номера ("+1 1234567890")
    //Некорректные номера ("12345", "invalid")

    @Test
    public void validPhone(){
        IsValidPhoneNumber isValidPhoneNumber = new IsValidPhoneNumber();
        assertTrue(isValidPhoneNumber.isValidPhoneNumber("+1 1234567890"));
        assertTrue(isValidPhoneNumber.isValidPhoneNumber("+7 9231331363"));
    }

    @Test
    public void negativePhone(){
        IsValidPhoneNumber isValidPhoneNumber = new IsValidPhoneNumber();
        assertFalse(isValidPhoneNumber.isValidPhoneNumber("+1 12345623423423427890"));
        assertFalse(isValidPhoneNumber.isValidPhoneNumber("invalid"));
        assertFalse(isValidPhoneNumber.isValidPhoneNumber("12345"));
        assertFalse(isValidPhoneNumber.isValidPhoneNumber("+1 abcdefghij"));
        assertFalse(isValidPhoneNumber.isValidPhoneNumber(""));

        assertThrows(NullPointerException.class, () -> {
            isValidPhoneNumber.isValidPhoneNumber(null);
        });

    }
}
