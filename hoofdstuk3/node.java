// test
import java.util* ; // na te zien

class Node{
  //ArrayList<Node> nodes = new ArrayList<>();  // voor tree graph
  String label;
  int value;
  
  public Node (String label){
    this.label = label;
  }; // constructor
  public Node (String Label, int value) {
    this.label = label;
    this.value = value;
  }
  /**
  public void addNode(Node n){ // kan niet voor node wel voor tree, graph
    nodes.add(n);
  }
  public void deleteNode(Node n){ //kan niet voor node wel voor tree, graph
    nodes.remove(n);
  }
  public boolean containNode(Node n){ //kan niet voor node wel voor tree, graph
    nodes.contain(n); 
  }
  public ArrayList<Node> getNodelist(){ //kan niet voor node wel voor tree, graph
    return nodes; 
  }
  **/
}
