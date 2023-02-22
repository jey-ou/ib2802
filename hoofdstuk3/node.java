// test
import java.util* ; // na te zien

class Node{
  String label; een gewone label 
  int value; // heuristic value
  Node node; // voor een graph
  
  public Node(){}
  public Node (String label){
    this.label = label;
  } // constructor
  public Node (String label, int value) {
    this.label = label;
    this.value = value;
  }
  
  public bool changeValue(int value){
    this.value = value;
    return true;
  }

  public bool changeLabel(String label){
    this label = label;
    return true;
  }
  
  public bool changeNode(Node node){
    this.node = node;
    return true;
}
