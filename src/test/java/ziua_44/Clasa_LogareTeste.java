package ziua_44;

import org.testng.annotations.Test;

public class Clasa_LogareTeste {

    @Test(priority=1, groups={"sanity"})
    void login_email1()
    {
        System.out.println("Test de logare la email1");
    }

    @Test(priority=2, groups={"sanity"})
    void login_email2()
    {
        System.out.println("Test de logare la email2");
    }

    @Test(priority=3, groups={"sanity"})
    void login_pinterest()
    {
        System.out.println("Test de logare la Pinterest");
    }

    @Test(priority=4, groups={"sanity"})
    void login_instagram()
    {
        System.out.println("Test de logare la Instagram");
    }

}
