public class Main {
    public static void main(String[] args) {
        beverage b = new whiskey();
        b.template(35);

        b = new beer();
        b.template(200); 
    }
}