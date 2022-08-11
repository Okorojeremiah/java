package dietelProject.chapterNine.animal;

public class Dog extends AnimalClass {

    private String breed;


    public Dog(String name, String type, String colour, String breed) {
        super(name, type, colour);
        this.breed = breed;
    }

    public String getBreed() {
        return breed;
    }

    public void setBreed(String breed) {
        this.breed = breed;
    }

    @Override
    public String toString(){
        return String.format("%s %n%s: %s", super.toString(),"Breed", breed);
    }
}

