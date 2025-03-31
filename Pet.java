public class Pet{

    private String name;
    private String species;
    
    public Pet(){
        name = "Unnamed";
        species = "unknown";
    }

    public Pet(String n, String s){
        name = n;
        species = s;
    }

    public String getName(){
        return name;
    }

    public String getSpecies(){
        return species;
    }

    public void setName(String n){
        name = n;
    }

    public void setSpecies(String s){
        species = s;
    }

    public String toString(){
        return name + " is a " + species;
    }

    public void doATrick(){
        System.out.println(name + " doesn't know any tricks.");
    }

    public void speak(){
        System.out.println(name + " doesn't know how to speak.");
    }
}