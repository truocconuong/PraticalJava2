import java.util.ArrayList;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        boolean flag = true;
        ArrayList<InforKhachHang> arraylist = new ArrayList<>();
        PriorityQueue data = new PriorityQueue(arraylist);
        menu();
       Scanner sc = new Scanner(System.in);
        while (flag){
            int luachon = sc.nextInt();
            switch(luachon){
                case 1 : {
                    data.Add(arraylist);
                    menu();
                    break;
                }
                case 2: {
                    System.out.println("Mời bạn nhập id muốn sửa");
                    int id = sc.nextInt();
                    data.EditKhachHang(id);
                    menu();
                    break;
                }
                case 3 : {
                    data.DisplayAll();
                    menu();
                    break;
                }
                case 4:{
                    flag=false;
                }
            }
        }
    }

    private static void menu() {
        System.out.println("1:Add reservation");
        System.out.println("2:Modify passenger records");
        System.out.println("3:Display passenger records");
        System.out.println("4:Exit");
    }
}
