package pset1;

	import static org.junit.Assert.*;
	import org.junit.Test;
	public class SLListAddTester {

		
		@Test public void test0() {
			SLList l = new SLList();
			assertTrue(l.repOk());
			l.add(true);
// write a sequence of assertTrue method invocations that
// perform checks on the values for all the declared fields
// of list and node objects reachable from l
			
			//test all initial conditions when list equals 1 element
			assertTrue(l.first != null);
			assertTrue(l.first.elem==true);
			assertTrue(l.first.next == null);
			assertTrue(l.last!=null);
			assertTrue(l.last==l.first);
			
// your code goes here
}
		@Test public void test1() {
			SLList l = new SLList();
			assertTrue(l.repOk());
			l.add(true);
			assertTrue(l.repOk());
			l.add(false);
			assertTrue(l.repOk());
// write a sequence of assertTrue method invocations that
// perform checks on the values for all the declared fields
// of list and node objects reachable from l
			
			//check if first is correct
			assertTrue(l.first != null);
			assertTrue(l.first.elem == true);
			//check if first connects to second
			assertTrue(l.first.next !=null);
			//check if second is correct
			assertTrue(l.first.next.elem ==false);
			assertTrue(l.first.next.next==null);
			//check if last is correct
			assertTrue(l.last !=null);
			//check if last matches second
			assertTrue(l.first.next ==l.last);
			
			

}
}