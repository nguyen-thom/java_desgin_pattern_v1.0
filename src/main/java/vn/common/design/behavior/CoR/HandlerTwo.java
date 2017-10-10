/**
 * 
 */
package vn.common.design.behavior.CoR;

/**
 * @author <a href="mailto:nguyen.thom2406@gmail.com">Tom Nguyen</a>
 * @since Oct 9, 2017
 * @note
 */
public class HandlerTwo extends Handler {
  public void handleRequest(Request request) {
    if (request.getValue() > 0) { //if request is eligible handle it
      System.out.println("Positive values are handled by ConcreteHandlerTwo:");
      System.out.println("\tConcreteHandlerTwo.HandleRequest : " + request.getDescription() + request.getValue());
    } else {
      super.handleRequest(request);
    }
  }
}
