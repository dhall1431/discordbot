package com.github.dhall1431.jda;

import javax.security.auth.login.LoginException;

import net.dv8tion.jda.core.AccountType;
import net.dv8tion.jda.core.JDA;
import net.dv8tion.jda.core.JDABuilder;
import net.dv8tion.jda.core.entities.Game;
import net.dv8tion.jda.core.hooks.ListenerAdapter;

public class Main extends ListenerAdapter {
	public static JDA api;
	
	public static void main(String[] args) {
		try {
			api = new JDABuilder(AccountType.BOT).setToken(Ref.TOKEN).buildBlocking();
			api.getPresence().setGame(Game.of(null, "sking flue"));
		} catch (LoginException | InterruptedException e) {
			e.printStackTrace();
		}

	}

	
	

}
