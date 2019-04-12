/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package frequencycounter;

import java.util.*;

public class FrequencyCounter {
 // private DictionaryInterface<String, Integer> wordTable;
 	private TreeMap<String, Integer> wordTable;
  
  public FrequencyCounter() {
    wordTable = new TreeMap<String, Integer>();
  } 
  
  /** Task: Reads a text file of words and counts their frequencies 
   *        of occurrence.
   *  @param data  a text scanner for the text file of data */
  public void readFile(Scanner data) {
    String nextWord;
    
    while(data.hasNext()){
			nextWord = (data.next()).toLowerCase();
			Integer frequency = wordTable.get(nextWord);

			if (frequency == null) { 				// add new word to table       
				wordTable.put(nextWord, new Integer(1));     
			}
			else { 									// increment count of existing word; replace wordTable entry       
				frequency++;
				wordTable.put(nextWord, frequency);
			} 
		}
  } 
  
  /** Task: Displays words and their frequencies of occurrence. */
  public void display()
  {
    Set<Map.Entry<String, Integer>> allWords = wordTable.entrySet();
    Iterator<Map.Entry<String, Integer>> keyIterator = allWords.iterator();
    
		while (keyIterator.hasNext())   {    
    	Map.Entry<String, Integer> element =  keyIterator.next();
      System.out.println( element.getKey() + " " +  element.getValue());
    }
  } 
} 
