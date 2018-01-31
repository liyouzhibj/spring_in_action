package com.springinaction.ch02;

public class Instrumentalist implements Performer {
    public Instrumentalist() {

    }

    private String song;
    private Instrument instrument;

    public String getSong() {
        return song;
    }

    public void setSong(String song) {
        this.song = song;
    }

    public Instrument getInstrument() {
        return instrument;
    }

    public void setInstrument(Instrument instrument) {
        this.instrument = instrument;
    }

    public void perform() {
        System.out.println("Playing " + song + ": ");
        instrument.play();
    }
}
