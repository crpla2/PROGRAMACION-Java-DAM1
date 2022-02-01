package _06treeset3;

import java.util.Comparator;

public class UserSalaryComparator implements Comparator<User> {

	// This compares employees based on salaries
	@Override
	public int compare(User o1, User o2) {
		if (o1.getSalary() >= o2.getSalary()) {
			return 1;
		} else {
			return -1;
		}
	}
		// return o1.getSalary() - o2.getSalary(); este no vale porque si hay
		//salarios iguales lo consideraría como repetido y lo eliminaria.
}
