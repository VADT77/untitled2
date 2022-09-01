package ru.netology

        import org.junit.jupiter.api.Test;

public class StatServiceTest {

    @Test
    public void shouldSum() {
        SalesService service = new SalesService ();
        long [] sales = {8,15,13,15,17,20,19,20,7,14,14,18};

        long actual = service.sum(sales);
        long expected = 8 + 15 + 13 + 15 + 17 + 20 + 19 + 20 + 7 + 14 + 14 + 18

        Assertions.assertEquals (expected, actual);
    }

}
