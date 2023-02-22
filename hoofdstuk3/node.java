// test
import java.util* ; // na te zien

class Node{
  String label; een gewone label 
  int value; // heuristic value
  Node node; // voor een graph
  
  public Node (String label){
    this.label = label;
  }; // constructor
  public Node (String Label, int value) {
    this.label = label;
    this.value = value;
  }
  
  public void changeValue(int value){
    this.value = value;
  }

}
