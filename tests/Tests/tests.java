package Tests;

import Rechner.Rechner;
import Rechner.RechnerImpl;
import Speicher.Speicher;
import Speicher.SpeicherImpl;
import org.junit.Assert;
import org.junit.Test;

public class tests {

    @Test
    public void goodAddition1() {

        Rechner r = new RechnerImpl();
        Speicher s = new SpeicherImpl();

        int x = 1;
        int y = 13;

        int ergebnis = r.addiere(x);
        Assert.assertEquals(14, ergebnis);
    }

    @Test
    public void goodAddition2() {
        Rechner r = new RechnerImpl();
        Speicher s = new SpeicherImpl();

        r.addiere(9);

        Assert.assertEquals(9, s.getErgebnis());
    }

    @Test
    public void goodAddition3() {
        Rechner r = new RechnerImpl();
        Speicher s = new SpeicherImpl();

        r.addiere(-10);

        Assert.assertEquals(-10,s.getErgebnis());
    }

    @Test
    public void goodAddition4() {
        Rechner r = new RechnerImpl();
        Speicher s = new SpeicherImpl();

        r.addiere(10);
        r.addiere(10);

        Assert.assertEquals(20,s.getErgebnis());
    }

    @Test
    public void randAddiMax1() {
        Rechner r = new RechnerImpl();
        Speicher s = new SpeicherImpl();

        r.addiere(Integer.MAX_VALUE);

        Assert.assertEquals(Integer.MAX_VALUE,  s.getErgebnis());
    }

    @Test(expected = Exception.class)
    public void randAddiMax2() {
        Rechner r = new RechnerImpl();

        r.addiere(Integer.MAX_VALUE);
        r.addiere(10);
    }

    @Test
    public void randAddiMin1() {
        Rechner r = new RechnerImpl();
        Speicher s = new SpeicherImpl();

        r.addiere(Integer.MIN_VALUE);

        Assert.assertEquals(Integer.MIN_VALUE, s.getErgebnis());
    }

    @Test(expected = Exception.class)
    public void badAddition(){
        Rechner r = new RechnerImpl();
        Speicher s = new SpeicherImpl();

        int x = Integer.MAX_VALUE;

        Assert.assertEquals(Integer.MAX_VALUE,  s.getErgebnis());
    }

    @Test
    public void goodSub1() {
        Rechner r = new RechnerImpl();
        Speicher s = new SpeicherImpl();

        r.subtrahiere(10);

        Assert.assertEquals(-10, s.getErgebnis());
    }

    @Test
    public void goodSub2() {
        Rechner r = new RechnerImpl();
        Speicher s = new SpeicherImpl();

        r.subtrahiere(10);
        r.subtrahiere(100);

        Assert.assertEquals(-110, s.getErgebnis());
    }

    @Test
    public void goodSub3() {
        Rechner r = new RechnerImpl();
        Speicher s = new SpeicherImpl();

        r.subtrahiere(-10);

        Assert.assertEquals(10, s.getErgebnis());
    }

    @Test(expected = Exception.class)
    public void badSub1() {
        Rechner r = new RechnerImpl();
        Speicher s = new SpeicherImpl();

        r.subtrahiere(Integer.MIN_VALUE);
        r.subtrahiere(-1);
    }

    @Test
    public void randSub1() {
        Rechner r = new RechnerImpl();
        Speicher s = new SpeicherImpl();

        r.subtrahiere(Integer.MIN_VALUE);
        r.subtrahiere(0);

        Assert.assertEquals(Integer.MIN_VALUE, s.getErgebnis());
    }

    @Test
    public void randSub2() {
        Rechner r = new RechnerImpl();
        Speicher s = new SpeicherImpl();

        r.addiere(Integer.MAX_VALUE);
        r.subtrahiere(0);

        Assert.assertEquals(Integer.MAX_VALUE, s.getErgebnis());
    }

}
