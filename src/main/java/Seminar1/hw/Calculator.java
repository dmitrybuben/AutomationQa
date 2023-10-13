package Seminar1.hw;

import static org.assertj.core.api.Assertions.*;
public class Calculator {

    public static void main(String[] args) {
        assertThat(calculatingDiscount(1000, 20)).isEqualTo(800);
        assertThatThrownBy(() ->
                calculatingDiscount(1000, 110)).isInstanceOf(IllegalArgumentException.class);
        assertThatThrownBy(() ->
                calculatingDiscount(1000, 100)).isInstanceOf(IllegalArgumentException.class);
        assertThatThrownBy(() ->
                calculatingDiscount(1000, 0)).isInstanceOf(IllegalArgumentException.class);
        assertThatThrownBy(() ->
                calculatingDiscount(1000, -10)).isInstanceOf(IllegalArgumentException.class);
    }

    /*Задание 1. ** В классе Calculator создайте метод calculateDiscount, который принимает сумму покупки и
    процент скидки и возвращает сумму с учетом скидки.
    Ваша задача - проверить этот метод с использованием библиотеки AssertJ.
    Если метод calculateDiscount получает недопустимые аргументы, он должен выбрасывать исключение
    ArithmeticException. Не забудьте написать тесты для проверки этого поведения.*/

    // purchaseAmount - сумма покупки
    // discountPercent - размер скидки
    // Метод должен возвращать сумму покупки со скидкой
    public static double calculatingDiscount(double purchaseAmount, int discountPercent) {
        if (discountPercent > 100) {
            throw new IllegalArgumentException("The discount can't be more than 100%");
        }
        if (discountPercent == 100) {
            throw new IllegalArgumentException("The discount can't be equal to 100%");
        }
        if (discountPercent < 0) {
            throw new IllegalArgumentException("The discount can't have negative value");
        }
        if (discountPercent == 0) {
            throw new IllegalArgumentException("The discount should be higher than zero");
        }
        return purchaseAmount - purchaseAmount / 100 * discountPercent;
    }
}
