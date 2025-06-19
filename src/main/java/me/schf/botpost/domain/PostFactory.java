package me.schf.botpost.domain;

import org.springframework.stereotype.Component;

@Component
public class PostFactory {

	// autowire in id providers

	public void makeLinkedinPost(String postText) {
		Post post = new LinkedinPost(null, null, null);
		post.getPayload();
	}

	public void makeXPost(String postText) {
		throw new UnsupportedOperationException("Not yet implemented.");
	}

}
