package dietelProject.ChapterNine;

public  class AnimalClass {

    private String name;
    private String type;
    private String colour;

    public AnimalClass(String name, String type, String colour){
        this.name = name;
        this.type = type;
        this.colour = colour;
    }

    public String eat(){
        return "I am eating";
    }

    public String walk(){
        return "I am walking";
    }

    public String setSound(String sound){
        return sound;
    }


    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getType() {
        return type;
    }

    public void setType(String type) {
        this.type = type;
    }

    public String getColour() {
        return colour;
    }

    public void setColour(String colour) {
        this.colour = colour;
    }

//    public String getBehaviour() {
//        return behaviour;
//    }
//
//    public void setBehaviour(String behaviour) {
//        this.behaviour = behaviour;
//    }


    @Override
    public String toString(){
        return String.format(
                "%s: %s %n%s: %s%n%s: %s",
                "Name", name,
                "type", type, "Colour", colour);
    }
}
