package com.coll.model;

import java.io.Serializable;

import javax.persistence.Entity;
import javax.persistence.Id;

import org.springframework.stereotype.Component;

public class Chat implements Serializable
{
 @Id
private String message,to,from;

public String getMessage() {
	return message;
}

public void setMessage(String message) {
	this.message = message;
}

public String getTo() {
	return to;
}

public void setTo(String to) {
	this.to = to;
}

public String getFrom() {
	return from;
}

public void setFrom(String from) {
	this.from = from;
}

}
