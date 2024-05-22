package uz.pdp.adminpanel;

import lombok.RequiredArgsConstructor;
import lombok.extern.slf4j.Slf4j;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.stereotype.Component;
import org.telegram.telegrambots.bots.TelegramLongPollingBot;
import org.telegram.telegrambots.meta.api.methods.GetFile;
import org.telegram.telegrambots.meta.api.methods.send.SendMessage;
import org.telegram.telegrambots.meta.api.objects.File;
import org.telegram.telegrambots.meta.api.objects.Message;
import org.telegram.telegrambots.meta.api.objects.PhotoSize;
import org.telegram.telegrambots.meta.api.objects.Update;
import org.telegram.telegrambots.meta.api.objects.replykeyboard.ReplyKeyboardMarkup;
import org.telegram.telegrambots.meta.api.objects.replykeyboard.ReplyKeyboardRemove;
import org.telegram.telegrambots.meta.api.objects.replykeyboard.buttons.KeyboardButton;
import org.telegram.telegrambots.meta.api.objects.replykeyboard.buttons.KeyboardRow;
import org.telegram.telegrambots.meta.exceptions.TelegramApiException;

import java.io.FileOutputStream;
import java.io.InputStream;
import java.net.MalformedURLException;
import java.net.URL;
import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.Paths;
import java.util.List;
import java.util.UUID;

@Component
@Slf4j
@RequiredArgsConstructor

public class BotSender extends TelegramLongPollingBot {

    @Value("${telegram.bot.token}")
    private String botToken;

    @Value("${telegram.bot.username}")
    private String botUsername;

    @Override
    public void onUpdateReceived(Update update) {



        if(update.hasMessage() && update.getMessage().hasContact()){
            String text = update.getMessage().getText();



        }




    }



    private void savePictureInDisc(Update update) {
        if (update.hasMessage() && update.getMessage().hasPhoto()) {
            Message message = update.getMessage();
            List<PhotoSize> photos = message.getPhoto();
            PhotoSize largestPhoto = photos.get(photos.size() - 1);

            try {
                GetFile getFileRequest = new GetFile();
                getFileRequest.setFileId(largestPhoto.getFileId());
                File file = execute(getFileRequest);
                String filePath = file.getFilePath();

                URL fileUrl = new URL("https://api.telegram.org/file/bot" + getBotToken() + "/" + filePath);

                try (InputStream inputStream = fileUrl.openStream()) {

                    String uniqueFileName = UUID.randomUUID() + ".jpg";

                    Path savePath = Paths.get("C:\\photo1111111", uniqueFileName);
                    Files.createDirectories(savePath.getParent());

                    try (FileOutputStream fileOutputStream = new FileOutputStream(savePath.toFile())) {
                        byte[] buffer = new byte[1024];
                        int bytesRead;
                        while ((bytesRead = inputStream.read(buffer)) != -1) {
                            fileOutputStream.write(buffer, 0, bytesRead);
                        }
                    }

                    System.out.println("Rasm " + savePath + " fayliga saqlandi.");

                } catch (Exception e) {
                    e.printStackTrace();
                }

            } catch (TelegramApiException e) {
                e.printStackTrace();
            } catch (MalformedURLException e) {
                throw new RuntimeException(e);
            }

        }
    }

    @Override
    public String getBotUsername() {
        return botUsername;
    }

    @Override
    public String getBotToken() {
        return botToken;
    }



}
