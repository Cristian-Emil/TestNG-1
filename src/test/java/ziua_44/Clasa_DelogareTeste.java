package ziua_44;

import org.testng.annotations.Test;

public class Clasa_DelogareTeste {

    @Test(priority=1, groups={"regression"})
    void delogare_email1()
    {
        System.out.println("Test de delogare la email1");
    }

    @Test(priority=2, groups={"regression"})
    void delogare_email2()
    {
        System.out.println("Test de delogare la email2");
    }

    @Test(priority=3, groups={"regression"})
    void delogare_pinterest()
    {
        System.out.println("Test de delogare la Pinterest");
    }

    @Test(priority=4, groups={"regression"})
    void delogare_instagram()
    {
        System.out.println("Test de delogare la Instagram");
    }

}
