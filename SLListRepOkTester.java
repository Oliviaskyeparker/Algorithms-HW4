package pset1;

import static org.junit.Assert.*;
import org.junit.Test;
import pset1.SLList.Node;

public class SLListRepOkTester {
	@Test public void t0() {
		SLList l = new SLList();
		l.first = new SLList.Node();
		l.first.elem=false;
		l.first.next=null;
		l.last=l.first;
		assertTrue(l.repOk());
	}
	@Test public void t1() {
		//tests a false acyclic list to ascertain a false result
		SLList l = new SLList();
		l.first = new SLList.Node();
		l.first.elem=false;
		l.first.next = l.first;
		l.last=l.first.next;
		

		assertFalse(l.repOk());
// your code goes here
	
}

}