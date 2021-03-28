package pricelistapp.pricelist.entity;

import pricelistapp.pricelist.model.Product1Dto;

import javax.persistence.*;

@Entity(name ="Product1")
public class Product1Entity {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    @Column(nullable = false)
    private int size;

    @Column(nullable = false)
    private String housing;

    @Column(nullable = false)
    private String diaphragm;

    @Column(nullable = false)
    private String valves;

    @Column(nullable = false)
    private String connections;

    @Column(nullable = false)
    private String airValve;

    @Column(nullable = false)
    private char codeLetter;

    @Column(nullable = false)
    private double price;

    public Product1Entity() {
    }

    public Product1Entity(int size, String housing, String diaphragm, String valves, String connections, String airValve, char codeLetter, double price) {
        this.size = size;
        this.housing = housing;
        this.diaphragm = diaphragm;
        this.valves = valves;
        this.connections = connections;
        this.airValve = airValve;
        this.codeLetter = codeLetter;
        this.price = price;
    }



    public double getPrice() {
        return price;
    }

    public void setPrice(double price) {
        this.price = price;
    }

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

    public String getAirValve() {
        return airValve;
    }

    public void setAirValve(String airValve) {
        this.airValve = airValve;
    }

    public char getCodeLetter() {
        return codeLetter;
    }

    public void setCodeLetter(char codeLetter) {
        this.codeLetter = codeLetter;
    }
}
