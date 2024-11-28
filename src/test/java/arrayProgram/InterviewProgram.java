package arrayProgram;

import java.util.HashSet;
import java.util.*;


public class InterviewProgram {
	public static void main(String[] args) {
        int[] a = {10, 20, 30, 40, 50, 60};
        int[] b = {20, 25, 30, 40, 50, 65, 70};
        
          Set<Integer> SetA =new HashSet<>();
          Set<Integer> SetB=new HashSet<>();
          for(int num :a){
              SetA.add(num);
          }
          for(int num:b){
              SetB.add(num);
          }
          Set<Integer> hash1 =new HashSet<>(SetA);
          hash1.addAll(SetB);
          
          Set<Integer> hash2 =new HashSet<>(SetA);
          hash2.retainAll(SetB);
          hash1.removeAll(hash2);
          System.out.println(hash1);
          
          
          
          
          
          
          
			/*
			 * Set<Integer> Systeric=new HashSet<>(SetA); Systeric.addAll(SetB);
			 * Set<Integer> retain =new HashSet<>(SetA); retain.retainAll(SetB);
			 * Systeric.removeAll(retain); System.out.println(Systeric);
			 */
            
        
        }
    }
    	   
       
