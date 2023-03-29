package com.company;
import java.util.LinkedList;
public class Main {

    public static void main(String[] args) {
	// write your code here
        LinkedList<String> Animal = new LinkedList<String>();

        //menambahkan elment linked list
        Animal.add("Sapi");
        Animal.add("Kelinci");
        Animal.add("Kambing");
        Animal.add("Unta");
        Animal.add("Domba");
        // Menampilkan isi linked list
        System.out.println("Isi objek Hewan sebelum dihapus:");
        for(String animal: Animal) {
            System.out.println(animal);
        }

        LinkedList<String> DeletAnimal = new LinkedList<String>();
        DeletAnimal.add("Kelinci");
        DeletAnimal.add("Kambing");
        DeletAnimal.add("Unta");

        Animal.removeAll(DeletAnimal);
        System.out.println("Isi objek Hewan setelah dihapus:");
        for(String animal: Animal) {
            System.out.println(animal);
        }







    }
}
