package com.gradeproject.q1;

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
