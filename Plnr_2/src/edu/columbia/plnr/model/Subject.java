package edu.columbia.plnr.model;

import com.google.cloud.backend.android.CloudEntity;

public class Subject {
	private CloudEntity entity;

	public static final String KEY_NAME = "name";
	
	public Subject(CloudEntity e) {
		this.entity = e;
	}
	public Subject(String name) {
		this.entity = new CloudEntity("Subject");
		this.setName(name);
	}
	
	public CloudEntity asEntity() {
		return this.entity;
	}
	
	public void setName(String nName) {
		entity.put(KEY_NAME, nName);
	}
	
	public String getName() {
		return (String) entity.get(KEY_NAME);
	}
}
