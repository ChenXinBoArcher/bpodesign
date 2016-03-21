package com.bpodesign.core.entities;

import org.hibernate.annotations.Type;
import org.joda.time.DateTime;

import com.bpodesign.core.common.database.OrganizationTable;
import com.bpodesign.core.common.database.UserTable;

import java.io.Serializable;
import javax.persistence.Basic;
import javax.persistence.CascadeType;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.FetchType;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
import javax.persistence.NamedQueries;
import javax.persistence.NamedQuery;
import javax.persistence.OneToOne;
import javax.persistence.Table;
import javax.xml.bind.annotation.XmlRootElement;

@Entity
@Table(name = UserTable.TableName)
public class User implements Serializable {

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
	
	@Column
	protected Boolean isActived;
	
	@Column
	@Type(type="org.joda.time.contrib.hibernate.PersistentDateTime")
	protected DateTime registrationTimeUtc;
	
	@Column
	protected String email;
	
	@ManyToOne(fetch=FetchType.EAGER)
	@JoinColumn(name=UserTable.OrganizationId)
	protected Organization organization;
	
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

	public Organization getOrganization() {
		return organization;
	}

	public void setOrganization(Organization newOrganization) {
		organization = newOrganization;
	}

	public DateTime getRegistrationTimeUtc() {
		return registrationTimeUtc;
	}

	public void setRegistrationTimeUtc(DateTime dateTime) {
		registrationTimeUtc = dateTime;
	}

	public String getEmail() {
		return email;
	}

	public void setEmail(String newEmail) {
		email = newEmail;
	}

	public Boolean getIsActived() {
		return isActived;
	}

	public void setIsActived(Boolean actived) {
		isActived = actived;
	}

}
