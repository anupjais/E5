package com.qsp.e5;

import java.util.Comparator;

public class SortByIdDesc implements Comparator<Employee> {

	@Override
	public int compare(Employee o1, Employee o2) {
		if(o1.id<o2.id)
			return 1;
		else if(o1.id>o2.id)
			return -1;
		
		return 0;
	}

}

