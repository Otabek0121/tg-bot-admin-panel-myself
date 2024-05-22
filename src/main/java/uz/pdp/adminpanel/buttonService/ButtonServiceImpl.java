package uz.pdp.adminpanel.buttonService;

import lombok.RequiredArgsConstructor;
import org.telegram.telegrambots.meta.api.methods.send.SendMessage;
import org.telegram.telegrambots.meta.api.objects.Update;
import org.telegram.telegrambots.meta.api.objects.replykeyboard.InlineKeyboardMarkup;
import org.telegram.telegrambots.meta.api.objects.replykeyboard.ReplyKeyboardMarkup;
import org.telegram.telegrambots.meta.api.objects.replykeyboard.ReplyKeyboardRemove;
import org.telegram.telegrambots.meta.api.objects.replykeyboard.buttons.InlineKeyboardButton;
import org.telegram.telegrambots.meta.api.objects.replykeyboard.buttons.KeyboardButton;
import org.telegram.telegrambots.meta.api.objects.replykeyboard.buttons.KeyboardRow;
import org.telegram.telegrambots.meta.bots.AbsSender;
import org.telegram.telegrambots.meta.exceptions.TelegramApiException;
import uz.pdp.adminpanel.utils.RestConstants;

import java.util.ArrayList;
import java.util.List;

@RequiredArgsConstructor
public class ButtonServiceImpl implements ButtonService{


    private final AbsSender absSender;
    @Override
    public void createContactButton(Update update) {

        SendMessage sendMessage = new SendMessage();
        String text = update.getMessage().getText();
        Long chatId = update.getMessage().getChatId();

        KeyboardButton phoneNumber = new KeyboardButton("Telefon nomerni jo'natish");
        phoneNumber.setRequestContact(true);

        KeyboardRow buttons = new KeyboardRow();
        buttons.add(phoneNumber);

        ReplyKeyboardMarkup keyboard = new ReplyKeyboardMarkup();
        keyboard.setOneTimeKeyboard(true);
        keyboard.setResizeKeyboard(true);
        keyboard.setKeyboard(List.of(buttons));


        sendMessage.setChatId(chatId);


        if (text.equals("/start")) {
            sendMessage.setText("Iltimos Telefon nomeringizni yuboring.");
            sendMessage.setReplyMarkup(keyboard);
        }

        try {
            absSender.execute(sendMessage);
        } catch (TelegramApiException e) {
            e.printStackTrace();
        }
    }

    @Override
    public void deleteContactButton(Update update) {
        Long chatId = update.getMessage().getChatId();

        SendMessage sendMessage = new SendMessage();
        sendMessage.setChatId(chatId);
        sendMessage.setText("Telefon raqamingizni yuborganingiz uchun rahmat!");
        sendMessage.setReplyMarkup(new ReplyKeyboardRemove(true));

        try {
            absSender.execute(sendMessage);
        } catch (TelegramApiException e) {
            e.printStackTrace();
        }
    }

    @Override
    public void createWeekDaysButton(Update update) {
        Long chatId = update.getMessage().getChatId();
        SendMessage message = new SendMessage();
        message.setChatId(chatId);
        message.setText("Hafta kunlarini tanlang:");

        InlineKeyboardMarkup markupKeyboard = new InlineKeyboardMarkup();

        List<List<InlineKeyboardButton>> rows = new ArrayList<>();

        List<InlineKeyboardButton> row=new ArrayList<>();

        int count=0;

        for (int i = 0; i <7 ; i++) {
            if(count==2){
                rows.add(row);
                row=new ArrayList<>();
                count=0;
            }
            if(i==6){
                InlineKeyboardButton day = new InlineKeyboardButton();
                day.setText(RestConstants.weekDaysList.get(6));
                day.setCallbackData(RestConstants.weekDaysList.get(6).toUpperCase());
                row.add(day);

                rows.add(row);

                break;
            }
            InlineKeyboardButton day = new InlineKeyboardButton();
            day.setText(RestConstants.weekDaysList.get(i));
            day.setCallbackData(RestConstants.weekDaysList.get(i).toUpperCase());
            row.add(day);
            count++;
        }

        markupKeyboard.setKeyboard(rows);

        message.setReplyMarkup(markupKeyboard);

        try {
            absSender.execute(message);
        } catch (TelegramApiException e) {
            e.printStackTrace();
        }
    }
}
