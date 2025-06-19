package me.schf.botpost.domain;

import java.time.ZonedDateTime;

public record RssEntry(
	    String title,
	    String link,
	    String description,
	    ZonedDateTime pubDate,
	    String author
	) {}
