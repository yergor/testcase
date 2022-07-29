package guru.qa;


public class TestCase {
    int time;
    String name;
    boolean bug;
    boolean status;

    public TestCase(int time, String name, boolean bug, boolean status) {
        this.time = time;
        this.name = name;
        this.bug = bug;
        this.status = bug;
    }

    void findBug() throws InterruptedException {
        if (bug == true) {
            status = false;
            System.out.println("Заведен баг в jira");
            time = time + 1;
            System.out.println("Статус бага: готово к разработке");
            Thread.sleep(20);
            System.out.println("Статус бага: разработка");
            Thread.sleep(30);
            System.out.println("Статус бага: готово");
            System.out.println("Проведите ретест кейса");
            time = time*2 - 1;
            status = true;
            System.out.println("Успешно");
        } else {
            status = true;
            System.out.println("Успешно");
        }
    }


    void makeReport() {
        System.out.println("");
        System.out.println("");
        System.out.println("Название тест кейса: " + name);
        System.out.println("Время затраченное на прохождение: " + time);
        System.out.println("Статус: " + status);
    }
}

