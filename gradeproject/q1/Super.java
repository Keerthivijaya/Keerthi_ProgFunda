package com.gradeproject.q1;

class SuperDepartment {
	public String departmentName() {
		return "Super Depar
	}

	public String getTodaysWork() {
		return "No Work as of now";
	}

	public String getWorkDeadline() {
		return "Nil";
	}

	public String isTodayAHoliday() {
		return "Today is not a holiday";
	}
}

class AdminDepartment extends SuperDepartment {
	@Override
	public String departmentName() {
		return "Welcome to Admin Department";
	}

	@Override
	public String getTodaysWork() {
		return "Complete your documents Submission";
	}

	@Override
	public String getWorkDeadline() {
		return "Complete by EOD";
	}

	public String isTodayAHoliday() {
		return "Today is not a Holiday";
	}
}

class HrDepartment extends SuperDepartment {
	@Override
	public String departmentName() {
		return "Welcome to HR Department";
	}

	@Override
	public String getTodaysWork() {
		return "Fill today’s timesheet and mark your attendance";
	}

	@Override
	public String getWorkDeadline() {
		return "Complete by EOD";
	}

	public String doActivity() {
		return "Team Lunch";
	}

	public String isTodayAHoliday() {
		return "Today is not a Holiday";
	}
}

class TechDepartment extends SuperDepartment {
	@Override
	public String departmentName() {
		return "Welcome to Tech Department";
	}

	@Override
	public String getTodaysWork() {
		return "Complete coding of Module 1";
	}

	@Override
	public String getWorkDeadline() {
		return "Complete by EOD";
	}

	public String getTechStackInformation() {
		return "Core Java";
	}

	public String isTodayAHoliday() {
		return "Today is not a holiday";
	}
}

public class Super {
	public static void main(String[] args) {
		AdminDepartment adminDepartment = new AdminDepartment();
		HrDepartment hrDepartment = new HrDepartment();
		TechDepartment techDepartment = new TechDepartment();

		System.out.println(adminDepartment.departmentName());
		System.out.println(adminDepartment.getTodaysWork());
		System.out.println(adminDepartment.getWorkDeadline());
		System.out.println(adminDepartment.isTodayAHoliday());
		System.out.println();

		System.out.println(hrDepartment.departmentName());
		System.out.println(hrDepartment.doActivity());
		System.out.println(hrDepartment.getTodaysWork());
		System.out.println(hrDepartment.getWorkDeadline());
		System.out.println(hrDepartment.isTodayAHoliday());
		System.out.println();

		System.out.println(techDepartment.departmentName());
		System.out.println(techDepartment.getTodaysWork());
		System.out.println(techDepartment.getWorkDeadline());
		System.out.println(techDepartment.getTechStackInformation());
		System.out.println(techDepartment.isTodayAHoliday());
	}

}
