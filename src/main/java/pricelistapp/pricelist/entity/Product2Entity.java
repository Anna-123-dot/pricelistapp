package pricelistapp.pricelist.entity;

import javax.persistence.*;

@Entity(name ="Product2")
public class Product2Entity {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    @Column(nullable = false)
    private String description;

    @Column(nullable = false)
    private String BSP;

    @Column(nullable = false)
    private String housing;

    @Column(nullable = false)
    private String diaphragm;

    @Column(nullable = false)
    private String valves;

    @Column(nullable = false)
    private String remark;

       @Column(nullable = false)
    private double price;

    public Product2Entity() {
    }

    public Product2Entity(Long id, String description, String BSP, String housing, String diaphragm, String valves, String remark, double price) {
        this.id = id;
        this.description = description;
        this.BSP = BSP;
        this.housing = housing;
        this.diaphragm = diaphragm;
        this.valves = valves;
        this.remark = remark;
        this.price = price;
    }

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public String getDescription() {
        return description;
    }

    public void setDescription(String description) {
        this.description = description;
    }

    public String getBSP() {
        return BSP;
    }

    public void setBSP(String BSP) {
        this.BSP = BSP;
    }

    public String getHousing() {
        return housing;
    }

    public void setHousing(String housing) {
        this.housing = housing;
    }

    public String getDiaphragm() {
        return diaphragm;
    }

    public void setDiaphragm(String diaphragm) {
        this.diaphragm = diaphragm;
    }

    public String getValves() {
        return valves;
    }

    public void setValves(String valves) {
        this.valves = valves;
    }

    public String getRemark() {
        return remark;
    }

    public void setRemark(String remark) {
        this.remark = remark;
    }

    public double getPrice() {
        return price;
    }

    public void setPrice(double price) {
        this.price = price;
    }
}
