package az.idrak.vacancy.common.entity;

import javax.persistence.*;
import javax.validation.constraints.NotNull;
import javax.validation.constraints.Size;

@Entity
@Table(name = "position")
public class Position {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    @NotNull
    @Size(min = 2,max = 50,message = "ad qeyd edilməyib")
    @Column(name = "name")
    private  String name;

    @NotNull
    @Size(min = 2,max = 50,message = "açıqlama qeyd edilməyib")
    @Column(name = "description")
    private String description;

    public Position(){

    }

    public Position(String name, String description){
        this.name=name;
        this.description=description;
    }
    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getDescription() {
        return description;
    }

    public void setDescription(String description) {
        this.description = description;
    }
}
