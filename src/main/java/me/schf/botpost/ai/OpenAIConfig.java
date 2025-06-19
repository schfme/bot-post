package me.schf.botpost.ai;

import org.springframework.ai.chat.model.ChatModel;
import org.springframework.ai.openai.OpenAiChatModel;
import org.springframework.ai.openai.OpenAiChatOptions;
import org.springframework.context.annotation.Configuration;

@Configuration
public class OpenAIConfig {
	
	@Bean
	public OpenAiChatModel blah() {
		OpenAiChatOptions.builder()
		.model("gpt-4o")
		.temperature(0.4)
		.build();
	}

}
