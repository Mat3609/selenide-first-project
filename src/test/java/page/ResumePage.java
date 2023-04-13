package page;

import com.codeborne.selenide.Selenide;
import com.codeborne.selenide.SelenideElement;
import java.util.HashMap;
import java.util.Map;
import static com.codeborne.selenide.Selenide.$x;

public class ResumePage extends AbstractPage{
    private final String URL = "https://rabota.by/resume/a00bd1c9000130b6280039ed1f555942673837?query=QA+Automation+engineer+%28junior%29&hhtmFrom=resume_search_result";

    private SelenideElement genderText = $x("//span[@data-qa='resume-personal-gender']");
    private SelenideElement ageText = $x("//span[@data-qa='resume-personal-age']");
    private SelenideElement addressText = $x("//span[@data-qa='resume-personal-address']");
    private SelenideElement readyToRelocateText = $x("//div[@class='bloko-translate-guard']");

    public static String GENDER = "Gender";
    public static String AGE = "Age";
    public static String ADDRESS = "Address";
    public static String READY_TO_RELOCATE = "Ready to relocate";

    @Override
    public ResumePage openPage() {
        Selenide.open(URL);
        return this;
    }

    public Map<String, Object> getMapAttributes() {
        Map<String, Object> actualAttributes =  new HashMap<String, Object>() {{
            put(GENDER, getGender());
            put(AGE, getAge());
            put(ADDRESS, getAddress());
            put(READY_TO_RELOCATE, getReadyToRelocate());
        }};
        return actualAttributes;
    }

    public String getGender() {
       return genderText.getText().equals("Мужчина") ? "М" : "Ж";
    }

    public int getAge() {

        return Integer.parseInt(ageText.getText().replaceAll("\\D+", ""));
    }

    public String getAddress() {
        return addressText.getText();
    }

    public Boolean getReadyToRelocate() {
        return !readyToRelocateText.getText().split(", ")[1].equals("не готов к переезду");
    }




}
