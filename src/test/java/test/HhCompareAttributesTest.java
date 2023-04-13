package test;

import model.Resume;
import org.testng.Assert;
import org.testng.annotations.Test;
import page.ResumePage;

public class HhCompareAttributesTest extends  CommonConditions {
    @Test
    public void attributesEqualsExpectedResults() {
        ResumePage resumePage = new ResumePage();
        resumePage.openPage();
        Resume expectedResume = new Resume("М", 33, "Минск", false);
        Resume actualResume = new Resume(resumePage.getGender(), resumePage.getAge(), resumePage.getAddress(), resumePage.getReadyToRelocate());

        Assert.assertTrue(expectedResume.equals(actualResume));
    }
}
