public class Developer {

    String name;
    String stack;
    String country;

    public Developer(String name, String stack, String country) {
        this.name = name;
        this.stack = stack;
        this.country = country;
    }

    @Override
    public String toString() {
        return "Ola meu nome é " + name + "\ntrabalho com a stack " + stack +
                "\ne sou do "+ country;
    }
}
