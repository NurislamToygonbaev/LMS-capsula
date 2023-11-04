import java.time.LocalDate;

import static java.lang.StringTemplate.STR;

public class Univarsity {
    private String UniName;
    private LocalDate foundation;
    private String director;

    public Univarsity(String uniName, LocalDate foundation, String director) {
        this.UniName = uniName;
        this.foundation = foundation;
        this.director = director;
    }

    public String getUniName() {
        return UniName;
    }

    public void setUniName(String uniName) {
        UniName = uniName;
    }

    public LocalDate getFoundation() {
        return foundation;
    }

    public void setFoundation(LocalDate foundation) {
        this.foundation = foundation;
    }

    public String getDirector() {
        return director;
    }

    public void setDirector(String director) {
        this.director = director;
    }

    public String getInfoOfUniver() {
        return STR. """
                    Universistet:
                title: \{ getUniName() }
                god: \{getFoundation()}
                rector: \{getDirector()}
                """ ;
    }
}
