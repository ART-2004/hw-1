public final class Workers extends OldestSalesman {
    private String name;
    private Integer workExperience;


    public String getName() {
        return name;
    }

    public Integer getWorkExperience() {
        return workExperience;
    }

    public Workers(Shop shop, WorkInCompany workInCompany, String name,
                   Integer workExperience, String name1, Integer workExperience1) {
        super(shop, workInCompany, workExperience, name);
        this.name = name1;
        this.workExperience = workExperience1;
    }

}


