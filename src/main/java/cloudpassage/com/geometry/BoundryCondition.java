package cloudpassage.com.geometry;
/**
 * 
 * @author ajay
 * 
 * This assumes a boundary condition for the Rover that it should not  
 * Exceed the extremes of x,y
 * and x,y should always be > 0 
 * Like if rover is at 0,0 it can not go south.
 *
 */
public class BoundryCondition {

	private XYCoord extreme;

	public BoundryCondition(final int rightE, final int leftE) {

		extreme = new XYCoord(rightE, leftE);

	}

	public boolean isLegalRoverMove(final XYCoord xyc) {
		return (this.extreme.isLegal(xyc) && (xyc.getX() >= 0) && (xyc.getY() >= 0));
	}

}
