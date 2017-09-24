package cloudpassage.com.rovertest;

import org.junit.Assert;
import org.junit.Test;

import cloudpassage.com.basicrover.BasicRover;
import cloudpassage.com.exception.RoverException;
import cloudpassage.com.geometry.BoundryCondition;
import cloudpassage.com.geometry.RoverDirection;
import cloudpassage.com.geometry.XYCoord;
/**
 * 
 * @author ajay
 * Basic test for the Rover movement 
 * tests
 * No movement 
 * Random movement 
 * Hit the southern extreme
 * Exception handling 
 *
 */
public class myRoverTest {

    @Test
    
    //No move test
    public void canProvideCurrentLocationAsString() {
        BoundryCondition bc = new BoundryCondition(5,5);
        XYCoord xyc = new XYCoord (3,3);
        BasicRover br = new BasicRover();
        br.setBc(bc);
        br.setRd(RoverDirection.N);
        br.setXyc(xyc);
        Assert.assertEquals("3 3 N", br.currentLocation());
    }
    @Test
    //Reandom move test
    public void roverPosition1() throws RoverException {
    	 BoundryCondition bc = new BoundryCondition(5,5);
         XYCoord xyc = new XYCoord (3,3);
         BasicRover br = new BasicRover();
         br.setBc(bc);
         br.setRd(RoverDirection.N);
         br.setXyc(xyc);

     
         br.moveRover("MMMMMMMMMMR");

      
        Assert.assertEquals("3 5 E", br.currentLocation());
    }
    @Test
    //consitent move south until hits y axis as 0
    public void roverPosition2() throws RoverException {
    	 BoundryCondition bc = new BoundryCondition(5,5);
         XYCoord xyc = new XYCoord (3,3);
         BasicRover br = new BasicRover();
         br.setBc(bc);
         br.setRd(RoverDirection.S);
         br.setXyc(xyc);

     
         br.moveRover("MMMMMMM");

   
        Assert.assertEquals("3 0 S", br.currentLocation());
    }
    @Test
    //input exaception 
    public void inputException()  {
    	try{
    	 BoundryCondition bc = new BoundryCondition(5,5);
         XYCoord xyc = new XYCoord (3,3);
         BasicRover br = new BasicRover();
         br.setBc(bc);
         br.setRd(RoverDirection.S);
         br.setXyc(xyc);

     
         br.moveRover("pppppp");
    	}
    	catch (Exception e){
    		assert (e instanceof RoverException);
    	}

       
    }
 
}