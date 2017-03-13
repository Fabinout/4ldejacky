import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.assertEquals;

public class QuatreLDeJackyTest {


    private QuatreLDeJacky quatreLDeJacky;

    @Before
    public void setUp() throws Exception {
        this.quatreLDeJacky = new QuatreLDeJacky();
    }

    @Test
    public void nombreInteressant_si_termine_par_007() throws Exception {
        boolean result = quatreLDeJacky.nombreEstInteressant(10007);
        assertEquals(true, result);
    }

    @Test
    public void nombrePasInteressant_si_termine_pas_par_007() throws Exception {
        boolean result = quatreLDeJacky.nombreEstInteressant(10006);
        assertEquals(false, result);
    }

    @Test
    public void nombreInteressant_si_termine_par_007_et_different_de_10007() throws Exception {
        boolean result = quatreLDeJacky.nombreEstInteressant(20007);
        assertEquals(true, result);
    }

    @Test
    public void nombreInteressant_si_que_des_deux() throws Exception {
        boolean result = quatreLDeJacky.nombreEstInteressant(22222);
        assertEquals(true, result);
    }

    @Test
    public void nombreInteressant_si_que_quatre_deux() throws Exception {
        boolean result = quatreLDeJacky.nombreEstInteressant(2222);
        assertEquals(true, result);
    }

    @Test
    public void nombreInteressant_si_sept_trois() throws Exception {
        boolean result = quatreLDeJacky.nombreEstInteressant(3333333);
        assertEquals(true, result);
    }

    @Test
    public void nombreInteressant_si_trois_trois() throws Exception {
        boolean result = quatreLDeJacky.nombreEstInteressant(333);
        assertEquals(true, result);
    }

    @Test
    public void nombreInteressant_si_trois_cinq() throws Exception {
        boolean result = quatreLDeJacky.nombreEstInteressant(555);
        assertEquals(true, result);
    }

    @Test
    public void nombreInteressant_si_un_deux_trois() throws Exception {
        boolean result = quatreLDeJacky.nombreEstInteressant(123);
        assertEquals(true, result);
    }

    @Test
    public void nombreInteressant_si_deux_trois_quatre() throws Exception {
        boolean result = quatreLDeJacky.nombreEstInteressant(234);
        assertEquals(true, result);
    }

    @Test
    public void neDoitPasPlanter() throws Exception {
        boolean result = quatreLDeJacky.nombreEstInteressant(1);
        assertEquals(true, result);
    }

    @Test
    public void nest_pas_interessant_8_9_0_1() throws Exception {
        boolean result = quatreLDeJacky.nombreEstInteressant(8901);
        assertEquals(false, result);
    }
}



