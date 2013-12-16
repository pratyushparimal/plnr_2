package edu.columbia.plnr.model;

import java.util.List;

import com.google.api.client.util.DateTime;
import com.google.cloud.backend.android.CloudEntity;

public class StudyGroup {
	
	private CloudEntity entity;
	
	public static final String KEY_LOC = "locationhash";
	public static final String KEY_LOC_NAME = "locationname";
	public static final String KEY_DATE = "starttime";
	public static final String KEY_DURATION = "duration";
	public static final String KEY_ATTENDEES = "attendees";
	public static final String KEY_SUBJECT = "subject";

	
	
	public StudyGroup(String locationHash,	String locationName, DateTime startTime, Duration duration,
			List<String> attendees, String subject) {
		
		this.entity = new CloudEntity("StudyGroup");
		this.setLocation(locationHash);
		this.setLocationName(locationName);
		this.setStartTime(startTime);
		this.setDuration(duration.name());
		this.setAttendees(attendees);
		this.setSubjectId(subject);
	}

	public StudyGroup(CloudEntity e) {
		this.entity = e;
	}
	
	public CloudEntity asEntity() {
		return this.entity;
	}
	
	public void setLocation(String locHash) {
		this.entity.put(KEY_LOC, locHash);
	}
	public String getLocation() {
		return (String) this.entity.get(KEY_LOC);
	}
	
	public void setLocationName(String name) {
		this.entity.put(KEY_LOC_NAME, name);
	}
	public String getLocationName() {
		return (String) this.entity.get(KEY_LOC_NAME);
	}
	
	public void setStartTime(DateTime time) {
		this.entity.put(KEY_DATE, time);
	}
	public DateTime getStartTime(){
		return new DateTime((String)this.entity.get(KEY_DATE));
	}
	
	public void setDuration(String duration) {
		this.entity.put(KEY_DURATION, duration);
	}
	public String getDuration() {
		return (String)this.entity.get(KEY_DURATION);
	}
	
	public void setAttendees(List<String> userIds) {
		this.entity.put(KEY_ATTENDEES, userIds);
	}
	public List<String> getAttendees(){
		return (List<String>) entity.get(KEY_ATTENDEES);
	}
	
	public void setSubjectId(String subjId) {
		this.entity.put(KEY_SUBJECT, subjId);
	}
	public String getSubjectId() {
		return (String) entity.get(KEY_SUBJECT);
	}
	
}
