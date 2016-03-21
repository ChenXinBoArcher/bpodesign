package com.bpodesign.core.entities;

import java.io.Serializable;
import java.util.ArrayList;
import java.util.List;

import javax.persistence.CascadeType;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.OneToOne;
import javax.persistence.Table;

import org.hibernate.annotations.Type;
import org.joda.time.DateTime;

import com.bpodesign.core.common.database.OrganizationTable;

@Entity
@Table(name = OrganizationTable.TableName)
public class Organization implements Serializable {

	@Id  
	@GeneratedValue(strategy = GenerationType.SEQUENCE)
	protected Long id;
	
	@Column
	protected int version;
	
	@Column
	protected Boolean isDeleted;
	
	@Column
	protected String name;
	
	@Column
	protected String description;
	
	@OneToOne(mappedBy = OrganizationTable.TableName, cascade = CascadeType.ALL, orphanRemoval = false)
	@JoinColumn(name=OrganizationTable.ReistrantId)
	protected User registrant;
	
	@Column
	@Type(type="org.joda.time.contrib.hibernate.PersistentDateTime")
	protected DateTime registrationTimeUtc;
	
	public Long getId() {
		return id;
	}

	public void setId(Long newId) {
		id = newId;
	}

	public int getVersion() {
		return version;
	}

	public void setVersion(int newVersion) {
		version = newVersion;
	}

	public Boolean getIsDeleted() {
		return isDeleted;
	}

	public void setIsDeleted(Boolean deleted) {
		isDeleted = deleted;
	}

	public String getName() {
		return name;
	}

	public void setName(String newName) {
		name = newName;
	}

	public String getDescription() {
		return description;
	}

	public void setDescription(String newDescription) {
		description = newDescription;
	}

	public User getRegistrant() {
		return registrant;
	}

	public void setRegistrant(User registrantUser) {
		registrant = registrantUser;
	}

	public DateTime getRegistrationTimeUtc() {
		return registrationTimeUtc;
	}

	public void setRegistrationTimeUtc(DateTime registrationTime) {
		registrationTimeUtc = registrationTime;
	}

}
