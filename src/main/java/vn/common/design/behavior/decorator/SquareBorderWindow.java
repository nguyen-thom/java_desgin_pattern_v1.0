/**
 * 
 */
package vn.common.design.behavior.decorator;


/**
 *
 * @author <a href="mailto:nguyen.thom2406@gmail.com">Tom Nguyen</a>
 *
 * @since 5 Oct 2017
 * @note 
 */
public class SquareBorderWindow extends DecoratorWindow {

	/**
	 * @param window
	 */
	public SquareBorderWindow(Window window) {
		super(window);
	}

	/**
	 * 
	 */
	@Override
	public void draw() {
		super.draw();
		addBehavior();
	}
	
	/**
	 * ad behavior to window (component)
	 */
	public void addBehavior(){
		
	}
	
	@Override
	public String getDescription(){
		return this.windowDecorated.getDescription() + ",Add Square Border";
		
	}

}
