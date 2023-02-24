package pset1;
import static org.junit.Assert.*;
import org.junit.Test;
public class HashCodeTester {
/*
* P5: If two objects are equal according to the equals(Object)
* method, then calling the hashCode method on each of
* the two objects must produce the same integer result.
*/
// your test methods go here
	@Test public void t0() {
		//C/C combo equivalent
		C c1 = new C(1);
		C c2 = new C(1);
		assertTrue((c1.equals(c2))&&(c1.hashCode()==c2.hashCode()));
	}
	@Test public void t1() {
		//C/C combo non equivalent
		C c1 = new C(1);
		C c2 = new C(2);
		assertFalse((c1.equals(c2))&&(c1.hashCode()==c2.hashCode()));
	}
	@Test public void t2() {
		// D/D combo equivalent
		D d1 = new D(1,1);
		D d2 = new D(1,1);
		assertTrue((d1.equals(d2))&&(d1.hashCode()==d2.hashCode()));
	}
	@Test public void t3() {
		//D/D combo non-equivalent
		D d1 = new D(1,1);
		D d2 = new D(1,2);
		assertFalse((d1.equals(d2))&&(d1.hashCode()==d2.hashCode()));
	}
	@Test public void t5() {
		//O/O combo equivalent
		Object o1= new D(1,1);
		Object o2 = new D(1,1);
		assertTrue((o1.equals(o2))&&(o1.hashCode()==o2.hashCode()));
		
	}
	@Test public void t6() {
		//O/O combo non-equivalent
		Object o1= new D(1,1);
		Object o2 = new D(1,2);
		assertFalse((o1.equals(o2))&&(o1.hashCode()==o2.hashCode()));
		
	}
	@Test public void t7() {
		//C/D combo equivalent
		C c1 = new C(0);
		D d1 = new D(0,0);
		assertFalse((c1.equals(d1))&&(c1.hashCode()==d1.hashCode()));
	}
	@Test public void t8() {
		//C/D combo non-equivalent
		C c1 = new C(0);
		D d1 = new D(1,1);
		assertFalse((c1.equals(d1))&&(c1.hashCode()==d1.hashCode()));
	}
	@Test public void t9() {
		//C/0 combo equivalent
		C c1 = new C(1);
		Object o = new C(1);
		assertTrue((c1.equals(o))&&(c1.hashCode()==o.hashCode()));
		
	}
	@Test public void t10() {
		//C/O combo non-equivalent
		C c1 = new C(1);
		Object o = new C(2);
		assertFalse((c1.equals(o))&&(c1.hashCode()==o.hashCode()));
	}
	@Test public void t11() {
		//D/O combo equivalent
		D d1 = new D(1,1);
		Object d2 = new D(1,1);
		assertTrue((d1.equals(d2))&&(d1.hashCode()==d2.hashCode()));
	
}
	@Test public void t12() {
		//D/O combo non-equivalent
		D d1 = new D(1,1);
		Object d2 = new D(1,2);
		assertFalse((d1.equals(d2))&&(d1.hashCode()==d2.hashCode()));
	
}


}