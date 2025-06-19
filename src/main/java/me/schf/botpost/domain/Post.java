package me.schf.botpost.domain;

public abstract class Post {

	private String pat;
	private String userId;
	private String postText;

	public String getPat() {
		return pat;
	}

	public String getUserId() {
		return userId;
	}

	public String getPostText() {
		return postText;
	}

	public Post(String pat, String userId, String postText) {
		super();
		this.pat = pat;
		this.userId = userId;
		this.postText = postText;
	}

	public abstract String getPayload();
}
