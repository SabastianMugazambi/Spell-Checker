//Aditya Subramanian and Sabastian Mugazambi
import java.util.Random; 
public class ArrayBag<T> implements BagInterface<T>  {
        
        private T[] stuff;
        private int numItems;
        public ArrayBag(int num) {
            this.numItems = 0;
            this.stuff = (T[]) new Object[num];
        }

        public int getCurrentSize() {  
            return numItems;
        }

        public boolean isFull() {
            if (numItems == stuff.length) {
                return true;
            }
           return false; 
        }
        
        public boolean isEmpty(){
            if (numItems == 0) {
                return true;
            }
            return false;
        }
        
        public boolean add(T newEntry){
            if (this.isFull()) {
                return false;
            }
            
            this.stuff[this.numItems]= newEntry;
            this.numItems++;
            return true;
        }
        public T remove() {
            if(this.isEmpty()){
                return null;
            }
            Random rand = new Random(); 
            T pickedItem = this.stuff[rand.nextInt(this.numItems)];
            this.remove(pickedItem);
            return pickedItem;
        }
        public boolean remove(T anEntry) {
            for(int i = 0; i < this.numItems; i++) {
                if(anEntry.equals(this.stuff[i])){
                this.stuff[i] = this.stuff[this.numItems-1];
                this.numItems--;
                return true;
                }
            }
            return false;
        }
        public void clear(){
            this.numItems = 0;
        }
        public int getFrequencyOf(T anEntry){
            int freq = 0;
            for(int i = 0; i < this.numItems; i++) {
                if(anEntry.equals(this.stuff[i])){
                    freq++;
                }
            }
            return freq;
        }
        public boolean contains(T anEntry){
            for(int i = 0; i < this.numItems; i++) {
                if(anEntry.equals(this.stuff[i])){
                    return true;
                }
            }
            return false;
        }
        
}
