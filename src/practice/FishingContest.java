package practice;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.Iterator;

public class FishingContest {
	HashMap<String, double[]> allCatches;
	FishingContest(HashMap<String, double[]> ac){
		allCatches=ac;
	}

	public double findBiggestFish(String string) {
		// TODO Auto-generated method stub
		double[] personsFishes = allCatches.get(string);
		double largestNum = 0;
			for (int i = 0; i < personsFishes.length; i++) {
		if (personsFishes[i]>largestNum) {
		largestNum=personsFishes[i];
		}
	}
		return largestNum;
	}

	public Object findWinner() {
	//	ArrayList<Double> bigFishes = new ArrayList<Double>();
	double bf=0;
	String key2="0";
	
		for(String key: allCatches.keySet()) {
		
		double[] personsFishes = allCatches.get(key);
		double largestNum = 0;
		for (int i = 0; i < personsFishes.length; i++) {
	if (personsFishes[i]>largestNum) {
	largestNum=personsFishes[i];
	}
}
		//bigFishes.add(largestNum);	
		if(largestNum>bf) {
			bf=largestNum;
			key2=key;
		}
	}
	
		return key2;	
	/*System.out.println(bigFishes);
	double biggestFish = 0;
	for (int i = 0; i < bigFishes.size(); i++) {
		if(bigFishes.get(i)>biggestFish) {
			biggestFish=bigFishes.get(i);
		}
	}
	*/
	
	/*	double[] fishMountain =allCatches.get(allCatches);
		double largestNum = 0;
		for (int i = 0; i < fishMountain.length; i++) {
	if (fishMountain[i]>largestNum) {
	largestNum=fishMountain[i];
	}
}
	return largestNum; */
}  
	}

