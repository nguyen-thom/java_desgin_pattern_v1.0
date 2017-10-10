/**
 * 
 */
package vn.common.design.behavior.CoR.test;

import org.junit.Test;

import vn.common.design.behavior.CoR.Handler;
import vn.common.design.behavior.CoR.HandlerOne;
import vn.common.design.behavior.CoR.HandlerThree;
import vn.common.design.behavior.CoR.HandlerTwo;
import vn.common.design.behavior.CoR.Request;

/**
 * @author <a href="mailto:nguyen.thom2406@gmail.com">Tom Nguyen</a>
 * @since Oct 9, 2017
 * @note
 */
public class ChainOfResponsibilityTest {

  @Test
  public void testCoR() {
    HandlerOne h1 = new HandlerOne();
    Handler h2 = new HandlerTwo();
    Handler h3 = new HandlerThree();
    h1.setSuccessor(h2);
    h2.setSuccessor(h3);

    // Send requests to the chain
    // h1.handleRequest(new Request("Negative Value ", -1));
    h1.handleRequest(new Request("Negative Value ", 0));
    // h1.handleRequest(new Request("Negative Value ", 1));
    // h1.handleRequest(new Request("Negative Value ", 2));
    // h1.handleRequest(new Request("Negative Value ", -5));
  }
}
