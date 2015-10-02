/**
 * ListTest.java
 * A Java program to test the methods of a list implementation
 * Created by Frederik Roenn Stensaeth and Javier Moran
 * 05.07.14
 */

public class ListTest {
	public static void main (String[] args) {
		List<String> testList;
		testList = new LinkedListImplementation<String>();
		//tests for add
		//prints explanation of what was tested
		testList.add("Hi");
		if (!testList.at(testList.length() - 1).equals("Hi")) {
			System.out.printf("*** add FAILED: Expected Hi; Got %s ***\n", testList.at(testList.length() - 1));
		}
		testList.add("null");
		if (!testList.at(testList.length() - 1).equals("null")) {
			System.out.printf("*** add FAILED: Expected null; Got %s ***\n", testList.at(testList.length() - 1));
		}
		testList.add("false");
		if (!testList.at(testList.length() - 1).equals("false")) {
			System.out.printf("*** add FAILED: Expected false; Got %s ***\n", testList.at(testList.length() - 1));
		}
		testList.add("true");
		if (!testList.at(testList.length() - 1).equals("true")) {
			System.out.printf("*** add FAILED: Expected true; Got %s ***\n", testList.at(testList.length() - 1));
		}
		testList.add(".");
		if (!testList.at(testList.length() - 1).equals(".")) {
			System.out.printf("*** add FAILED: Expected .; Got %s ***\n", testList.at(testList.length() - 1));
		}
		testList.add("");
		if (!testList.at(testList.length() - 1).equals("")) {
			System.out.printf("*** add FAILED: Expected \"\"; Got %s ***\n", testList.at(testList.length() - 1));
		}
		testList.add("Hello Freddie wanted me to do this");
		if (!testList.at(testList.length() - 1).equals("Hello Freddie wanted me to do this")) {
			System.out.printf("*** add FAILED: Expected Hello Freddie wanted me to do this; Got %s ***\n", testList.at(testList.length() - 1));
		}
		testList.add("1");
		if (!testList.at(testList.length() - 1).equals("1")) {
			System.out.printf("*** add FAILED: Expected 1; Got %s ***\n", testList.at(testList.length() - 1));
		}
		testList.add("-1");
		if (!testList.at(testList.length() - 1).equals("-1")) {
			System.out.printf("*** add FAILED: Expected -1; Got %s ***\n", testList.at(testList.length() - 1));
		}
		
		testList.add("Hi \n Hello");
		if (!testList.at(testList.length() - 1).equals("Hi \n Hello")) {
			System.out.printf("*** add FAILED: Expected Hi \\n Hello; Got %s ***\n", testList.at(testList.length() - 1));
		}
		// for (String i : testList) {
		// 	System.out.format("%s\n", i);
		//}
		//test for add at index
		//prints true if test is succesfull
		testList.add(0, "Hi");
		if (!testList.at(0).equals("Hi")) {
			System.out.printf("*** add at FAILED: Expected Hi; Got %s ***\n", testList.at(0));
		}
		//prints false if test is succesfull
		if (testList.add(-1, "Hi") == true) {
			System.out.println("*** add at FAILED: Expected false; Got true ***");
		}
		//prints true if test is succesfull
		if (testList.add(testList.length(), "Hi") == false) {
			System.out.println("*** add at FAILED: Expected true; Got false ***");
		}
		//prints false if test is succesfull
		if (testList.add(testList.length() + 1, "Hi") == true) {
			System.out.println("*** add at FAILED: Expected false; Got true ***");
		}
		//prints true if test is succesfull
		if (testList.add(testList.length() / 2, "Hi") == false) {
			System.out.println("*** add at FAILED: Expected true; Got false ***");
		}
		// for (String i : testList) {
		// 	System.out.format("%s\n", i);
		// }
				for(int i = 0; i < testList.length(); i++) {
			System.out.println(testList.at(i));
		}
		


		//test for at
		//prints an item if at is succesfull
		if (!testList.at(8).equals("Hello Freddie wanted me to do this")){
			System.out.printf("*** at FAILED: Expected Hello Freddie wanted me to do this; Got %s ***\n", testList.at(8));
		}

		//prints null if at is succesfull		
		if (testList.at(-1) != null){
			System.out.println("*** at FAILED: Expected null; Got an item ***\n");
		}
		if (testList.at(50) != null){
			System.out.println("*** at FAILED: Expected null; Got an item ***\n");
		}
		if (testList.at(testList.length()) != null){
			System.out.println("*** at FAILED: Expected null; Got an item ***\n");
		}

		//test 
		//test for remove
		//Prints hi if test is succesfull
		String x = testList.remove(0);
		if (!x.equals("Hi")) {
			System.out.printf("*** remove FAILED: Expected Hi; Got %s ***\n", x);
		}
		//Prints null if remove is succesfull
		x = testList.remove(-1);
		if (x != null) {
			System.out.printf("*** remove FAILED: Expected null; Got %s ***\n", x);
		}
		//Prints null if remove is succesfull
		x = testList.remove(testList.length());
		if (x != null) {
			System.out.printf("*** remove FAILED: Expected null; Got %s ***\n", x);
		}
		//Prints the same thing if the remove is succesfull,
		x = testList.at(4);
		testList.remove(3);
		if (!testList.at(3).equals(x)) {
			System.out.printf("*** remove FAILED: Expected %s; Got %s ***\n", x, testList.at(3));
		}
		//test for clear
		//will then print null if clear is succesfull
		testList.clear();
		if (testList.at(0) != null) {
			System.out.printf("*** remove FAILED: Expected null; Got %s ***\n", testList.at(0));
		}

		//adds new things to the cleared list
		testList.add("Hi");
		testList.add("message1");
		testList.add("message2");
		testList.add("message3");
		testList.add("message4");
		testList.add("message5");

		//test for replace
		//prints false if replace is succesfull
		if (testList.replace(-1, "message6") != false) {
			System.out.println("*** replace FAILED: Expected false; Got true ***");
		}
		//prints false if replace is succesfull
		if (testList.replace(testList.length(), "message6") != false) {
			System.out.println("*** replace FAILED: Expected false; Got true ***");
		}
		//prints same thing if test is succesfull
		testList.replace(0, testList.at(1));
		if (!testList.at(1).equals(testList.at(0))) {
			System.out.printf("*** replace FAILED: Expected %s; Got %s ***\n", testList.at(1), testList.at(0));
		}

		//test for contains
		//prints true if contains is succesfull
		if (!testList.contains("message5")) {
			System.out.println("*** contains FAILED: Expected true; Got false ***");
		}
		//prints false if contains is succesfull
		if (testList.contains("message6")) {
			System.out.println("*** contains FAILED: Expected false; Got true ***");
		}

		//test for length
		//prints to consecutive integers, 6 and 7 if length is succesfull
		int length = testList.length();
		testList.add("message6");
		if ((length + 1) != testList.length()) {
			System.out.printf("*** length FAILED: Expected %d; Got %d ***\n", length + 1, testList.length());
		}

		//test for isEmpty
		//prints false if isEmpty is succesfull
		if (testList.isEmpty()) {
			System.out.println("*** length FAILED: Expected false; Got true ***");
		}
		//prints true if isEmpty is succesfull
		testList.clear();
		if (!testList.isEmpty()) {
			System.out.println("*** length FAILED: Expected true; Got false ***");
		}
	}
}