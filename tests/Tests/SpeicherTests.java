package Tests;

import Rechner.Rechner;
import Rechner.RechnerImpl;
import Speicher.Speicher;
import Speicher.SpeicherImpl;
import org.junit.Assert;
import org.junit.Test;

public class SpeicherTests {

    @Test
    public void delete1() {
        Rechner r = new RechnerImpl();
        Speicher s = new SpeicherImpl();

        r.addiere(10);
        s.setzeZuruck();

        Assert.assertEquals(0, s.returnWert());
    }

    @Test
    public void delete2() {
        Rechner r = new RechnerImpl();
        Speicher s = new SpeicherImpl();

        r.subtrahiere(10);
        s.setzeZuruck();

        Assert.assertEquals(0, s.returnWert());
    }

    @Test
    public void delete3() {
        Rechner r = new RechnerImpl();
        Speicher s = new SpeicherImpl();

        r.addiere(10);
        s.setzeZuruck();
        r.addiere(5);

        Assert.assertEquals(5, s.returnWert());
    }


}
