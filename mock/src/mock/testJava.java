package mock;

public class testJava {
	
	

	public static void main(String[] args) {
		int number = 5;
		int fact = 1;
for (int i=1; i<= number; i++) {
	fact = fact*i;
}

System.out.println(fact);

System.out.println("*********************");

int max = 10 ;

for (int i =0; i <max; i++) {
	for (int a =i+1 ; a <max; a++ ) {
		System.out.print(a);
	}
	System.out.println( i);
	
}

System.out.println("*********************");


int sum =0;

while ( sum<20) {
	
	System.out.println(sum);
	
	sum ++;
}
System.out.println("*********************");

int tot =0 ;
for (int tot1  =0 ; tot1 <=20; tot1++) {
	tot +=tot1;
	System.out.print(tot1);
	System.out.print("+");
	
}
System.out.println();
System.out.println(tot);

System.out.println("*********************");



int a= 10;
int b=20;
int c=0;
 c = b ;
b=a ;
a = c;
System.out.println(a);
System.out.println(b);


System.out.println("*********************");


String name = "welcome "; 
char[] try1 = name.toCharArray();

for (int i = try1.length - 1; i >= 0; i--) {
    System.out.print(try1[i]);
	
}
System.out.println("                ");

System.out.println("*********************");


int[] arr={2,5,6,10,12,9,13,18,20};
int odd_n=0;
int even_n=0;

for (int i=0; i<arr.length;i++) {
//ystem.out.println(arr[i]);
	if(arr[i]%2==0) {
		even_n+=1;
		}
	if(arr[i]%2!=0) {
odd_n+=1;
                              
	}
}
System.out.println("This is the sume of even number in the array"+ even_n);
System.out.println("This is the sume of odd number of the array"+ odd_n);


System.out.println("***********************************************");


int rad = 3;
double area = Math.PI * (Math.pow(rad, 2));
System.out.println(Math.round(area));



System.out.println("***************************************************");
	
	//Write a Java program to sum values of an array
int[] arr1={2,5,6,10,12,9,13,18,20};
int sum1 = 0;
for (int i :arr1) {
	sum1 = sum1+i;
}
System.out.println("sum values of an array is "+ sum1);


System.out.println("***************************************************");


//a Java Program to Search Key Elements in an Array
int[] arr2={5,2,6,3,7,8,4,1};
for (int i =0; i <arr2.length;i++ ) {
	//System.out.println(arr2[i]);
	
	if (arr2[i]==8) {
		System.out.println("The number 8 in the arr2 is located on "+ i +" position");
	}
	
}

System.out.println("***************************************************");


//Write a Java program to count total negative numbers in array 
int arr3[] = {3, 2, -1, 9, -8, 6, -2,-15,20,11,-13};
int count=0;
for (int i : arr3) {
	System.out.println( i );
	if (i<0) {
			
	}
	count = count+1;
	System.out.println( count);
//System.out.println("The number of negatives is  "+ count +" positions");
}
	}

}
	


