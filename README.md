# rovertest
Rover Solution in JAVA
------------------------

Assumption:
-----------
It is a simplistic solution which assumes the following 
1) Once rover hits the extreme it won't move and it will wait for next instruction 
2) 0,0 is the base cooridinate - can not go negative on the x and y coordinates 


Solution:
--------
As this solution if for the Rover we have the following base parameters 

 1. Geometry
		⋅⋅* Boundry condition : the extreme at  which the rover can move 
		..* Rover Direction : The direction for the rover and future steps 
		..* XY coordinates of Rover 
		
 2.Exception 
 		..*Just now capturing only input errors 
 		
 3. Basic Rover 
 	 	..* For rover movement 
 	 	
  *Test
  	Test for regular movement and Exception tests
  	
 Future Enhancement
 ==================
 
When I get chance i will build in intelligence in the program 
Taking care of extremes and movement if rover is at y = 0 dont even test South going it will save intructions and computation,

* More robust error handling 
* More robust error messages


