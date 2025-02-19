class Kaurav extends Bharatvanshi {
    String name;
    boolean noble;
    Kaurav(String name, boolean noble) { this.name = name; this.noble = noble; }
    void obey() { System.out.println(name + (noble ? " is obedient." : " is disobedient.")); }
    void kind() { System.out.println(name + (noble ? " is kind." : " is cruel.")); }
}
