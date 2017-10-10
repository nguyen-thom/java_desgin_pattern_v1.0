/**
 * 
 */
package vn.common.design.behavior.CoREx1;

/**
 * @author <a href="mailto:nguyen.thom2406@gmail.com">Tom Nguyen</a>
 * @since Oct 9, 2017
 * @note
 */
public enum Categories {

  PURCHASE_PACK_1(20), PURCHASE_PACK_2(40), PURCHASE_PACK_3(60), PURCHASE_PACK_4(80), PURCHASE_PACK_5(100), PURCHASE_PACK_6(
      150), PURCHASE_PACK_7(200);

  Categories(int cost1) {
    this.cost = cost1;
  }

  private int cost;

  public int cost() {
    return this.cost;
  }

}
