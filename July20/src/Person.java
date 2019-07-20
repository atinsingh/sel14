public class Person {

    private String name;
    private int likes;

//    public Person(){
//
//    } // Default

    public Person(String name) {
        this.name = name;
    } // parametirized

    public Person(String name, int likes) {
        this.name = name;
        this.likes = likes;
    }

    public String getName() {
        return name;
    }

    public void printDetails() {
        System.out.println("Name --->"+ this.name);
        System.out.println("Like --->"+ this.likes);
    }

    public void likeMe(){
        likes++;  // likes = likes+1;
    }
}
