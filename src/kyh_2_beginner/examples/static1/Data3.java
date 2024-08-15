package kyh_2_beginner.examples.static1;

public class Data3 {
    public String name;
    public static int count; //static

    public Data3(String name) {
        this.name = name;
        count++;
    }
}
