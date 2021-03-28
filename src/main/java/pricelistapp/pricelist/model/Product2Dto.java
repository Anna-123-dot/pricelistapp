package pricelistapp.pricelist.model;

import javax.validation.constraints.NotEmpty;
import javax.validation.constraints.NotNull;
import javax.validation.constraints.Size;

public class Product2Dto {

    private Long id;


    @NotNull
    @NotEmpty
    @Size(min = 4, max = 255)
    private String description;

    @NotNull
    @NotEmpty
    @Size(min = 4, max = 255)
    private String BSP;

    @NotNull
    @NotEmpty
    @Size(min = 4, max = 255)
    private String housing;

    @NotNull
    @NotEmpty
    @Size(min = 4, max = 255)
    private String diaphragm;

    @NotNull
    @NotEmpty
    @Size(min = 4, max = 255)
    private String valves;

    @NotNull
    @NotEmpty
    @Size(min = 4, max = 255)
    private String remark;

    @NotNull
    private double price;

    public Product2Dto() {
    }

    public Product2Dto(Long id, @NotNull @NotEmpty @Size(min = 4, max = 255) String description, @NotNull @NotEmpty @Size(min = 4, max = 255) String BSP, @NotNull @NotEmpty @Size(min = 4, max = 255) String housing, @NotNull @NotEmpty @Size(min = 4, max = 255) String diaphragm, @NotNull @NotEmpty @Size(min = 4, max = 255) String valves, @NotNull @NotEmpty @Size(min = 4, max = 255) String remark, @NotNull double price) {
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
