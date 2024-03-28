package oops_concept;

public class RoadToll_Main {
	public static void main(String args[]) {
		Road_Toll r1=new Road_Toll();
		r1.type="mahindra";
		r1.tiresCount=4;
		r1.calculateToll();
		
		Road_Toll r2=new Road_Toll("truck", 6);
		r2.calculateToll();
	}
   
}
