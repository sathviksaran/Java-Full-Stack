import java.util.*;
public class Problem37 {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        HashMap<String,Integer> map=new HashMap<>();
        ArrayList<String> ppl=new ArrayList<>();
        ArrayList<Double> bal=new ArrayList<>();
        ArrayList<Double> bal1=new ArrayList<>();
        HashMap<String,Double> map1=new HashMap<>();
        String s="";
        System.out.println("Enter bill details");
        while(!s.equalsIgnoreCase("end")){
            s=sc.next();
            if(!s.equalsIgnoreCase("end")){
                if(!ppl.contains(s)){
                    ppl.add(s);
                }
                int n=sc.nextInt();
                if(map.containsKey(s)){
                    map.put(s,map.get(s)+n);
                }
                else{
                    map.put(s,n);
                }
            }
        }
        System.out.print("Bill Summary: "+map+"\n");
        double avg=0;
        for(int i=0;i<ppl.size();i++){
            avg+=(map.get(ppl.get(i)));
        }
        avg/=ppl.size();
        for(int i=0;i<ppl.size();i++){
            map1.put(ppl.get(i),map.get(ppl.get(i))-avg);
            bal.add(map1.get(ppl.get(i)));
            bal1.add(map1.get(ppl.get(i)));
        }
        Collections.sort(bal1);
        for(int i=0;i<ppl.size();i++){
            while(bal1.get(i)!=0){
                for(int j=i+1;j<ppl.size();j++){
                    if(bal1.get(j)>0){
                        double n1,n2;
                        if(Math.abs(bal1.get(i))<bal1.get(j)){
                            n1=0;
                        }
                        else{
                            n1=bal1.get(i)+bal1.get(j);
                        }
                        n2=Math.min(Math.abs(bal1.get(i)),Math.abs(bal1.get(j)));
                        System.out.println(ppl.get(bal.indexOf(bal1.get(i)))+" -> "+ppl.get(bal.indexOf(bal1.get(j)))+" ----> "+n2);
                        bal1.set(i,n1);
                        bal1.set(j,bal1.get(j)-n2);
                        bal=(ArrayList)bal1.clone();
                    }
                }
            }
        }
    }
}