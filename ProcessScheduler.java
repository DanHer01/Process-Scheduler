import java.io.*;
import java.util.*;
import scheduler.processing.*;

public class ProcessScheduler {
    public static void main(String[] args) {
        if (args.length <= 7) {
            try {
                String sRangoTiempo = args[1];
                Scanner sc = new Scanner(sRangoTiempo);
                Scanner sc1 = new Scanner(sRangoTiempo);
                double rangoMayor = 0;
                double rangoMenor = 0;
                sc.useDelimiter("-");
                sc1.useDelimiter("[0-9]+\\.?[0-9]*-");
                String srangoMenor = sc.next();                        
                String srangoMayor = sc1.next();
                rangoMayor = Double.parseDouble(srangoMayor);
                rangoMenor = Double.parseDouble(srangoMenor);
                String sArith = args[2];
                double Arith = Double.parseDouble(sArith);
                String sInputOut = args[3];
                double InputOut = Double.parseDouble(sInputOut);
                String sCond = args[4];
                double Cond = Double.parseDouble(sCond);
                String sLoop = args[5];
                double Loop = Double.parseDouble(sLoop);
                String sQuantum = "";
                double Quantum = 0; //Valor default de Quantum
                if (args.length == 7){
                    sQuantum = args[6];
                    Quantum = Double.parseDouble(sQuantum);
                }           
                //double randomRange = (double)((Math.random()*(rangoMayor)-(rangoMenor)+1)+(rangoMenor)) * 100.0;
                Long randomRange = Long.parseLong(srangoMayor) * (long)1000.0; //
            } finally {
                System.out.println("Error!");
            }
        }
    }
}