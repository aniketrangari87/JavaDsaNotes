class Encapsulation{

    private int age ;
    private String name ;


    public int getAge() {
        return age;
    }


    public void setAge(int age) {
        this.age = age;
    }


    public String getName() {
        return name;
    }


    public void setName(String name) {
        this.name = name;
    }


    public static void main(String[] args) {
        Encapsulation e = new Encapsulation();
        e.setAge(100);
        System.out.println(e.getAge());
        
    }
}