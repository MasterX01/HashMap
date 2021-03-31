package com.bridgelabz.hashmaptest;

import com.bridgelabz.hashmap.MyHashMap;
import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

public class MyHashMapTest {

    @Test
    public void givenSentence_whenWordsAreAddedToList_ShouldReturnWordFrequency(){
        String sentence = "To be or not to be";
        MyHashMap<String, Integer> myHashMap = new MyHashMap<String, Integer>();
        String[] words = sentence.toLowerCase().split(" ");
        for(String word : words){
            Integer value = myHashMap.get(word);
            if(value == null) {
                value = 1;
            }
            else {
                value += 1;
            }
            myHashMap.add(word, value);
        }
        Integer freq = myHashMap.get("to");
        Assertions.assertEquals(2, freq);
    }

}
