public class Unit8_1a
{
  public int [] [] modifyRows (int [] [] array)
 {
//create new array
int[][] arr = new int[array.length][array[0].length];
//traverse even rows
for(int r=0;r<array.length;r+=2){
//traverse columns
for(int c=0;c<array[0].length;c++){
//copy even rows to arr but not odd rows
arr[r][c]=array[r][c];
arr[r+1][c]=array[r][c];
//end nested loop
}
//end main loop
}
//return arr
return arr;
//end method
}
} 

 