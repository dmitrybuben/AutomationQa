package Lection1;
import static org.assertj.core.api.Assertions.*;
import static Lection1.Calculator.calculation;

public class CalculatorTest {
    public static void main(String[] args) {

        /*if (4 != calculation(2,2,'+')) {
            throw new AssertionError("Method contains a mistake");
        }
        if (2 != calculation(4,2,'-')) {
            throw new AssertionError("Method contains a mistake");
        }
        if (4 != calculation(8,2,'/')) {
            throw new AssertionError("Method contains a mistake");
        }
        if (6 != calculation(3,2,'*')) {
            throw new AssertionError("Method contains a mistake");
        }*/

      /*  assert 4 == calculation(2,2,'+');
        assert 2 == calculation(4,2,'-');
        assert 4 == calculation(8,2,'/');
        assert 9 == calculation(3,2,'*');*/

        assertThat(calculation(2,2,'+')).isEqualTo(4);
        assertThat(calculation(4,2,'-')).isEqualTo(2);
        assertThat(calculation(8,2,'/')).isEqualTo(4);
        assertThat(calculation(3,2,'*')).isEqualTo(6);

       /* try {
            Calculator.calculation(8,4,'_');
        } catch (IllegalStateException e) {
            if (!e.getMessage().equals("Unexpected value operator: _")) {
                throw new AssertionError("Method contains a mistake");
            }
        }*/

        assertThatThrownBy(() -> Calculator.calculation(8,4,'_'))
                .isInstanceOf(IllegalStateException.class);
    }
}
