public class School {
    private String where;
    private String title;
    private String director;

    public School(String where, String title, String director) {
        this.where = where;
        this.title = title;
        this.director = director;
    }

    public String getWhere() {
        return where;
    }

    public void setWhere(String where) {
        this.where = where;
    }

    public String getTitle() {
        return title;
    }

    public void setTitle(String title) {
        this.title = title;
    }

    public String getDirector() {
        return director;
    }

    public void setDirector(String director) {
        this.director = director;
    }

    public String getInfoSchool(){
        return STR."""
                    School:
                where: \{getWhere()}
                title: \{getTitle()}
                rector: \{getDirector()}
                """;
    }
}
