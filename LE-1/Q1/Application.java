/******************************************************************************

Welcome to GDB Online.
  GDB online is an online compiler and debugger tool for C, C++, Python, PHP, Ruby,
  C#, OCaml, VB, Perl, Swift, Prolog, Javascript, Pascal, COBOL, HTML, CSS, JS
  Code, Compile, Run and Debug online from anywhere in world.

*******************************************************************************/

class Mother {
	int x = 10;


	void show() {
		System.out.println("Value of x in Mother: " + x);
	}
}


class Child extends Mother {

}


public class Application {
	public static void main(String[] args) {

		Mother m = new Mother();
		m.show();


		Child ch = new Child();
		ch.show();
	}
}
