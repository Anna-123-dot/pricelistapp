package pricelistapp.pricelist.model;

import javax.validation.constraints.NotEmpty;
import javax.validation.constraints.NotNull;
import javax.validation.constraints.Size;

public class Product1Dto {

    private Long id;

    @NotNull
    private int size;

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
    private String connections;

    @NotNull
    @NotEmpty
    @Size(min = 4, max = 255)
    private String airValves;

    @NotNull
    private double price;

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public int getSize() {
        return size;
    }

    public void setSize(int size) {
        this.size = size;
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

    public String getConnections() {
        return connections;
    }

    public void setConnections(String connections) {
        this.connections = connections;
    }

    public String getAirValves() {
        return airValves;
    }

    public void setAirValves(String airValves) {
        this.airValves = airValves;
    }

    public double getPrice() {
        return price;
    }

    public void setPrice(double price) {
        this.price = price;
    }
}
