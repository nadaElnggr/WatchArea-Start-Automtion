package TestCases;

import Base.BaseTest;
import org.testng.annotations.Test;

public class CreateWatchAreaTest extends BaseTest {


    @Test
    private static void create_new_watcharea()
    {
        LoginTest.login_with_valid_mail();
        create_watcharea.create_watcharea_with_required_fields();
    }
}
