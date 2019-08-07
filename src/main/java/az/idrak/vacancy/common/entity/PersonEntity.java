package az.idrak.vacancy.common.entity;
import javax.persistence.*;

@Entity
@Table(name = "person")

public class PersonEntity {

    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private Long id;


    @Column(name = "name")
    private String name;

    @Column(name = "surname")
    private String surname;


    @Column(name = "patronymic")
    private String patronymic;


    @Column(name = "email")
    private String email;


    @Column(name = "address")
    private String address;


    @Column(name = "phone")
    private String phone;

    @Column(name = "experience")
    private String experience;

    @Column(name = "education")
    private String education;


    @Column(name = "skills")
    private String skills;



    public PersonEntity(){

    }

    public PersonEntity(Long id, String name, String surname, String patronymic, String email, String address, String phone,String  experience, String education, String skills){
        this.id=id;
        this.name=name;
        this.surname=surname;
        this.patronymic=patronymic;
        this.email=email;
        this.address=address;
        this.phone=phone;
        this.experience=experience;
        this.education=education;
        this.skills=skills;

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

    public String getSurname() {
        return surname;
    }

    public void setSurname(String surname) {
        this.surname = surname;
    }

    public String getPatronymic() {
        return patronymic;
    }

    public void setPatronymic(String patronymic) {
        this.patronymic = patronymic;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public String getAddress() {
        return address;
    }

    public void setAddress(String address) {
        this.address = address;
    }

    public String getPhone() {
        return phone;
    }

    public void setPhone(String phone) {
        this.phone = phone;
    }

    public String getExperience() {
        return experience;
    }

    public void setExperience(String experience) {
        this.experience = experience;
    }

    public String getEducation() {
        return education;
    }

    public void setEducation(String education) {
        this.education = education;
    }

    public String getSkills() {
        return skills;
    }

    public void setSkills(String skills) {
        this.skills = skills;
    }


}
