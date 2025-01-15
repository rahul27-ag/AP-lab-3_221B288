/******************************************************************************

Welcome to GDB Online.
GDB online is an online compiler and debugger tool for C, C++, Python, Java, PHP, Ruby, Perl,
C#, OCaml, VB, Swift, Pascal, Fortran, Haskell, Objective-C, Assembly, HTML, CSS, JS, SQLite, Prolog.
Code, Compile, Run and Debug online from anywhere in world.

*******************************************************************************/

class jUET {
	String name;
	int age;

	int setage(int a) {
		age = a;
		return age;
	}
	String setname(String s) {
		name = s;
		return name;
	}
	void getage() {
		System.out.println(age);
	}
	void getname() {
		System.out.println(name);
	}

}

public class Main
{
	public static void main(String[] args) {
		jUET j = new jUET();
		j.setname("Rahul");
		j.getname();
		j.setage(22);
		j.getage();
	}
}
