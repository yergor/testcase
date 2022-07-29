package guru.qa;

public class First {
    public static void main(String[] args) throws InterruptedException {
        TestCase genderSelection = new TestCase(20, "Выбор пола: Женский", true, false );
        genderSelection.findBug();
        genderSelection.makeReport();
    }
}
