package com.asmin.MANY_TO_MANY_CONSTRUCTOR;

public class Course {
		private String courseId;
		private String courseName;
		private int courseCost;
		public Course(String courseId, String courseName, int courseCost) {
			
			this.courseId = courseId;
			this.courseName = courseName;
			this.courseCost = courseCost;
		}
		public String getCourseId() {
			return courseId;
		}
		
		public String getCourseName() {
			return courseName;
		}
		public int getCourseCost() {
			return courseCost;
		}
		
		
		
}
