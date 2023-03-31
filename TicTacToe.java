import java.util.Scanner;
public class TicTacToe {
    public static void main(String[] args) {
        System.out.println("*******************************");
        System.out.println("****Welcome to Tik Tak Toe****");
        System.out.println("*******************************");
        Scanner in = new Scanner (System.in);
        System.out.println();
        
        // board 
        
        System.out.println("    Here's the board!!!");
        char[][]board = new char[3][3];
        for(int i = 0; i<3; i++){
            for(int j = 0; j<3; j++){
                board[i][j] = '-';
            }
        }
        PrintBoard(board);
        System.out.println("");
        
        // players
            char player1;
            char player2;
            System.out.print("Player 1 would you like 'X' or '0'? ");
            
            player1 = in.next().charAt(0);
            
            if (player1 == 'X' || player1 == 'x') player2 = '0';
            else player2 = 'X';
            
            System.out.println ("Player 1, your sign is " + player1+ "\nPlayer 2, your sign is " + player2);
            
            // rule
            
           // System.out.println("");
            System.out.println("");
            if(player1 == 'X' || player1 == 'x') {
                System.out.println("According to the rules the first player to go first is Player 1!");
                while (checkBoard(board) != false)
                {
                    System.out.println("Please enter coordinates: ");
                    int row = in.nextInt();
                    int col = in.nextInt();
                    board[row-1][col-1] = player1;
                    PrintBoard(board);
                    System.out.println();
                    checkBoard(board);
                    if (checkBoard(board) == false) break;
                    System.out.println("Please enter coordinates: ");
                    row = in.nextInt();
                    col = in.nextInt();
                    board[row-1][col-1] = player2;
                    PrintBoard(board);
                    System.out.println();
                    checkBoard(board);
                }
            } 
            else 
            {
                System.out.println("According to the rules the first player to go first is Player 2!");
                while (checkBoard(board) != false)
                {
                    System.out.println("Please enter coordinates: ");
                    int row = in.nextInt();
                    int col = in.nextInt();
                    board[row-1][col-1] = player2;
                    PrintBoard(board);
                    System.out.println();
                    checkBoard(board);
                    if (checkBoard(board) == false) break;
                    System.out.println("Please enter coordinates: ");
                    row = in.nextInt();
                    col = in.nextInt();
                    board[row-1][col-1] = player1;
                    PrintBoard(board);
                    System.out.println();
                    checkBoard(board);
                }
            }
    }
    
    public static void PrintBoard(char[][]board)
    {
        for(int i = 0; i<3; i++)
        {
            for(int j =0; j<3; j++)
            {
                System.out.print(board[i][j]);
            }
            System.out.println();
        }
    }
    
    public static Boolean checkBoard (char[][]board)
    {
        int counter = 0;
        // following is X rows
        if(board[0][0] == 'X' && board[0][1] == 'X' && board[0][2] == 'X' )
        {
            System.out.println("X wins!!!");
            return false;
        }
        
        else if(board[1][0] == 'X' && board[1][1] == 'X' && board[1][2] == 'X' )
        {
            System.out.println("X wins!!!");
            return false;
        }
        
        else if(board[2][0] == 'X' && board[2][1] == 'X' && board[2][2] == 'X' )
        {
            System.out.println("X wins!!!");
            return false;
        }
        // following is 0 rows
        else if(board[0][0] == '0' && board[0][1] == '0' && board[0][2] == '0' )
        {
            System.out.println("0 wins!!!");
            return false;
        }
        
        else if(board[1][0] == '0' && board[1][1] == '0' && board[1][2] == '0' )
        {
            System.out.println("0 wins!!!");
            return false;
        }
        
        else if(board[2][0] == '0' && board[2][1] == '0' && board[2][2] == '0' )
        {
            System.out.println("0 wins!!!");
            return false;
        }
        // following x cols
        else if(board[0][0] == 'X' && board[1][0] == 'X' && board[2][0] == 'X' )
        {
            System.out.println("X wins!!!");
            return false;
        }
        
        else if(board[0][1] == 'X' && board[1][1] == 'X' && board[2][1] == 'X' )
        {
            System.out.println("X wins!!!");
            return false;
        }
        
        else if(board[0][2] == 'X' && board[1][2] == 'X' && board[2][2] == 'X' )
        {
            System.out.println("X wins!!!");
            return false;
        }
        // following is 0 cols
        else if(board[0][0] == '0' && board[1][0] == '0' && board[2][0] == '0' )
        {
            System.out.println("0 wins!!!");
            return false;
        }
        
        else if(board[0][1] == '0' && board[1][1] == '0' && board[2][1] == '0' )
        {
            System.out.println("0 wins!!!");
            return false;
        }
        
        else if(board[0][2] == '0' && board[1][2] == '0' && board[2][2] == '0' )
        {
            System.out.println("0 wins!!!");
            return false;
        }
        // following dgnols
        // top left to bottom right
        else if(board[0][0] == 'X' && board[1][1] == 'X' && board[2][2] == 'X' )
        {
            System.out.println("X wins!!!");
            return false;
        }
        
        else if(board[0][0] == '0' && board[1][1] == '0' && board[2][2] == '0' )
        {
            System.out.println("0 wins!!!");
            return false;
        }
        //top right to bottom left
        else if(board[0][2] == 'X' && board[1][1] == 'X' && board[2][1] == 'X' )
        {
            System.out.println("X wins!!!");
            return false;
        }
        
        else if(board[0][2] == '0' && board[1][1] == '0' && board[2][1] == '0' )
        {
            System.out.println("0 wins!!!");
            return false;
        }
        
        // tie 
        for(int i = 0; i<3 ; i++)
        {
            for(int j = 0; j<3; j++)
            {
               // check board for full
                if(board[i][j] == 'X' || board[i][j] == '0') 
                {
                    counter++;
                    if (counter == 9) 
                    {
                        System.out.println("Tie!!!!!");
                        return false;
                        
                    }
                }
            }
        }   
        return true;
    }
}











