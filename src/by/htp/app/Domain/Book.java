package by.htp.app.Domain;

import java.io.Serializable;

/**
 * Created by user on 29.03.17.
 */
public class Book implements Serializable {
    private static final long serialVersionUID = 6879914928840050333L;

    private String tittle;
    private String author;
    private int year;
    private double price;
    private String imageURL;
    private int idOZby;
    private String description;
    private String bookURL;

    public Book () {}

    public String getBookURL() {
        return bookURL;
    }

    public void setBookURL(String bookURL) {
        this.bookURL = bookURL;
    }

    public String getDescription() {
        return description;
    }

    public void setDescription(String description) {
        this.description = description;
    }

    public int getIdOZby() {
        return idOZby;
    }

    public void setIdOZby(int idOZby) {
        this.idOZby = idOZby;
    }

    public String getImageURL() {
        return imageURL;
    }

    public void setImageURL(String imageURL) {
        this.imageURL = imageURL;
    }

    public String getTittle() {
        return tittle;
    }

    public void setTittle(String tittle) {
        this.tittle = tittle;
    }

    public String getAuthor() {
        return author;
    }

    public void setAuthor(String author) {
        this.author = author;
    }

    public int getYear() {
        return year;
    }

    public void setYear(int year) {
        this.year = year;
    }

    public double getPrice() {
        return price;
    }

    public void setPrice(double price) {
        this.price = price;
    }

    @Override
    public String toString() {
        return "Book{" +
                "tittle='" + tittle + '\'' +
                ", author='" + author + '\'' +
                ", imageURL='" + imageURL + '\'' +
                ", year=" + year +
                ", price=" + price +
                '}';
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;

        Book book = (Book) o;

        if (year != book.year) return false;
        if (Double.compare(book.price, price) != 0) return false;
        if (idOZby != book.idOZby) return false;
        if (tittle != null ? !tittle.equals(book.tittle) : book.tittle != null) return false;
        if (author != null ? !author.equals(book.author) : book.author != null) return false;
        if (imageURL != null ? !imageURL.equals(book.imageURL) : book.imageURL != null) return false;
        if (description != null ? !description.equals(book.description) : book.description != null) return false;
        return bookURL != null ? bookURL.equals(book.bookURL) : book.bookURL == null;
    }

    @Override
    public int hashCode() {
        int result;
        long temp;
        result = tittle != null ? tittle.hashCode() : 0;
        result = 31 * result + (author != null ? author.hashCode() : 0);
        result = 31 * result + year;
        temp = Double.doubleToLongBits(price);
        result = 31 * result + (int) (temp ^ (temp >>> 32));
        result = 31 * result + (imageURL != null ? imageURL.hashCode() : 0);
        result = 31 * result + idOZby;
        result = 31 * result + (description != null ? description.hashCode() : 0);
        result = 31 * result + (bookURL != null ? bookURL.hashCode() : 0);
        return result;
    }
}


