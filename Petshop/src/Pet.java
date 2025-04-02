public class Pet {

    // com final para não alterar o name do pet depois que foi criado.

    private final String name;

    private boolean clean;// para informar se esta limpo ou não

    //para passar o nome
    public Pet (String name){
        this.name = name;
        this.clean = false;
    }


    public String getName(){
        return name;
    }

    public boolean isClean(){
        return clean;
    }


    public void setClean(boolean clean){
        this.clean = clean;
    }




    
}
