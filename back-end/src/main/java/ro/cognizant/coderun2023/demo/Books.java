package ro.cognizant.coderun2023.demo;

import org.springframework.stereotype.Service;

@Service
public class Books {
    private String Name;
    private String Author;
    private String Publisher;

    public Books() {
    }

    public Books(String name, String author, String publisher) {
        Name = name;
        Author = author;
        Publisher = publisher;
    }

    public String getName() {
        return Name;
    }

    public void setName(String name) {
        Name = name;
    }

    public String getAuthor() {
        return Author;
    }

    public void setAuthor(String author) {
        Author = author;
    }

    public String getPublisher() {
        return Publisher;
    }

    public void setPublisher(String publisher) {
        Publisher = publisher;
    }
}