import java.util.Scanner;

     public class Main {

         public static Scanner scan = new Scanner(System.in);

         public static void main(String[] args) {
             CreateSetGetPowerOfMachines();
             SettingsOfHeatManagers();
         }


         public static void CreateSetGetPowerOfMachines() {

             Machine machine1 = new Machine();
             Machine machine2 = new Machine();
             Machine machine3 = new Machine();

             Machine[] machines = new Machine[3];
             machines[0] = machine1;
             machines[1] = machine2;
             machines[2] = machine3;

             System.out.println("Въведете мощността на машините: ");
             machine1.setPower(scan.nextInt());
             machine2.setPower(scan.nextInt());
             machine3.setPower(scan.nextInt());

         }

         public static void SettingsOfHeatManagers() {

             HeatManager heatManager1 = new HeatManager();
             HeatManager heatManager2 = new HeatManager();
             HeatManager heatManager3 = new HeatManager();

             HeatManager[] heatManagers = new HeatManager[3];
             heatManagers[0] = heatManager1;
             heatManagers[1] = heatManager2;
             heatManagers[2] = heatManager3;

             System.out.println("Мошността на ТМ: ");
             heatManager1.setPower(scan.nextInt());
             heatManager2.setPower(scan.nextInt());
             heatManager3.setPower(scan.nextInt());

             System.out.println("Работното време на ТМ: ");
             heatManager1.setHours(scan.nextInt());
             heatManager2.setHours(scan.nextInt());
             heatManager3.setHours(scan.nextInt());

             System.out.println("Максимална работна температура на ТМ");
             heatManager1.GetMaxWorkTemp(scan.nextInt());
             heatManager2.GetMaxWorkTemp(scan.nextInt());
             heatManager3.GetMaxWorkTemp(scan.nextInt());


         }
     }

