

import java.util.*;

public class main{
	
	public static class countLayers{// to count the number of layers
		static int layerCount = 0;
	}
	
	public static class allStates{ // stores all the states 
		 static ArrayList<ArrayList<Integer>> allStates = new ArrayList<ArrayList<Integer>>();
		 
	}
	

	
	public static class currentLayer{//holds all the nodes of the current Layer ready for expansion
		static ArrayList<ArrayList<Integer>> currentLayer = new ArrayList<ArrayList<Integer>>();
	}
	
	public static class createfirstLayer{//creates the first layer of the algorithm
		static ArrayList<Integer> firstLayer = new ArrayList<Integer>();  
		
	}
	
	public static class nextLayer{// to create a new Layer
		static ArrayList<ArrayList<Integer>> nextLayer = new ArrayList<ArrayList<Integer>>();
	}
	
	public static class zeroLayer{
		public static void zeroLayerFunction(){
			ArrayList<Integer> firstnode = new ArrayList<Integer>();// to create the source layer
			 firstnode.add(0);
			 firstnode.add(0);
			 firstnode.add(0);
			 allStates.allStates.add(firstnode);
			
			 
			 nextLayer.nextLayer.add(firstnode);
			 System.out.println(nextLayer.nextLayer);
			 
			 
			 
		}
	}
	
	public static class currentNode{// expands the current node
		public static void expandNodes() {
			 int capacityA = createfirstLayer.firstLayer.get(0);//store capacity of A 
			 int capacityB = createfirstLayer.firstLayer.get(1);// store capacity of B
			 int capacityC = createfirstLayer.firstLayer.get(2);// store capacity of C
			 
			 
			 
			 
				 currentLayer.currentLayer=nextLayer.nextLayer;
				 
				 
				 ArrayList<ArrayList<Integer>> layerToBeImplemented = new ArrayList<ArrayList<Integer>>();
				 for(int i = 0;i<currentLayer.currentLayer.size();i++){
					 
					 int a = (currentLayer.currentLayer.get(i)).get(0);
					 

					 int b = (currentLayer.currentLayer.get(i)).get(1);
					 int c = (currentLayer.currentLayer.get(i)).get(2);
					 
					 
						 
						 //to empty bucket a
						 ArrayList<Integer> newnode = new ArrayList<Integer>();
						 newnode.add(0);
						 newnode.add(b);
						 newnode.add(c);
						 
						 if(!(allStates.allStates.contains(newnode))){
							 allStates.allStates.add(newnode);
							 layerToBeImplemented.add(newnode);
						 }
						 ArrayList<Integer> newnode1 = new ArrayList<Integer>(); //to empty bucket b
						 newnode1.add(a);
						 newnode1.add(0);
						 newnode1.add(c);
						 if(!(allStates.allStates.contains(newnode1))){
							 allStates.allStates.add(newnode1);
							 layerToBeImplemented.add(newnode1);
						 }
						 ArrayList<Integer> newnode2 = new ArrayList<Integer>();// to empty bucket c
						 newnode2.add(a);
						 newnode2.add(b);
						 newnode2.add(0);
						 if(!(allStates.allStates.contains(newnode2))){
							 allStates.allStates.add(newnode2);
							 layerToBeImplemented.add(newnode2);
						 }
						 ArrayList<Integer> newnode3 = new ArrayList<Integer>();//to fill up A
						 newnode3.add(capacityA);
						 newnode3.add(b);
						 newnode3.add(c);
						 if(!(allStates.allStates.contains(newnode3))){
							 allStates.allStates.add(newnode3);
							 layerToBeImplemented.add(newnode3);
						 }
						 ArrayList<Integer> newnode4 = new ArrayList<Integer>();//to fill up B
						 newnode4.add(a);
						 newnode4.add(capacityB);
						 newnode4.add(c);
						 if(!(allStates.allStates.contains(newnode4))){
							 allStates.allStates.add(newnode4);
							 layerToBeImplemented.add(newnode4);
						 }
						 ArrayList<Integer> newnode5 = new ArrayList<Integer>();// to fill up C
						 newnode5.add(a);
						 newnode5.add(b);
          				 newnode5.add(capacityC);
						 if(!(allStates.allStates.contains(newnode5))){
							 allStates.allStates.add(newnode5);
							 layerToBeImplemented.add(newnode5);
							
						 }
						 ArrayList<Integer> newnode6 = new ArrayList<Integer>(); //pour water a from a into B
						 int holda = a;
						 int holdb = b;
						 for(int m=holdb;m<capacityB;m++){ 
							 if(holda>0){
								 holda=holda-1;
								 holdb=holdb+1;			
							 }
						 }
						 newnode6.add(holda);
						 newnode6.add(holdb);
          				 newnode6.add(c);
						 if(!(allStates.allStates.contains(newnode6))){
							 allStates.allStates.add(newnode6);
							 layerToBeImplemented.add(newnode6);
							 
						 }
						 ArrayList<Integer> newnode7 = new ArrayList<Integer>(); // pour water from a into c 
						 int holdab = a;
						 int holdc = c;
						 for(int p=holdc;p<capacityC;p++){
							 if(holdab>0){
								 holdab=holdab-1;
								 holdc=holdc+1;			
							 }
						 }
						 newnode7.add(holdab);
						 newnode7.add(b);
          				 newnode7.add(holdc);
						 if(!(allStates.allStates.contains(newnode7))){
							 allStates.allStates.add(newnode7);
							 layerToBeImplemented.add(newnode7);
							 
						 }
						 ArrayList<Integer> newnode8 = new ArrayList<Integer>(); // pour water from b into a
						 int holdb1 = b;
						 int holda2 = a;
						 for(int q=holda2;q<capacityA;q++){
							 if(holdb1>0){
								 holdb1=holdb1-1;
								 holda2=holda2+1;			
							 }
						 }
						 newnode8.add(holda2);
						 newnode8.add(holdb1);
          				 newnode8.add(c);
						 if(!(allStates.allStates.contains(newnode8))){
							 allStates.allStates.add(newnode8);
							 layerToBeImplemented.add(newnode8);
							 
						 }
						 ArrayList<Integer> newnode9 = new ArrayList<Integer>(); //pour water from b into c
						 int holdb2 = b;
						 int holdc1 = c;
						 for(int q=holdc1;q<capacityC;q++){
							 if(holdb2>0){
								 holdb2=holdb2-1;
								 holdc1=holdc1+1;			
							 }
						 }
						 newnode9.add(a);
						 newnode9.add(holdb2);
          				 newnode9.add(holdc1);
						 if(!(allStates.allStates.contains(newnode9))){
							 allStates.allStates.add(newnode9);
							 layerToBeImplemented.add(newnode9);
							 
						 }
						 ArrayList<Integer> newnode10 = new ArrayList<Integer>();// pour water from c into a 
						 int holdc2 = c;
						 int holda3 = a;
						 for(int w=holda3;w<capacityA;w++){
							 if(holdc2>0){
								 holdc2=holdc2-1;
								 holda3=holda3+1;			
							 }
						 }
						 newnode10.add(holda3);
						 newnode10.add(b);
          				 newnode10.add(holdc2);
						 if(!(allStates.allStates.contains(newnode10))){
							 allStates.allStates.add(newnode10);
							 layerToBeImplemented.add(newnode10);
							 
						 }
						 ArrayList<Integer> newnode11 = new ArrayList<Integer>();// pour water from c into b
						 int holdc3 = c;
						 int holdb3 = b;
						 for(int w=holdb3;w<capacityB;w++){
							 if(holdc3>0){
								 holdc3=holdc3-1;
								 holdb3=holdb3+1;			
							 }
						 }
						 newnode11.add(a);
						 newnode11.add(holdb3);
          				 newnode11.add(holdc3);
						 if(!(allStates.allStates.contains(newnode11))){
							 allStates.allStates.add(newnode11);
							 layerToBeImplemented.add(newnode11);
							 
						 }
						 
					
						 
						 
						 
						 
					 
					   
				 }
				 
				 System.out.println(layerToBeImplemented);
				 nextLayer.nextLayer=layerToBeImplemented;
				 layerToBeImplemented = null;
				 countLayers.layerCount=countLayers.layerCount+1;
				 
				 
				 
				 
				 
				 
			
			
			
			
			
//do the calculation here
}
		
	}
	
	
	public static void main(String[] args) {
		
		int bucketA;
		int bucketB;
		int bucketC;
		Scanner input = new Scanner(System.in);

		System.out.println("Please enter the value of Bucket A : ");
		bucketA = input.nextInt(); // get value of bucket A

		System.out.println("Please enter the value of Bucket B : ");
		bucketB = input.nextInt(); // get value of Bucket B
		System.out.println("Please enter the value of Bucket C : ");
		bucketC = input.nextInt(); // get value of Bucket C
		
		createfirstLayer.firstLayer.add(bucketA);
		createfirstLayer.firstLayer.add(bucketB);
		createfirstLayer.firstLayer.add(bucketC);
		
		currentLayer.currentLayer.add(createfirstLayer.firstLayer);
	        zeroLayer.zeroLayerFunction();
	    	while(!(nextLayer.nextLayer.isEmpty())){
	        currentNode.expandNodes();
	    	}
	    	System.out.println("total number of layers ="+countLayers.layerCount);
	
		
		
		


		
		
		
	   }
}



