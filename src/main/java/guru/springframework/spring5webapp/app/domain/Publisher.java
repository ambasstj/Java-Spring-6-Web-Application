package guru.springframework.spring5webapp.app.domain;

import org.springframework.stereotype.Component;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;

@Entity
@Component
public class Publisher {
    private String name;
    @Id
    @GeneratedValue(strategy= GenerationType.AUTO)
    private Long id;

    public Publisher() {
    }

    public Publisher(String name) {
        this.name = name;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public Long getId() {
        return id;
    }
}
