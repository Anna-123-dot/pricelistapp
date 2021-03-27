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



}
