package com.stackroute.keepnote.model;

import java.util.Date;
import java.util.List;

import org.springframework.data.annotation.Id;
import org.springframework.data.mongodb.core.mapping.Document;
@Document
public class Note {
	
	/*
	 * This class should have eight fields
	 * (noteId,noteTitle,noteContent,noteStatus,createdAt,
	 * category,reminder,createdBy). This class should also contain the
	 * getters and setters for the fields along with the no-arg , parameterized
	 * constructor and toString method. The value of createdAt should not be
	 * accepted from the user but should be always initialized with the system date.
	 * 
	 */
	
	    @Id
	private int noteId;
	private String noteTitle;
	private String noteContent;
	private String noteStatus;
	private Date createdAt;
	private Category category;
	private List<Reminder> reminder;
	private String createdBy;
	

	   

		public int getNoteId() {
			return noteId;
		}



		public void setNoteId(int noteId) {
			this.noteId = noteId;
		}



		public String getNoteTitle() {
			return noteTitle;
		}



		public void setNoteTitle(String noteTitle) {
			this.noteTitle = noteTitle;
		}



		public String getNoteContent() {
			return noteContent;
		}



		public void setNoteContent(String noteContent) {
			this.noteContent = noteContent;
		}



		public String getNoteStatus() {
			return noteStatus;
		}



		public void setNoteStatus(String noteStatus) {
			this.noteStatus = noteStatus;
		}



		public Date getCreatedAt() {
			return createdAt;
		}



		public void setCreatedAt(Date createdAt) {
			this.createdAt = createdAt;
		}



		public Category getCategory() {
			return category;
		}



		public void setCategory(Category category) {
			this.category = category;
		}



		public List<Reminder> getReminder() {
			return reminder;
		}



		public void setReminder(List<Reminder> reminder) {
			this.reminder = reminder;
		}



		public String getCreatedBy() {
			return createdBy;
		}



		public void setCreatedBy(String createdBy) {
			this.createdBy = createdBy;
		}



		public void setNoteCreationDate(Date date) {
			// TODO Auto-generated method stub
			
		}



		

}
