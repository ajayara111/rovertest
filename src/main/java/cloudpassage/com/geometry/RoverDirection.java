package cloudpassage.com.geometry;

import cloudpassage.com.exception.RoverException;

/**
 * 
 * @author ajay
 * This class defines the directions of the rover.
 * There are 4 directions and as a result of that the movement is on the steps 
 * given.
 * 
 * North has a movement 0,1 
 * South has 0,-1
 * East is 1,0
 * West is -1,0
 * 
 * If there is any input problem RoverException is thrown
 *
 */
public enum RoverDirection {

    N(0,1) {
        @Override
        public RoverDirection rotateLeft() {
            return W;
        }

        @Override
        public RoverDirection rotateRight() {
            return E;
        }
    },

    S(0,-1) {
        @Override
        public RoverDirection rotateRight() {
            return W;
        }

        @Override
        public RoverDirection rotateLeft() {
            return E;
        }
    },

    E(1,0) {
        @Override
        public RoverDirection rotateRight() {
            return S;
        }

        @Override
        public RoverDirection rotateLeft() {
            return N;
        }
    },

    W(-1,0) {
        @Override
        public RoverDirection rotateRight() {
            return N;
        }

        @Override
        public RoverDirection rotateLeft() {
            return S;
        }
    };

    private final int moveX;
    private final int moveY;

    RoverDirection(final int moveX, final int moveY) {
        this.moveX = moveX;
        this.moveY = moveY;
    }
    public abstract RoverDirection rotateRight();
    public abstract RoverDirection rotateLeft();

    public int moveXOneHop() {
        return this.moveX;
    }

    public int moveYOneHop() {
        return this.moveY;
    }
   
  

	public static RoverDirection valueOf(char c) throws RoverException {
		switch (c){
		case 'N':
			return RoverDirection.N;
		case 'S':
			return RoverDirection.S;
		case 'W':
			return RoverDirection.W;
		case 'E':
			return RoverDirection.E;
		
		}
		throw new RoverException();
	}

}
