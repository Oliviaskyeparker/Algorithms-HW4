package pset1;
import static org.junit.Assert.*;
import org.junit.Test;
public class EqualsTester {
/*
* P1: For any non-null reference value x, x.equals(null) should return false.
*/
@Test public void t0() {
	
	//p1 for object class
	assertFalse(new Object().equals(null));
}
@Test public void t1() {
	//p1 for C class
	C c1 = new C(1);
	assertFalse(c1.equals(null));
}
@Test public void t2() {
	//p1 for D class
	D d1= new D(1,1);
	assertFalse(d1.equals(null));
}

/*
* P2: It is reflexive: for any non-null reference value x, x.equals(x)
* should return true.
*/
@Test public void t3() {
	//p2 for C class
	C c1 = new C(1);
	assertTrue(c1.equals(c1));
	
}
@Test public void t4() {
	//p2 for D class
	D d1= new D(1,1);
	assertTrue(d1.equals(d1));
}
@Test public void t5() {
	//p2 for object class
	Object o = new Object();
	assertTrue(o.equals(o));
}

/*
* P3: It is symmetric: for any non-null reference values x and y, x.equals(y)
* should return true if and only if y.equals(x) returns true.
*/
@Test public void t6() {
	//p3 for C class combination of the same object
	C c1 = new C(1);
	C c2 = new C(1);

	boolean result1=c1.equals(c2);
	boolean result2=c2.equals(c1);
	assertTrue((result1==result2)&&(result2==true));
	
}

@Test public void t7() {
	//p3 for C class combination of different objects
	C c1 = new C(1);
	C c3 = new C(2);
	
	boolean result1=c1.equals(c3);
	boolean result2=c3.equals(c1);
	assertTrue((result1==result2)&&(result2==false));
}



@Test public void t8() {
	//p2 for identical d objects
	D d1 = new D(1,1);
	D d2 = new D(1,1);

	boolean result1=d1.equals(d2);
	boolean result2=d2.equals(d1);
	assertTrue((result1==result2)&&(result2==true));
}

@Test public void t9() {
	//p2 for different d objects
	D d1 = new D(1,1);
	D d2 = new D(1,2);

	boolean result1=d1.equals(d2);
	boolean result2=d2.equals(d1);
	assertTrue((result1==result2)&&(result2==false));
}



@Test public void t10() {
	//p2 for identical objects
	Object o1= new D(1,1);
	Object o2 = new D(1,1);
	
	
	boolean result1=o1.equals(o2);
	boolean result2=o2.equals(o1);
	assertTrue((result1==result2)&&(result2==true));
	
	
}

@Test public void t11() {
	Object o1 = new D(1,1);
	Object o2 = new D(1,2);
	
	
	boolean result1=o1.equals(o2);
	boolean result2=o2.equals(o1);
	assertTrue((result1==result2)&&(result2==false));
	
	
}

//mixed class comparisons

@Test public void t12() {
	
	//p3 for C/D class combination, same object no typecasting
		C c1 = new C(0);
		D d1 = new D(0,0);

		boolean result1=c1.equals(d1);
		boolean result2=d1.equals(c1);
		assertTrue((result1==result2)&&(result2==false));
	
}

@Test public void t13() {
	
	//p3 for C/D class combination typecasting
		C c1 = new D(0,0);
		D c2 = new D(0,0);
		

		boolean result1=c1.equals(c2);
		boolean result2=c2.equals(c1);
		assertTrue((result1==result2)&&(result2==true));
	
}

@Test public void t14() {
	
	//p3 for C/D class combination of the different object
		C c1 = new C(0);
		D d1 = new D(1,1);
		

		boolean result1=c1.equals(d1);
		boolean result2=d1.equals(c1);
		assertTrue((result1==result2)&&(result2==false));
	
}

@Test public void t15() {
	//equal C/O combination typecasted
	C c1 = new C(1);
	Object o = new C(1);

	boolean result1=c1.equals(o);
	boolean result2=o.equals(c1);
	assertTrue((result1==result2)&&(result2==true));
}

@Test public void t16() {
	//equal C/O combination- non typecasted
	C c1 = new C(0);
	Object o = new Object();

	boolean result1=c1.equals(o);
	boolean result2=o.equals(c1);
	assertTrue((result1==result2)&&(result2==false));
}
@Test public void t17() {
	//unequal C and object
	C c1 = new C(1);
	Object o = new C(2);
	

	boolean result1=c1.equals(o);
	boolean result2=o.equals(c1);
	assertTrue((result1==result2)&&(result2==false));
}

@Test public void t18() {
	//unequal object and D
	D d1 = new D(1,1);
	Object d2 = new D(1,1);
	

	boolean result1=d1.equals(d2);
	boolean result2=d2.equals(d1);
	assertTrue((result1==result2)&&(result2==true));
}

@Test public void t19() {
	//unequal object and D
	D d1 = new D(0,0);
	Object d2 = new Object();
	

	boolean result1=d1.equals(d2);
	boolean result2=d2.equals(d1);
	assertTrue((result1==result2)&&(result2==false));
}

@Test public void t20() {
	//unequal object and D
	D d1 = new D(1,1);
	Object d2 = new Object();
	

	boolean result1=d1.equals(d2);
	boolean result2=d2.equals(d1);
	assertTrue((result1==result2)&&(result2==false));
}












}
