package devdojo.orientacaoobjetos.Xstreams.classes;

import java.util.Objects;

public class LigthNovel {
    private String title;
    private double price;

    public LigthNovel(String title, double price) {
        this.title = title;
        this.price = price;
    }

    @Override
    public boolean equals(Object o) {
        if (o == null || getClass() != o.getClass()) return false;
        LigthNovel that = (LigthNovel) o;
        return Double.compare(price, that.price) == 0 && Objects.equals(title, that.title);
    }

    @Override
    public int hashCode() {
        return Objects.hash(title, price);
    }

    @Override
    public String toString() {
        return "LigthNovel{" +
                "title='" + title + '\'' +
                ", price=" + price +
                '}';
    }

    public String getTitle() {
        return title;
    }

    public void setTitle(String title) {
        this.title = title;
    }

    public double getPrice() {
        return price;
    }

    public void setPrice(double price) {
        this.price = price;
    }
}
