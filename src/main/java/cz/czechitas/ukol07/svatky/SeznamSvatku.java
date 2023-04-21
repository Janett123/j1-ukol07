package cz.czechitas.ukol07.svatky;

import java.time.MonthDay;
import java.util.List;

public class SeznamSvatku {
    private List<Svatek> svatky;

    Svatek svatek = new Svatek();

    String jmenoSvatku = svatek.getJmeno();
    MonthDay denSvatku = svatek.getDen();

    public String getJmenoSvatku() {
        return jmenoSvatku;
    }

    public void setJmenoSvatku(String jmenoSvatku) {
        this.jmenoSvatku = jmenoSvatku;
    }

    public MonthDay getDenSvatku() {
        return denSvatku;
    }

    public void setDenSvatku(MonthDay denSvatku) {
        this.denSvatku = denSvatku;
    }



    public List<Svatek> getSvatky() {
        return svatky;
    }

    public void setSvatky(List<Svatek> svatky) {
        this.svatky = svatky;
    }

}
