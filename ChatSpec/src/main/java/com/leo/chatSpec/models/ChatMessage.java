package com.leo.chatSpec.models;

import org.springframework.lang.NonNull;

public class ChatMessage{
	@NonNull
	private String content;
	@NonNull
	private String recipient;
	
	public ChatMessage(String content, String recipient) {
		this.content = content;
		this.recipient = recipient;
	}
	
	public String getContent()
	{
		return content;
	}
	
	public String getRecipient() {
		return recipient;
	}
	
	public void setContent(String content) {
		this.content = content;
	}
}
