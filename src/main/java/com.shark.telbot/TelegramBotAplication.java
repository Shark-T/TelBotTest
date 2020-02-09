package com.shark.telbot;

import handlers.MySuperBot;
import org.springframework.boot.SpringApplication;
import org.telegram.telegrambots.ApiContextInitializer;
import org.telegram.telegrambots.meta.TelegramBotsApi;
import org.telegram.telegrambots.meta.exceptions.TelegramApiRequestException;
import org.telegram.telegrambots.meta.generics.BotSession;


public class TelegramBotAplication {
    public static void main(String[] args) throws TelegramApiRequestException {
        SpringApplication.run(TelegramBotAplication.class, args);

        ApiContextInitializer.init();
        TelegramBotsApi telegramBotsApi = new TelegramBotsApi();
        telegramBotsApi.registerBot(new MySuperBot());

    }
}
