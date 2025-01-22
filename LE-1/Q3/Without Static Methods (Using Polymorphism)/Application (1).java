/******************************************************************************

Welcome to GDB Online.
  GDB online is an online compiler and debugger tool for C, C++, Python, PHP, Ruby, 
  C#, OCaml, VB, Perl, Swift, Prolog, Javascript, Pascal, COBOL, HTML, CSS, JS
  Code, Compile, Run and Debug online from anywhere in world.

*******************************************************************************/
class Mother {
    void show() {
        System.out.println("Hello World");
    }
}

class Child extends Mother {
    @Override
    void show() {
        System.out.println("Hello JUET");
    }
}

public class Application {
    public static void main(String[] args) {
        Mother m = new Mother();
        m.show();

        Mother m1 = new Child();  
        m1.show();  
    }
}
