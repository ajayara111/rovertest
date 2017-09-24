package cloudpassage.com.basicrover;
import cloudpassage.com.geometry.XYCoord;
import cloudpassage.com.geometry.RoverDirection;
import cloudpassage.com.exception.RoverException;
import cloudpassage.com.geometry.BoundryCondition;



public class BasicRover {

    private XYCoord xyc;
    private RoverDirection rd;
    private BoundryCondition bc;


    public XYCoord getXyc() {
		return xyc;
	}

	public void setXyc(XYCoord xyc) {
		this.xyc = xyc;
	}

	public RoverDirection getRd() {
		return rd;
	}

	public void setRd(RoverDirection rd) {
		this.rd = rd;
	}

	public BoundryCondition getBc() {
		return bc;
	}

	public void setBc(BoundryCondition bc) {
		this.bc = bc;
	}



    public void moveRover(final String commandString) throws RoverException {
        
        for (int i =0; i < commandString.length(); i++) {
            switch (commandString.charAt(i)){
            case 'L':
            	rotateL();
            	break;
            case 'R':
            	rotateR();
            	break;
            case 'M':
            	moveStraight();
            	break;
            default:
            	throw new RoverException();
            }
        }
    }

    public String currentLocation() {
        return xyc.toString() + " " + rd.toString();
    }

    public void rotateR() {
        this.rd = this.rd.rotateRight();
    }

    public void rotateL() {
        this.rd = this.rd.rotateLeft();
    }

    public void moveStraight() {
        XYCoord positionAfterMove = xyc.afterMove(rd.moveXOneHop(), rd.moveYOneHop());

        //ignores the command if rover is being driven off plateau
        if(bc.isLegalRoverMove(positionAfterMove))
            xyc = xyc.futureDirection(rd.moveXOneHop(), rd.moveYOneHop());
    }
    
   
}
