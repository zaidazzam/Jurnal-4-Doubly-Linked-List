package com.company;

import java.util.LinkedList;
import java.util.ListIterator;
import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        LinkedList<Link> lists = new LinkedList<Link>();
        lists.addLast(new Link("Mantra_Cinta", "Rizky_Febian"));
        lists.addLast(new Link("Cukup_Tau", "Rizky_Febian3"));
        Scanner scanner = new Scanner(System.in);

        boolean kondisi = true;
        while (kondisi){
            menu();
            switch (scanner.nextInt()){
                case 1:
                    System.out.println("---------\uD83C\uDFB6\uD83C\uDFB6\uD83C\uDFB6\uD83C\uDFB6\uD83C\uDFB6\uD83C\uDFB6---------");
                    String judulLagu = scanner.next();
                    String Penyanyi = scanner.next();
                    System.out.println("---------\uD83C\uDFB6\uD83C\uDFB6\uD83C\uDFB6\uD83C\uDFB6\uD83C\uDFB6\uD83C\uDFB6---------");
                    lists.addLast(new Link(judulLagu, Penyanyi));
                    break;
                case 2:
                    System.out.println("⚠️Harap Pilih  ⚠️");
                    System.out.println("1. Hapus sesuai judul");
                    System.out.println("2. Hapus yang terakhir");
                    if(scanner.nextInt() == 1){
                        System.out.println("⚠️ Tuliskan Judul Lagunya  ⚠️");
                        removeWithJudul(lists, scanner.next());
                    }else {
                        lists.removeLast();
                        System.out.println("✅✅✅ Berhasil terhapus ✅✅✅");
                    }
                    break;
                case 3:
                    System.out.println("---------\uD83C\uDFB6\uD83C\uDFB6\uD83C\uDFB6\uD83C\uDFB6\uD83C\uDFB6\uD83C\uDFB6---------");
                    print(lists);
                    break;
                default:
                    kondisi = false;
                    System.out.println("\uD83D\uDCA4\uD83D\uDCA4\uD83D\uDCA4 Berhasil Keluar dari Program \uD83D\uDCA4\uD83D\uDCA4\uD83D\uDCA4");
                    break;
            }
        }


    }

    public static void print(LinkedList playerLists){
        ListIterator<Link> iterator = playerLists.listIterator();

        while (iterator.hasNext()){
            System.out.print(iterator.next());
            if(iterator.hasNext()){
                System.out.print(" || ");
            }
        }

        System.out.println();

        while (iterator.hasPrevious()){
            System.out.print(iterator.previous());
            if(iterator.hasPrevious()){
                System.out.print(" || ");
            }
        }

        System.out.println("\n---------\uD83C\uDFB6\uD83C\uDFB6\uD83C\uDFB6\uD83C\uDFB6\uD83C\uDFB6\uD83C\uDFB6---------");
    }

    public static void removeWithJudul(LinkedList playerLists, String judul){
        ListIterator<Link> iterator = playerLists.listIterator();
        while (iterator.hasNext()){
            Link playerList = iterator.next();
            if(playerList.getjudulLagu().equals(judul)){
                iterator.remove();
                System.out.println("✅✅✅ Terhapus ✅✅✅");
            }
        }
    }

    public static void menu(){
        System.out.println("Menu list Lagu");
        System.out.println("1. Input lagu");
        System.out.println("2. Hapus lagu");
        System.out.println("3. Mainkan lagu");
        System.out.println("4 Keluar");
    }
}


