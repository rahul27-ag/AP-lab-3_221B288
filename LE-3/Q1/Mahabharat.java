public class Mahabharat {
    public static void main(String[] args) {
        Bharatvanshi[] characters = {
            new Pandav("Arjun"), new Pandav("Bheem"),
            new Kaurav("Duryodhan", false), new Kaurav("Vikarn", true)
        };
        for (Bharatvanshi character : characters) {
            character.fight();
            character.obey();
            character.kind();
            System.out.println();
        }
    }
}
