package myproect;

import org.testng.annotations.AfterClass;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

public class AnnotationTest {

	@Test
	public void method1() {

			System.out.println("method 1");
		}

		@Test
		public void method2() {

				System.out.println("method 2");
			}



		@Test
		public void method3() {

				System.out.println("method 3");
			}

		@AfterMethod
		public void end() {

			System.out.println("************calling after method****************");
		}

		@BeforeMethod
		public void start() {

			System.out.println("************calling before method****************");
		}

		@BeforeTest
		public void before() {
			System.out.println("************** Before Test ********************");
		}

		@AfterTest
		public void after() {
			System.out.println("************** After Test********************");
		}

		@BeforeClass
		public void beforeclass() {
			System.out.println("************** Before class ********************");
		}

		@AfterClass
		public void afterclass() {
			System.out.println("************** After class********************");
		}
		
		public class annot{
			
			@Test
			
			public void lazy() {
				System.out.println("now or never ");
				
			}
}
}
