package uz.pdp.adminpanel.utils;

import java.util.ArrayList;
import java.util.List;

public interface RestConstants {
    String BASE_PATH="/api";
    String BASE_PATH_V=BASE_PATH+"/v1";


    List<String> weekDaysList = new ArrayList<>() {{
        add("Dushanba");
        add("Seshanba");
        add("Chorshanba");
        add("Payshanba");
        add("Juma");
        add("Shanba");
        add("Yakshanba");
    }};

}
