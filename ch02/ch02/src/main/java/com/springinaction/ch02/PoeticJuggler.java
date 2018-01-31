package com.springinaction.ch02;

public class PoeticJuggler extends Juggler {
    private Poem poem;

    public PoeticJuggler(Poem poem){
        super();
        this.poem = poem;
    }

    public PoeticJuggler(int BeanBags, Poem poem){
        super(BeanBags);
        this.poem = poem;
    }

    public void perform(){
        super.perform();
        System.out.println("While reciting");
        poem.recite();
    }
}
