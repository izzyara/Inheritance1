class Clothes {
    
    String type;
    String size;

    public Clothes(){
        type = "garment";
        size = "one size";
    }

    public Clothes(String t, String s){
        type = t;
        size = s;
    }

    public String getType(){
        return type;
    }

    public String getSize(){
        return size;
    }

    public void setType(String t){
        type = t;
    }

    public void setSize(String s){
        size = s;
    }

    public String toString(){
        return "Type: " + type + ", Size: " + size;
    }

    public boolean equals(Clothes c){
        if (this.getType().equals(c.getType()) && this.getSize().equals(c.getSize())){
            return true;
        }else{
            return false;
        }
    }

    public void washInstructions(){
        System.out.println("Wash according to label.");
    }

    public void tryOn(){
        System.out.println("Trying on... looks good!");
    }
}
