// https://www.w3resource.com/java-exercises/basic/index.php

/* 
Product of Two Numbers

Write a Java program that takes two numbers as input and displays the product of two numbers.
Test Data:
Input first number: 25
Input second number: 5
Expected Output :
25 x 5 = 125
 */
import java.util.Scanner;
public class exo4 {
    public static void main(String[] args) {
        // Je crée un objet pour lire les entrées utilisateur:
        Scanner input = new Scanner(System.in);

        // Je propose à mon utilisateur d'entrer un 1er nombre: 
        System.out.print("Veuillez entrer un 1er nombre s'il vous plaît :) ");
        // Je crée mon objet qui lira et enegistrera la valeur saisie par l'utilisateur:
        // ci dessous la variable "input" est relative à la variable "input" ligne 17.
        int numOne = input.nextInt();

        // Je propose à mon utilisateur d'entrer un 2ème nombre:
        System.out.print("Veuillez entrer un 2em nombre s'il vous plaît :) ");
        // Je crée mon objet qui lira et enegistrera la valeur saisie de nouveau: 
        int numTwo = input.nextInt();
        // Je calcule le produit des deux nombres et les affiche:
        System.out.println("Le résultat de : " + numOne + " x " + numTwo + " est égale à " + numOne * numTwo);  




        
}
}