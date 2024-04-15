
class Addition {
    int a;
    static int b;
}

public class pratical9 {
    public static void main(String[] args) {
        Addition obj = new Addition();
        obj.a = 10;
        Addition.b = 20;
        int add = obj.a + Addition.b;
        System.out.println("Addition is:" + add);
    }
}
