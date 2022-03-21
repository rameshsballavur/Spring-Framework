package com.jsp.multiplebeanclass;

import java.util.Set;

public class College {
	
	private int collegeId;
	private String collegeName;
	private Set<Branch> branches;
	
	public int getCollegeId() {
		return collegeId;
	}
	public void setCollegeId(int collegeId) {
		this.collegeId = collegeId;
	}
	public String getCollegeName() {
		return collegeName;
	}
	public void setCollegeName(String collegeName) {
		this.collegeName = collegeName;
	}
	public Set<Branch> getBranches() {
		return branches;
	}
	public void setBranches(Set<Branch> branches) {
		this.branches = branches;
	}
	@Override
	public String toString() {
		return "College [collegeId=" + collegeId + ", collegeName=" + collegeName + ", branches=" + branches + "]";
	}
	
	
}
