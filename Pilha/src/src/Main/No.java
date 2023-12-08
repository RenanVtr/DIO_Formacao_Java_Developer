package src.Main;



public class No {

private int dado;
private No referenciaNo = null;

//Constructor
public No(int dado) {
    this.dado = dado;
}

//Getters & Setters
public int getDado() {
    return dado;
}

public void setDado(int dado) {
    this.dado = dado;
}

public No getReferenciaNo() {
    return referenciaNo;
}

public void setReferenciaNo(No referenciaNo) {
    this.referenciaNo = referenciaNo;
}

@Override
public String toString() {
    return "No [dado=" + dado + "]";
}





}