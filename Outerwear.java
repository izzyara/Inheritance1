class Outerwear extends Clothes{

    Boolean hooded;

    public Outerwear(){
        super("outerwear","one size");
        hooded = false;
    }

    public Outerwear(String s, Boolean w){
        super ("outerwear",s);
        hooded = w;
    }

    public boolean isHooded(){
        return hooded;
    }

    public String toString(){
        return super.toString() + ", Hooded: " + hooded;
    }

    public boolean equals(Outerwear c){
        if (super.equals(c) && this.isHooded()==(c.isHooded())){
            return true;
        }else{
            return false;
        }
    }

    public void washInstructions(){
        System.out.println("Wash cold, gentle cycle. Hang dry to maintain shape. Avoid high heat!");
    }

    public void flipHood(){
        if (isHooded()){
            System.out.println("You flip the hood over your head... very mysterious");
        }else{
            System.out.println("There is no hood.");
        }
    }

    public void zipUp(){
        System.out.println("Zipping up... super cozy");
    }
}