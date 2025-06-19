package me.schf.botpost.controller;

import me.schf.botpost.domain.PostFactory;

public class BotPostController {
	
	private final PostFactory pf;
	// poll rss feeds
	// 
	
	public void um() {
		pf.makeLinkedinPost(null);
	}

}
