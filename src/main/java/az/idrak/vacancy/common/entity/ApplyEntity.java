package az.idrak.vacancy.common.entity;

import org.springframework.format.annotation.DateTimeFormat;

import javax.persistence.*;
import java.time.LocalDate;

@Entity
@Table(name = "apply")
public class ApplyEntity {
    @Id
    @Column(name = "id")
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;
    @DateTimeFormat(iso = DateTimeFormat.ISO.DATE)
    @Column(name = "apply_date",updatable = false)
    private LocalDate applyDate;

    @ManyToOne(cascade = CascadeType.ALL, fetch = FetchType.EAGER)
    @JoinColumn(name = "person_id", referencedColumnName = "id")
    private PersonEntity personEntity;

    @ManyToOne(cascade = CascadeType.DETACH, fetch = FetchType.EAGER)
    @JoinColumn(name = "vacancy_id", referencedColumnName = "id")
    private VacancyEntity vacancy;

    @Column(name = "about")
    private String about;

    @Column(name = "file_name")
    private String filename;

    @Column(name = "file")
    private Byte[] file;

    @PrePersist
    protected void onCreate() {

        applyDate = LocalDate.now();

    }

    public  ApplyEntity(){

    }

    public ApplyEntity(Long id, PersonEntity personEntity, VacancyEntity vacancy, String about, String filename, Byte[] file){
        this.id=id;
        this.vacancy=vacancy;
        this.personEntity = personEntity;
        this.about=about;
        this.filename=filename;
        this.file=file;
    }

    public String getFilename() {
        return filename;
    }

    public void setFilename(String filename) {
        this.filename = filename;
    }

    public Byte[] getFile() {
        return file;
    }

    public void setFile(Byte[] file) {
        this.file = file;
    }

    public LocalDate getApplyDate() {
        return applyDate;
    }

    public void setApplyDate(LocalDate applyDate) {
        this.applyDate = applyDate;
    }

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public PersonEntity getPersonEntity() {
        return personEntity;
    }

    public void setPersonEntity(PersonEntity personEntity) {
        this.personEntity = personEntity;
    }

    public VacancyEntity getVacancy() {
        return vacancy;
    }

    public void setVacancy(VacancyEntity vacancy) {
        this.vacancy = vacancy;
    }

    public String getAbout() {
        return about;
    }

    public void setAbout(String about) {
        this.about = about;
    }
}
