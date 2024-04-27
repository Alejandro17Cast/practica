import java.util.Scanner;

public class app {
    public static int num1;
    public static int num2;
    public static int num3;
    //utilizar metodos para las distintas operaciones 

    public static int resta (int mayor1, int mayor3){
        int resultado= mayor3-mayor1; 
        return resultado; 
    }
    public static int suma (int menor1, int menor2){
        int result= menor1+menor2; 
        return result; 
    }
    public static int adicion (int menor2, int menor3){
        int resul= menor2+menor3; 
        return resul; 
    }
    public static int diferencia ( int mayor1, int mayor2){
        int dif = mayor2-mayor1; 
        return dif; 
    }
    public static int resta1 (int mayor2, int mayor1){
        int result1= mayor1-mayor2; 
        return result1; 
    }
    public static int suma1 (int menor1, int menor3){
        int resultado2= menor1+menor3;  
        return resultado2; 
    }



        public static void main(String[] args) throws Exception {
        Scanner leer = new Scanner(System.in);
        do {
 
             try {
                 System.out.println("Ingrese tres numeros enteros diferentes");
                 num1 = leer.nextInt();
                 num2 = leer.nextInt();
                 num3 = leer.nextInt();
             } catch (Exception e) {
                 System.out.println(e);
                 System.out.println("Ingrese valores correctos");
                 leer.nextLine();
             }
 
         } while (num1 == num2 || num1 == num3 || num2 == num3);
         


          //utilizar math para encontrar el numero maximo(con el max)

           int mayor1 = Math.max(num1, num2); 
           int mayor2 = Math.max(num1, num3); 
           int mayor3 = Math.max(num2, num3); 

           //utilizar de nuevo Math para encontrar los numeros menores (con el min)
           int menor1 = Math.min(num1, num2); 
           int menor2 = Math.min(num1, num3); 
           int menor3 = Math.min(num2, num3); 

           //UTILICE EL IF Y ELSE PARA MOSTRAR LOS RESULTADOS DE LAS OPERACIONES EFECTUADAS 

           if (mayor1 == mayor2) {
            System.out.println("El numero mayor es: "+mayor1);
            System.out.println("La Suma de "+menor1+ " + "+menor2+" es: "+suma(menor1, menor2) );
            System.out.println("La diferencia entre: "+mayor1+" y "+mayor3 +" es: "+resta(mayor3, mayor1));
             }else{
                if(mayor2 == mayor3) {
                    System.out.println("El numero mayor es: "+mayor2);
                    System.out.println("La Suma de "+menor2+ " + "+menor3+" es: "+adicion(menor2, menor3) );
                    System.out.println("La diferencia entre: "+mayor2+" y "+mayor1 +" es: "+diferencia(mayor2, mayor1));
             }else{
                if(mayor1 == mayor3) {
                    System.out.println("El numero mayor es: "+mayor3);
                    System.out.println("La Suma de "+menor1+ " + "+menor3+" es: "+suma1(menor1, menor3) );
                    System.out.println("La diferencia entre: "+mayor1+" y "+mayor2+" es: "+resta1(mayor2, mayor1));
             }
            }
         

         }
         leer.close();
    }
     
}

