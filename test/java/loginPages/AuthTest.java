package loginPages;

import core.BaseSeleniumTest;
import helperClasses.TestValues;
import org.junit.Assert;
import org.junit.Test;
import readProperties.ConfigProvider;

public class AuthTest extends BaseSeleniumTest {

   @Test
     public void checkPage(){
       CreatNewAnket newAnket = new LogInPage().auth(ConfigProvider.USER_EMAIL,ConfigProvider.USER_PASSWORD)
               .creatAnketa(ConfigProvider.USER_EMAIL, TestValues.TEST_NAME);

       Assert.assertEquals(newAnket.getEmail(),ConfigProvider.USER_EMAIL);
       Assert.assertEquals(newAnket.getName(),TestValues.TEST_NAME);
       Assert.assertEquals(newAnket.getGender(),TestValues.TEST_GENDER);
       Assert.assertEquals(newAnket.getChoice1(),TestValues.TEST_CHOICE_1);
       Assert.assertEquals(newAnket.getChoice2(),TestValues.TEST_CHOICE_2);
   }
}
