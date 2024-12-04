package com.mock.mockito;


public class SomeBusinessImpl {

	private DataService dataService;

	public int findGreatestofAll() {
		int[] data = dataService.retrieveAll();
		int greatestVal = Integer.MIN_VALUE;
		for (int value : data) {
			if (value > greatestVal)
				greatestVal = value;
		}
		return greatestVal;
	}

	public SomeBusinessImpl(DataService dataService) {
		super();
		this.dataService = dataService;
	}

}
 
interface DataService {
	int[] retrieveAll();
}
