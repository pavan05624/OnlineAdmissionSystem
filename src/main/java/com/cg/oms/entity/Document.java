package com.cg.oms.entity;

import javax.persistence.CascadeType;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.OneToOne;

import org.springframework.data.relational.core.mapping.Table;
@Entity
@Table(value="Document")
public class Document
{
@Id
@GeneratedValue(strategy=GenerationType.AUTO)
private int documentId;
private String documentName;
private String documentUrl;
private int applicantId;
private String emailId;
private String documentStatus;//Uploaded/NotUploaded
@OneToOne(cascade=CascadeType.ALL, mappedBy="document")
private Student student;
public Document() {
	super();
	// TODO Auto-generated constructor stub
}
public Document(int documentId, String documentName, String documentUrl, int applicantId, String emailId,
		String documentStatus) {
	super();
	this.documentId = documentId;
	this.documentName = documentName;
	this.documentUrl = documentUrl;
	this.applicantId = applicantId;
	this.emailId = emailId;
	this.documentStatus = documentStatus;
}
public int getDocumentId() {
	return documentId;
}
public void setDocumentId(int documentId) {
	this.documentId = documentId;
}
public String getDocumentName() {
	return documentName;
}
public void setDocumentName(String documentName) {
	this.documentName = documentName;
}
public String getDocumentUrl() {
	return documentUrl;
}
public void setDocumentUrl(String documentUrl) {
	this.documentUrl = documentUrl;
}
public int getApplicantId() {
	return applicantId;
}
public void setApplicantId(int applicantId) {
	this.applicantId = applicantId;
}
public String getEmailId() {
	return emailId;
}
public void setEmailId(String emailId) {
	this.emailId = emailId;
}
public String getDocumentStatus() {
	return documentStatus;
}
public void setDocumentStatus(String documentStatus) {
	this.documentStatus = documentStatus;
}
}
