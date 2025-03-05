package TestCases;

import Base.BaseTest;
import org.testng.Assert;
import org.testng.annotations.Test;

public class LoginTest extends BaseTest {



//    @Test
    public static void login_with_valid_mail()
    {
        login.enter_mail();
        login.enter_password();
        assert_profile();
    }

    private static void assert_profile()
    {
        Assert.assertEquals(login.profile_assert_result, "Profile");
    }
}
