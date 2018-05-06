package com.github.dhall1431.jda;

import net.dv8tion.jda.core.events.message.guild.GuildMessageReceivedEvent;
import net.dv8tion.jda.core.hooks.ListenerAdapter;

public class Commands extends ListenerAdapter{
	
	@Override
	public void onGuildMessageRevieved(GuildMessageReceivedEvent event ) {
		String[] command = event.getMessage().getContent().split(" ");
		String message = event.getMessage().getContent();
	}

}
