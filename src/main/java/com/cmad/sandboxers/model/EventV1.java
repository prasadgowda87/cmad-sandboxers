package com.cmad.sandboxers.model;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;

/**
 * 
 * @author pkrishne
 *
 */
@Entity(name="event")
public class EventV1 {

	@Id
	@GeneratedValue
	private Integer id; // auto-generated by database.
	private String source;
	private Long timestamp;
	private String description;
	private EventType eventType;

	public Integer getId() {
		return id;
	}

	public void setId(Integer id) {
		this.id = id;
	}

	public String getSource() {
		return source;
	}

	public void setSource(String source) {
		this.source = source;
	}

	public Long getTimestamp() {
		return this.timestamp;
	}

	public void setTimeStamp(Long timestamp) {
		this.timestamp = timestamp;
	}

	public String getDescription() {
		return description;
	}

	public void setDescription(String description) {
		this.description = description;
	}

	public EventType getEvent_type() {
		return eventType;
	}

	public void setEvent_type(EventType event_type) {
		this.eventType = event_type;
	}

	@Override
	public String toString() {
		return "EventV1 [id=" + id + ", source=" + source + ", timestamp=" + timestamp + ", description="
				+ description + ", event_type=" + eventType + "]";
	}

}
