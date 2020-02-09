package handlers;


import org.telegram.telegrambots.bots.TelegramLongPollingBot;
import org.telegram.telegrambots.meta.api.methods.send.SendMessage;
import org.telegram.telegrambots.meta.api.objects.Message;
import org.telegram.telegrambots.meta.api.objects.Update;
import org.telegram.telegrambots.meta.exceptions.TelegramApiException;

public class MySuperBot extends TelegramLongPollingBot {
    @Override
    public void onUpdateReceived(Update update) {

        Message message = update.getMessage();

        SendMessage response = new SendMessage();
        response.setText("Hello, " + message.getFrom().getFirstName() +  " in, first Telegram bot from Boyko A");
        //response.
        response.setChatId(message.getChatId());
        try {
            execute(response);
        } catch (TelegramApiException e) {
            e.printStackTrace();
        }

    }

    @Override
    public String getBotUsername() {
        return "Boyko_test_bot";
    }

    @Override
    public String getBotToken() {
        return "1010377372:A0A0E0ehtFSBSHOmLXz7Nps3_SDQBC2Xqwd8Vg";
    }
}
