package az.idrak.vacancy.common.entity;

import az.idrak.vacancy.common.enums.ActivityStatus;
import az.idrak.vacancy.common.enums.WorkStatus;
import org.springframework.format.annotation.DateTimeFormat;

import javax.persistence.*;
import java.time.LocalDate;

@Entity
@Table(name = "vacancy")
public class VacancyEntity {

    @Id
    @Column(name = "id")
    @GeneratedValue(strategy = GenerationType.AUTO)

    private Long id;


    @OneToOne(cascade = CascadeType.ALL,fetch = FetchType.EAGER)
    @JoinColumn(name = "position_id",referencedColumnName = "id")
    private Position position;

    @Column(name = "title")
    private String title;


    @Column(name = "create_date", updatable = false)
    private LocalDate createDate;


    @DateTimeFormat(iso = DateTimeFormat.ISO.DATE)
    @Column(name = "start_date")
    private LocalDate startDate;


    @DateTimeFormat(iso = DateTimeFormat.ISO.DATE)
    @Column(name = "end_date")
    private LocalDate endDate;

    @Column(name = "experience")
    private String experience;

    @Column(name = "status_id")
    private Integer statusCode;

    @Column(name = "work_id")
    private Integer workCode;

    @Column(name = "salary")
    private String salary;



    public VacancyEntity() {

    }


    @PrePersist
    protected void onCreate() {

        createDate = LocalDate.now();

    }

    public VacancyEntity(Long id, String title, Position position, LocalDate startDate, LocalDate endDate, int statusCode,int workCode,String experience,String salary) {
        this.id=id;
        this.title=title;
        this.position = position;
        this.startDate = startDate;
        this.endDate = endDate;
        this.statusCode = statusCode;
        this.workCode=workCode;
        this.experience=experience;
        this.salary=salary;

    }

    public String getTitle() {
        return title;
    }

    public void setTitle(String title) {
        this.title = title;
    }

    public Position getPosition() {
        return position;
    }

    public void setPosition(Position position) {
        this.position = position;
    }

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public LocalDate getStartDate() {
        return startDate;
    }

    public void setStartDate(LocalDate startDate) {
        this.startDate = startDate;
    }

    public LocalDate getEndDate() {
        return endDate;
    }

    public void setEndDate(LocalDate endDate) {
        this.endDate = endDate;
    }

    public ActivityStatus getStatus(){
        return ActivityStatus.lookup(statusCode);
    }

    public void setStatus(ActivityStatus status){
        this.statusCode = ActivityStatus.getCode(status);
    }

    public WorkStatus getWorkStatus(){
        return WorkStatus.lookup(workCode);
    }
    public void setWorkStatus(WorkStatus workStatus){
        this.workCode= WorkStatus.getCode(workStatus);
    }


    public String getExperience() {
        return experience;
    }

    public void setExperience(String experience) {
        this.experience = experience;
    }

    public String getSalary() {
        return salary;
    }

    public void setSalary(String salary) {
        this.salary = salary;
    }
}
