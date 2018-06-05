package com.kodilla.stream.beautifier;

public class PoemBeautifier {


    public String beautifier ( String text , PoemDecorator poemDecorator ){

      return  poemDecorator.decorate(text);
    }
}
