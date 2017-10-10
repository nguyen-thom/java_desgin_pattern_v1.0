/**
 * 
 */
package vn.common.design.structural.decorator;

/**
 *
 * @author <a href="mailto:nguyen.thom2406@gmail.com">Tom Nguyen</a>
 *
 * @since 5 Oct 2017
 * @note 
 */
public abstract class DecoratorWindow implements Window {
	
	
	protected Window windowDecorated;
	
	/**
	 * add component to decorator. We use component and add some behavior when apply.
	 */
	public DecoratorWindow(Window window) {
		super();
		this.windowDecorated = window;
	}

	/* (non-Javadoc)
	 * @see vn.common.design.behavior.decorator.Window#draw()
	 */
	@Override
	public void draw() {
		//delegate
		windowDecorated.draw();
		
	}

	/* (non-Javadoc)
	 * @see vn.common.design.behavior.decorator.Window#getDescription()
	 */
	@Override
	public String getDescription() {
		//delegate
		return this.windowDecorated.getDescription();
	}

}
