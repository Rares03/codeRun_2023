package ro.cognizant.coderun2023.demo;

import jakarta.transaction.Transactional;
import org.springframework.stereotype.Service;

import java.time.LocalDate;
import java.util.List;

@Service
@Transactional
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