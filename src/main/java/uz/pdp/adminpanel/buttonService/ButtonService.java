package uz.pdp.adminpanel.buttonService;

import org.telegram.telegrambots.meta.api.objects.Update;
import org.jvnet.hk2.annotations.Service;
@Service
public interface ButtonService {

    void createContactButton(Update update);
    void deleteContactButton(Update update);
    void createWeekDaysButton(Update update);

}
