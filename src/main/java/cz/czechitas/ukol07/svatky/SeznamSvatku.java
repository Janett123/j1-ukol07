package cz.czechitas.ukol07.svatky;

import java.time.MonthDay;
import java.util.List;

public class SeznamSvatku {
    private List<Svatek> svatky;

    Svatek svatek = new Svatek();


    public List<Svatek> getSvatky() {
        return svatky;
    }

    public void setSvatky(List<Svatek> svatky) {
        this.svatky = svatky;
    }

}
