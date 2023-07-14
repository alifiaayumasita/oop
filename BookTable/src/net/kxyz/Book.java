package net.kxyz;

   /**
    *
    * @author kuman
    */
   public class Book {
String id;
String title;
String author;
String year;
Boolean state;

public Book() {};
public Book(String id, String title, String author, String year) {
    this.id = id ;
    this.title = title;
    this.author = author;
    this.year = year;
    this.state = true;
}

public String getId() {
    return id;
}

public void setId(String id) {
    this.id = id;
}


public String getAuthor() {
    return author;
}

public void setAuthor(String author) {
    this.author = author;
}

public Boolean isState() {
    return state;
}

public void setState(Boolean state) {
    this.state = state;
}

public String getTitle() {
    return title;
}

public void setTitle(String title) {
    this.title = title;
}

public String getYear() {
    return year;
}

public void setYear(String year) {
    this.year = year;
}

}