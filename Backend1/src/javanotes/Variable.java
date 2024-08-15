package javanotes;

public class Variable {

    public static void main(String[] args) {


        byte moveLeft; //declarando la variable

        moveLeft = 127;

        short moveLeft2 = (short) moveLeft;

        System.out.println(moveLeft2);

        moveLeft2 = 130;

        // recibe 2 valores pero uno es de tipo string


        int num1 = 2;

        String num2 = "23";


                //parseo de variables

        int newNum2 = Integer.parseInt(num2);

        float promedio = (num1 + newNum2)/ 2;




    }

}
