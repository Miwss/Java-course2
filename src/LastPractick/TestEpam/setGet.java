package LastPractick.TestEpam;

public class setGet {
    private String name;
    private String surname;

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

    public static void main(String[] args) {
        setGet p1 = new setGet();
        setGet p2 = new setGet();
        p1.setName("eqw");
        p1.setSurname("qwe");
        System.out.println(p1.getName()+ " " + p1.getSurname());
        System.out.println(p2.getName()+ " " + p2.getSurname());
    }
}
