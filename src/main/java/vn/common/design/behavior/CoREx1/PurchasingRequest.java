/**
 * 
 */
package vn.common.design.behavior.CoREx1;

/**
 * @author <a href="mailto:nguyen.thom2406@gmail.com">Tom Nguyen</a>
 * @since Oct 9, 2017
 * @note
 */
public class PurchasingRequest {
  private Categories requestCategory;

  public PurchasingRequest(Categories category) {
    this.requestCategory = category;
  }

  public Categories getCategory() {
    return this.requestCategory;
  }
}
