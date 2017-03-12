import java.io.*;
import java.util.*;
import java.text.*;
import java.math.*;
import java.util.regex.*;
import java.util.Arrays;

public class Solution {
 static void displayPathtoPrincess(int n, String[] grid) { //wow this is not good coding practice on my part
  int meLocation[] = new int[2]; //seriously need to split this up into more functions
  int princessLocation[] = new int[2];
  for (int i = 0; i < n; i++) {
   if (grid[i].contains("m")) {
    meLocation[0] = i;
    meLocation[1] = grid[i].indexOf("m"); //get indices of location for me
   }
   if (grid[i].contains("p")) {
    princessLocation[0] = i;
    princessLocation[1] = grid[i].indexOf("p"); //get indices for location of princess
   }


  }
  if (princessLocation[0] != meLocation[0]) {
   int horizontal = meLocation[0] - princessLocation[0]; //find horizontal distance
   int vertical = meLocation[1] - princessLocation[1]; //find vertical distance
   if (horizontal < 0) //print RIGHT once for every space I need
    for (int i = horizontal; i < 0; i++) { //to move right
    System.out.println("LEFT");
   }
   if (horizontal > 0) {
    for (int i = horizontal; i > 0; i--) //ditto for left
     System.out.println("RIGHT");
   }
   if (vertical < 0)
    for (int i = vertical; i < 0; i++) { //ditto for down
     System.out.println("UP");
    }
   if (vertical > 0) {
    for (int i = vertical; i > 0; i--) //ditto for up
     System.out.println("DOWN");
   }

  }


 }
 public static void main(String[] args) {
  Scanner in = new Scanner(System.in);
  int m;
  m = in .nextInt();
  String grid[] = new String[m];
  for (int i = 0; i < m; i++) {
   grid[i] = in .next();
  }

  displayPathtoPrincess(m, grid);
 }
}
