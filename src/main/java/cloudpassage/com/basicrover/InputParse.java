package cloudpassage.com.basicrover;

import java.util.Scanner;

import cloudpassage.com.exception.RoverException;
import cloudpassage.com.geometry.BoundryCondition;
import cloudpassage.com.geometry.XYCoord;
import cloudpassage.com.geometry.RoverDirection;

public class InputParse {
	public void readInputAndExecute() throws RoverException {

		try {
			Scanner scanner = new Scanner(System.in);
			String bounds = scanner.nextLine();
			String[] s = bounds.split(" ");
			BoundryCondition bc = new BoundryCondition(Integer.parseInt(s[0]), Integer.parseInt(s[1]));
			System.out.println("Bound is" + bounds);

			int i = 0;
			BasicRover br = null;
			while (scanner.hasNextLine()) {
				XYCoord c;
				RoverDirection d;

				if (i % 2 == 0) {
					String initialPosition = scanner.nextLine();
					String[] s1 = initialPosition.split(" ");
					c = new XYCoord(Integer.parseInt(s1[0]), Integer.parseInt(s1[1]));
					d = RoverDirection.valueOf(s1[2].charAt(0));
					br = new BasicRover();
					br.setBc(bc);
					br.setRd(d);
					br.setXyc(c);
					System.out.println("Initial is" + initialPosition);
					i++;
				} else {
					String movement = scanner.nextLine();
					br.moveRover(movement);
					System.out.println("current position is" + br.currentLocation());
					System.out.println("movement is" + movement);
					i++;
				}
			}
		} catch (Exception e) {
			throw new RoverException();
		}
	}

	public static void main(String[] argv) {
		InputParse ip = new InputParse();
		try{
		ip.readInputAndExecute();
		}
		catch (RoverException e){
			System.out.println(e.toString());
		}
	}

}
