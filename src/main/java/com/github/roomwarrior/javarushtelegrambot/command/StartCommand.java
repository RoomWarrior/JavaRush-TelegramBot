package com.github.roomwarrior.javarushtelegrambot.command;

import com.github.roomwarrior.javarushtelegrambot.services.SendBotMessageService;
import org.telegram.telegrambots.meta.api.objects.Update;

/**
 * Start {@link Command}
 */
public class StartCommand implements Command {

    private final SendBotMessageService sendBotMessageService;

    public static final String START_MESSAGE = "Привет. Я Javarush TelegramBot. Я помогу тебе быть в курсе последних статей" +
            "тех авторов, которые тебе интересны. Я ещё маленький и только учусь.";

    public StartCommand(SendBotMessageService sendBotMessageService) {
        this.sendBotMessageService = sendBotMessageService;
    }

    @Override
    public void execute(Update update) {
        sendBotMessageService.sendMessage(update.getMessage().getChatId().toString(), START_MESSAGE);
    }
}
