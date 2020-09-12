package patronesdediseño_holamundo_decorator;

public class Main {
    
    public static void main(String[] args) {
        
       // HolaMundo holaMundo;
       // HolaMundo2 holaMundo2;
        
        for(int i = 0; i < 10; i++){
            
            if(i%2 == 0){
                
                System.out.println("N° PAR");
                
                HolaMundo holaMundo = new HolaMundo();
                System.out.println(holaMundo.HolaMundo());
                
            } else {
                
                System.out.println("N° IMPAR");
                
                HolaMundo2 holaMundo2 = new HolaMundo2();
                System.out.println(holaMundo2.HolaMundo2());
                
            }

        }
        
    }
    
}
