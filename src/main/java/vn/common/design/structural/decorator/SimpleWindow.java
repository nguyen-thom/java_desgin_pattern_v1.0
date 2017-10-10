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
public class SimpleWindow implements Window {

	/*
	 * @see vn.common.design.behavior.decorator.Window#draw()
	 */
	@Override
	public void draw() {
		
		
	}

	/* 
	 * @see vn.common.design.behavior.decorator.Window#getDescription()
	 */
	@Override
	public String getDescription() {
		
		return "simple window";
	}
	
	

}
