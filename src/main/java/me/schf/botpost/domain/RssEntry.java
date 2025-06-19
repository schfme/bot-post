package me.schf.botpost.domain;

import java.time.ZonedDateTime;

import com.fasterxml.jackson.databind.annotation.JsonDeserialize;
import com.fasterxml.jackson.dataformat.xml.annotation.JacksonXmlProperty;

public record RssEntry(
		
		@JacksonXmlProperty(localName = "title") String title,

		@JacksonXmlProperty(localName = "link") String link,

		@JacksonXmlProperty(localName = "description") String description,

		@JacksonXmlProperty(localName = "pubDate") @JsonDeserialize(using = ZonedDateTimeDeserializer.class) ZonedDateTime pubDate,

		@JacksonXmlProperty(localName = "author") String author) {
}
