package cloudpassage.com.geometry;
/**
 * 
 * @author ajay
 * 
 * This class just do the sanity on x,y coordinates given by the rover input 
 * Does following 
 * Check if x is within bounds 
 * Check if y in within bounds 
 * Check if the current move of the Rover is legal or not 
 *  Gives the direction of the rover after the move.
 *
 */
public class XYCoord {

    public int getX() {
		return x;
	}

	public void setX(int x) {
		this.x = x;
	}

	public int getY() {
		return y;
	}

	public void setY(int y) {
		this.y = y;
	}



	private int x;
    private int y;

    public XYCoord(final int x, final int y) {
        this.x = x;
        this.y = y;
    }

    public XYCoord futureDirection(final int xMove, final int yMove) {
        return new XYCoord(this.x + xMove, this.y + yMove);
    }

    @Override
    public String toString() {
        StringBuilder co = new StringBuilder();
        co.append(x);
        co.append(" ");
        co.append(y);
        return co.toString();
    }

    public boolean isLegal(final XYCoord xyc) {
        return isXValidMove(xyc.x) && isYValidMove(xyc.y);
    }

   

    private boolean isXValidMove(final int x) {
        return x <= this.x;
    }

    private boolean isYValidMove(final int y) {
        return y <= this.y;
    }

  

    public XYCoord afterMove(final int xMove, final int yMove) {
        return new XYCoord(x+xMove, y+yMove);
    }
   


}
