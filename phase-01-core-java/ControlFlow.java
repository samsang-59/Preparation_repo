public class ControlFlow {
    public static String dayType(int day){
        switch(day){
            case 1:
            case 2:   
            case 3:
            case 4:
            case 5:
                return "WeekDay";
            case 6:
            case 7:
                return "Weekend";      
            default:
                return "Other";                  
        }
        // return "Invalid Day";
    } 
    public static void main(String[] args){
        System.out.println(dayType(1));
        System.out.println(dayType(2));
        System.out.println(dayType(8));    

        int[][] grid = { {1, 2, 3}, {4, 5, 6}, {7, 8, 9} };
        int row = 0 , col = 0;
        outer:
        for(int i=0;i<grid.length;i++){
            for(int j=0;j<grid[0].length;j++){
                row = i ; 
                col = j;
                if(grid[i][j]==5) break outer;
            }
        }
        System.out.println("Row: " + row + ", Column: " + col);
    }
}
