package MinefieldProject;

import java.util.Random;
import java.util.Scanner;

public class MineSweeper {
    int row;
    int column;
    int mineCount;
    String[][] board;
    String[][] adminBoard;
    

    public MineSweeper(int row, int column){
        this.column=column;
        this.row=row;
        this.board = new String[row][column];
        this.adminBoard = new String[row][column];
        mineCount = (row*column)/4;
    }


    public void run(){
        
        placeBoards();
        printAdminBoard();
        Scanner scanner = new Scanner(System.in);
          
        boolean isALive = true;
        System.out.println("Mayın tarlasına hoşgeldiniz");
        printBoard();
        int openedPlaceCount = 0;
        
        while (isALive) {
            System.out.println("Satir giriniz:");
            int rowNumber = scanner.nextInt();

            System.out.println("Sütun giriniz:");
            int columnNumber = scanner.nextInt();

            if (adminBoard[rowNumber-1][columnNumber-1].equals("*")) {
                //board[rowNumber][columnNumber] = "0";
                //printBoard();
                System.out.println("Game Over !!!");
                printAdminBoard();
                scanner.close();
                break;
                
            }
            else{ 
                
                board[rowNumber-1][columnNumber-1] =(adminBoard[rowNumber-1][columnNumber-1]);
                openedPlaceCount++;
                System.out.println("------------------------------------");
                printBoard();
                if (openedPlaceCount == (row*column)-mineCount) {
                    System.out.println("Oyunu kazandınızz!!!!");
                    break;
                }

            }
            
        }




    }



    public void placeBoards(){

        for (int i = 0; i < board.length; i++) {
            for (int j = 0; j < board[i].length; j++) {
                board[i][j]="-";
            }
        }

        for (int i = 0; i < adminBoard.length; i++) {
            for (int j = 0; j < adminBoard[i].length; j++) {
                adminBoard[i][j]="0";
            }
        }

        Random random = new Random();

        for (int a = 0; a < mineCount; a++) {
            int i = random.nextInt(row);
            int j = random.nextInt(column);
            adminBoard[i][j] = "*";
            if(i-1>=0 && j-1>=0 ){
                if(adminBoard[i-1][j-1].equals("0"))
                    adminBoard[i-1][j-1] = "1";
                else if(adminBoard[i-1][j-1].equals("*")){
                    continue;
                }    
                else{
                    int deger = Integer.parseInt(adminBoard[i-1][j-1])+1;
                    adminBoard[i-1][j-1]=String.valueOf(deger);
                }


            }
            if(i-1>=0 ){
                if(adminBoard[i-1][j].equals("0"))
                    adminBoard[i-1][j] = "1";
                else if(adminBoard[i-1][j].equals("*")){
                    continue;
                }
                else{
                    int deger = Integer.parseInt(adminBoard[i-1][j])+1;
                    adminBoard[i-1][j]=String.valueOf(deger);
                }
                
            }
            if(i-1>=0 && j+1<adminBoard.length ){
                if(adminBoard[i-1][j+1].equals("0"))
                    adminBoard[i-1][j+1] = "1";
                else if(adminBoard[i-1][j+1].equals("0")){
                        continue;
                }
                else{
                    int deger = Integer.parseInt(adminBoard[i-1][j+1])+1;
                    adminBoard[i-1][j+1]=String.valueOf(deger);
                }
            }

            //kendi rowu
            if(j+1<adminBoard.length){
                if(adminBoard[i][j+1].equals("0"))
                    adminBoard[i][j+1] = "1";

                else if(adminBoard[i][j+1].equals("*")){
                    continue;
                }    
                else{
                    int deger = Integer.parseInt(adminBoard[i][j+1])+1;
                    adminBoard[i][j+1]=String.valueOf(deger);
                }
                
            }
            if(j-1>=0 ){
                if(adminBoard[i][j-1].equals("0"))
                    adminBoard[i][j-1] = "1";

                else if(adminBoard[i][j-1].equals("*")){
                    continue;
                }
                else{
                    int deger = Integer.parseInt(adminBoard[i][j-1])+1;
                    adminBoard[i][j-1]=String.valueOf(deger);
                }
                
            }


            //en alt row
            if(i+1<adminBoard.length && j-1>=0 ){
                if(adminBoard[i+1][j-1].equals("0"))
                    adminBoard[i+1][j-1] = "1";
                else if(adminBoard[i+1][j-1].equals("*")){
                    continue;
                }
                else{
                    int deger = Integer.parseInt(adminBoard[i+1][j-1])+1;
                    adminBoard[i+1][j-1]=String.valueOf(deger);
                }
                
            }
            if(i+1<adminBoard.length ){
                if(adminBoard[i+1][j].equals("0"))
                    adminBoard[i+1][j] = "1";
                else if(adminBoard[i+1][j].equals("*")){
                    continue;
                }
                    else{
                    int deger = Integer.parseInt(adminBoard[i+1][j])+1;
                    adminBoard[i+1][j]=String.valueOf(deger);
                }
                
            }
            if(i+1<adminBoard.length && j+1<adminBoard.length){
                if(adminBoard[i+1][j+1].equals("0"))
                    adminBoard[i+1][j+1] = "1";
                else if(adminBoard[i+1][j+1].equals("*")){
                    continue;
                }
                else{
                    int deger = Integer.parseInt(adminBoard[i+1][j+1])+1;
                    adminBoard[i+1][j+1]=String.valueOf(deger);
                }
        
        }

        /*for (int i = 0; i < adminBoard.length; i++) {
            for (int j = 0; j < adminBoard[i].length; j++) {
                
                if(i-1>=0 && j-1>=0 ){
                    if(adminBoard[i-1][j-1].equals("0"))
                        adminBoard[i-1][j-1] = "1";
                    else if(adminBoard[i-1][j-1].equals("*")){
                        continue;
                    }    
                    else{
                        int deger = Integer.parseInt(adminBoard[i-1][j-1])+1;
                        adminBoard[i-1][j-1]=String.valueOf(deger);
                    }


                }
                else if(i-1>=0 ){
                    if(adminBoard[i-1][j].equals("0"))
                        adminBoard[i-1][j] = "1";
                    else if(adminBoard[i-1][j].equals("*")){
                        continue;
                    }
                    else{
                        int deger = Integer.parseInt(adminBoard[i-1][j])+1;
                        adminBoard[i-1][j]=String.valueOf(deger);
                    }
                    
                }
                else if(i-1>=0 && j+1<adminBoard.length ){
                    if(adminBoard[i-1][j+1].equals("0"))
                        adminBoard[i-1][j+1] = "1";
                    else if(adminBoard[i-1][j+1].equals("0")){
                            continue;
                    }
                    else{
                        int deger = Integer.parseInt(adminBoard[i-1][j+1])+1;
                        adminBoard[i-1][j+1]=String.valueOf(deger);
                    }
                }

                //kendi rowu
                else if(j+1<adminBoard.length){
                    if(adminBoard[i][j+1].equals("0"))
                        adminBoard[i][j+1] = "1";

                    else if(adminBoard[i][j+1].equals("*")){
                        continue;
                    }    
                    else{
                        int deger = Integer.parseInt(adminBoard[i][j+1])+1;
                        adminBoard[i][j+1]=String.valueOf(deger);
                    }
                    
                }
                else if(j-1>=0 ){
                    if(adminBoard[i][j-1].equals("0"))
                        adminBoard[i][j-1] = "1";

                    else if(adminBoard[i][j-1].equals("*")){
                        continue;
                    }
                    else{
                        int deger = Integer.parseInt(adminBoard[i][j-1])+1;
                        adminBoard[i][j-1]=String.valueOf(deger);
                    }
                    
                }


                //en alt row
                else if(i+1<adminBoard.length && j-1>=0 ){
                    if(adminBoard[i+1][j-1].equals("0"))
                        adminBoard[i+1][j-1] = "1";
                    else if(adminBoard[i+1][j-1].equals("*")){
                        continue;
                    }
                    else{
                        int deger = Integer.parseInt(adminBoard[i+1][j-1])+1;
                        adminBoard[i+1][j-1]=String.valueOf(deger);
                    }
                    
                }
                else if(i+1<adminBoard.length ){
                    if(adminBoard[i+1][j].equals("0"))
                        adminBoard[i+1][j] = "1";
                    else if(adminBoard[i+1][j].equals("*")){
                        continue;
                    }
                        else{
                        int deger = Integer.parseInt(adminBoard[i+1][j])+1;
                        adminBoard[i+1][j]=String.valueOf(deger);
                    }
                    
                }
                else if(i+1<adminBoard.length && j+1<adminBoard.length){
                    if(adminBoard[i+1][j+1].equals("0"))
                        adminBoard[i+1][j+1] = "1";
                    else if(adminBoard[i+1][j+1].equals("*")){
                        continue;
                    }
                    else{
                        int deger = Integer.parseInt(adminBoard[i+1][j+1])+1;
                        adminBoard[i+1][j+1]=String.valueOf(deger);
                    }
                    
                }
                
            }*/
        }

        
    }

    public void printBoard(){
        for (int i = 0; i < board.length; i++) {
            for (int j = 0; j < board[i].length; j++) {
                System.out.print(board[i][j] + " ");
            }
            System.out.println();
        } 

    }

    public void printAdminBoard(){
        for (int i = 0; i < adminBoard.length; i++) {
            for (int j = 0; j < adminBoard[i].length; j++) {
                System.out.print(adminBoard[i][j] + " ");
            }
            System.out.println();
        } 

    }

    





}
