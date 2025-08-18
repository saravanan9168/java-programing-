// Online Java Compiler
// Use this editor to write, compile and run your Java code online


class emp_Salary {
	public  void salary() {
		System.out.println("Basic salary 10,000");
	}
}
class manager extends emp_Salary {
	@Override
	public  void salary() {
		System.out.println("Manager salary is 30,000");
	}
}
class hr extends emp_Salary {
	@Override
	public  void salary() {
		System.out.println("HR salary is 35,000");
	}
}
class team_leader extends emp_Salary {
	@Override
	public  void salary() {
		System.out.println("TL salary is 30,000");
	}

}
class Main {
	public static void main(String[] args) {
		emp_Salary v,a,b,u;
		v=new hr();
		v.salary();

		a=new team_leader();
		a.salary();

		b=new manager();
		b.salary();

		u=new emp_Salary();
		u.salary();
	}
}
