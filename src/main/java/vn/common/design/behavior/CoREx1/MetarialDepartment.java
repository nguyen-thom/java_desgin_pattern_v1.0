/**
 * 
 */
package vn.common.design.behavior.CoREx1;

/**
 * @author <a href="mailto:nguyen.thom2406@gmail.com">Tom Nguyen</a>
 * @since Oct 9, 2017
 * @note
 */
public class MetarialDepartment extends Department {

  public void processPurchar(PurchasingRequest request) {
    if (request.getCategory().cost() <= Categories.PURCHASE_PACK_2.cost()) {
      System.out.println("MetarialDepartment processed request");
    } else {
      super.processPurchar(request);
    }

  }
}
