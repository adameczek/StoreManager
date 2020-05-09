package pl.sawickiadam.storemanager.model;

import javax.persistence.*;

@Entity
@Table(name = "roll")
public class Roll {
    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private Long id;

    @Column(nullable = false)
    private String name;
    @Column(nullable = false)
    private int colorNumber;
    @Column(nullable = false)
    private int numberOfRolls;

    public Roll() {

    }

    public String getName() {
        return name;
    }
    public void setName(String name) {
        this.name = name;
    }
    public int getColorNumber() {
        return colorNumber;
    }
    public void setColorNumber(int colorNumber) {
        this.colorNumber = colorNumber;
    }

    public int getNumberOfRolls() {
        return numberOfRolls;
    }
    public void setNumberOfRolls(int numberOfRolls) {
        this.numberOfRolls = numberOfRolls;
    }
    public void increment(){
        this.numberOfRolls++;
    }


}
