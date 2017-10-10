/**
 * 
 */
package vn.common.design.behavior.CoR;

/**
 * @author <a href="mailto:nguyen.thom2406@gmail.com">Tom Nguyen</a>
 * @since Oct 9, 2017
 * @note
 */
public class Request {
  private int value;
  private String description;

  public Request(String description, int value) {
    this.description = description;
    this.value = value;
  }

  public int getValue() {
    return this.value;
  }

  public String getDescription() {
    return this.description;
  }
}
