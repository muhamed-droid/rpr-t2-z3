import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class Main {

    public static boolean onlyDigits(String s){
        for(int i=0; i<=s.length(); i++){
            if (s.charAt(i) < '0'
                    || s.charAt(i) > '9') {
                return false;
            }
        }
        return true;
    }

    public static Double min(List<Double> lista){
        double min = lista.get(0);
        for(var x: lista){
            if(x<min) min = x;
        }
        return min;
    }

    public static Double max(List<Double> lista){
        double max = lista.get(0);
        for(var x:lista){
            if(x>max) max = x;
        }
        return max;
    }

    public static Double mean(List<Double> lista){
        double sum = 0;
        for(var x:lista) {
            sum+=x;
        }
        return sum/lista.size();
    }

    public static Double srednjaVrijednost(List<Double> lista){
        double sum = 0;
        for(var x:lista) {
            sum+=x;
        }
        return sum/lista.size();
    }

    public static Double standardnaDevijacija(List<Double> list){
        double sum = 0.0, standardDeviation = 0.0;
        int length = list.size();

        for(double num : list) {
            sum += num;
        }

        double mean = sum/length;

        for(double num: list) {
            standardDeviation += Math.pow(num - mean, 2);
        }

        return Math.sqrt(standardDeviation/length);
    }


    public static void main(String[] args) {


        List<Double> brojevi = new ArrayList<Double>();
        do{
            System.out.println("Unesite brojeve u listu: (\"stop\") za prekid unosa: ");
            Scanner ulaz = new Scanner(System.in);
            String stringUlaz = ulaz.nextLine();
            if(stringUlaz.equals(new String("stop"))) break;
            else if(onlyDigits(stringUlaz) == false) continue;
            else {
                brojevi.add(Double.parseDouble(stringUlaz));
            }
        }while(true);

        System.out.println("Izracuna su sljedeće stavke za list: \n min:" + min(brojevi) + "\n max: " + max(brojevi) +"\n mean: "+ mean(brojevi) +
                " \n srednja vrijednost: " + srednjaVrijednost(brojevi) + "\n standardna devijacija: " + standardnaDevijacija(brojevi));
    }
}
