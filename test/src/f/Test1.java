package f;

import c.Protected_Example;

public class Test1 extends Protected_Example{

	public static void main(String[] args) {

		//	Default_Example d = new Default_Example();
		//	System.out.println(d.age);
		//	System.out.println(d.name);
		//	d.method1();

		//	Protected_Example pr= new Protected_Example();
			//System.out.println(pr.age);
			//System.out.println(pr.name);
			//pr.method1();

			Test1 t = new Test1();
			System.out.println(t.age);
			System.out.println(t.name);
			t.method1();

		}

	}

/*There are four types of Java access modifiers:

Private: The access level of a private modifier is only within the class. 
It cannot be accessed from outside the class.

Default: The access level of a default modifier is only within the package. 
It cannot be accessed from outside the package. If you do not specify any access level, it will be the default.

Protected: The access level of a protected modifier is within the package and outside the package through child class. 
If you do not make the child class, it cannot be accessed from outside the package.

Public: The access level of a public modifier is everywhere. It can be accessed from within the class, outside the class, 
within the package and outside the package.*/


 



