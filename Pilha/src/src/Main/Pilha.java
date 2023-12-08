package src.Main;

public class Pilha {
    
private No referenciaNoEntrada;


//Constructor
public Pilha(){
    this.referenciaNoEntrada = null;
}


//Metodo Pop
public No pop(){

if (!this.isEmpty()){
    No noPoped = referenciaNoEntrada;
    referenciaNoEntrada = referenciaNoEntrada.getReferenciaNo();
    return noPoped;
    }    
    return null;
}

//Metodo Top
public No top(){
    return referenciaNoEntrada;
}

//Metodo Push
public void push(No novoNo){
    No refAuxiliar = referenciaNoEntrada;
    referenciaNoEntrada = novoNo;
    referenciaNoEntrada.setReferenciaNo(refAuxiliar);
}


//Verificar se pilha esta vazia
public boolean isEmpty(){
    return referenciaNoEntrada == null ? true : false;
}
}
