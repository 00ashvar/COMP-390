import org.junit.jupiter.api.Test;

public class TestingHere {
    @Test
    void testCar() {
        System.out.println("Test");
        Car c = new Car();
        c.setMake("Tesla");
        c.setModel("Model S");
        c.setYear(2020);
        c.setPrice(100000);
        System.out.println(c.toString());
        System.out.println(c.getMake());
        System.out.println(c.getModel());
        System.out.println(c.getYear());
        System.out.println(c.getPrice());
        System.out.println(c);
    }
}
