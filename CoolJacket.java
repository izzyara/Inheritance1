class  CoolJacket extends Outerwear{
    
    String style;

    public CoolJacket(){
        super("one size", true);
        style = "unspecified";
    }

    public CoolJacket(String s, String t){
        super(s,true);
        style = t;
    }

    public String getStyle(){
        return style;
    }

    public void setStyle(String s){
        style = s;
    }

    public String toString(){
        return super.toString() + ", Style: " + style;
    }

    public boolean equals(CoolJacket c){
        if (super.equals(c) && this.getStyle().equals(c.getStyle())){
            return true;
        }else{
            return false;
        }
    }

    public void flipHood(){
        System.out.println("You flip the hood over your head... super stylish");
    }

    public void flaunt(){
        System.out.println("You flaunt your stylish jacket.");
    }

    public void style(){
        System.out.println("You style your jacket with a great outfit.");
    }
}
