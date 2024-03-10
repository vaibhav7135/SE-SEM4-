import java.util.Scanner;
class HashTable{
    int index;
    long mobile;
}

class Hashing{
    HashTable[] h = new HashTable[10];
    public Hashing()
    {
        for(int i=0;i<10;i++)
        {
            h[i]=new HashTable();
            h[i].index=i;
            h[i].mobile=-1;

        }
    }

    public void  display()
    {
      for(int i=0;i<10;i++)
      {
        System.out.println(h[i].index+" "+h[i].mobile);
      } 
    }

    public void insert(int ch)
    {
        int position;
        long key;
        Scanner input =new Scanner(System.in);
        System.out.println("Enter mobile number to insert:");
        key=input.nextLong();
        position=(int)(key%10);
        System.err.println("Position is "+position);
        if (h[position].mobile==-1) {
        h[position].mobile=key; 
        }
        else if(ch==1){
            int temp_position=LinearProbing(position);
            h[temp_position].mobile=key;
            
        }  
        else if (ch==2)
        {
            int temp_position=QuadraticProbing(position);
            h[temp_position].mobile=key;   
        }         
    }    
    

    public int  LinearProbing(int collision_position)
    {
        for (int i = collision_position; i < 10; i++) {
        if (h[i].mobile == -1) {
            return i;
        }
        if (i == 9) {
            i = -1;
        }
    }
    return -1;
}
public void search()
{
    Scanner input=new Scanner(System.in);
    System.out.println("Enter data to be search:");
    long find =input.nextLong();
    int position=(int)(find%10);
    if(h[position].mobile==find)
    {
        System.out.println("Data found at position:"+position);
    }
    else{

    
    for (int i=0;i<10;i++)
    {
        if(h[i].mobile==find)
        {
        System.out.println("Data found at position:"+i);
        }

    }
    
}
    
}

public int QuadraticProbing(long key) {
    int a;
    for (int j = 0; j < 10; j++) {
        a = (int) ((key + (j * j)) % 10);
        if (h[a].mobile == -1) {
            return a;
        }
    }
    return -1;
}
}

public class DSA_1 {

    public static void main(String[] args) {
        Hashing obj=new Hashing();
        int choice=1;
        do{
            int flag;
            Scanner input=new Scanner(System.in);
            System.out.println("Enter 1 for insert ekemnt:");
            System.out.println("Enter 2 for search data: ");
            System.out.println("Enter 3 for Display data:");
            System.out.println("Enter 4 for exit:");
            flag=input.nextInt();

            if (flag==1) {
                System.out.println("Enter 1 for linear probing");
                System.out.println("Enter 2 fro quadratic probing ");
                int ch=input.nextInt();
                obj.insert(ch);
                obj.display();
            }
            else if (flag==2)
            {
                obj.search();
            }
            else if (flag==3) {
                obj.display();
            }
            else if (flag==4) {
                choice=0;                
            }


        }while( choice==1);
      
        
    }
}
