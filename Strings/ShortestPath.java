//Given a routr containing 4 directions
//(E,W,N,S) , find the shortest path to reach destination
//""WNEENESENNN""




package Strings;

public class ShortestPath {
    public static float getShortestPath(String Path){
        int x = 0; int y= 0 ; 
        for (int i = 0 ; i< Path.length(); i++){
            char dir = Path.charAt(i);
            //south
            if (dir == 'S'){
                y--;
            }
            //north
            else if ( dir == 'N'){
                y++;
            }
            //West
            else if(dir == 'W' ){
                x--;
            }
            //East
            else{
                x++;
            }
        }
        int X2 = x*x;//X2 (X's square)
        int Y2 = y*y;//Y2 (Y's square)
    return (float)Math.sqrt(X2+Y2);
    }
    public static void main(String[] args) {
        String Path = "WNEENESENNN";
        System.out.println(getShortestPath(Path));
    }
}
