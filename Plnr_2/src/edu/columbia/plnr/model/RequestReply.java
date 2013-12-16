package edu.columbia.plnr.model;




import com.google.cloud.backend.android.CloudEntity;

public class RequestReply {
	
	private CloudEntity entity;
	
	public static final String KEY_USERID = "userid";
	public static final String KEY_STAT_ACCEPT = "accepted";
	public static final String KEY_SUBJ_ID = "subjecid";
	
	public RequestReply(CloudEntity e) {
		this.entity = e;
	}
	
	public RequestReply( String target, Boolean accept, String subject) {
		this.setTarget(target);
		this.setAccepted(accept);
		this.setSubject(subject);
	}
	
	public CloudEntity asEntity() {
		return this.entity;
	}
	
	public void setSubject(String subject2) {
		this.entity.put(KEY_SUBJ_ID, subject2);
	}
	public String getSubjectId() {
		return (String) this.entity.get(KEY_SUBJ_ID);
	}
	
	public void setAccepted(Boolean accept2) {
		this.entity.put(KEY_STAT_ACCEPT, accept2);
	}
	public Boolean isAccepted() {
		return (Boolean) this.entity.get(KEY_STAT_ACCEPT);
	}
	
	public void setTarget(String target2) {
		this.entity.put(KEY_USERID, target2);
	}
	public String getTargetUserId() {
		return (String) this.entity.get(KEY_USERID);
	}
	
	
}
