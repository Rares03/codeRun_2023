package ro.cognizant.coderun2023.demo;

import org.springframework.stereotype.Service;

import java.time.LocalDate;
import java.util.List;

@Service
public class DemoService {
    public List<Books> getBooks() {
        return List.of(
                new Books(
                        "TLOTR",
                        "AUTHOR",
                        "PUBLISHER"
                )
        );
    }
}