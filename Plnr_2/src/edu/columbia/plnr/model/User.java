package edu.columbia.plnr.model;

import java.util.ArrayList;
import java.util.List;

import com.google.cloud.backend.android.CloudEntity;


public class User {

	private CloudEntity entity;
	private static final String KEY_USERNAME = "username";

	private static final String KEY_GEOHASH = "location";

	private static final String KEY_LOC_NAME = "locationname";

	private static final String KEY_TUTOR = "istutor";

	private static final String KEY_SUB_ID = "subjects";;

	private static final String KEY_STATUS = "status";

	private static final String KEY_TUTOR_STATUS = "tutorStatus";
	
	
	public User(String userN, String location, String locationN, Boolean isTutor, 
			List<String> subjects, Status nStat, TutorStatus tutStat) {
		this.entity = new CloudEntity("User");
		this.setUsername(userN);
		this.setLocName(locationN);
		this.setGeohash(location);
		this.setTutor(isTutor);
		this.setSubjects(subjects);
		this.setStatus(nStat.name());
		this.setTutorStatus(tutStat.name());
		
	}
	
	public User(CloudEntity e) {
		this.entity = e;		
	}
	
	public CloudEntity asEntity() {
		return this.entity;
	}
	
	public static List<User> fromEntities(List<CloudEntity> entities){
		List<User> users = new ArrayList<User>();
		for (CloudEntity entity : entities) {
			users.add(new User(entity));
		}
		return users;
	}

	public CloudEntity getEntity() {
		return entity;
	}

	public void setUsername(String uName) {
		this.entity.put(KEY_USERNAME, uName);
	}
	public String getUsername() {
		return (String) entity.get(KEY_USERNAME);
	}

	public void setGeohash(String gH) {
		this.entity.put(KEY_GEOHASH, gH);
	}
	
	public String getGeohash() {
		return (String) entity.get(KEY_GEOHASH);
	}
	
	public void setLocName(String lN) {
		this.entity.put(KEY_LOC_NAME, lN);
	}
	
	public String getLocName() {
		return (String) this.entity.get(KEY_LOC_NAME);
	}
	
	public void setTutor(Boolean isTutor) {
		this.entity.put(KEY_TUTOR, isTutor);
	}
	
	public Boolean getTutor() {
		return (Boolean) this.entity.get(KEY_TUTOR);
	}

	public void setSubjects(List<String> subjectIds) {
		this.entity.put(KEY_SUB_ID, subjectIds);
	}
	
	public List<String> getSubjectIds() {
		List<String> list = (List<String>) this.entity.get(KEY_SUB_ID);
		return list;
	}

	public void setStatus(String status) {
		this.entity.put(KEY_STATUS, status);
	}
	public String getStatus() {
		return (String) this.entity.get(KEY_STATUS);
	}
	
	public void setTutorStatus(String tutStat) {
		this.entity.put(KEY_TUTOR_STATUS, tutStat);
	}

	public String getTutorStatus() {
		return (String) this.entity.get(KEY_TUTOR_STATUS);
	}
	
	
}
