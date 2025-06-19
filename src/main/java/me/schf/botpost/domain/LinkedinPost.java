package me.schf.botpost.domain;

public class LinkedinPost extends Post {

	public LinkedinPost(String pat, String userId, String postText) {
		super(pat, userId, postText);
	}

	@Override
	public String getPayload() {
		return """
				            {
				              "author": "%s",
				              "lifecycleState": "PUBLISHED",
				              "specificContent": {
				                "com.linkedin.ugc.ShareContent": {
				                  "shareCommentary": {
				                    "text": "Hello, LinkedIn! This is a post from Java code using text blocks."
				                  },
				                  "shareMediaCategory": "NONE"
				                }
				              },
				              "visibility": {
				                "com.linkedin.ugc.MemberNetworkVisibility": "PUBLIC"
				              }
				            }
				""".formatted(this.getPat(), this.getUserId(), this.getPostText());
	}
}
