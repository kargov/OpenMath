package net.nedkargov.business.domain;

public class Project implements ProjectInterface {

    private Integer id;
    private String name;
    private Double time;

    @Override
    public Integer getId() {
        return this.id;
    }

    @Override
    public String getName() {
        return this.name;
    }
}
