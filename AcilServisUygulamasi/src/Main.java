
import java.util.Comparator;
import java.util.PriorityQueue;
import java.util.Queue;


class Player implements Comparable<Player>{
    private String isim;
    private String sikayet;
    private int oncelik;
    
    public Player(String isim,String sikayet){
        this.isim=isim;
        this.sikayet=sikayet;
        
        if(sikayet.equalsIgnoreCase("Apandisit")){
            this.oncelik=3;
        }
        else if(sikayet.equalsIgnoreCase("Yanık")){
            this.oncelik=2;
        }
        else if(sikayet.equalsIgnoreCase("Baş ağrısı")){
            this.oncelik=1;
        }
    }

    @Override
    public String toString() {
        String bilgiler = "Hasta adi: "+ this.isim
                +"\nŞikayet : "+ this.sikayet
                +"\nÖncelik : "+ this.oncelik;
        
        return bilgiler;
    }

    @Override
    public int compareTo(Player player) {
        if(player.oncelik < this.oncelik){
            return -1;
        }
        else if(player.oncelik > this.oncelik){
            return 1;
        }
        else{
            return 0;
        }
    }

    

    
    
}
public class Main {

    
    public static void main(String[] args) {
        //Acil servis Uygulamasi
        
        /*Hastalar acil serviste şikayetlerine göre kuyrukta en önlere geçeçek
        (PriotrityQueue)
        
        apandisit---> en yüksek
        Yanık----> orta
        baş ağırısı--->en düşük
        
        new hasta("Murat Bey","yanık");
        new hasta("Okan Bey","Baş ağrısı");
        new hasta("Elif hanım","apandisit");
        new hasta("Oğuz Bey","Yanık");
        new hasta("merve hanım","Yanık");
        new hasta("gizem hanım","apandisit");
        
        
        
        
        */
        
        Queue<Player> queue = new PriorityQueue<Player>();
        
        queue.offer( new Player("Murat Bey","yanık"));
        queue.offer(new Player("Elif hanım","apandisit"));
        queue.offer(new Player("Okan Bey","Baş ağrısı"));
        queue.offer(new Player("Oğuz Bey","Yanık"));
        queue.offer(new Player("merve hanım","Yanık"));
        queue.offer(new Player("gizem hanım","apandisit"));
        
        
        
        while(!queue.isEmpty()){
            System.out.println(queue.poll());
            System.out.println("**************************");
        }
    }
    
}
