package java.orientacaoobjetos.WOptional.dominio;

public class Manga {
    private Integer id;
    private String name;
    private int chapters;

    public Manga(Integer id, int chapters, String name) {
        this.id = id;
        this.chapters = chapters;
        this.name = name;
    }

    @Override
    public String toString() {
        return "Manga{" +
                "id=" + id +
                ", name='" + name + '\'' +
                ", chapters=" + chapters +
                '}';
    }

    public Integer getId() {
        return id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getChapters() {
        return chapters;
    }

    public void setChapters(int chapters) {
        this.chapters = chapters;
    }
}
