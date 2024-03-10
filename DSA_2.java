
import java.util.*;

class Set_1 {
    public void insert(Set abc) {
        Scanner input = new Scanner(System.in);

        System.out.println("Enter number of student who play  :");
        int n = input.nextInt();

        for (int i = 1; i <= n; i++) {
            System.out.print("Enter the name of students who play: ");
            String name = input.next();
            abc.add(name);
            System.out.println(abc);

        }
        System.out.println("size is " + abc.size());

    }

    public void remove(Set a) {
        Scanner input = new Scanner(System.in);

        System.out.println("Enter elemnt to remove");
        String name = input.next();
        a.remove(name);
        System.out.println("Elemnet " + name + " is removed");
        System.out.println(a);
        System.out.println("size is " + a.size());

    }

    public void search(Set a) {
        Scanner input = new Scanner(System.in);

        System.out.println("Enter elemnt to Search");
        String name = input.next();
        a.contains(name);
        if (a.contains(name)) {
            System.out.println("Elment found");
        }

        else {
            System.out.println(" Element Not found");
        }

    }

    public void intersection_(Set a, Set b) {
        a.retainAll(b);
        System.out.println("intersection is " + a);

    }

    public void union_(Set a, Set b) {
        a.addAll(b);                                                            
        System.out.println("union is " + a);

    }

    public void difference(Set a, Set b) {
        a.removeAll(b);
        System.out.println("Difference is " + a);

    }

    public void subset(Set a)
    {
        int n = a.size();
        String []arr=new String[a.size()];
        a.toArray(arr);
        Arrays.toString(arr);
        
 
        for (int i = 0; i < (1<<n); i++)
        {
            System.out.print("{ ");
 
        
            for (int j = 0; j < n; j++)
 
                if ((i & (1 << j)) > 0)
                    System.out.print(arr[j] + " ");
 
            System.out.println("}");
        }
    }

}

class DSA_2 {
    public static void main(String[] args) {
        Set_1 obj1 = new Set_1();
        Set<String> cricket = new HashSet<String>();
        Set<String> Football = new HashSet<String>();

        int ch = 1;
        do {
            Scanner input = new Scanner(System.in);
            System.out.println("Enter 1 for insert element in Cricket ");
            System.out.println("Enter 2 for insert element in Football ");

            System.out.println("Enter 3 for remove element in Cricket ");
            System.out.println("Enter 4 for remove element in Football ");
            System.out.println("Enter 5 for search element in cricket ");
            System.out.println("enter 6 intersection of cricket and football ");
            System.out.println("enter 7 union of cricket and football ");
            System.out.println("enter 8 difference of cricket and football ");
            System.out.println("Enter 9 for Subsets of a set ");

            int choice = input.nextInt();

            if (choice == 1) {

                obj1.insert(cricket);
            }

            else if (choice == 2) {
                obj1.insert(Football);
            }

            else if (choice == 3) {
                obj1.remove(cricket);
            }

            else if (choice == 4) {
                obj1.remove(Football);
            }

            else if (choice == 5) {
                obj1.search(cricket);
            }

            else if (choice == 6) {
                obj1.intersection_(cricket, Football);

            }

            else if (choice == 7) {
                obj1.union_(cricket, Football);
            }

            else if (choice == 8) {
                obj1.difference(cricket, Football);
            }

            else if (choice==9)
            {
                obj1.subset(cricket);
            }

        } while (ch == 1);
    }
}
