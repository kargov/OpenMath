package net.nedkargov.business.domain;

public class ProjectDetails implements ProjectDetailsInterface{

    private Integer id;
    private String name;
    @Override
    public void setName(String name) {
        this.name = name;
    }

    @Override
    public void setId(Integer id) {
        this.id = id;
    }

    @Override
    public Integer getId() {
        return this.id;
    }



    @Override
    public String getName() {
        return this.name;
    }

}
