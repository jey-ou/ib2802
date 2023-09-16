// test
import java.util.* ; // na te zien

class Node{
  String label; //een gewone label 
  int value;  // heuristic value
  Node node; // voor een graph
  
  public Node(){}
  public Node (String label){
    this.label = label;
  } // constructor
  public Node (String label, int value) {
    this.label = label;
    this.value = value;
  }
  
  public Boolean setValue(int value){
    this.value = value;
    return true;
  }

  public Boolean setLabel(String label){
    this.label = label;
    return true;
  }
  
  public Boolean setNode(Node node){
    this.node = node;
    return true;
  }
  public int getValue(){
    return value;
  }
  public String getLabel(){
     return label;
  }
  
  
}
