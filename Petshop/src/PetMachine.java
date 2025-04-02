public class PetMachine {

    private boolean clean = true; 

    private int water = 30;

    private int shampoo = 10;

    private Pet pet;

    



    public void takeAShawer(){
        if (this.pet == null){
        System.out.println("Coloque o pet na máquina para iniciar o banho");
        return;
    }


    //Cada banho realizado irá consumir 10 litros de água e 2 litros de shampoo;
    this.water =- 10;
    this.shampoo =- 2;


    //dar banho
    pet.setClean(true);
    System.out.println("O pet " + pet.getName() + " está limpo");

    }

    //Abastecer com água

    public void addWater(){

        if (water == 30){
            System.out.println("A capacidade de água da máquina esta no máximo");
        }

        water += 2;
    }

    //Abastecer com shampoo;

    public void addShampoo(){

        if (shampoo == 10){
            System.out.println("A capacidade de shampoo da máquina esta no máximo");
        }
        
        shampoo += 2;
    }

    public int getWater(){
        return water;
    }


    public int getShampoo(){
        return shampoo;
    }

    public boolean hasPet(){
        return pet != null;
    }


    //colocar o pet na máquina
    public  void setPet(Pet pet){

        if(!this.clean){
            System.out.println("A máquina esta suja, para colocar o pet é necessário limpar-lá");  
            return;
        }


        if(hasPet()){
            System.out.println("O pet" + this.pet.getName() + " está na máquina nesse momento.");
            return;
        }


        this.pet = pet;
        System.out.println("O pet " + pet.getName() + " foi colocado na máquina");

    }
//Se o pet for retirado da maquina sem estar limpo será necessário limpar a máquina para permitir a entrada de outro pet;
    public void removePet(){
        this.clean = this.pet.isClean();

        System.out.println("O pet " + this.pet.getName() + " foi retirado da máquina");

        this.pet = null;

        
    }

    public void wash(){
        this.water -= 10;
        this.shampoo -= 2;
        this.clean = true;

        System.out.println("A máquina foi limpa");
    }




    


    
}

