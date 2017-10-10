/**
 * 
 */
package vn.common.design.behavior.CoR;

/**
 * @author <a href="mailto:nguyen.thom2406@gmail.com">Tom Nguyen</a>
 * @since Oct 9, 2017
 * @note
 */
public abstract class Handler {

  protected Handler successor;

  public void setSuccessor(Handler successor) {
    this.successor = successor;
  }

  public void handleRequest(Request request) {
    this.successor.handleRequest(request);
  }

}
