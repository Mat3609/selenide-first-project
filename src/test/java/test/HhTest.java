package test;

import org.testng.Assert;
import org.testng.annotations.Test;
import page.ResumePage;
import java.util.HashMap;
import java.util.Map;


public class HhTest extends CommonConditions{

    @Test
    public void attributesEqualsExpectedResultsSecond() {
        Map<String, Object> expectedAttributes = new HashMap<String, Object>(){{
            put(ResumePage.GENDER, "М");
            put(ResumePage.AGE, 33);
            put(ResumePage.ADDRESS, "Минск");
            put(ResumePage.READY_TO_RELOCATE, false);
        }};

        ResumePage resumePage = new ResumePage();
        resumePage.openPage();

        Assert.assertEquals(expectedAttributes, resumePage.getMapAttributes());
    }
}
